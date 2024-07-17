
package tx.Assets

import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite

class Revoke extends AnyFunSuite {

  val fromID = testConstants.setup.nubIdentityID
  val toID = testConstants.setup.issuedIdentityID

  val seq = 14

  // negative case
  val msg = utilities.BlockchainTransaction.getRevokeAssetMsgAsAny(testConstants.setup.balanceAccount.address, fromID.asProtoIdentityID, toID.asProtoIdentityID, testConstants.setup.assetClassificationID.asProtoClassificationID)

  // positive case
//  val msg = utilities.BlockchainTransaction.getRevokeAssetMsgAsAny(testConstants.setup.balanceAccount.address, toID.asProtoIdentityID, fromID.asProtoIdentityID, testConstants.setup.assetClassificationID.asProtoClassificationID)
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(msg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  utilities.Tx.doTx(txRawBytes)
}
