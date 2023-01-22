package TestSchema.TestData.Metas

import TestSchema.TestData.Constants.Setup
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base._
import schema.id.base.StringID
import schema.types.Height

class MetasRevealTransactionTest extends AnyFunSuite {
  val setup = new Setup()

  //Data that can be sent in a metas reveal transaction
  val dataTypes = Seq(StringData("testnetData"), DecData(3.0), HeightData(Height(1234)), IDData(StringID("testStringID").toAnyID), ListData(Seq(StringData("listData1").toAnyData, StringData("listData2").toAnyData)))

  dataTypes.foreach(data => {
    val metasRevealMsg = commonUtilities.BlockchainTransaction.getRevealMsgAsAny(setup.balanceAccount.address, data.toAnyData)

    val (txRawBytes, memo): (Array[Byte], String) = commonUtilities.BlockchainTransaction.getTxRawBytesWithSignedMemo(messages = Seq(metasRevealMsg), fee = setup.amount, gasLimit = 1000000, accountNumber = 11, sequence = 24, ecKey = ECKey.fromPrivate(setup.balanceAccount.privateKey), chainID = setup.chainId, memoSignerPrivateKey = setup.balanceAccount.privateKey)

    val txRawBytesString = commonUtilities.Secrets.byteArrayToString(txRawBytes)
    println("0x" + txRawBytesString)
  })

}