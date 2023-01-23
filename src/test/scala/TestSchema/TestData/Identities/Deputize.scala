package TestSchema.TestData.Identities

import TestSchema.TestData.Constants.Setup
import commonUtilities.AttoNumber
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base.{DecData, StringData}
import schema.id.base.{PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.MetaProperty

class Deputize extends AnyFunSuite{
  val setup = new Setup()

  val fromID = setup.identityID

  val toID = setup.secondaryIdentityID

  val maintainedProperties = PropertyList(Seq(MetaProperty(PropertyID(StringID("supply"), StringID("D")), DecData(AttoNumber.zero).toAnyData))).asProtoPropertyList

  val identitiesDeputizeMsg = commonUtilities.BlockchainTransaction.getDeputizeIdentityMsgAsAny(setup.balanceAccount.address, fromID.asProtoIdentityID, toID.asProtoIdentityID, setup.classificationID.asProtoClassificationID, maintainedProperties, true, true, true, true, true, true)

  val (txRawBytes, memo): (Array[Byte], String) = commonUtilities.BlockchainTransaction.getTxRawBytesWithSignedMemo(messages = Seq(identitiesDeputizeMsg), fee = setup.amount, gasLimit = 1000000, accountNumber = 11, sequence = 57, ecKey = ECKey.fromPrivate(setup.balanceAccount.privateKey), chainID = setup.chainId, memoSignerPrivateKey = setup.balanceAccount.privateKey)

  val txRawBytesString = commonUtilities.Secrets.byteArrayToString(txRawBytes)
  println("0x" + txRawBytesString)
}
