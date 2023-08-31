package tx

import com.google.protobuf
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite

class SendCoinTransactionTest extends AnyFunSuite {
  println(testConstants.setup.balanceAccount.address)
  val sendCoinMsg: protobuf.Any = utilities.BlockchainTransaction.getSendCoinMsgAsAny(fromAddress = testConstants.setup.balanceAccount.address, toAddress = testConstants.setup.balanceAccount.address, amount = Seq(testConstants.setup.amount))
  val seq = 1 //utilities.Account.getSequenceAndAccountNumber(testConstants.setup.balanceAccount.address)
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(sendCoinMsg), fee = testConstants.setup.amount, gasLimit = 100000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  val txHash: String = utilities.Secrets.sha256HashHexString(txRawBytes)
  val txRawBytesString: String = "0x" + utilities.Secrets.byteArrayToString(txRawBytes)
  println(utilities.doGET.synchronous(testConstants.setup.broadcastURI + txRawBytesString))

}