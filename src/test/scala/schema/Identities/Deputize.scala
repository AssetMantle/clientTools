package schema.Identities

import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base.DecData
import schema.id.base.{PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.MetaProperty
import utilities.AttoNumber

class Deputize extends AnyFunSuite {

  val fromID = testConstants.setup.nubIdentityID

  val toID = testConstants.setup.secondaryIdentityID

  val maintainedProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("supply"), StringID("D")), DecData(AttoNumber.zero).toAnyData))).asProtoPropertyList

  val identitiesDeputizeMsg = utilities.BlockchainTransaction.getDeputizeIdentityMsgAsAny(testConstants.setup.balanceAccount.address, fromID.asProtoIdentityID, toID.asProtoIdentityID, testConstants.setup.classificationID.asProtoClassificationID, maintainedProperties, true, true, true, true, true, true)

  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(identitiesDeputizeMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = 11, sequence = 57, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)

  val txRawBytesString = utilities.Secrets.byteArrayToString(txRawBytes)
  println("0x" + txRawBytesString)
}
