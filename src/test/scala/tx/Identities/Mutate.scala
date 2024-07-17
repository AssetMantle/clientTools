package tx.Identities

import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base._
import schema.data.{constants => dataConstants}
import schema.id.base.{IdentityID, PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.{MesaProperty, MetaProperty}
import schema.types.Height

class Mutate extends AnyFunSuite {

  val fromID: IdentityID = testConstants.setup.nubIdentityID
  val seq = 6
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
  val msg = utilities.BlockchainTransaction.getUpdateIdentityMsgAsAny(testConstants.setup.balanceAccount.address, fromID.asProtoIdentityID, testConstants.setup.issuedIdentityID.asProtoIdentityID, PropertyList(mutableMetaProperties).asProtoPropertyList, PropertyList(mutableProperties).asProtoPropertyList)
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(msg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  utilities.Tx.doTx(txRawBytes)
}
