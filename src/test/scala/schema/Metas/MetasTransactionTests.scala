package schema.Metas

import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base._
import schema.id.base.StringID
import schema.types.Height

class MetasRevealTransactionTest extends AnyFunSuite {

  //Data that can be sent in a metas reveal transaction
  val dataTypes = Seq(StringData("testnetData"), DecData(3.0), HeightData(Height(1234)), IDData(StringID("testStringID").toAnyID), ListData(Seq(StringData("listData1").toAnyData, StringData("listData2").toAnyData)))

  dataTypes.foreach(data => {
    val metasRevealMsg = utilities.BlockchainTransaction.getRevealMsgAsAny(testConstants.setup.balanceAccount.address, data.toAnyData)

    val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(metasRevealMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = 11, sequence = 24, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)

    val txRawBytesString = utilities.Secrets.byteArrayToString(txRawBytes)
    println("0x" + txRawBytesString)
  })

}