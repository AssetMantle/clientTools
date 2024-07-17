package tx.Identities

import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite

class Quash extends AnyFunSuite {
  val identitiesQuashMsg = utilities.BlockchainTransaction.getQuashIdentityMsgAsAny(testConstants.setup.balanceAccount.address, testConstants.setup.nubIdentityID.asProtoIdentityID, testConstants.setup.issuedIdentityID.asProtoIdentityID)

  val seq = 14
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(identitiesQuashMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)

  val txRawBytesString = utilities.Encoding.byteArrayToString(txRawBytes)
  utilities.Tx.doTx(txRawBytes)
}
