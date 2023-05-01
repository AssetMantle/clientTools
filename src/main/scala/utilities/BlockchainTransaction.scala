package utilities

import com.assetmantle.modules.assets.transactions.burn.{Message => BurnAssetMessage}
import com.assetmantle.modules.assets.transactions.define.{Message => DefineAssetMessage}
import com.assetmantle.modules.assets.transactions.deputize.{Message => DeputizeAssetMessage}
import com.assetmantle.modules.assets.transactions.mint.{Message => MintAssetMessage}
import com.assetmantle.modules.assets.transactions.mutate.{Message => MutateAssetMessage}
import com.assetmantle.modules.assets.transactions.renumerate.{Message => RenumerateAssetMessage}
import com.assetmantle.modules.assets.transactions.revoke.{Message => RevokeAssetMessage}
import com.assetmantle.modules.identities.transactions.define.{Message => DefineIDMessage}
import com.assetmantle.modules.identities.transactions.deputize.{Message => DeputizeIDMessage}
import com.assetmantle.modules.identities.transactions.issue.{Message => IssueIDMessage}
import com.assetmantle.modules.identities.transactions.nub.{Message => NubIDMessage}
import com.assetmantle.modules.identities.transactions.provision.{Message => ProvisionIDMessage}
import com.assetmantle.modules.identities.transactions.quash.{Message => QuashIDMessage}
import com.assetmantle.modules.identities.transactions.revoke.{Message => RevokeIDMessage}
import com.assetmantle.modules.identities.transactions.unprovision.{Message => UnprovisionIDMessage}
import com.assetmantle.modules.metas.transactions.reveal.{Message => MetasMessage}
import com.assetmantle.modules.orders.transactions.cancel.{Message => CancelOrderMessage}
import com.assetmantle.modules.orders.transactions.define.{Message => DefineOrderMessage}
import com.assetmantle.modules.orders.transactions.deputize.{Message => DeputizeOrderMessage}
import com.assetmantle.modules.orders.transactions.immediate.{Message => ImmediateOrderMessage}
import com.assetmantle.modules.orders.transactions.make.{Message => MakeOrderMessage}
import com.assetmantle.modules.orders.transactions.modify.{Message => ModifyOrderMessage}
import com.assetmantle.modules.orders.transactions.revoke.{Message => RevokeOrderMessage}
import com.assetmantle.modules.orders.transactions.take.{Message => TakeOrderMessage}
import com.assetmantle.modules.splits.transactions.send.{Message => SendSplitMessage}
import com.assetmantle.modules.splits.transactions.unwrap.{Message => UnwrapSplitMessage}
import com.assetmantle.modules.splits.transactions.wrap.{Message => WrapSplitMessage}
import com.assetmantle.schema.data.base.AnyData
import com.assetmantle.schema.ids.base._
import com.assetmantle.schema.lists.base.PropertyList
import com.assetmantle.schema.types.base.Height
import com.cosmos.bank.v1beta1.MsgSend
import com.cosmos.base.v1beta1.Coin
import com.cosmos.crypto.secp256k1
import com.cosmos.tx.v1beta1._
import com.google.protobuf.{ByteString, Any => protoBufAny}
import org.bitcoinj.core.ECKey
import schema.list
import schema.property.base._

import scala.jdk.CollectionConverters.IterableHasAsJava

object BlockchainTransaction {

