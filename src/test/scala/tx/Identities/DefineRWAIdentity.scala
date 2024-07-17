package tx.Identities

import com.google.protobuf
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base._
import schema.data.{constants => dataConstants}
import schema.id.base.{PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.{MesaProperty, MetaProperty}

class DefineRWAIdentity extends AnyFunSuite {

  val seq = 1
  val immutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("origin"), dataConstants.StringDataTypeID), StringData("MantlePlace")),
    MetaProperty(PropertyID(StringID("id"), dataConstants.StringDataTypeID), StringData("")),
  )

  val immutableProperties: Seq[MesaProperty] = Seq()

  val mutableMetaProperties: Seq[MetaProperty] = Seq(
    MetaProperty(PropertyID(StringID("note1"), dataConstants.StringDataTypeID), StringData("")),
    MetaProperty(PropertyID(StringID("role"), dataConstants.StringDataTypeID), StringData("")),
  )
  val mutableProperties: Seq[MesaProperty] = Seq(
    MesaProperty(PropertyID(StringID("note3"), dataConstants.StringDataTypeID), StringData("")),
    MesaProperty(PropertyID(StringID("note4"), dataConstants.StringDataTypeID), StringData("")),
  )
  val identitiesDefineMsg: protobuf.Any = utilities.BlockchainTransaction.getDefineIdentityMsgAsAny(testConstants.setup.balanceAccount.address, testConstants.setup.nubIdentityID.asProtoIdentityID, PropertyList(immutableMetaProperties).asProtoPropertyList, PropertyList(immutableProperties).asProtoPropertyList, PropertyList(mutableMetaProperties).asProtoPropertyList, PropertyList(mutableProperties).asProtoPropertyList)
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = Seq(identitiesDefineMsg), fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  println( "0x" + utilities.Encoding.byteArrayToString(txRawBytes))
  println(utilities.Tx.doTx(txRawBytes))
}