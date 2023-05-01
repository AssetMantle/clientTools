package tx.Identities

import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite


class Provision extends AnyFunSuite {

  val identitiesProvisionMsg = utilities.BlockchainTransaction.getProvisionIdentityMsgAsAny(testConstants.setup.balanceAccount.address, utilities.Wallet.getRandomWallet.address, testConstants.setup.issuedIdentityID.asProtoIdentityID)

  val seq = 21
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(identitiesProvisionMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)

  utilities.Tx.doTx(txRawBytes)
}
