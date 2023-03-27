package schema.Identities

import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite


class Provision extends AnyFunSuite {

  val identitiesProvisionMsg = utilities.BlockchainTransaction.getProvisionIdentityMsgAsAny(testConstants.setup.balanceAccount.address, testConstants.setup.wallet1.address, testConstants.setup.identityID.asProtoIdentityID)

  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(identitiesProvisionMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = 11, sequence = 58, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)

  val txRawBytesString = utilities.Secrets.byteArrayToString(txRawBytes)
  println("0x" + txRawBytesString)
}
