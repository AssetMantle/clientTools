package tx.Assets

import com.google.protobuf
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base._
import schema.id.base.{HashID, IdentityID, PropertyID, StringID}
import schema.property.base.{MesaProperty, MetaProperty}

class DefineTicketing extends AnyFunSuite {

  val seq = 1
  val immutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(id = PropertyID(keyID = StringID("creatorId"), typeID = schema.id.constants.IdentityIDType), data = IDData(IdentityID(Array[Byte]()))),
    MetaProperty(id = PropertyID(keyID = StringID("name"), typeID = schema.data.constants.StringDataTypeID), data = StringData("")),
    MetaProperty(id = PropertyID(keyID = StringID("description"), typeID = schema.data.constants.StringDataTypeID), data = StringData("")),
    MetaProperty(id = PropertyID(keyID = StringID("address"), typeID = schema.data.constants.StringDataTypeID), data = StringData("")),
    MetaProperty(id = PropertyID(keyID = StringID("postalCode"), typeID = schema.data.constants.StringDataTypeID), data = StringData("")),
    MetaProperty(id = PropertyID(keyID = StringID("city"), typeID = schema.data.constants.StringDataTypeID), data = StringData("")),
    MetaProperty(id = PropertyID(keyID = StringID("contactNumber"), typeID = schema.data.constants.StringDataTypeID), data = StringData("")),
    MetaProperty(id = PropertyID(keyID = StringID("startEpochTime"), typeID = schema.data.constants.NumberDataTypeID), data = NumberData(0)),
    MetaProperty(id = PropertyID(keyID = StringID("endEpochTime"), typeID = schema.data.constants.NumberDataTypeID), data = NumberData(0)),
    MetaProperty(id = PropertyID(keyID = StringID("fileResource"), typeID = schema.data.constants.LinkedDataTypeID), data = LinkedData(resourceID = HashID(Array[Byte]()), extensionID = StringID(""), serviceEndpoint = "")),
    schema.constants.Properties.SupplyProperty.copy(data = NumberData(0))
  )

  val immutableProperties: Seq[MesaProperty] = Seq()

  val mutableMetaProperties: Seq[MetaProperty] = Seq()
  val mutableProperties: Seq[MesaProperty] = Seq()
  val identitiesDefineMsg: protobuf.Any = utilities.BlockchainTransaction.getDefineAssetMsg(testConstants.setup.balanceAccount.address, testConstants.setup.nubIdentityID.asProtoIdentityID, immutableMetaProperties, immutableProperties, mutableMetaProperties, mutableProperties)
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(identitiesDefineMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  println("0x" + utilities.Encoding.byteArrayToString(txRawBytes))
  println(utilities.Tx.doTx(txRawBytes))
}