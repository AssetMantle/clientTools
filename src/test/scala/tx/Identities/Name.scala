package tx.Identities

import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.id.base.StringID

class Name extends AnyFunSuite {
  val stringID = StringID("test2")
  val identitiesNubMsg = utilities.BlockchainTransaction.getNameIdentityMsgAsAny(testConstants.setup.balanceAccount.address, stringID.asProtoStringID)
  val seq = 24
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(identitiesNubMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  val txRawBytesString: String = "0x" + utilities.Encoding.byteArrayToString(txRawBytes)
  println(utilities.doGET.synchronous(testConstants.setup.broadcastURI + txRawBytesString))
}
