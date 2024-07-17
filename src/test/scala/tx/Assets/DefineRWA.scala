package tx.Assets

import com.google.protobuf
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base._
import schema.data.{constants => dataConstants}
import schema.id.base.{HashID, IdentityID, PropertyID, StringID}
import schema.property.base.{MesaProperty, MetaProperty}

class DefineRWA extends AnyFunSuite {

  val seq = 2
  val immutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(id = PropertyID(keyID = StringID("creatorId"), typeID = schema.id.constants.IdentityIDType), data = IDData(IdentityID(Array[Byte]()))),
    MetaProperty(id = PropertyID(keyID = StringID("registrationId"), typeID = schema.data.constants.StringDataTypeID), data = StringData("")),
    MetaProperty(id = PropertyID(keyID = StringID("postalCode"), typeID = schema.data.constants.StringDataTypeID), data = StringData("")),
    MetaProperty(id = PropertyID(keyID = StringID("address"), typeID = schema.data.constants.StringDataTypeID), data = StringData("")),
    MetaProperty(id = PropertyID(keyID = StringID("geoLocation"), typeID = schema.data.constants.StringDataTypeID), data = StringData("")),
    MetaProperty(id = PropertyID(keyID = StringID("totalArea"), typeID = schema.data.constants.DecDataTypeID), data = DecData(0.0)),
    MetaProperty(id = PropertyID(keyID = StringID("fileResource"), typeID = schema.data.constants.LinkedDataTypeID), data = LinkedData(resourceID = HashID(Array[Byte]()), extensionID = StringID(""), serviceEndpoint = "")),
  )

  val immutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(id = PropertyID(keyID = StringID("secretValue"), typeID = schema.data.constants.StringDataTypeID), data = StringData("")),
  )

  val mutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("rented"), dataConstants.BooleanDataTypeID), BooleanData(false)),
    MetaProperty(PropertyID(StringID("rentalAmount"), dataConstants.DecDataTypeID), DecData(0.0)),
    MetaProperty(PropertyID(StringID("rentalPeriodicity"), dataConstants.NumberDataTypeID), NumberData(0)),
    MetaProperty(PropertyID(StringID("documentLink"), dataConstants.StringDataTypeID), StringData("")),
    schema.constants.Properties.SupplyProperty.copy(data = NumberData(0))
  )
  val mutableProperties: Seq[MesaProperty] = Seq()
  val identitiesDefineMsg: protobuf.Any = utilities.BlockchainTransaction.getDefineAssetMsg(testConstants.setup.balanceAccount.address, testConstants.setup.nubIdentityID.asProtoIdentityID, immutableMetaProperties, immutableProperties, mutableMetaProperties, mutableProperties)
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(identitiesDefineMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  println("0x" + utilities.Encoding.byteArrayToString(txRawBytes))
  println(utilities.Tx.doTx(txRawBytes))
}