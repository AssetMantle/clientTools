package schema.Identities

import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite

class Quash extends AnyFunSuite {
  val identitiesQuashMsg = utilities.BlockchainTransaction.getQuashIdentityMsgAsAny(testConstants.setup.balanceAccount.address, testConstants.setup.nubIdentityID.asProtoIdentityID, testConstants.setup.secondaryIdentityID.asProtoIdentityID)

  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(identitiesQuashMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = 11, sequence = 60, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)

  val txRawBytesString = utilities.Secrets.byteArrayToString(txRawBytes)
  println("0x" + txRawBytesString)
}
