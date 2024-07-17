package tx.Assets

import com.google.protobuf
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base._
import schema.data.{constants => dataConstants}
import schema.id.base.{ClassificationID, IdentityID, PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.MetaProperty

class DeputizeRWA extends AnyFunSuite {

  val seq = 3

  val toID: IdentityID = IdentityID("ohCidVdbiDmxHxj_SRauRt_2F-XcDITo_wAlB-lrvB8=")
  val ClassificationId: ClassificationID = ClassificationID("N_zwfO3PCJOvhLslGv7O7J3Rik18J8GpFFFoP2QfLeI=")

  val mutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("rented"), dataConstants.BooleanDataTypeID), BooleanData(false)),
    MetaProperty(PropertyID(StringID("rentalAmount"), dataConstants.DecDataTypeID), DecData(0.0)),
    MetaProperty(PropertyID(StringID("rentalPeriodicity"), dataConstants.NumberDataTypeID), NumberData(0)),
    MetaProperty(PropertyID(StringID("documentLink"), dataConstants.StringDataTypeID), StringData("")),
    schema.constants.Properties.SupplyProperty.copy(data = NumberData(0))
  )
  val identitiesDefineMsg: protobuf.Any = utilities.BlockchainTransaction.getDeputizeAssetMsgAsAny(
    fromAddress = testConstants.setup.balanceAccount.address,
    fromID = testConstants.setup.nubIdentityID.asProtoIdentityID,
    toID = toID.asProtoIdentityID,
    classificationID = ClassificationId.asProtoClassificationID,
    maintainedProperties = PropertyList(mutableMetaProperties).asProtoPropertyList,
    canMintAsset = false,
    canBurnAsset = false, canRenumerateAsset = true, canAddMaintainer = false, canRemoveMaintainer = false, canMutateMaintainer = false)
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(identitiesDefineMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  println("0x" + utilities.Encoding.byteArrayToString(txRawBytes))
  println(utilities.Tx.doTx(txRawBytes))
}