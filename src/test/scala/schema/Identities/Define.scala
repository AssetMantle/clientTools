package schema.Identities

import com.google.protobuf
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base._
import schema.id.base.{PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.{MesaProperty, MetaProperty}
import schema.types.Height
import utilities.AttoNumber

class Define extends AnyFunSuite {

  val immutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("IdentityIM1"), constants.Data.AccAddressDataTypeID), AccAddressData(Array[Byte]()).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityIM2"), constants.Data.BooleanDataTypeID), BooleanData(false).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityIM3"), constants.Data.DecDataTypeID), DecData(AttoNumber(0)).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityIM4"), constants.Data.HeightDataTypeID), HeightData(Height(-1)).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityIM5"), constants.Data.ListDataTypeID), ListData(Seq()).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityIM6"), constants.Data.NumberDataTypeID), NumberData(0).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityIM7"), constants.Data.StringDataTypeID), StringData("").toAnyData),
  )

  val immutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("IdentityI1"), constants.Data.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address)),
    MesaProperty(PropertyID(StringID("IdentityI2"), constants.Data.BooleanDataTypeID), BooleanData(false)),
    MesaProperty(PropertyID(StringID("IdentityI3"), constants.Data.DecDataTypeID), DecData(AttoNumber(0))),
    MesaProperty(PropertyID(StringID("IdentityI4"), constants.Data.HeightDataTypeID), HeightData(Height(-1))),
    MesaProperty(PropertyID(StringID("IdentityI5"), constants.Data.ListDataTypeID), ListData(Seq())),
    MesaProperty(PropertyID(StringID("IdentityI6"), constants.Data.NumberDataTypeID), NumberData(0)),
    MesaProperty(PropertyID(StringID("IdentityI7"), constants.Data.StringDataTypeID), StringData("")),
  )

  val mutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("IdentityMM1"), constants.Data.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityMM2"), constants.Data.BooleanDataTypeID), BooleanData(false).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityMM3"), constants.Data.DecDataTypeID), DecData(AttoNumber(0)).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityMM4"), constants.Data.HeightDataTypeID), HeightData(Height(-1)).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityMM5"), constants.Data.ListDataTypeID), ListData(Seq()).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityMM6"), constants.Data.NumberDataTypeID), NumberData(0).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityMM7"), constants.Data.StringDataTypeID), StringData("").toAnyData),
  )
  val mutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("IdentityM1"), constants.Data.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address)),
    MesaProperty(PropertyID(StringID("IdentityM2"), constants.Data.BooleanDataTypeID), BooleanData(false)),
    MesaProperty(PropertyID(StringID("IdentityM3"), constants.Data.DecDataTypeID), DecData(AttoNumber(0))),
    MesaProperty(PropertyID(StringID("IdentityM4"), constants.Data.HeightDataTypeID), HeightData(Height(-1))),
    MesaProperty(PropertyID(StringID("IdentityM5"), constants.Data.ListDataTypeID), ListData(Seq())),
    MesaProperty(PropertyID(StringID("IdentityM6"), constants.Data.NumberDataTypeID), NumberData(0)),
    MesaProperty(PropertyID(StringID("IdentityM7"), constants.Data.StringDataTypeID), StringData("")),
  )
  val identitiesDefineMsg: protobuf.Any = utilities.BlockchainTransaction.getDefineIdentityMsgAsAny(testConstants.setup.balanceAccount.address, testConstants.setup.nubIdentityID.asProtoIdentityID, PropertyList(immutableMetaProperties).asProtoPropertyList, PropertyList(immutableProperties).asProtoPropertyList, PropertyList(mutableMetaProperties).asProtoPropertyList, PropertyList(mutableProperties).asProtoPropertyList)

  val seq = 15
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(identitiesDefineMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)

  println(utilities.Tx.doTx(txRawBytes))
}