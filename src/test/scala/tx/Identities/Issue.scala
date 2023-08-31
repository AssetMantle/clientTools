package tx.Identities

import com.assetmantle.schema.ids.base.ClassificationID
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.constants
import schema.data.base._
import schema.data.{constants => dataConstants}
import schema.id.base.{IdentityID, PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.{MesaProperty, MetaProperty}
import schema.types.Height

class Issue extends AnyFunSuite {

  val fromID: IdentityID = testConstants.setup.nubIdentityID
  val seq = 4
  val classificationID: ClassificationID = testConstants.setup.identityClassificationID.asProtoClassificationID

  val immutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("IdentityIM1"), dataConstants.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address)),
    MetaProperty(PropertyID(StringID("IdentityIM2"), dataConstants.BooleanDataTypeID), BooleanData(true)),
    MetaProperty(PropertyID(StringID("IdentityIM3"), dataConstants.DecDataTypeID), DecData(BigDecimal(0.0003))),
    MetaProperty(PropertyID(StringID("IdentityIM4"), dataConstants.HeightDataTypeID), HeightData(Height(4))),
    MetaProperty(PropertyID(StringID("IdentityIM5"), dataConstants.ListDataTypeID), testConstants.Data.listData),
    MetaProperty(PropertyID(StringID("IdentityIM6"), dataConstants.NumberDataTypeID), NumberData(6)),
    MetaProperty(PropertyID(StringID("IdentityIM7"), dataConstants.StringDataTypeID), StringData("IdentityIM7")),
    MetaProperty(PropertyID(StringID("IdentityIM8"), schema.id.constants.StringIDType), IDData(StringID("IdentityIM8"))),
    MetaProperty(PropertyID(StringID("bondAmount"), dataConstants.NumberDataTypeID), NumberData(6956)),
    MetaProperty(PropertyID(StringID("IdentityIM9"), schema.id.constants.AssetIDType), IDData(testConstants.setup.assetID)),
  )
  val immutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("IdentityI1"), dataConstants.AccAddressDataTypeID), AccAddressData(testConstants.setup.balanceAccount.address)),
    MesaProperty(PropertyID(StringID("IdentityI2"), dataConstants.BooleanDataTypeID), BooleanData(true)),
    MesaProperty(PropertyID(StringID("IdentityI3"), dataConstants.DecDataTypeID), DecData(BigDecimal(0.3453))),
    MesaProperty(PropertyID(StringID("IdentityI4"), dataConstants.HeightDataTypeID), HeightData(Height(987))),
    MesaProperty(PropertyID(StringID("IdentityI5"), dataConstants.ListDataTypeID), testConstants.Data.listData),
    MesaProperty(PropertyID(StringID("IdentityI6"), dataConstants.NumberDataTypeID), NumberData(4356)),
    MesaProperty(PropertyID(StringID("IdentityI7"), dataConstants.StringDataTypeID), StringData("IdentityI7")),
    MesaProperty(PropertyID(StringID("IdentityI8"), schema.id.constants.StringIDType), IDData(StringID("IdentityI8"))),
  )

  val mutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("IdentityMM1"), dataConstants.AccAddressDataTypeID), AccAddressData(utilities.Wallet.getRandomWallet.address)),
    MetaProperty(PropertyID(StringID("IdentityMM2"), dataConstants.BooleanDataTypeID), BooleanData(true)),
    MetaProperty(PropertyID(StringID("IdentityMM3"), dataConstants.DecDataTypeID), DecData(BigDecimal(utilities.Random.getRandomDouble))),
    MetaProperty(PropertyID(StringID("IdentityMM4"), dataConstants.HeightDataTypeID), HeightData(Height(utilities.Random.getRandomAbsLong))),
    MetaProperty(PropertyID(StringID("IdentityMM5"), dataConstants.ListDataTypeID), testConstants.Data.listData),
    MetaProperty(PropertyID(StringID("IdentityMM6"), dataConstants.NumberDataTypeID), NumberData(utilities.Random.getRandomAbsLong)),
    MetaProperty(PropertyID(StringID("IdentityMM7"), dataConstants.StringDataTypeID), StringData(utilities.Random.getRandomString)),
    MetaProperty(PropertyID(StringID("IdentityMM8"), schema.id.constants.StringIDType), IDData(StringID(utilities.Random.getRandomString))),
  )
  val mutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("IdentityM1"), dataConstants.AccAddressDataTypeID), AccAddressData(utilities.Wallet.getRandomWallet.address)),
    MesaProperty(PropertyID(StringID("IdentityM2"), dataConstants.BooleanDataTypeID), BooleanData(true)),
    MesaProperty(PropertyID(StringID("IdentityM3"), dataConstants.DecDataTypeID), DecData(BigDecimal(utilities.Random.getRandomDouble))),
    MesaProperty(PropertyID(StringID("IdentityM4"), dataConstants.HeightDataTypeID), HeightData(Height(utilities.Random.getRandomAbsLong))),
    MesaProperty(PropertyID(StringID("IdentityM5"), dataConstants.ListDataTypeID), testConstants.Data.listData),
    MesaProperty(PropertyID(StringID("IdentityM6"), dataConstants.NumberDataTypeID), NumberData(utilities.Random.getRandomAbsLong)),
    MesaProperty(PropertyID(StringID("IdentityM7"), dataConstants.StringDataTypeID), StringData(utilities.Random.getRandomString)),
    MesaProperty(PropertyID(StringID("IdentityM8"), schema.id.constants.StringIDType), IDData(StringID(utilities.Random.getRandomString))),
  )
  val issueMsg = utilities.BlockchainTransaction.getIssueIdentityMsgAsAny(testConstants.setup.balanceAccount.address, fromID.asProtoIdentityID, testConstants.setup.balanceAccount.address, classificationID, PropertyList(immutableMetaProperties).asProtoPropertyList, PropertyList(immutableProperties).asProtoPropertyList, PropertyList(mutableMetaProperties).asProtoPropertyList, PropertyList(mutableProperties).asProtoPropertyList)
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(issueMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  utilities.Tx.doTx(txRawBytes)
}
