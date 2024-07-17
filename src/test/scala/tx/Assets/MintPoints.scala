package tx.Assets

import com.google.protobuf
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base._
import schema.id.base.{AssetID, ClassificationID, PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.{MesaProperty, MetaProperty}

class MintPoints extends AnyFunSuite {

  val seq = 4
  val immutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(id = PropertyID(keyID = StringID("superOrganizationId"), typeID = schema.data.constants.StringDataTypeID), data = StringData("E219D356F3B4A3D0"))
  )
  val classificationID: ClassificationID = ClassificationID("FdKUExckWXd2zcEutKOJYAChVpw07EK5CSbjzuxmLhw=")

  val immutableProperties: Seq[MesaProperty] = Seq()

  val mutableMetaProperties: Seq[MetaProperty] = Seq(
    schema.constants.Properties.BondAmountProperty.copy(data = NumberData(272)),
    schema.constants.Properties.SupplyProperty.copy(data = NumberData(100000000000L))
  )
  val mutableProperties: Seq[MesaProperty] = Seq()
  val msg: protobuf.Any = utilities.BlockchainTransaction.getMintAssetMsgAsAny(
    fromAddress = testConstants.setup.balanceAccount.address,
    fromID = testConstants.setup.nubIdentityID.asProtoIdentityID,
    toID = testConstants.setup.nubIdentityID.asProtoIdentityID,
    classificationID = classificationID.asProtoClassificationID,
    immutableMetaProperties = PropertyList(immutableMetaProperties).asProtoPropertyList,
    immutableProperties = PropertyList(immutableProperties).asProtoPropertyList,
    mutableMetaProperties = PropertyList(mutableMetaProperties).asProtoPropertyList,
    mutableProperties = PropertyList(mutableProperties).asProtoPropertyList)
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(msg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  println("0x" + utilities.Encoding.byteArrayToString(txRawBytes))
  println(utilities.Tx.doTx(txRawBytes))
}
