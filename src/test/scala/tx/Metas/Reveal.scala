package tx.Metas

import com.google.protobuf
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.Data
import schema.data.base._
import schema.id.base.StringID
import schema.types.Height

class Reveal extends AnyFunSuite {

  //Data that can be sent in a metas reveal transaction
  val dataTypes: Seq[Data] = Seq(
    AccAddressData(testConstants.setup.balanceAccount.address),
    BooleanData(true),
    DecData(3.0),
    HeightData(Height(1234)),
    IDData(StringID("testStringID")),
    IDData(testConstants.setup.assetID),
    IDData(testConstants.setup.identityClassificationID),
    IDData(testConstants.setup.assetClassificationID),
    testConstants.Data.listData,
    NumberData(987),
    StringData("testnetData"))

  val metasRevealMsgs: Seq[protobuf.Any] = dataTypes.map(x => utilities.BlockchainTransaction.getRevealMsgAsAny(testConstants.setup.balanceAccount.address, x.toAnyData))
  val seq = 2
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = metasRevealMsgs, fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  utilities.Tx.doTx(txRawBytes)

}