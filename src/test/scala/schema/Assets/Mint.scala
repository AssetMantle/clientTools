package schema.Assets

import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base.{DecData, StringData}
import schema.id.base.{PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.MetaProperty
import utilities.AttoNumber

class Mint extends AnyFunSuite {

  val fromID = testConstants.setup.identityID

  val classificationID = testConstants.setup.classificationID.asProtoClassificationID

  val immutableMetaProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("A"), StringID("S")), StringData("a").toAnyData))).asProtoPropertyList

  val immutableProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("B"), StringID("S")), StringData("b").toAnyData))).asProtoPropertyList

  val mutableMetaProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("C"), StringID("S")), StringData("c").toAnyData), MetaProperty(PropertyID(StringID("supply"), StringID("D")), DecData(AttoNumber.zero).toAnyData))).asProtoPropertyList

  val mutableProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("D"), StringID("S")), StringData("d").toAnyData))).asProtoPropertyList

  val assetMintMsg = utilities.BlockchainTransaction.getMintAssetMsgAsAny(testConstants.setup.balanceAccount.address, fromID.asProtoIdentityID, fromID.asProtoIdentityID, classificationID, immutableMetaProperties, immutableProperties, mutableMetaProperties, mutableProperties)
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(assetMintMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = 11, sequence = 51, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  val txRawBytesString = utilities.Secrets.byteArrayToString(txRawBytes)
  println("0x" + txRawBytesString)
}
