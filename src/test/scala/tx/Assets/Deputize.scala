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

class Deputize extends AnyFunSuite {

  val fromID = testConstants.setup.nubIdentityID
  val toID = testConstants.setup.issuedIdentityID

  val seq = 14
  val mutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("AssetMM1"), dataConstants.AccAddressDataTypeID), AccAddressData(utilities.Wallet.getRandomWallet.address)),
    MetaProperty(PropertyID(StringID("AssetMM2"), dataConstants.BooleanDataTypeID), BooleanData(true)),
    MetaProperty(PropertyID(StringID("AssetMM3"), dataConstants.DecDataTypeID), DecData(BigDecimal(utilities.Random.getRandomDouble))),
    MetaProperty(PropertyID(StringID("AssetMM4"), dataConstants.HeightDataTypeID), HeightData(Height(utilities.Random.getRandomAbsLong))),
    MetaProperty(PropertyID(StringID("AssetMM5"), dataConstants.ListDataTypeID), testConstants.Data.listData),
    MetaProperty(PropertyID(StringID("AssetMM6"), dataConstants.NumberDataTypeID), NumberData(utilities.Random.getRandomAbsLong)),
    MetaProperty(PropertyID(StringID("AssetMM7"), dataConstants.StringDataTypeID), StringData(utilities.Random.getRandomString)),
    MetaProperty(PropertyID(StringID("AssetMM8"), schema.id.constants.StringIDType), IDData(StringID(utilities.Random.getRandomString))),
    MetaProperty(PropertyID(StringID("supply"), dataConstants.NumberDataTypeID), NumberData(100)),
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
  val msg = utilities.BlockchainTransaction.getDeputizeAssetMsgAsAny(testConstants.setup.balanceAccount.address, fromID.asProtoIdentityID, toID = toID.asProtoIdentityID, testConstants.setup.assetClassificationID.asProtoClassificationID, PropertyList(mutableMetaProperties ++ mutableProperties).asProtoPropertyList, true, true, true, true, true, true)
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(msg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  utilities.Tx.doTx(txRawBytes)
}
