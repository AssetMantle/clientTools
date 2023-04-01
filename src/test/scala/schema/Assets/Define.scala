package schema.Assets

import com.google.protobuf
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base._
import schema.id.base.{PropertyID, StringID}
import schema.property.base.{MesaProperty, MetaProperty}
import schema.types.Height
import utilities.AttoNumber

class Define extends AnyFunSuite {

  val fromID = testConstants.setup.nubIdentityID

  val immutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("AssetIM1"), constants.Data.AccAddressDataTypeID), AccAddressData(Array[Byte]()).toAnyData),
    MetaProperty(PropertyID(StringID("AssetIM2"), constants.Data.BooleanDataTypeID), BooleanData(false).toAnyData),
    MetaProperty(PropertyID(StringID("AssetIM3"), constants.Data.DecDataTypeID), DecData(AttoNumber(0)).toAnyData),
    MetaProperty(PropertyID(StringID("AssetIM4"), constants.Data.HeightDataTypeID), HeightData(Height(-1)).toAnyData),
    MetaProperty(PropertyID(StringID("AssetIM5"), constants.Data.ListDataTypeID), ListData(Seq()).toAnyData),
    MetaProperty(PropertyID(StringID("AssetIM6"), constants.Data.NumberDataTypeID), NumberData(0).toAnyData),
    MetaProperty(PropertyID(StringID("AssetIM7"), constants.Data.StringDataTypeID), StringData("").toAnyData),
  )

  val immutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("AssetI1"), constants.Data.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address)),
    MesaProperty(PropertyID(StringID("AssetI2"), constants.Data.BooleanDataTypeID), BooleanData(false)),
    MesaProperty(PropertyID(StringID("AssetI3"), constants.Data.DecDataTypeID), DecData(AttoNumber(0))),
    MesaProperty(PropertyID(StringID("AssetI4"), constants.Data.HeightDataTypeID), HeightData(Height(-1))),
    MesaProperty(PropertyID(StringID("AssetI5"), constants.Data.ListDataTypeID), ListData(Seq())),
    MesaProperty(PropertyID(StringID("AssetI6"), constants.Data.NumberDataTypeID), NumberData(0)),
    MesaProperty(PropertyID(StringID("AssetI7"), constants.Data.StringDataTypeID), StringData("")),
  )

  val mutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("AssetMM1"), constants.Data.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address).toAnyData),
    MetaProperty(PropertyID(StringID("AssetMM2"), constants.Data.BooleanDataTypeID), BooleanData(false).toAnyData),
    MetaProperty(PropertyID(StringID("AssetMM3"), constants.Data.DecDataTypeID), DecData(AttoNumber(0)).toAnyData),
    MetaProperty(PropertyID(StringID("AssetMM4"), constants.Data.HeightDataTypeID), HeightData(Height(-1)).toAnyData),
    MetaProperty(PropertyID(StringID("AssetMM5"), constants.Data.ListDataTypeID), ListData(Seq()).toAnyData),
    MetaProperty(PropertyID(StringID("AssetMM6"), constants.Data.NumberDataTypeID), NumberData(0).toAnyData),
    MetaProperty(PropertyID(StringID("AssetMM7"), constants.Data.StringDataTypeID), StringData("").toAnyData),
  )
  val mutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("AssetM1"), constants.Data.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address)),
    MesaProperty(PropertyID(StringID("AssetM2"), constants.Data.BooleanDataTypeID), BooleanData(false)),
    MesaProperty(PropertyID(StringID("AssetM3"), constants.Data.DecDataTypeID), DecData(AttoNumber(0))),
    MesaProperty(PropertyID(StringID("AssetM4"), constants.Data.HeightDataTypeID), HeightData(Height(-1))),
    MesaProperty(PropertyID(StringID("AssetM5"), constants.Data.ListDataTypeID), ListData(Seq())),
    MesaProperty(PropertyID(StringID("AssetM6"), constants.Data.NumberDataTypeID), NumberData(0)),
    MesaProperty(PropertyID(StringID("AssetM7"), constants.Data.StringDataTypeID), StringData("")),
  )

  val assetDefineMsg: protobuf.Any = utilities.BlockchainTransaction.getDefineAssetMsg(testConstants.setup.balanceAccount.address, fromID.asProtoIdentityID, immutableMetaProperties, immutableProperties, mutableMetaProperties, mutableProperties)

  val seq = 3
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(assetDefineMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  println(utilities.Tx.doTx(txRawBytes))
}
