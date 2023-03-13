package TestSchema.TestData.Identities

import TestSchema.TestData.Constants.Setup
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite

class Quash extends AnyFunSuite{
  val setup = new Setup()

  val identitiesQuashMsg = commonUtilities.BlockchainTransaction.getQuashIdentityMsgAsAny(setup.balanceAccount.address, setup.identityID.asProtoIdentityID, setup.secondaryIdentityID.asProtoIdentityID)

  val (txRawBytes, memo): (Array[Byte], String) = commonUtilities.BlockchainTransaction.getTxRawBytesWithSignedMemo(messages = Seq(identitiesQuashMsg), fee = setup.amount, gasLimit = 1000000, accountNumber = 11, sequence = 60, ecKey = ECKey.fromPrivate(setup.balanceAccount.privateKey), chainID = setup.chainId, memoSignerPrivateKey = setup.balanceAccount.privateKey)

  val txRawBytesString = commonUtilities.Secrets.byteArrayToString(txRawBytes)
  println("0x" + txRawBytesString)
}
