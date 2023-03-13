package TestSchema.TestData

import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import Constants.Setup

import scalaj.http.Http

class SendCoinTransactionTest extends AnyFunSuite {

  val setup = new Setup()

  val sendCoinMsg = commonUtilities.BlockchainTransaction.getSendCoinMsgAsAny(fromAddress = setup.balanceAccount.address, toAddress = setup.balanceAccount.address, amount = Seq(setup.amount))
  println(setup.balanceAccount.address)
  //val response = Http(setup.accountUrl)//"mantle1pkkayn066msg6kn33wnl5srhdt3tnu2vuet86j")

  val (txRawBytes, memo): (Array[Byte], String) = commonUtilities.BlockchainTransaction.getTxRawBytesWithSignedMemo(messages = Seq(sendCoinMsg), fee = setup.amount, gasLimit = 100000, accountNumber = 11, sequence = 19, ecKey = ECKey.fromPrivate(setup.balanceAccount.privateKey), chainID = setup.chainId, memoSignerPrivateKey = setup.balanceAccount.privateKey)
  val txHash = commonUtilities.Secrets.sha256HashHexString(txRawBytes)
  val txRawBytesString = commonUtilities.Secrets.byteArrayToString(txRawBytes)

  println("0x" + txRawBytesString)
}