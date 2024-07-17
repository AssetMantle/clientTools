
package tx.Assets

import com.google.protobuf
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base._
import schema.id.base._
import schema.property.base.{MesaProperty, MetaProperty}
import schema.types.Height

class DefinePoints extends AnyFunSuite {

  val seq = 3
  val immutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(id = PropertyID(keyID = StringID("superOrganizationId"), typeID = schema.data.constants.StringDataTypeID), data = StringData(""))
  )

  val immutableProperties: Seq[MesaProperty] = Seq()

  val mutableMetaProperties: Seq[MetaProperty] = Seq(
    schema.constants.Properties.SupplyProperty.copy(data = NumberData(0))
  )
  val mutableProperties: Seq[MesaProperty] = Seq()
  val defineMsg: protobuf.Any = utilities.BlockchainTransaction.getDefineAssetMsg(testConstants.setup.balanceAccount.address, testConstants.setup.nubIdentityID.asProtoIdentityID, immutableMetaProperties, immutableProperties, mutableMetaProperties, mutableProperties)
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(defineMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  println("0x" + utilities.Encoding.byteArrayToString(txRawBytes))
  println(utilities.Tx.doTx(txRawBytes))
}