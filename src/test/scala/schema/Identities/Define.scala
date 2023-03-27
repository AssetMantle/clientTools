package schema.Identities

import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base.StringData
import schema.id.base.{HashID, IdentityID, PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.MetaProperty

class Define extends AnyFunSuite {

  val immutableMetaProperties = PropertyList(Seq()).asProtoPropertyList

  val immutableProperties = PropertyList(Seq()).asProtoPropertyList

  val mutableMetaProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("C"), StringID("S")), StringData("mutableStringMetaProperty").toAnyData))).asProtoPropertyList

  val mutableProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("D"), StringID("S")), StringData("mutableStringProperty").toAnyData))).asProtoPropertyList

  val identitiesDefineMsg = utilities.BlockchainTransaction.getDefineIdentityMsgAsAny(testConstants.setup.balanceAccount.address, IdentityID(HashID(utilities.Secrets.base64URLDecode("yujODYa9-zQDTZdIQhm5VRUxnuhKIidDXgPQsLkfpuk="))).asProtoIdentityID, immutableMetaProperties, immutableProperties, mutableMetaProperties, mutableProperties)

  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(identitiesDefineMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = 21, sequence = 2, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)

  val txRawBytesString = utilities.Secrets.byteArrayToString(txRawBytes)
  println("0x" + txRawBytesString)
}