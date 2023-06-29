package tx.Assets

import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite

class Renumerate extends AnyFunSuite {

  val fromID = testConstants.setup.nubIdentityID

  val seq = 17
  val msg = utilities.BlockchainTransaction.getRenumerateAssetMsgAsAny(testConstants.setup.balanceAccount.address, fromID.asProtoIdentityID, testConstants.setup.assetID.asProtoAssetID)
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(msg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  utilities.Tx.doTx(txRawBytes)
}
