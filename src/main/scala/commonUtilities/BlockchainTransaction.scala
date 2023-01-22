package commonUtilities

import com.cosmos.bank.v1beta1.MsgSend
import com.cosmos.base.v1beta1.Coin
import com.cosmos.crypto.secp256k1
import com.cosmos.tx.v1beta1._
import com.data.AnyData
import com.google.protobuf.{ByteString, Any => protoBufAny}
import com.metas.transactions.reveal.{Message => MetasMessage}
import com.identities.transactions.nub.{Message => NubIDMessage}
import com.identities.transactions.define.{Message => DefineIDMessage}
import com.identities.transactions.issue.{Message => IssueIDMessage}
import com.identities.transactions.provision.{Message => ProvisionIDMessage}
import com.identities.transactions.deputize.{Message => DeputizeIDMessage}
import com.identities.transactions.quash.{Message => QuashIDMessage}
import com.identities.transactions.revoke.{Message => RevokeIDMessage}
import com.identities.transactions.unprovision.{Message => UnprovisionIDMessage}
import com.ids.{ClassificationID, IdentityID, StringID}
import com.lists.PropertyList
import org.bitcoinj.core.ECKey

import scala.jdk.CollectionConverters.IterableHasAsJava

object BlockchainTransaction {

  private def getTxRawBytes(messages: Seq[protoBufAny], fee: Coin, gasLimit: Int, accountNumber: Int, sequence: Int, ecKey: ECKey, memo: String, chainID: String): Array[Byte] = {
    val txBody = TxBody.newBuilder().addAllMessages(messages.asJava).setMemo(memo).build()

    val signerInfo = SignerInfo.newBuilder()
      .setSequence(sequence)
      .setPublicKey(com.google.protobuf.Any.newBuilder().setTypeUrl(commonConstants.Blockchain.PublicKey.SINGLE_SECP256K1).setValue(secp256k1.PubKey.newBuilder().setKey(ByteString.copyFrom(ecKey.getPubKey)).build().toByteString).build())
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
      .addSignatures(ByteString.copyFrom(Wallet.ecdsaSign(commonUtilities.Secrets.sha256Hash(signDoc.toByteArray), ecKey)))
      .build()
    txRaw.toByteArray
  }

  def getTxRawBytesWithSignedMemo(messages: Seq[protoBufAny], fee: Coin, gasLimit: Int, accountNumber: Int, sequence: Int, ecKey: ECKey, chainID: String, memoSignerPrivateKey: Array[Byte]): (Array[Byte], String) = {
    val txRawBytesWithoutMemo = getTxRawBytes(
      messages = messages,
      fee = fee,
      gasLimit = gasLimit,
      accountNumber = accountNumber,
      sequence = sequence,
      ecKey = ecKey,
      memo = "",
      chainID = chainID)
    val memo = commonUtilities.Secrets.base64URLEncoder(commonUtilities.Wallet.ecdsaSign(commonUtilities.Secrets.sha256Hash(txRawBytesWithoutMemo), ECKey.fromPrivate(memoSignerPrivateKey)))
    (getTxRawBytes(
      messages = messages,
      fee = fee,
      gasLimit = gasLimit,
      accountNumber = accountNumber,
      sequence = sequence,
      ecKey = ecKey,
      memo = memo,
      chainID = chainID), memo)
  }

  def memoGenerator(memoPrefix: String, memoSignerPrivateKey: Array[Byte]): String = commonUtilities.Secrets.base64URLEncoder(commonUtilities.Wallet.hashAndEcdsaSign(memoPrefix, ECKey.fromPrivate(memoSignerPrivateKey)))

  def getFee(gasPrice: Double, stakingDenom: String, gasLimit: Int): Coin = Coin.newBuilder().setDenom(stakingDenom).setDenom(MicroNumber(gasPrice * gasLimit).toMicroString).build()

  //BANK
  def getSendCoinMsgAsAny(fromAddress: String, toAddress: String, amount: Seq[Coin]): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(commonConstants.Blockchain.TransactionMessage.SEND_COIN)
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

  //IDENTITIES
  def getDefineIdentityMsgAsAny(fromAddress: String, fromID: IdentityID, immutableMetaProperties: PropertyList, immutableProperties: PropertyList, mutableMetaProperties: PropertyList, mutableProperties: PropertyList): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(commonConstants.Blockchain.TransactionMessage.IDENTITY_DEFINE)
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
    .setTypeUrl(commonConstants.Blockchain.TransactionMessage.IDENTITY_DEPUTIZE)
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
    .setTypeUrl(commonConstants.Blockchain.TransactionMessage.IDENTITY_ISSUE)
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
    .setTypeUrl(commonConstants.Blockchain.TransactionMessage.IDENTITY_PROVISION)
    .setValue(ProvisionIDMessage.newBuilder()
      .setFrom(fromAddress)
      .setTo(toAddress)
      .setIdentityID(identityID)
      .build().toByteString)
    .build()

  def getQuashIdentityMsgAsAny(fromAddress: String, fromID: IdentityID, identityID: IdentityID): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(commonConstants.Blockchain.TransactionMessage.IDENTITY_QUASH)
    .setValue(QuashIDMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setIdentityID(identityID)
      .build().toByteString)
    .build()

  def getRevokeIdentityMsgAsAny(fromAddress: String, fromID: IdentityID, toID: IdentityID, classificationID: ClassificationID): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(commonConstants.Blockchain.TransactionMessage.IDENTITY_REVOKE)
    .setValue(RevokeIDMessage.newBuilder()
      .setFrom(fromAddress)
      .setFromID(fromID)
      .setToID(toID)
      .setClassificationID(classificationID)
      .build().toByteString)
    .build()

  def getUnprovisionIdentityMsgAsAny(fromAddress: String, toAddress: String, identityID: IdentityID): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(commonConstants.Blockchain.TransactionMessage.IDENTITY_UNPROVISION)
    .setValue(UnprovisionIDMessage.newBuilder()
      .setFrom(fromAddress)
      .setTo(toAddress)
      .setIdentityID(identityID)
      .build().toByteString)
    .build()

  def getNubIdentityMsgAsAny(fromAddress: String, nubID: StringID): protoBufAny = protoBufAny.newBuilder()
        .setTypeUrl(commonConstants.Blockchain.TransactionMessage.IDENTITY_NUB)
        .setValue(NubIDMessage.newBuilder()
          .setFrom(fromAddress)
          .setNubID(nubID)
          .build().toByteString)
    .build()

  //METAS
  def getRevealMsgAsAny(fromAddress: String, anyData: AnyData): protoBufAny = protoBufAny.newBuilder()
    .setTypeUrl(commonConstants.Blockchain.TransactionMessage.META_REVEAL)
    .setValue(MetasMessage.newBuilder()
      .setFrom(fromAddress)
      .setData(anyData)
      .build().toByteString)
    .build()
}
