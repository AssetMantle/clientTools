package TestSchema.TestData.Identities

import TestSchema.TestData.Constants.Setup
import org.scalatest.funsuite.AnyFunSuite
import org.bitcoinj.core.ECKey


class Provision extends AnyFunSuite{
  val setup = new Setup()

  val identitiesProvisionMsg = commonUtilities.BlockchainTransaction.getProvisionIdentityMsgAsAny(setup.balanceAccount.address, setup.wallet1.address, setup.identityID.asProtoIdentityID)

  val (txRawBytes, memo): (Array[Byte], String) = commonUtilities.BlockchainTransaction.getTxRawBytesWithSignedMemo(messages = Seq(identitiesProvisionMsg), fee = setup.amount, gasLimit = 1000000, accountNumber = 11, sequence = 58, ecKey = ECKey.fromPrivate(setup.balanceAccount.privateKey), chainID = setup.chainId, memoSignerPrivateKey = setup.balanceAccount.privateKey)

  val txRawBytesString = commonUtilities.Secrets.byteArrayToString(txRawBytes)
  println("0x" + txRawBytesString)
}
