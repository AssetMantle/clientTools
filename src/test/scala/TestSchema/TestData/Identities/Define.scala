package TestSchema.TestData.Identities

import TestSchema.TestData.Constants.Setup
import com.google.common.io.BaseEncoding.{base64, base64Url}
import commonUtilities.ID
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base.StringData
import schema.id.base.{ClassificationID, HashID, IdentityID, PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.MetaProperty

class Define extends AnyFunSuite{
  val setup = new Setup()

  val immutableMetaProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("A"), StringID("S")), StringData("immutableStringMetaProperty").toAnyData))).asProtoPropertyList

  val immutableProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("B"), StringID("S")), StringData("immutableStringProperty").toAnyData))).asProtoPropertyList

  val mutableMetaProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("C"), StringID("S")), StringData("mutableStringMetaProperty").toAnyData))).asProtoPropertyList

  val mutableProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("D"), StringID("S")), StringData("mutableStringProperty").toAnyData))).asProtoPropertyList

  val identitiesDefineMsg = commonUtilities.BlockchainTransaction.getDefineIdentityMsgAsAny(setup.balanceAccount.address, setup.identityID.asProtoIdentityID, immutableMetaProperties, immutableProperties, mutableMetaProperties, mutableProperties)

  val (txRawBytes, memo): (Array[Byte], String) = commonUtilities.BlockchainTransaction.getTxRawBytesWithSignedMemo(messages = Seq(identitiesDefineMsg), fee = setup.amount, gasLimit = 1000000, accountNumber = 11, sequence = 42, ecKey = ECKey.fromPrivate(setup.balanceAccount.privateKey), chainID = setup.chainId, memoSignerPrivateKey = setup.balanceAccount.privateKey)

  val txRawBytesString = commonUtilities.Secrets.byteArrayToString(txRawBytes)
  println("0x" + txRawBytesString)
}
