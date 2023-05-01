package schema.Orders

import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base._
import schema.id.base._
import schema.list.PropertyList
import schema.property.base.{MesaProperty, MetaProperty}
import schema.types.Height

import java.text.DecimalFormat

class Make extends AnyFunSuite {

  val fullFormat = new DecimalFormat("#0.000000000000000000")

  val fromID = testConstants.setup.nubIdentityID

  val classificationID = testConstants.setup.orderClassificationID.asProtoClassificationID

  val immutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("OrderIM1"), constants.Data.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address)),
    MetaProperty(PropertyID(StringID("OrderIM2"), constants.Data.BooleanDataTypeID), BooleanData(true)),
    MetaProperty(PropertyID(StringID("OrderIM3"), constants.Data.DecDataTypeID), DecData(BigDecimal(utilities.Random.getRandomDouble))),
    MetaProperty(PropertyID(StringID("OrderIM4"), constants.Data.HeightDataTypeID), HeightData(Height(utilities.Random.getRandomAbsLong))),
    MetaProperty(PropertyID(StringID("OrderIM5"), constants.Data.ListDataTypeID), testConstants.Data.listData),
    MetaProperty(PropertyID(StringID("OrderIM6"), constants.Data.NumberDataTypeID), NumberData(utilities.Random.getRandomAbsLong)),
    MetaProperty(PropertyID(StringID("OrderIM7"), constants.Data.StringDataTypeID), StringData(utilities.Random.getRandomString)),
    MetaProperty(PropertyID(StringID("bondAmount"), constants.Data.NumberDataTypeID), NumberData(5916)),
  )
  val immutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("OrderI1"), constants.Data.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address)),
    MesaProperty(PropertyID(StringID("OrderI2"), constants.Data.BooleanDataTypeID), BooleanData(true)),
    MesaProperty(PropertyID(StringID("OrderI3"), constants.Data.DecDataTypeID), DecData(BigDecimal(utilities.Random.getRandomDouble))),
    MesaProperty(PropertyID(StringID("OrderI4"), constants.Data.HeightDataTypeID), HeightData(Height(utilities.Random.getRandomAbsLong))),
    MesaProperty(PropertyID(StringID("OrderI5"), constants.Data.ListDataTypeID), testConstants.Data.listData),
    MesaProperty(PropertyID(StringID("OrderI6"), constants.Data.NumberDataTypeID), NumberData(utilities.Random.getRandomAbsLong)),
    MesaProperty(PropertyID(StringID("OrderI7"), constants.Data.StringDataTypeID), StringData(utilities.Random.getRandomString)),
  )

  val mutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("OrderMM1"), constants.Data.AccAddressDataTypeID), AccAddressData(utilities.Wallet.getRandomWallet.address)),
    MetaProperty(PropertyID(StringID("OrderMM2"), constants.Data.BooleanDataTypeID), BooleanData(true)),
    MetaProperty(PropertyID(StringID("OrderMM3"), constants.Data.DecDataTypeID), DecData(BigDecimal(utilities.Random.getRandomDouble))),
    MetaProperty(PropertyID(StringID("OrderMM4"), constants.Data.HeightDataTypeID), HeightData(Height(utilities.Random.getRandomAbsLong))),
    MetaProperty(PropertyID(StringID("OrderMM5"), constants.Data.ListDataTypeID), testConstants.Data.listData),
    MetaProperty(PropertyID(StringID("OrderMM6"), constants.Data.NumberDataTypeID), NumberData(utilities.Random.getRandomAbsLong)),
    MetaProperty(PropertyID(StringID("OrderMM7"), constants.Data.StringDataTypeID), StringData(utilities.Random.getRandomString)),
  )
  val mutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("OrderM1"), constants.Data.AccAddressDataTypeID), AccAddressData(utilities.Wallet.getRandomWallet.address)),
    MesaProperty(PropertyID(StringID("OrderM2"), constants.Data.BooleanDataTypeID), BooleanData(true)),
    MesaProperty(PropertyID(StringID("OrderM3"), constants.Data.DecDataTypeID), DecData(BigDecimal(utilities.Random.getRandomDouble))),
    MesaProperty(PropertyID(StringID("OrderM4"), constants.Data.HeightDataTypeID), HeightData(Height(utilities.Random.getRandomAbsLong))),
    MesaProperty(PropertyID(StringID("OrderM5"), constants.Data.ListDataTypeID), testConstants.Data.listData),
    MesaProperty(PropertyID(StringID("OrderM6"), constants.Data.NumberDataTypeID), NumberData(utilities.Random.getRandomAbsLong)),
    MesaProperty(PropertyID(StringID("OrderM7"), constants.Data.StringDataTypeID), StringData(utilities.Random.getRandomString)),
  )
  val seq = 19
  val makeMsg = utilities.BlockchainTransaction.getMakeOrderMsgAsAny(
    testConstants.setup.balanceAccount.address,
    fromID.asProtoIdentityID,
    classificationID,
    IdentityID(HashID(Array[Byte]())).asProtoIdentityID,
    testConstants.setup.assetID.toAnyOwnableID,
    CoinID(StringID("umntl")).toAnyOwnableID,
    Height(43200).asProtoHeight,
    makerOwnableSplit = fullFormat.format(BigDecimal(1) / BigDecimal.factor),
    takerOwnableSplit = "100",
    PropertyList(immutableMetaProperties).asProtoPropertyList,
    PropertyList(immutableProperties).asProtoPropertyList,
    PropertyList(mutableMetaProperties).asProtoPropertyList,
    PropertyList(mutableProperties).asProtoPropertyList)
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(makeMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  utilities.Tx.doTx(txRawBytes)
}
