package schema.data.base

import data.{AnyDataV1, IdDataV1}
import ids.AnyIDV1.AnyID
import ids.DataIDV1
import schema.data.Data
import schema.id.base.{DataID, HashID, StringID}
import schema.id.{ID, base}

case class IDData(value: AnyID) extends Data {

  def asID: ID = ID(this.value)

  def getType: StringID = commonConstants.DataTypeID.IDDataTypeID

  def getID: DataID = base.DataID(typeID = commonConstants.DataTypeID.IDDataTypeID, hashID = this.generateHashID)

  def getBytes: Array[Byte] = this.asID.getBytes

  def generateHashID: HashID = commonUtilities.ID.generateHashID(this.getBytes)

  def getProtoDataID: DataIDV1.DataID = base.DataID(typeID = commonConstants.DataTypeID.IDDataTypeID, hashID = this.generateHashID).asProtoDataID

  def zeroValue: Data = IDData(StringID("").toAnyID)

  def asProtoIDData: IdDataV1.IDData = IdDataV1.IDData.newBuilder().setValue(this.value).build()

  def toAnyData: AnyDataV1.AnyData = AnyDataV1.AnyData.newBuilder().setIDData(this.asProtoIDData).build()

  def getProtoBytes: Array[Byte] = this.asProtoIDData.toByteArray
}

object IDData {

  def apply(value: IdDataV1.IDData): IDData = IDData(value.getValue)
}
