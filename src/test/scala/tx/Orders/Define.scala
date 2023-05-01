package tx.Orders

import com.google.protobuf
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.constants
import schema.data.base._
import schema.id.base.{PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.{MesaProperty, MetaProperty}
import schema.types.Height

class Define extends AnyFunSuite {

  val immutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("OrderIM1"), constants.Data.AccAddressDataTypeID), AccAddressData(Array[Byte]())),
    MetaProperty(PropertyID(StringID("OrderIM2"), constants.Data.BooleanDataTypeID), BooleanData(false)),
    MetaProperty(PropertyID(StringID("OrderIM3"), constants.Data.DecDataTypeID), DecData(BigDecimal(0))),
    MetaProperty(PropertyID(StringID("OrderIM4"), constants.Data.HeightDataTypeID), HeightData(Height(-1))),
    MetaProperty(PropertyID(StringID("OrderIM5"), constants.Data.ListDataTypeID), ListData(Seq())),
    MetaProperty(PropertyID(StringID("OrderIM6"), constants.Data.NumberDataTypeID), NumberData(0)),
    MetaProperty(PropertyID(StringID("OrderIM7"), constants.Data.StringDataTypeID), StringData("")),
  )

  val immutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("OrderI1"), constants.Data.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address)),
    MesaProperty(PropertyID(StringID("OrderI2"), constants.Data.BooleanDataTypeID), BooleanData(false)),
    MesaProperty(PropertyID(StringID("OrderI3"), constants.Data.DecDataTypeID), DecData(BigDecimal(0))),
    MesaProperty(PropertyID(StringID("OrderI4"), constants.Data.HeightDataTypeID), HeightData(Height(-1))),
    MesaProperty(PropertyID(StringID("OrderI5"), constants.Data.ListDataTypeID), ListData(Seq())),
    MesaProperty(PropertyID(StringID("OrderI6"), constants.Data.NumberDataTypeID), NumberData(0)),
    MesaProperty(PropertyID(StringID("OrderI7"), constants.Data.StringDataTypeID), StringData("")),
  )

  val mutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("OrderMM1"), constants.Data.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address)),
    MetaProperty(PropertyID(StringID("OrderMM2"), constants.Data.BooleanDataTypeID), BooleanData(false)),
    MetaProperty(PropertyID(StringID("OrderMM3"), constants.Data.DecDataTypeID), DecData(BigDecimal(0))),
    MetaProperty(PropertyID(StringID("OrderMM4"), constants.Data.HeightDataTypeID), HeightData(Height(-1))),
    MetaProperty(PropertyID(StringID("OrderMM5"), constants.Data.ListDataTypeID), ListData(Seq())),
    MetaProperty(PropertyID(StringID("OrderMM6"), constants.Data.NumberDataTypeID), NumberData(0)),
    MetaProperty(PropertyID(StringID("OrderMM7"), constants.Data.StringDataTypeID), StringData("")),
  )
  val mutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("OrderM1"), constants.Data.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address)),
    MesaProperty(PropertyID(StringID("OrderM2"), constants.Data.BooleanDataTypeID), BooleanData(false)),
    MesaProperty(PropertyID(StringID("OrderM3"), constants.Data.DecDataTypeID), DecData(BigDecimal(0))),
    MesaProperty(PropertyID(StringID("OrderM4"), constants.Data.HeightDataTypeID), HeightData(Height(-1))),
    MesaProperty(PropertyID(StringID("OrderM5"), constants.Data.ListDataTypeID), ListData(Seq())),
    MesaProperty(PropertyID(StringID("OrderM6"), constants.Data.NumberDataTypeID), NumberData(0)),
    MesaProperty(PropertyID(StringID("OrderM7"), constants.Data.StringDataTypeID), StringData("")),
  )
  val identitiesDefineMsg: protobuf.Any = utilities.BlockchainTransaction.getDefineOrderMsg(testConstants.setup.balanceAccount.address, testConstants.setup.nubIdentityID.asProtoIdentityID, PropertyList(immutableMetaProperties).asProtoPropertyList, PropertyList(immutableProperties).asProtoPropertyList, PropertyList(mutableMetaProperties).asProtoPropertyList, PropertyList(mutableProperties).asProtoPropertyList)

  val seq = 18
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(identitiesDefineMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)

  println(utilities.Tx.doTx(txRawBytes))
}