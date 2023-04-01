package schema.Identities

import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base._
import schema.id.base.{PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.{MesaProperty, MetaProperty}
import schema.types.Height
import utilities.AttoNumber

class Issue extends AnyFunSuite {

  val fromID = testConstants.setup.nubIdentityID

  val classificationID = testConstants.setup.identityClassificationID.asProtoClassificationID

  val immutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("IdentityIM1"), constants.Data.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityIM2"), constants.Data.BooleanDataTypeID), BooleanData(true).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityIM3"), constants.Data.DecDataTypeID), DecData(AttoNumber(utilities.Random.getRandomDouble)).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityIM4"), constants.Data.HeightDataTypeID), HeightData(Height(utilities.Random.getRandomAbsLong)).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityIM5"), constants.Data.ListDataTypeID), testConstants.Data.listData.toAnyData),
    MetaProperty(PropertyID(StringID("IdentityIM6"), constants.Data.NumberDataTypeID), NumberData(utilities.Random.getRandomAbsLong).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityIM7"), constants.Data.StringDataTypeID), StringData(utilities.Random.getRandomString).toAnyData),
    MetaProperty(PropertyID(StringID("bondAmount"), constants.Data.NumberDataTypeID), NumberData(6636).toAnyData),
  )
  val immutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("IdentityI1"), constants.Data.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address)),
    MesaProperty(PropertyID(StringID("IdentityI2"), constants.Data.BooleanDataTypeID), BooleanData(true)),
    MesaProperty(PropertyID(StringID("IdentityI3"), constants.Data.DecDataTypeID), DecData(AttoNumber(utilities.Random.getRandomDouble))),
    MesaProperty(PropertyID(StringID("IdentityI4"), constants.Data.HeightDataTypeID), HeightData(Height(utilities.Random.getRandomAbsLong))),
    MesaProperty(PropertyID(StringID("IdentityI5"), constants.Data.ListDataTypeID), testConstants.Data.listData),
    MesaProperty(PropertyID(StringID("IdentityI6"), constants.Data.NumberDataTypeID), NumberData(utilities.Random.getRandomAbsLong)),
    MesaProperty(PropertyID(StringID("IdentityI7"), constants.Data.StringDataTypeID), StringData(utilities.Random.getRandomString)),
  )

  val mutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("IdentityMM1"), constants.Data.AccAddressDataTypeID), AccAddressData(utilities.Wallet.getRandomWallet.address).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityMM2"), constants.Data.BooleanDataTypeID), BooleanData(true).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityMM3"), constants.Data.DecDataTypeID), DecData(AttoNumber(utilities.Random.getRandomDouble)).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityMM4"), constants.Data.HeightDataTypeID), HeightData(Height(utilities.Random.getRandomAbsLong)).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityMM5"), constants.Data.ListDataTypeID), testConstants.Data.listData.toAnyData),
    MetaProperty(PropertyID(StringID("IdentityMM6"), constants.Data.NumberDataTypeID), NumberData(utilities.Random.getRandomAbsLong).toAnyData),
    MetaProperty(PropertyID(StringID("IdentityMM7"), constants.Data.StringDataTypeID), StringData(utilities.Random.getRandomString).toAnyData),
  )
  val mutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("IdentityM1"), constants.Data.AccAddressDataTypeID), AccAddressData(utilities.Wallet.getRandomWallet.address)),
    MesaProperty(PropertyID(StringID("IdentityM2"), constants.Data.BooleanDataTypeID), BooleanData(true)),
    MesaProperty(PropertyID(StringID("IdentityM3"), constants.Data.DecDataTypeID), DecData(AttoNumber(utilities.Random.getRandomDouble))),
    MesaProperty(PropertyID(StringID("IdentityM4"), constants.Data.HeightDataTypeID), HeightData(Height(utilities.Random.getRandomAbsLong))),
    MesaProperty(PropertyID(StringID("IdentityM5"), constants.Data.ListDataTypeID), testConstants.Data.listData),
    MesaProperty(PropertyID(StringID("IdentityM6"), constants.Data.NumberDataTypeID), NumberData(utilities.Random.getRandomAbsLong)),
    MesaProperty(PropertyID(StringID("IdentityM7"), constants.Data.StringDataTypeID), StringData(utilities.Random.getRandomString)),
  )
  val seq = 4
  val issueMsg = utilities.BlockchainTransaction.getIssueIdentityMsgAsAny(testConstants.setup.balanceAccount.address, fromID.asProtoIdentityID, utilities.Wallet.getRandomWallet.address, classificationID, PropertyList(immutableMetaProperties).asProtoPropertyList, PropertyList(immutableProperties).asProtoPropertyList, PropertyList(mutableMetaProperties).asProtoPropertyList, PropertyList(mutableProperties).asProtoPropertyList)
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(issueMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  utilities.Tx.doTx(txRawBytes)
}
