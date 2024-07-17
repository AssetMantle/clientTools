package tx.Orders

import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite

import java.text.DecimalFormat

class Cancel extends AnyFunSuite {
  val seq = 33
  val fullFormat = new DecimalFormat("#0.000000000000000000")

  val fromID = testConstants.setup.nubIdentityID

  val msg = utilities.BlockchainTransaction.getCancelOrderMsgAsAny(
    testConstants.setup.balanceAccount.address,
    fromID.asProtoIdentityID,
    testConstants.setup.orderID.asProtoOrderID)
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(msg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  utilities.Tx.doTx(txRawBytes)
}
