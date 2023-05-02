package tx.Assets

import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.constants
import schema.data.base._
import schema.id.base.{PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.{MesaProperty, MetaProperty}
import schema.types.Height

class Mint extends AnyFunSuite {

  val fromID = testConstants.setup.nubIdentityID

  val classificationID = testConstants.setup.assetClassificationID.asProtoClassificationID

  val immutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("AssetIM1"), constants.Data.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address)),
    MetaProperty(PropertyID(StringID("AssetIM2"), constants.Data.BooleanDataTypeID), BooleanData(true)),
    MetaProperty(PropertyID(StringID("AssetIM3"), constants.Data.DecDataTypeID), DecData(BigDecimal(utilities.Random.getRandomDouble))),
    MetaProperty(PropertyID(StringID("AssetIM4"), constants.Data.HeightDataTypeID), HeightData(Height(utilities.Random.getRandomAbsLong))),
    MetaProperty(PropertyID(StringID("AssetIM5"), constants.Data.ListDataTypeID), testConstants.Data.listData),
    MetaProperty(PropertyID(StringID("AssetIM6"), constants.Data.NumberDataTypeID), NumberData(utilities.Random.getRandomAbsLong)),
    MetaProperty(PropertyID(StringID("AssetIM7"), constants.Data.StringDataTypeID), StringData(utilities.Random.getRandomString)),
    MetaProperty(PropertyID(StringID("bondAmount"), constants.Data.NumberDataTypeID), NumberData(5612)),
  )
  val immutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("AssetI1"), constants.Data.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address)),
    MesaProperty(PropertyID(StringID("AssetI2"), constants.Data.BooleanDataTypeID), BooleanData(true)),
    MesaProperty(PropertyID(StringID("AssetI3"), constants.Data.DecDataTypeID), DecData(BigDecimal(utilities.Random.getRandomDouble))),
    MesaProperty(PropertyID(StringID("AssetI4"), constants.Data.HeightDataTypeID), HeightData(Height(utilities.Random.getRandomAbsLong))),
    MesaProperty(PropertyID(StringID("AssetI5"), constants.Data.ListDataTypeID), testConstants.Data.listData),
    MesaProperty(PropertyID(StringID("AssetI6"), constants.Data.NumberDataTypeID), NumberData(utilities.Random.getRandomAbsLong)),
    MesaProperty(PropertyID(StringID("AssetI7"), constants.Data.StringDataTypeID), StringData(utilities.Random.getRandomString)),
  )

  val mutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("AssetMM1"), constants.Data.AccAddressDataTypeID), AccAddressData(utilities.Wallet.getRandomWallet.address)),
    MetaProperty(PropertyID(StringID("AssetMM2"), constants.Data.BooleanDataTypeID), BooleanData(true)),
    MetaProperty(PropertyID(StringID("AssetMM3"), constants.Data.DecDataTypeID), DecData(BigDecimal(utilities.Random.getRandomDouble))),
    MetaProperty(PropertyID(StringID("AssetMM4"), constants.Data.HeightDataTypeID), HeightData(Height(utilities.Random.getRandomAbsLong))),
    MetaProperty(PropertyID(StringID("AssetMM5"), constants.Data.ListDataTypeID), testConstants.Data.listData),
    MetaProperty(PropertyID(StringID("AssetMM6"), constants.Data.NumberDataTypeID), NumberData(utilities.Random.getRandomAbsLong)),
    MetaProperty(PropertyID(StringID("AssetMM7"), constants.Data.StringDataTypeID), StringData(utilities.Random.getRandomString)),
  )
  val mutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("AssetM1"), constants.Data.AccAddressDataTypeID), AccAddressData(utilities.Wallet.getRandomWallet.address)),
    MesaProperty(PropertyID(StringID("AssetM2"), constants.Data.BooleanDataTypeID), BooleanData(true)),
    MesaProperty(PropertyID(StringID("AssetM3"), constants.Data.DecDataTypeID), DecData(BigDecimal(utilities.Random.getRandomDouble))),
    MesaProperty(PropertyID(StringID("AssetM4"), constants.Data.HeightDataTypeID), HeightData(Height(utilities.Random.getRandomAbsLong))),
    MesaProperty(PropertyID(StringID("AssetM5"), constants.Data.ListDataTypeID), testConstants.Data.listData),
    MesaProperty(PropertyID(StringID("AssetM6"), constants.Data.NumberDataTypeID), NumberData(utilities.Random.getRandomAbsLong)),
    MesaProperty(PropertyID(StringID("AssetM7"), constants.Data.StringDataTypeID), StringData(utilities.Random.getRandomString)),
  )
  val seq = 8
  val assetMintMsg = utilities.BlockchainTransaction.getMintAssetMsgAsAny(testConstants.setup.balanceAccount.address, fromID.asProtoIdentityID, fromID.asProtoIdentityID, classificationID, PropertyList(immutableMetaProperties).asProtoPropertyList, PropertyList(immutableProperties).asProtoPropertyList, PropertyList(mutableMetaProperties).asProtoPropertyList, PropertyList(mutableProperties).asProtoPropertyList)
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(assetMintMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  utilities.Tx.doTx(txRawBytes)
}
