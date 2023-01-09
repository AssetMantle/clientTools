package data.base

import data.{AnyDataV1, IdDataV1, SuperData}
import ids.AnyIDV1.AnyID
import ids.base.{DataID, HashID, StringID}
import ids.{DataIDV1, ID}

case class IDData(value: AnyID) extends SuperData {

  def asID: ID = ID(this.value)

  def getType: StringID = commonConstants.DataTypeID.IDDataTypeID

  def getID: DataID = DataID(typeID = commonConstants.DataTypeID.IDDataTypeID, hashID = this.generateHashID)

  def getBytes: Array[Byte] = this.asID.getBytes

  def generateHashID: HashID = commonUtilities.ID.generateHashID(this.getBytes)

  def getProtoDataID: DataIDV1.DataID = DataID(typeID = commonConstants.DataTypeID.IDDataTypeID, hashID = this.generateHashID).asProtoDataID

  def zeroValue: SuperData = IDData(StringID("").toAnyID)

  def asProtoIDData: IdDataV1.IDData = IdDataV1.IDData.newBuilder().setValue(this.value).build()

  def toAnyData: AnyDataV1.AnyData = AnyDataV1.AnyData.newBuilder().setIDData(this.asProtoIDData).build()

  def getProtoBytes: Array[Byte] = this.asProtoIDData.toByteArray
}

object IDData {

  def apply(value: IdDataV1.IDData): IDData = IDData(value.getValue)
}
