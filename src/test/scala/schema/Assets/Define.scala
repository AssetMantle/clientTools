package schema.Assets

import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base.{DecData, StringData}
import schema.id.base.{PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.MetaProperty
import utilities.AttoNumber

class Define extends AnyFunSuite {

  val fromID = testConstants.setup.identityID

  val immutableMetaProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("A"), StringID("S")), StringData("").toAnyData))).asProtoPropertyList

  val immutableProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("B"), StringID("S")), StringData("").toAnyData))).asProtoPropertyList

  val mutableMetaProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("C"), StringID("S")), StringData("").toAnyData), MetaProperty(PropertyID(StringID("supply"), StringID("D")), DecData(AttoNumber.zero).toAnyData))).asProtoPropertyList

  val mutableProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("D"), StringID("S")), StringData("").toAnyData))).asProtoPropertyList

  val assetMintMsg = utilities.BlockchainTransaction.getDefineAssetMsgAsAny(testConstants.setup.balanceAccount.address, fromID.asProtoIdentityID, immutableMetaProperties, immutableProperties, mutableMetaProperties, mutableProperties)

  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(assetMintMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = 11, sequence = 49, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)

  val txRawBytesString = utilities.Secrets.byteArrayToString(txRawBytes)
  println("0x" + txRawBytesString)
}
