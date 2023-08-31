package tx.Assets

import com.google.protobuf
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base._
import schema.data.{constants => dataConstants}
import schema.id.base._
import schema.property.base.{MesaProperty, MetaProperty}
import schema.types.Height

class Define extends AnyFunSuite {

  val seq = 8

  val fromID: IdentityID = testConstants.setup.nubIdentityID

  val immutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("AssetIM1"), dataConstants.AccAddressDataTypeID), AccAddressData(Array[Byte]())),
    MetaProperty(PropertyID(StringID("AssetIM2"), dataConstants.BooleanDataTypeID), BooleanData(false)),
    MetaProperty(PropertyID(StringID("AssetIM3"), dataConstants.DecDataTypeID), DecData("0")),
    MetaProperty(PropertyID(StringID("AssetIM4"), dataConstants.HeightDataTypeID), HeightData(Height(-1))),
    MetaProperty(PropertyID(StringID("AssetIM5"), dataConstants.ListDataTypeID), ListData(Seq())),
    MetaProperty(PropertyID(StringID("AssetIM6"), dataConstants.NumberDataTypeID), NumberData(0)),
    MetaProperty(PropertyID(StringID("AssetIM7"), dataConstants.StringDataTypeID), StringData("")),
    MetaProperty(PropertyID(StringID("AssetIM8"), schema.id.constants.StringIDType), IDData(StringID(""))),
  )

  val immutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("AssetI1"), dataConstants.AccAddressDataTypeID), AccAddressData(Array[Byte]())),
    MesaProperty(PropertyID(StringID("AssetI2"), dataConstants.BooleanDataTypeID), BooleanData(false)),
    MesaProperty(PropertyID(StringID("AssetI3"), dataConstants.DecDataTypeID), DecData("0")),
    MesaProperty(PropertyID(StringID("AssetI4"), dataConstants.HeightDataTypeID), HeightData(Height(-1))),
    MesaProperty(PropertyID(StringID("AssetI5"), dataConstants.ListDataTypeID), ListData(Seq())),
    MesaProperty(PropertyID(StringID("AssetI6"), dataConstants.NumberDataTypeID), NumberData(0)),
    MesaProperty(PropertyID(StringID("AssetI7"), dataConstants.StringDataTypeID), StringData("")),
    MesaProperty(PropertyID(StringID("AssetI8"), schema.id.constants.StringIDType), IDData(StringID(""))),
  )

  val mutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("AssetMM1"), dataConstants.AccAddressDataTypeID), AccAddressData(Array[Byte]())),
    MetaProperty(PropertyID(StringID("AssetMM2"), dataConstants.BooleanDataTypeID), BooleanData(false)),
    MetaProperty(PropertyID(StringID("AssetMM3"), dataConstants.DecDataTypeID), DecData("0")),
    MetaProperty(PropertyID(StringID("AssetMM4"), dataConstants.HeightDataTypeID), HeightData(Height(-1))),
    MetaProperty(PropertyID(StringID("AssetMM5"), dataConstants.ListDataTypeID), ListData(Seq())),
    MetaProperty(PropertyID(StringID("AssetMM6"), dataConstants.NumberDataTypeID), NumberData(0)),
    MetaProperty(PropertyID(StringID("AssetMM7"), dataConstants.StringDataTypeID), StringData("")),
    MetaProperty(PropertyID(StringID("AssetMM8"), schema.id.constants.StringIDType), IDData(StringID(""))),
    MetaProperty(PropertyID(StringID("supply"), dataConstants.NumberDataTypeID), NumberData(0)),
  )
  val mutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("AssetM1"), dataConstants.AccAddressDataTypeID), AccAddressData(Array[Byte]())),
    MesaProperty(PropertyID(StringID("AssetM2"), dataConstants.BooleanDataTypeID), BooleanData(false)),
    MesaProperty(PropertyID(StringID("AssetM3"), dataConstants.DecDataTypeID), DecData("0")),
    MesaProperty(PropertyID(StringID("AssetM4"), dataConstants.HeightDataTypeID), HeightData(Height(-1))),
    MesaProperty(PropertyID(StringID("AssetM5"), dataConstants.ListDataTypeID), ListData(Seq())),
    MesaProperty(PropertyID(StringID("AssetM6"), dataConstants.NumberDataTypeID), NumberData(0)),
    MesaProperty(PropertyID(StringID("AssetM7"), dataConstants.StringDataTypeID), StringData("")),
    MesaProperty(PropertyID(StringID("AssetM8"), schema.id.constants.StringIDType), IDData(StringID(""))),
  )

  val assetDefineMsg: protobuf.Any = utilities.BlockchainTransaction.getDefineAssetMsg(testConstants.setup.balanceAccount.address, fromID.asProtoIdentityID, immutableMetaProperties, immutableProperties, mutableMetaProperties, mutableProperties)

  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(assetDefineMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  println(utilities.Tx.doTx(txRawBytes))
}