  def getTxRawBytes(messages: Seq[protoBufAny], fee: Coin, gasLimit: Int, accountNumber: Int, sequence: Int, ecKey: ECKey, memo: String = "", chainID: String): Array[Byte] = {
    val txBody = TxBody.newBuilder().addAllMessages(messages.asJava).setMemo(memo).build()

    val signerInfo = SignerInfo.newBuilder()
      .setSequence(sequence)
      .setPublicKey(com.google.protobuf.Any.newBuilder().setTypeUrl(constants.Blockchain.PublicKey.SINGLE_SECP256K1).setValue(secp256k1.PubKey.newBuilder().setKey(ByteString.copyFrom(ecKey.getPubKey)).build().toByteString).build())
      .setModeInfo(ModeInfo.newBuilder().setSingle(ModeInfo.Single.newBuilder().setModeValue(1).build()).build())
      .build()

    val authInfo = AuthInfo.newBuilder()
      .addSignerInfos(signerInfo)
      .setFee(Fee.newBuilder().addAmount(fee).setGasLimit(gasLimit).build())
      .build()

    val signDoc = SignDoc.newBuilder()
      .setBodyBytes(txBody.toByteString)
      .setAuthInfoBytes(authInfo.toByteString)
      .setChainId(chainID)
      .setAccountNumber(accountNumber)
      .build()

    val txRaw = TxRaw.newBuilder()
      .setBodyBytes(txBody.toByteString)
      .setAuthInfoBytes(authInfo.toByteString)
      .addSignatures(ByteString.copyFrom(Wallet.ecdsaSign(utilities.Secrets.sha256Hash(signDoc.toByteArray), ecKey)))
      .build()
    txRaw.toByteArray
  }

  def memoGenerator(memoPrefix: String, memoSignerPrivateKey: Array[Byte]): String = utilities.Secrets.base64URLEncoder(utilities.Wallet.hashAndEcdsaSign(memoPrefix, ECKey.fromPrivate(memoSignerPrivateKey)))

  def getFee(gasPrice: Double, stakingDenom: String, gasLimit: Int): Coin = Coin.newBuilder().setDenom(stakingDenom).setDenom(MicroNumber(gasPrice * gasLimit).toMicroString).build()

