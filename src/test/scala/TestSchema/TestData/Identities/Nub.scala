package TestSchema.TestData.Identities

import TestSchema.TestData.Constants.Setup
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.id.base.StringID

class Nub extends AnyFunSuite{
  val setup = new Setup()

  val stringID = StringID("testStringID2")

  val identitiesNubMsg = commonUtilities.BlockchainTransaction.getNubIdentityMsgAsAny(setup.balanceAccount.address, stringID.asProtoStringID)

  val (txRawBytes, memo): (Array[Byte], String) = commonUtilities.BlockchainTransaction.getTxRawBytesWithSignedMemo(messages = Seq(identitiesNubMsg), fee = setup.amount, gasLimit = 1000000, accountNumber = 11, sequence = 54, ecKey = ECKey.fromPrivate(setup.balanceAccount.privateKey), chainID = setup.chainId, memoSignerPrivateKey = setup.balanceAccount.privateKey)

  val txRawBytesString = commonUtilities.Secrets.byteArrayToString(txRawBytes)
  println("0x" + txRawBytesString)
}
