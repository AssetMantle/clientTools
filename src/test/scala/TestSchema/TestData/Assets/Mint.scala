package TestSchema.TestData.Assets

import TestSchema.TestData.Constants.Setup
import commonUtilities.{AttoNumber, ID}
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base.{DecData, StringData}
import schema.id.base.{ClassificationID, HashID, IdentityID, PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.MetaProperty

class Mint extends AnyFunSuite{
  val setup = new Setup()

  val fromID = setup.identityID

  val classificationID = setup.classificationID.asProtoClassificationID

  val immutableMetaProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("A"), StringID("S")), StringData("a").toAnyData))).asProtoPropertyList

  val immutableProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("B"), StringID("S")), StringData("b").toAnyData))).asProtoPropertyList

  val mutableMetaProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("C"), StringID("S")), StringData("c").toAnyData), MetaProperty(PropertyID(StringID("supply"), StringID("D")), DecData(AttoNumber.zero).toAnyData))).asProtoPropertyList

  val mutableProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("D"), StringID("S")), StringData("d").toAnyData))).asProtoPropertyList

  val assetMintMsg = commonUtilities.BlockchainTransaction.getMintAssetMsgAsAny(setup.balanceAccount.address, fromID.asProtoIdentityID, fromID.asProtoIdentityID, classificationID, immutableMetaProperties, immutableProperties, mutableMetaProperties, mutableProperties)

  val (txRawBytes, memo): (Array[Byte], String) = commonUtilities.BlockchainTransaction.getTxRawBytesWithSignedMemo(messages = Seq(assetMintMsg), fee = setup.amount, gasLimit = 1000000, accountNumber = 11, sequence = 51, ecKey = ECKey.fromPrivate(setup.balanceAccount.privateKey), chainID = setup.chainId, memoSignerPrivateKey = setup.balanceAccount.privateKey)

  val txRawBytesString = commonUtilities.Secrets.byteArrayToString(txRawBytes)
  println("0x" + txRawBytesString)
}
