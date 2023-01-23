package TestSchema.TestData.Assets

import TestSchema.TestData.Constants.Setup
import org.scalatest.funsuite.AnyFunSuite
import schema.id.base.{ClassificationID, HashID, IdentityID, PropertyID, StringID}
import commonUtilities.{AttoNumber, ID}
import org.bitcoinj.core.ECKey
import schema.data.base.{DecData, StringData}
import schema.list.PropertyList
import schema.property.base.MetaProperty

class Define extends AnyFunSuite{
  val setup = new Setup()

  val fromID = setup.identityID

  val immutableMetaProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("A"), StringID("S")), StringData("").toAnyData))).asProtoPropertyList

  val immutableProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("B"), StringID("S")), StringData("").toAnyData))).asProtoPropertyList

  val mutableMetaProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("C"), StringID("S")), StringData("").toAnyData), MetaProperty(PropertyID(StringID("supply"), StringID("D")), DecData(AttoNumber.zero).toAnyData))).asProtoPropertyList

  val mutableProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("D"), StringID("S")), StringData("").toAnyData))).asProtoPropertyList

  val assetMintMsg = commonUtilities.BlockchainTransaction.getDefineAssetMsgAsAny(setup.balanceAccount.address, fromID.asProtoIdentityID, immutableMetaProperties, immutableProperties, mutableMetaProperties, mutableProperties)

  val (txRawBytes, memo): (Array[Byte], String) = commonUtilities.BlockchainTransaction.getTxRawBytesWithSignedMemo(messages = Seq(assetMintMsg), fee = setup.amount, gasLimit = 1000000, accountNumber = 11, sequence = 49, ecKey = ECKey.fromPrivate(setup.balanceAccount.privateKey), chainID = setup.chainId, memoSignerPrivateKey = setup.balanceAccount.privateKey)

  val txRawBytesString = commonUtilities.Secrets.byteArrayToString(txRawBytes)
  println("0x" + txRawBytesString)
}
