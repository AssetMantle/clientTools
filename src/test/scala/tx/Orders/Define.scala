package tx.Orders

import com.google.protobuf
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base._
import schema.data.{constants => dataConstants}
import schema.id.base.{PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.{MesaProperty, MetaProperty}
import schema.types.Height

class Define extends AnyFunSuite {
  val seq = 15
  val immutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("OrderIM1"), dataConstants.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address)),
    MetaProperty(PropertyID(StringID("OrderIM2"), dataConstants.BooleanDataTypeID), BooleanData(false)),
    MetaProperty(PropertyID(StringID("OrderIM3"), dataConstants.DecDataTypeID), DecData(BigDecimal(0))),
    MetaProperty(PropertyID(StringID("OrderIM4"), dataConstants.HeightDataTypeID), HeightData(Height(-1))),
    MetaProperty(PropertyID(StringID("OrderIM5"), dataConstants.ListDataTypeID), ListData(Seq())),
    MetaProperty(PropertyID(StringID("OrderIM6"), dataConstants.NumberDataTypeID), NumberData(0)),
    MetaProperty(PropertyID(StringID("OrderIM7"), dataConstants.StringDataTypeID), StringData("")),
    MetaProperty(PropertyID(StringID("OrderIM8"), schema.id.constants.StringIDType), IDData(StringID(""))),
  )

  val immutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("OrderI1"), dataConstants.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address)),
    MesaProperty(PropertyID(StringID("OrderI2"), dataConstants.BooleanDataTypeID), BooleanData(false)),
    MesaProperty(PropertyID(StringID("OrderI3"), dataConstants.DecDataTypeID), DecData(BigDecimal(0))),
    MesaProperty(PropertyID(StringID("OrderI4"), dataConstants.HeightDataTypeID), HeightData(Height(-1))),
    MesaProperty(PropertyID(StringID("OrderI5"), dataConstants.ListDataTypeID), ListData(Seq())),
    MesaProperty(PropertyID(StringID("OrderI6"), dataConstants.NumberDataTypeID), NumberData(0)),
    MesaProperty(PropertyID(StringID("OrderI7"), dataConstants.StringDataTypeID), StringData("")),
    MesaProperty(PropertyID(StringID("OrderI8"), schema.id.constants.StringIDType), IDData(StringID(""))),
  )

  val mutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("OrderMM1"), dataConstants.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address)),
    MetaProperty(PropertyID(StringID("OrderMM2"), dataConstants.BooleanDataTypeID), BooleanData(false)),
    MetaProperty(PropertyID(StringID("OrderMM3"), dataConstants.DecDataTypeID), DecData(BigDecimal(0))),
    MetaProperty(PropertyID(StringID("OrderMM4"), dataConstants.HeightDataTypeID), HeightData(Height(-1))),
    MetaProperty(PropertyID(StringID("OrderMM5"), dataConstants.ListDataTypeID), ListData(Seq())),
    MetaProperty(PropertyID(StringID("OrderMM6"), dataConstants.NumberDataTypeID), NumberData(0)),
    MetaProperty(PropertyID(StringID("OrderMM7"), dataConstants.StringDataTypeID), StringData("")),
    MetaProperty(PropertyID(StringID("OrderMM8"), schema.id.constants.StringIDType), IDData(StringID(""))),
  )
  val mutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("OrderM1"), dataConstants.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address)),
    MesaProperty(PropertyID(StringID("OrderM2"), dataConstants.BooleanDataTypeID), BooleanData(false)),
    MesaProperty(PropertyID(StringID("OrderM3"), dataConstants.DecDataTypeID), DecData(BigDecimal(0))),
    MesaProperty(PropertyID(StringID("OrderM4"), dataConstants.HeightDataTypeID), HeightData(Height(-1))),
    MesaProperty(PropertyID(StringID("OrderM5"), dataConstants.ListDataTypeID), ListData(Seq())),
    MesaProperty(PropertyID(StringID("OrderM6"), dataConstants.NumberDataTypeID), NumberData(0)),
    MesaProperty(PropertyID(StringID("OrderM7"), dataConstants.StringDataTypeID), StringData("")),
    MesaProperty(PropertyID(StringID("OrderM8"), schema.id.constants.StringIDType), IDData(StringID(""))),
  )
//  val defineMsg: protobuf.Any = utilities.BlockchainTransaction.getDefineOrderMsg(testConstants.setup.balanceAccount.address, testConstants.setup.nubIdentityID.asProtoIdentityID, PropertyList(immutableMetaProperties).asProtoPropertyList, PropertyList(immutableProperties).asProtoPropertyList, PropertyList(mutableMetaProperties).asProtoPropertyList, PropertyList(mutableProperties).asProtoPropertyList)

  val imm2 = Seq(MetaProperty(PropertyID(StringID("origin"), dataConstants.StringDataTypeID), StringData("MantlePlaceSecondaryMarket")))
  val define2Msg: protobuf.Any = utilities.BlockchainTransaction.getDefineOrderMsg(testConstants.setup.balanceAccount.address, testConstants.setup.nubIdentityID.asProtoIdentityID, PropertyList(imm2).asProtoPropertyList, PropertyList(Seq()).asProtoPropertyList, PropertyList(Seq()).asProtoPropertyList, PropertyList(Seq()).asProtoPropertyList)

  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(define2Msg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)

  println(utilities.Tx.doTx(txRawBytes))
}