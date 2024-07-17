package utilities

import com.assetmantle.modules.assets.transactions.burn.{Message => BurnAssetMessage}
import com.assetmantle.modules.assets.transactions.define.{Message => DefineAssetMessage}
import com.assetmantle.modules.assets.transactions.deputize.{Message => DeputizeAssetMessage}
import com.assetmantle.modules.assets.transactions.mint.{Message => MintAssetMessage}
import com.assetmantle.modules.assets.transactions.mutate.{Message => MutateAssetMessage}
import com.assetmantle.modules.assets.transactions.renumerate.{Message => RenumerateAssetMessage}
import com.assetmantle.modules.assets.transactions.revoke.{Message => RevokeAssetMessage}
import com.assetmantle.modules.identities.transactions.define.{Message => DefineIDMessage}
import com.assetmantle.modules.identities.transactions.issue.{Message => IssueIDMessage}
import com.assetmantle.modules.identities.transactions.name.{Message => NameMessage}
import com.assetmantle.modules.identities.transactions.provision.{Message => ProvisionIDMessage}
import com.assetmantle.modules.identities.transactions.quash.{Message => QuashIDMessage}
import com.assetmantle.modules.identities.transactions.revoke.{Message => RevokeIDMessage}
import com.assetmantle.modules.identities.transactions.unprovision.{Message => UnprovisionIDMessage}
import com.assetmantle.modules.identities.transactions.update.{Message => UpdateIDMessage}
import com.assetmantle.modules.metas.transactions.reveal.{Message => MetasMessage}
import com.assetmantle.modules.orders.transactions.cancel.{Message => CancelOrderMessage}
import com.assetmantle.modules.orders.transactions.define.{Message => DefineOrderMessage}
import com.assetmantle.schema.data.base.AnyData
import com.assetmantle.schema.ids.base._
import com.assetmantle.schema.lists.base.PropertyList
import com.cosmos.bank.v1beta1.MsgSend
import com.cosmos.base.v1beta1.Coin
import com.cosmos.crypto.secp256k1.{PubKey => secp256k1}
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
      .setPublicKey(com.google.protobuf.Any.newBuilder().setTypeUrl(constants.Blockchain.PublicKey.SINGLE_SECP256K1).setValue(secp256k1.newBuilder().setKey(ByteString.copyFrom(ecKey.getPubKey)).build().toByteString).build())
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
      .addSignatures(ByteString.copyFrom(Wallet.ecdsaSign(Encoding.sha256Hash(signDoc.toByteArray), ecKey)))
      .build()
    txRaw.toByteArray
  }

  def memoGenerator(memoPrefix: String, memoSignerPrivateKey: Array[Byte]): String = Encoding.base64URLEncoder(Wallet.hashAndEcdsaSign(memoPrefix, ECKey.fromPrivate(memoSignerPrivateKey)))

  def getFee(gasPrice: Double, stakingDenom: String, gasLimit: Int): Coin = Coin.newBuilder().setDenom(stakingDenom).setDenom(MicroNumber(gasPrice * gasLimit).toMicroString).build()

  //BANK
  def getSendCoinMsgAsAny(fromAddress: String, toAddress: String, amount: Seq[Coin]): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(schema.constants.Messages.SEND_COIN)
    .setValue(MsgSend.newBuilder()
      .setFromAddress(fromAddress)
      .setToAddress(toAddress)
      .addAllAmount(amount.asJava)
      .build().toByteString)
    .build()

  def getMintMsgAsAny(fromAddress: String, fromId: String, toId: String, classificationId: String): protoBufAny = protoBufAny.newBuilder()
    //    .setTypeUrl(schema.constants.Messages.MINT)
    //    .setValue(Tx
    //      .MsgSend.newBuilder()
    //      .setFromAddress(fromAddress)
    //      .setToAddress(toAddress)
    //      .addAllAmount(amount.map(_.toProtoCoin).asJava)
    //      .build().toByteString)
    .build()

  //ASSETS
  def getDefineAssetMsg(fromAddress: String, fromID: IdentityID, immutableMetas: Seq[MetaProperty], immutables: Seq[MesaProperty], mutableMetas: Seq[MetaProperty], mutables: Seq[MesaProperty]): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(schema.constants.Messages.ASSET_DEFINE)
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
    .setTypeUrl(schema.constants.Messages.ASSET_BURN)
    .setValue(BurnAssetMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setAssetID(assetID)
      .build().toByteString)
    .build()

  def getDeputizeAssetMsgAsAny(fromAddress: String, fromID: IdentityID, toID: IdentityID, classificationID: ClassificationID, maintainedProperties: PropertyList, canMintAsset: Boolean, canBurnAsset: Boolean, canRenumerateAsset: Boolean, canAddMaintainer: Boolean, canRemoveMaintainer: Boolean, canMutateMaintainer: Boolean): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(schema.constants.Messages.ASSET_DEPUTIZE)
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
    .setTypeUrl(schema.constants.Messages.ASSET_MINT)
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
    .setTypeUrl(schema.constants.Messages.ASSET_MUTATE)
    .setValue(MutateAssetMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setAssetID(assetID)
      .setMutableMetaProperties(mutableMetaProperties)
      .setMutableProperties(mutableProperties)
      .build().toByteString)
    .build()

  def getRenumerateAssetMsgAsAny(fromAddress: String, fromID: IdentityID, assetID: AssetID): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(schema.constants.Messages.ASSET_RENUMERATE)
    .setValue(RenumerateAssetMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setAssetID(assetID)
      .build().toByteString)
    .build()

  def getRevokeAssetMsgAsAny(fromAddress: String, fromID: IdentityID, toID: IdentityID, classificationID: ClassificationID): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(schema.constants.Messages.ASSET_REVOKE)
    .setValue(RevokeAssetMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setToID(toID)
      .setClassificationID(classificationID)
      .build().toByteString)
    .build()


  //IDENTITIES
  def getDefineIdentityMsgAsAny(fromAddress: String, fromID: IdentityID, immutableMetaProperties: PropertyList, immutableProperties: PropertyList, mutableMetaProperties: PropertyList, mutableProperties: PropertyList): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(schema.constants.Messages.IDENTITY_DEFINE)
    .setValue(DefineIDMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setImmutableMetaProperties(immutableMetaProperties)
      .setImmutableProperties(immutableProperties)
      .setMutableMetaProperties(mutableMetaProperties)
      .setMutableProperties(mutableProperties)
      .build().toByteString)
    .build()

  def getIssueIdentityMsgAsAny(fromAddress: String, fromID: IdentityID, toAddress: String, classificationID: ClassificationID, immutableMetaProperties: PropertyList, immutableProperties: PropertyList, mutableMetaProperties: PropertyList, mutableProperties: PropertyList): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(schema.constants.Messages.IDENTITY_ISSUE)
    .setValue(IssueIDMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setClassificationID(classificationID)
      .setImmutableMetaProperties(immutableMetaProperties)
      .setImmutableProperties(immutableProperties)
      .setMutableMetaProperties(mutableMetaProperties)
      .setMutableProperties(mutableProperties)
      .build().toByteString)
    .build()

  def getUpdateIdentityMsgAsAny(fromAddress: String, fromID: IdentityID, identityID: IdentityID, mutableMetaProperties: PropertyList, mutableProperties: PropertyList): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(schema.constants.Messages.IDENTITY_UPDATE)
    .setValue(UpdateIDMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setIdentityID(identityID)
      .setMutableMetaProperties(mutableMetaProperties)
      .setMutableProperties(mutableProperties)
      .build().toByteString)
    .build()

  def getProvisionIdentityMsgAsAny(fromAddress: String, toAddress: String, identityID: IdentityID): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(schema.constants.Messages.IDENTITY_PROVISION)
    .setValue(ProvisionIDMessage.newBuilder()
      .setFrom(fromAddress)
      .setTo(toAddress)
      .setIdentityID(identityID)
      .build().toByteString)
    .build()

  def getQuashIdentityMsgAsAny(fromAddress: String, fromID: IdentityID, identityID: IdentityID): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(schema.constants.Messages.IDENTITY_QUASH)
    .setValue(QuashIDMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setIdentityID(identityID)
      .build().toByteString)
    .build()

  def getRevokeIdentityMsgAsAny(fromAddress: String, fromID: IdentityID, toID: IdentityID, classificationID: ClassificationID): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(schema.constants.Messages.IDENTITY_REVOKE)
    .setValue(RevokeIDMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setToID(toID)
      .setClassificationID(classificationID)
      .build().toByteString)
    .build()

  def getUnprovisionIdentityMsgAsAny(fromAddress: String, toAddress: String, identityID: IdentityID): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(schema.constants.Messages.IDENTITY_UNPROVISION)
    .setValue(UnprovisionIDMessage.newBuilder()
      .setFrom(fromAddress)
      .setTo(toAddress)
      .setIdentityID(identityID)
      .build().toByteString)
    .build()

  def getNameIdentityMsgAsAny(fromAddress: String, nubID: StringID): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(schema.constants.Messages.IDENTITY_NAME)
    .setValue(NameMessage.newBuilder()
      .setFrom(fromAddress)
      .setName(nubID)
      .build().toByteString)
    .build()

  //METAS
  def getRevealMsgAsAny(fromAddress: String, anyData: AnyData): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(schema.constants.Messages.META_REVEAL)
    .setValue(MetasMessage.newBuilder()
      .setFrom(fromAddress)
      .setData(anyData)
      .build().toByteString)
    .build()

  //ORDERS

  def getDefineOrderMsg(fromAddress: String, fromID: IdentityID, immutableMetaProperties: PropertyList, immutableProperties: PropertyList, mutableMetaProperties: PropertyList, mutableProperties: PropertyList): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(schema.constants.Messages.ORDER_DEFINE)
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
    .setTypeUrl(schema.constants.Messages.ORDER_CANCEL)
    .setValue(CancelOrderMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setOrderID(orderID)
      .build().toByteString)
    .build()
}

