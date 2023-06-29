package tx.Identities

import com.google.protobuf
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite


class Provision extends AnyFunSuite {

  val identitiesProvisionMsg: protobuf.Any = utilities.BlockchainTransaction.getProvisionIdentityMsgAsAny(testConstants.setup.balanceAccount.address, testConstants.setup.provisionAddress, testConstants.setup.issuedIdentityID.asProtoIdentityID)

  val seq = 22
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(identitiesProvisionMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)

  utilities.Tx.doTx(txRawBytes)
}
