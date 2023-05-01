package tx.Identities

import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.id.base.StringID

class Nub extends AnyFunSuite {
  val stringID = StringID("test")
  val identitiesNubMsg = utilities.BlockchainTransaction.getNubIdentityMsgAsAny(testConstants.setup.balanceAccount.address, stringID.asProtoStringID)
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(identitiesNubMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = 1, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  val txRawBytesString: String = "0x" + utilities.Secrets.byteArrayToString(txRawBytes)
  println(utilities.doGET.synchronous(testConstants.setup.broadcastURI + txRawBytesString))
}
