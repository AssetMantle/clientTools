package commonAbstract.base

import data.{AnyDataV1, StringDataV1}
import ids.{HashIDV1, StringIDV1}

case class StringData(value: String) extends commonAbstract.Data {
  def getType: StringIDV1.StringID = commonConstants.DataTypeID.StringDataTypeID

  def getID: commonAbstract.DataID = DataID(typeID = commonConstants.DataTypeID.StringDataTypeID, hashID = this.generateHashID)

  def zeroValue: commonAbstract.Data = StringData("")

  def getBytes: Array[Byte] = this.asString.getBytes

  def generateHashID: HashIDV1.HashID = commonUtilities.ID.generateHashID(this.getBytes)

  def asProtoStringData: StringDataV1.StringData = StringDataV1.StringData.newBuilder().setValue(this.value).build()

  def asString: String = this.asProtoStringData.toString

  def toAnyData: AnyDataV1.AnyData = AnyDataV1.AnyData.newBuilder().setStringData(this.asProtoStringData).build()
}