  //BANK
  def getSendCoinMsgAsAny(fromAddress: String, toAddress: String, amount: Seq[Coin]): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.SEND_COIN)
    .setValue(MsgSend.newBuilder()
      .setFromAddress(fromAddress)
      .setToAddress(toAddress)
      .addAllAmount(amount.asJava)
      .build().toByteString)
    .build()

  def getMintMsgAsAny(fromAddress: String, fromId: String, toId: String, classificationId: String): protoBufAny = protoBufAny.newBuilder()
    //    .setTypeUrl(constants.Blockchain.TransactionMessage.MINT)
    //    .setValue(Tx
    //      .MsgSend.newBuilder()
    //      .setFromAddress(fromAddress)
    //      .setToAddress(toAddress)
    //      .addAllAmount(amount.map(_.toProtoCoin).asJava)
    //      .build().toByteString)
    .build()

  //ASSETS
  def getDefineAssetMsg(fromAddress: String, fromID: IdentityID, immutableMetas: Seq[MetaProperty], immutables: Seq[MesaProperty], mutableMetas: Seq[MetaProperty], mutables: Seq[MesaProperty]): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.ASSET_DEFINE)
    .setValue(DefineAssetMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setImmutableMetaProperties(list.PropertyList(immutableMetas).asProtoPropertyList)
      .setImmutableProperties(list.PropertyList(immutables).asProtoPropertyList)
      .setMutableMetaProperties(list.PropertyList(mutableMetas).asProtoPropertyList)
      .setMutableProperties(list.PropertyList(mutables).asProtoPropertyList)
      .build().toByteString)
    .build()

  def getBurnAssetMsgAsAny(fromAddress: String, fromID: IdentityID, assetID: AssetID): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.ASSET_BURN)
    .setValue(BurnAssetMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setAssetID(assetID)
      .build().toByteString)
    .build()

  def getDeputizeAssetMsgAsAny(fromAddress: String, fromID: IdentityID, toID: IdentityID, classificationID: ClassificationID, maintainedProperties: PropertyList, canMintAsset: Boolean, canBurnAsset: Boolean, canRenumerateAsset: Boolean, canAddMaintainer: Boolean, canRemoveMaintainer: Boolean, canMutateMaintainer: Boolean): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.ASSET_DEPUTIZE)
    .setValue(DeputizeAssetMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setToID(toID)
      .setClassificationID(classificationID)
      .setMaintainedProperties(maintainedProperties)
      .setCanMintAsset(canMintAsset)
      .setCanBurnAsset(canBurnAsset)
      .setCanRenumerateAsset(canRenumerateAsset)
      .setCanAddMaintainer(canAddMaintainer)
      .setCanRemoveMaintainer(canRemoveMaintainer)
      .setCanMutateMaintainer(canMutateMaintainer)
      .build().toByteString)
    .build()

  def getMintAssetMsgAsAny(fromAddress: String, fromID: IdentityID, toID: IdentityID, classificationID: ClassificationID, immutableMetaProperties: PropertyList, immutableProperties: PropertyList, mutableMetaProperties: PropertyList, mutableProperties: PropertyList): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.ASSET_MINT)
    .setValue(MintAssetMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setToID(toID)
      .setClassificationID(classificationID)
      .setImmutableMetaProperties(immutableMetaProperties)
      .setImmutableProperties(immutableProperties)
      .setMutableMetaProperties(mutableMetaProperties)
      .setMutableProperties(mutableProperties)
      .build().toByteString)
    .build()

  def getMutateAssetMsgAsAny(fromAddress: String, fromID: IdentityID, assetID: AssetID, mutableMetaProperties: PropertyList, mutableProperties: PropertyList): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.ASSET_MUTATE)
    .setValue(MutateAssetMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setAssetID(assetID)
      .setMutableMetaProperties(mutableMetaProperties)
      .setMutableProperties(mutableProperties)
      .build().toByteString)
    .build()

  def getRenumerateAssetMsgAsAny(fromAddress: String, fromID: IdentityID, assetID: AssetID): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.ASSET_RENUMERATE)
    .setValue(RenumerateAssetMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setAssetID(assetID)
      .build().toByteString)
    .build()

  def getRevokeAssetMsgAsAny(fromAddress: String, fromID: IdentityID, toID: IdentityID, classificationID: ClassificationID): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.ASSET_REVOKE)
    .setValue(RevokeAssetMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setToID(toID)
      .setClassificationID(classificationID)
      .build().toByteString)
    .build()


  //IDENTITIES
  def getDefineIdentityMsgAsAny(fromAddress: String, fromID: IdentityID, immutableMetaProperties: PropertyList, immutableProperties: PropertyList, mutableMetaProperties: PropertyList, mutableProperties: PropertyList): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.IDENTITY_DEFINE)
    .setValue(DefineIDMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setImmutableMetaProperties(immutableMetaProperties)
      .setImmutableProperties(immutableProperties)
      .setMutableMetaProperties(mutableMetaProperties)
      .setMutableProperties(mutableProperties)
      .build().toByteString)
    .build()

  def getDeputizeIdentityMsgAsAny(fromAddress: String, fromID: IdentityID, toID: IdentityID, classificationID: ClassificationID, maintainedProperties: PropertyList, canMintAsset: Boolean, canBurnAsset: Boolean, canRenumerateAsset: Boolean, canAddMaintainer: Boolean, canRemoveMaintainer: Boolean, canMutateMaintainer: Boolean): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.IDENTITY_DEPUTIZE)
    .setValue(DeputizeIDMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setToID(toID)
      .setClassificationID(classificationID)
      .setMaintainedProperties(maintainedProperties)
      .setCanMintAsset(canMintAsset)
      .setCanBurnAsset(canBurnAsset)
      .setCanRenumerateAsset(canRenumerateAsset)
      .setCanAddMaintainer(canAddMaintainer)
      .setCanRemoveMaintainer(canRemoveMaintainer)
      .setCanMutateMaintainer(canMutateMaintainer)
      .build().toByteString)
    .build()

  def getIssueIdentityMsgAsAny(fromAddress: String, fromID: IdentityID, toAddress: String, classificationID: ClassificationID, immutableMetaProperties: PropertyList, immutableProperties: PropertyList, mutableMetaProperties: PropertyList, mutableProperties: PropertyList): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.IDENTITY_ISSUE)
    .setValue(IssueIDMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setTo(toAddress)
      .setClassificationID(classificationID)
      .setImmutableMetaProperties(immutableMetaProperties)
      .setImmutableProperties(immutableProperties)
      .setMutableMetaProperties(mutableMetaProperties)
      .setMutableProperties(mutableProperties)
      .build().toByteString)
    .build()

  def getProvisionIdentityMsgAsAny(fromAddress: String, toAddress: String, identityID: IdentityID): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.IDENTITY_PROVISION)
    .setValue(ProvisionIDMessage.newBuilder()
      .setFrom(fromAddress)
      .setTo(toAddress)
      .setIdentityID(identityID)
      .build().toByteString)
    .build()

  def getQuashIdentityMsgAsAny(fromAddress: String, fromID: IdentityID, identityID: IdentityID): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.IDENTITY_QUASH)
    .setValue(QuashIDMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setIdentityID(identityID)
      .build().toByteString)
    .build()

  def getRevokeIdentityMsgAsAny(fromAddress: String, fromID: IdentityID, toID: IdentityID, classificationID: ClassificationID): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.IDENTITY_REVOKE)
    .setValue(RevokeIDMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setToID(toID)
      .setClassificationID(classificationID)
      .build().toByteString)
    .build()

  def getUnprovisionIdentityMsgAsAny(fromAddress: String, toAddress: String, identityID: IdentityID): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.IDENTITY_UNPROVISION)
    .setValue(UnprovisionIDMessage.newBuilder()
      .setFrom(fromAddress)
      .setTo(toAddress)
      .setIdentityID(identityID)
      .build().toByteString)
    .build()

  def getNubIdentityMsgAsAny(fromAddress: String, nubID: StringID): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.IDENTITY_NUB)
    .setValue(NubIDMessage.newBuilder()
      .setFrom(fromAddress)
      .setNubID(nubID)
      .build().toByteString)
    .build()

  //METAS
  def getRevealMsgAsAny(fromAddress: String, anyData: AnyData): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.META_REVEAL)
    .setValue(MetasMessage.newBuilder()
      .setFrom(fromAddress)
      .setData(anyData)
      .build().toByteString)
    .build()

  //ORDERS

  def getDefineOrderMsg(fromAddress: String, fromID: IdentityID, immutableMetaProperties: PropertyList, immutableProperties: PropertyList, mutableMetaProperties: PropertyList, mutableProperties: PropertyList): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.ORDER_DEFINE)
    .setValue(DefineOrderMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setImmutableMetaProperties(immutableMetaProperties)
      .setImmutableProperties(immutableProperties)
      .setMutableMetaProperties(mutableMetaProperties)
      .setMutableProperties(mutableProperties)
      .build().toByteString)
    .build()

  def getCancelOrderMsgAsAny(fromAddress: String, fromID: IdentityID, orderID: OrderID): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.ORDER_CANCEL)
    .setValue(CancelOrderMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setOrderID(orderID)
      .build().toByteString)
    .build()

  def getDeputizeOrderMsgAsAny(fromAddress: String, fromID: IdentityID, toID: IdentityID, classificationID: ClassificationID, maintainedProperties: PropertyList, canMintAsset: Boolean, canBurnAsset: Boolean, canRenumerateAsset: Boolean, canAddMaintainer: Boolean, canRemoveMaintainer: Boolean, canMutateMaintainer: Boolean): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.ORDER_DEPUTIZE)
    .setValue(DeputizeOrderMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setToID(toID)
      .setClassificationID(classificationID)
      .setMaintainedProperties(maintainedProperties)
      .setCanMintAsset(canMintAsset)
      .setCanBurnAsset(canBurnAsset)
      .setCanRenumerateAsset(canRenumerateAsset)
      .setCanAddMaintainer(canAddMaintainer)
      .setCanRemoveMaintainer(canRemoveMaintainer)
      .setCanMutateMaintainer(canMutateMaintainer)
      .build().toByteString)
    .build()

  def getMakeOrderMsgAsAny(fromAddress: String, fromID: IdentityID, classificationID: ClassificationID, takerID: IdentityID, makerOwnableID: AnyOwnableID, takerOwnableID: AnyOwnableID, expires: Height, makerOwnableSplit: String, takerOwnableSplit: String, immutableMetaProperties: PropertyList, immutableProperties: PropertyList, mutableMetaProperties: PropertyList, mutableProperties: PropertyList): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.ORDER_MAKE)
    .setValue(MakeOrderMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setClassificationID(classificationID)
      .setTakerID(takerID)
      .setMakerOwnableID(makerOwnableID)
      .setTakerOwnableID(takerOwnableID)
      .setExpiresIn(expires)
      .setMakerOwnableSplit(makerOwnableSplit)
      .setTakerOwnableSplit(takerOwnableSplit)
      .setImmutableMetaProperties(immutableMetaProperties)
      .setImmutableProperties(immutableProperties)
      .setMutableMetaProperties(mutableMetaProperties)
      .setMutableProperties(mutableProperties)
      .build().toByteString)
    .build()

  def getImmediateOrderMsgAsAny(fromAddress: String, fromID: IdentityID, classificationID: ClassificationID, takerID: IdentityID, makerOwnableID: AnyOwnableID, takerOwnableID: AnyOwnableID, expires: Height, makerOwnableSplit: String, takerOwnableSplit: String, immutableMetaProperties: PropertyList, immutableProperties: PropertyList, mutableMetaProperties: PropertyList, mutableProperties: PropertyList): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.ORDER_IMMEDIATE)
    .setValue(ImmediateOrderMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setClassificationID(classificationID)
      .setTakerID(takerID)
      .setMakerOwnableID(makerOwnableID)
      .setTakerOwnableID(takerOwnableID)
      .setExpiresIn(expires)
      .setMakerOwnableSplit(makerOwnableSplit)
      .setTakerOwnableSplit(takerOwnableSplit)
      .setImmutableMetaProperties(immutableMetaProperties)
      .setImmutableProperties(immutableProperties)
      .setMutableMetaProperties(mutableMetaProperties)
      .setMutableProperties(mutableProperties)
      .build().toByteString)
    .build()

  def getModifyOrderMsgAsAny(fromAddress: String, fromID: IdentityID, orderID: OrderID, makerOwnableSplit: String, takerOwnableSplit: String, expires: Height, mutableMetaProperties: PropertyList, mutableProperties: PropertyList): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.ORDER_MODIFY)
    .setValue(ModifyOrderMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setOrderID(orderID)
      .setExpiresIn(expires)
      .setMakerOwnableSplit(makerOwnableSplit)
      .setTakerOwnableSplit(takerOwnableSplit)
      .setMutableMetaProperties(mutableMetaProperties)
      .setMutableProperties(mutableProperties)
      .build().toByteString)
    .build()

  def getRevokeOrdertMsgAsAny(fromAddress: String, fromID: IdentityID, toID: IdentityID, classificationID: ClassificationID): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.ORDER_REVOKE)
    .setValue(RevokeOrderMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setToID(toID)
      .setClassificationID(classificationID)
      .build().toByteString)
    .build()

  def getTakeOrderMsgAsAny(fromAddress: String, fromID: IdentityID, takerOwnableSplit: String, orderID: OrderID): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.ORDER_TAKE)
    .setValue(TakeOrderMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setTakerOwnableSplit(takerOwnableSplit)
      .setOrderID(orderID)
      .build().toByteString)
    .build()

  //SPLITS

  def getSendSplitMsgAsAny(fromAddress: String, fromID: IdentityID, toID: IdentityID, ownableID: AnyOwnableID, value: String): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.SPLIT_SEND)
    .setValue(SendSplitMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setToID(toID)
      .setOwnableID(ownableID)
      .setValue(value)
      .build().toByteString)
    .build()

  def getWrapSplitMsgAsAny(fromAddress: String, fromID: IdentityID, coins: Iterable[Coin]): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.SPLIT_WRAP)
    .setValue(WrapSplitMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .addAllCoins(coins.asJava)
      .build().toByteString)
    .build()

  def getUnwrapSplitMsgAsAny(fromAddress: String, fromID: IdentityID, ownableID: AnyOwnableID, value: String): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(constants.Blockchain.TransactionMessage.SPLIT_UNWRAP)
    .setValue(UnwrapSplitMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setOwnableID(ownableID)
      .setValue(value)
      .build().toByteString)
    .build()

}

