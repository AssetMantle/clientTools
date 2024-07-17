package tx.Assets

import com.google.protobuf
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base._
import schema.data.{constants => dataConstants}
import schema.id.base._
import schema.property.base.{MesaProperty, MetaProperty}
import schema.types.Height

class DefineVC extends AnyFunSuite {

  val seq = 2
  val immutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(id = PropertyID(keyID = StringID("verifierID"), typeID = schema.id.constants.IdentityIDType), data = IDData(IdentityID(Array[Byte]()))),
    MetaProperty(id = PropertyID(keyID = StringID("assetID"), typeID = schema.id.constants.AssetIDType), data = IDData(AssetID(Array[Byte]()))),
    MetaProperty(id = PropertyID(keyID = StringID("value"), typeID = schema.data.constants.StringDataTypeID), data = StringData("")),
    MetaProperty(id = PropertyID(keyID = StringID("note"), typeID = schema.data.constants.StringDataTypeID), data = StringData("")),
    schema.constants.Properties.LockHeightProperty.copy(data = HeightData(Height(-1)))
  )

  val immutableProperties: Seq[MesaProperty] = Seq()

  val mutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("expiry"), dataConstants.NumberDataTypeID), NumberData(0)),
    MetaProperty(id = PropertyID(keyID = StringID("externalLink"), typeID = schema.data.constants.StringDataTypeID), data = StringData("")),
  )
  val mutableProperties: Seq[MesaProperty] = Seq()
  val defineMsg: protobuf.Any = utilities.BlockchainTransaction.getDefineAssetMsg(testConstants.setup.balanceAccount.address, testConstants.setup.nubIdentityID.asProtoIdentityID, immutableMetaProperties, immutableProperties, mutableMetaProperties, mutableProperties)
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(defineMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  println("0x" + utilities.Encoding.byteArrayToString(txRawBytes))
  println(utilities.Tx.doTx(txRawBytes))
}