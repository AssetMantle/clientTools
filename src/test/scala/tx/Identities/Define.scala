package tx.Identities

import com.google.protobuf
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.constants
import schema.data.base._
import schema.data.{constants => dataConstants}
import schema.id.base.{AssetID, PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.{MesaProperty, MetaProperty}
import schema.types.Height

class Define extends AnyFunSuite {

  val seq = 16
  val immutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("IdentityIM1"), dataConstants.AccAddressDataTypeID), AccAddressData(Array[Byte]())),
    MetaProperty(PropertyID(StringID("IdentityIM2"), dataConstants.BooleanDataTypeID), BooleanData(false)),
    MetaProperty(PropertyID(StringID("IdentityIM3"), dataConstants.DecDataTypeID), DecData("0")),
    MetaProperty(PropertyID(StringID("IdentityIM4"), dataConstants.HeightDataTypeID), HeightData(Height(-1))),
    MetaProperty(PropertyID(StringID("IdentityIM5"), dataConstants.ListDataTypeID), ListData(Seq())),
    MetaProperty(PropertyID(StringID("IdentityIM6"), dataConstants.NumberDataTypeID), NumberData(0)),
    MetaProperty(PropertyID(StringID("IdentityIM7"), dataConstants.StringDataTypeID), StringData("")),
    MetaProperty(PropertyID(StringID("IdentityIM8"), schema.id.constants.StringIDType), IDData(StringID(""))),
    MetaProperty(PropertyID(StringID("IdentityIM9"), schema.id.constants.AssetIDType), IDData(AssetID(""))),
  )

  val immutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("IdentityI1"), dataConstants.AccAddressDataTypeID), AccAddressData(Array[Byte]())),
    MesaProperty(PropertyID(StringID("IdentityI2"), dataConstants.BooleanDataTypeID), BooleanData(false)),
    MesaProperty(PropertyID(StringID("IdentityI3"), dataConstants.DecDataTypeID), DecData("0")),
    MesaProperty(PropertyID(StringID("IdentityI4"), dataConstants.HeightDataTypeID), HeightData(Height(-1))),
    MesaProperty(PropertyID(StringID("IdentityI5"), dataConstants.ListDataTypeID), ListData(Seq())),
    MesaProperty(PropertyID(StringID("IdentityI6"), dataConstants.NumberDataTypeID), NumberData(0)),
    MesaProperty(PropertyID(StringID("IdentityI7"), dataConstants.StringDataTypeID), StringData("")),
    MesaProperty(PropertyID(StringID("IdentityI8"), schema.id.constants.StringIDType), IDData(StringID(""))),
  )

  val mutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("IdentityMM1"), dataConstants.AccAddressDataTypeID), AccAddressData(Array[Byte]())),
    MetaProperty(PropertyID(StringID("IdentityMM2"), dataConstants.BooleanDataTypeID), BooleanData(false)),
    MetaProperty(PropertyID(StringID("IdentityMM3"), dataConstants.DecDataTypeID), DecData("0")),
    MetaProperty(PropertyID(StringID("IdentityMM4"), dataConstants.HeightDataTypeID), HeightData(Height(-1))),
    MetaProperty(PropertyID(StringID("IdentityMM5"), dataConstants.ListDataTypeID), ListData(Seq())),
    MetaProperty(PropertyID(StringID("IdentityMM6"), dataConstants.NumberDataTypeID), NumberData(0)),
    MetaProperty(PropertyID(StringID("IdentityMM7"), dataConstants.StringDataTypeID), StringData("")),
    MetaProperty(PropertyID(StringID("IdentityMM8"), schema.id.constants.StringIDType), IDData(StringID(""))),
  )
  val mutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("IdentityM1"), dataConstants.AccAddressDataTypeID), AccAddressData(Array[Byte]())),
    MesaProperty(PropertyID(StringID("IdentityM2"), dataConstants.BooleanDataTypeID), BooleanData(false)),
    MesaProperty(PropertyID(StringID("IdentityM3"), dataConstants.DecDataTypeID), DecData("0")),
    MesaProperty(PropertyID(StringID("IdentityM4"), dataConstants.HeightDataTypeID), HeightData(Height(-1))),
    MesaProperty(PropertyID(StringID("IdentityM5"), dataConstants.ListDataTypeID), ListData(Seq())),
    MesaProperty(PropertyID(StringID("IdentityM6"), dataConstants.NumberDataTypeID), NumberData(0)),
    MesaProperty(PropertyID(StringID("IdentityM7"), dataConstants.StringDataTypeID), StringData("")),
    MesaProperty(PropertyID(StringID("IdentityM8"), schema.id.constants.StringIDType), IDData(StringID(""))),
  )
  val identitiesDefineMsg: protobuf.Any = utilities.BlockchainTransaction.getDefineIdentityMsgAsAny(testConstants.setup.balanceAccount.address, testConstants.setup.nubIdentityID.asProtoIdentityID, PropertyList(immutableMetaProperties).asProtoPropertyList, PropertyList(immutableProperties).asProtoPropertyList, PropertyList(mutableMetaProperties).asProtoPropertyList, PropertyList(mutableProperties).asProtoPropertyList)
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(identitiesDefineMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)

  println(utilities.Tx.doTx(txRawBytes))
}