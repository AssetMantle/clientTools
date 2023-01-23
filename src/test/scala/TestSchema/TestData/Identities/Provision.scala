package TestSchema.TestData.Identities

import TestSchema.TestData.Constants.Setup
import org.scalatest.funsuite.AnyFunSuite
import commonUtilities.ID
import org.bitcoinj.core.ECKey
import schema.data.base.StringData
import schema.id.base.{HashID, IdentityID, PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.MetaProperty

class Provision extends AnyFunSuite{
  val setup = new Setup()

  val identityID = IdentityID(ID.generateHashID(StringID("testStringID1").getBytes)).asProtoIdentityID

  val identitiesProvisionMsg = commonUtilities.BlockchainTransaction.getProvisionIdentityMsgAsAny(setup.balanceAccount.address, setup.balanceAccount.address, setup.identityID.asProtoIdentityID)

  val (txRawBytes, memo): (Array[Byte], String) = commonUtilities.BlockchainTransaction.getTxRawBytesWithSignedMemo(messages = Seq(identitiesProvisionMsg), fee = setup.amount, gasLimit = 1000000, accountNumber = 11, sequence = 53, ecKey = ECKey.fromPrivate(setup.balanceAccount.privateKey), chainID = setup.chainId, memoSignerPrivateKey = setup.balanceAccount.privateKey)

  val txRawBytesString = commonUtilities.Secrets.byteArrayToString(txRawBytes)
  println("0x" + txRawBytesString)
}
