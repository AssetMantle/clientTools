package tx.Orders

import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.constants
import schema.data.base._
import schema.id.base._
import schema.list.PropertyList
import schema.property.base.{MesaProperty, MetaProperty}
import schema.types.Height

import java.text.DecimalFormat

class Modify extends AnyFunSuite {
//  val seq = 31
//  val fullFormat = new DecimalFormat("#0.000000000000000000")
//
//  val fromID = testConstants.setup.nubIdentityID
//
//  val classificationID = testConstants.setup.orderClassificationID.asProtoClassificationID
//
//  val mutableMetaProperties: Seq[MetaProperty] = Seq(
//    MetaProperty(PropertyID(StringID("OrderMM1"), dataConstants.AccAddressDataTypeID), AccAddressData(utilities.Wallet.getRandomWallet.address)),
//    MetaProperty(PropertyID(StringID("OrderMM2"), dataConstants.BooleanDataTypeID), BooleanData(true)),
//    MetaProperty(PropertyID(StringID("OrderMM3"), dataConstants.DecDataTypeID), DecData(BigDecimal(utilities.Random.getRandomDouble))),
//    MetaProperty(PropertyID(StringID("OrderMM4"), dataConstants.HeightDataTypeID), HeightData(Height(utilities.Random.getRandomAbsLong))),
//    MetaProperty(PropertyID(StringID("OrderMM5"), dataConstants.ListDataTypeID), testConstants.Data.listData),
//    MetaProperty(PropertyID(StringID("OrderMM6"), dataConstants.NumberDataTypeID), NumberData(utilities.Random.getRandomAbsLong)),
//    MetaProperty(PropertyID(StringID("OrderMM7"), dataConstants.StringDataTypeID), StringData(utilities.Random.getRandomString)),
//    MetaProperty(PropertyID(StringID("OrderMM8"), dataschema.id.constantsDataTypeID), IDData(StringID(utilities.Random.getRandomString))),
//  )
//  val mutableProperties: Seq[MesaProperty] = Seq(
//    MesaProperty(PropertyID(StringID("OrderM1"), dataConstants.AccAddressDataTypeID), AccAddressData(utilities.Wallet.getRandomWallet.address)),
//    MesaProperty(PropertyID(StringID("OrderM2"), dataConstants.BooleanDataTypeID), BooleanData(true)),
//    MesaProperty(PropertyID(StringID("OrderM3"), dataConstants.DecDataTypeID), DecData(BigDecimal(utilities.Random.getRandomDouble))),
//    MesaProperty(PropertyID(StringID("OrderM4"), dataConstants.HeightDataTypeID), HeightData(Height(utilities.Random.getRandomAbsLong))),
//    MesaProperty(PropertyID(StringID("OrderM5"), dataConstants.ListDataTypeID), testConstants.Data.listData),
//    MesaProperty(PropertyID(StringID("OrderM6"), dataConstants.NumberDataTypeID), NumberData(utilities.Random.getRandomAbsLong)),
//    MesaProperty(PropertyID(StringID("OrderM7"), dataConstants.StringDataTypeID), StringData(utilities.Random.getRandomString)),
//    MesaProperty(PropertyID(StringID("OrderM8"), dataschema.id.constantsDataTypeID), IDData(StringID(utilities.Random.getRandomString))),
//  )
//  val makeMsg = utilities.BlockchainTransaction.getMakeOrderMsgAsAny(
//    testConstants.setup.balanceAccount.address,
//    fromID.asProtoIdentityID,
//    classificationID,
//    IdentityID(HashID(Array[Byte]())).asProtoIdentityID,
//    testConstants.setup.assetID.toAnyOwnableID,
//    CoinID(StringID("umntl")).toAnyOwnableID,
//    Height(43200).asProtoHeight,
//    makerOwnableSplit = 1.toString,
//    takerOwnableSplit = "100",
//    PropertyList(immutableMetaProperties).asProtoPropertyList,
//    PropertyList(immutableProperties).asProtoPropertyList,
//    PropertyList(mutableMetaProperties).asProtoPropertyList,
//    PropertyList(mutableProperties).asProtoPropertyList)
//  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(makeMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
//  utilities.Tx.doTx(txRawBytes)
}
