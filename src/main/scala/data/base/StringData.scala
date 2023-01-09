package data.base

import data.{AnyDataV1, StringDataV1, SuperData}
import ids.base.{DataID, HashID, StringID}

case class StringData(value: String) extends SuperData {
  def getType: StringID = commonConstants.DataTypeID.StringDataTypeID

  def getID: DataID = DataID(typeID = commonConstants.DataTypeID.StringDataTypeID, hashID = this.generateHashID)

  def zeroValue: SuperData = StringData("")

  def getBytes: Array[Byte] = this.value.getBytes

  def generateHashID: HashID = commonUtilities.ID.generateHashID(this.getBytes)

  def asProtoStringData: StringDataV1.StringData = StringDataV1.StringData.newBuilder().setValue(this.value).build()

  def toAnyData: AnyDataV1.AnyData = AnyDataV1.AnyData.newBuilder().setStringData(this.asProtoStringData).build()

  def getProtoBytes: Array[Byte] = this.asProtoStringData.toByteArray
}

object StringData {

  def apply(value: StringDataV1.StringData): StringData = StringData(value.getValue)
}