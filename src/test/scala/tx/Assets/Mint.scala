package tx.Assets

import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.constants
import schema.data.base._
import schema.data.{constants => dataConstants}
import schema.id.base.{PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.{MesaProperty, MetaProperty}
import schema.types.Height

class Mint extends AnyFunSuite {

  val fromID = testConstants.setup.nubIdentityID
  val seq = 7
  val classificationID = testConstants.setup.assetClassificationID.asProtoClassificationID

  val immutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("AssetIM1"), dataConstants.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address)),
    MetaProperty(PropertyID(StringID("AssetIM2"), dataConstants.BooleanDataTypeID), BooleanData(true)),
    MetaProperty(PropertyID(StringID("AssetIM3"), dataConstants.DecDataTypeID), DecData(BigDecimal(67.0))),
    MetaProperty(PropertyID(StringID("AssetIM4"), dataConstants.HeightDataTypeID), HeightData(Height(5))),
    MetaProperty(PropertyID(StringID("AssetIM5"), dataConstants.ListDataTypeID), testConstants.Data.listData),
    MetaProperty(PropertyID(StringID("AssetIM6"), dataConstants.NumberDataTypeID), NumberData(2954)),
    MetaProperty(PropertyID(StringID("AssetIM7"), dataConstants.StringDataTypeID), StringData("AssetIM7")),
    MetaProperty(PropertyID(StringID("bondAmount"), dataConstants.NumberDataTypeID), NumberData(5876)),
    MetaProperty(PropertyID(StringID("AssetIM8"), schema.id.constants.StringIDType), IDData(StringID("AssetIM8"))),
  )
  val immutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("AssetI1"), dataConstants.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address)),
    MesaProperty(PropertyID(StringID("AssetI2"), dataConstants.BooleanDataTypeID), BooleanData(true)),
    MesaProperty(PropertyID(StringID("AssetI3"), dataConstants.DecDataTypeID), DecData(BigDecimal(3.0))),
    MesaProperty(PropertyID(StringID("AssetI4"), dataConstants.HeightDataTypeID), HeightData(Height(234))),
    MesaProperty(PropertyID(StringID("AssetI5"), dataConstants.ListDataTypeID), testConstants.Data.listData),
    MesaProperty(PropertyID(StringID("AssetI6"), dataConstants.NumberDataTypeID), NumberData(6)),
    MesaProperty(PropertyID(StringID("AssetI7"), dataConstants.StringDataTypeID), StringData("AssetI7")),
    MesaProperty(PropertyID(StringID("AssetI8"), schema.id.constants.StringIDType), IDData(StringID("AssetI8"))),
  )

  val mutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("AssetMM1"), dataConstants.AccAddressDataTypeID), AccAddressData(utilities.Wallet.getRandomWallet.address)),
    MetaProperty(PropertyID(StringID("AssetMM2"), dataConstants.BooleanDataTypeID), BooleanData(true)),
    MetaProperty(PropertyID(StringID("AssetMM3"), dataConstants.DecDataTypeID), DecData(BigDecimal(utilities.Random.getRandomDouble))),
    MetaProperty(PropertyID(StringID("AssetMM4"), dataConstants.HeightDataTypeID), HeightData(Height(utilities.Random.getRandomAbsLong))),
    MetaProperty(PropertyID(StringID("AssetMM5"), dataConstants.ListDataTypeID), testConstants.Data.listData),
    MetaProperty(PropertyID(StringID("AssetMM6"), dataConstants.NumberDataTypeID), NumberData(utilities.Random.getRandomAbsLong)),
    MetaProperty(PropertyID(StringID("AssetMM7"), dataConstants.StringDataTypeID), StringData(utilities.Random.getRandomString)),
    MetaProperty(PropertyID(StringID("AssetMM8"), schema.id.constants.StringIDType), IDData(StringID(utilities.Random.getRandomString))),
    MetaProperty(PropertyID(StringID("supply"), dataConstants.NumberDataTypeID), NumberData(1)),
  )
  val mutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("AssetM1"), dataConstants.AccAddressDataTypeID), AccAddressData(utilities.Wallet.getRandomWallet.address)),
    MesaProperty(PropertyID(StringID("AssetM2"), dataConstants.BooleanDataTypeID), BooleanData(true)),
    MesaProperty(PropertyID(StringID("AssetM3"), dataConstants.DecDataTypeID), DecData(BigDecimal(utilities.Random.getRandomDouble))),
    MesaProperty(PropertyID(StringID("AssetM4"), dataConstants.HeightDataTypeID), HeightData(Height(utilities.Random.getRandomAbsLong))),
    MesaProperty(PropertyID(StringID("AssetM5"), dataConstants.ListDataTypeID), testConstants.Data.listData),
    MesaProperty(PropertyID(StringID("AssetM6"), dataConstants.NumberDataTypeID), NumberData(utilities.Random.getRandomAbsLong)),
    MesaProperty(PropertyID(StringID("AssetM7"), dataConstants.StringDataTypeID), StringData(utilities.Random.getRandomString)),
    MesaProperty(PropertyID(StringID("AssetM8"), schema.id.constants.StringIDType), IDData(StringID(utilities.Random.getRandomString))),
  )
  val assetMintMsg = utilities.BlockchainTransaction.getMintAssetMsgAsAny(testConstants.setup.balanceAccount.address, fromID.asProtoIdentityID, fromID.asProtoIdentityID, classificationID, PropertyList(immutableMetaProperties).asProtoPropertyList, PropertyList(immutableProperties).asProtoPropertyList, PropertyList(mutableMetaProperties).asProtoPropertyList, PropertyList(mutableProperties).asProtoPropertyList)
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(assetMintMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  utilities.Tx.doTx(txRawBytes)
}
