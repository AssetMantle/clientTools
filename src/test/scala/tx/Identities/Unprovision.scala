package tx.Identities

import com.google.protobuf
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite


class Unprovision extends AnyFunSuite {

  val identitiesUnprovisionMsg: protobuf.Any = utilities.BlockchainTransaction.getUnprovisionIdentityMsgAsAny(testConstants.setup.balanceAccount.address, testConstants.setup.provisionAddress, testConstants.setup.issuedIdentityID.asProtoIdentityID)

  val seq = 23
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(identitiesUnprovisionMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)

  utilities.Tx.doTx(txRawBytes)
}
