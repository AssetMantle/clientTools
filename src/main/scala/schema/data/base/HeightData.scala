package schema.data.base

import commonUtilities.AttoNumber
import data.{AnyDataV1, HeightDataV1}
import schema.data.Data
import schema.id.base.{DataID, HashID, StringID}
import types.Height

case class HeightData(value: Height) extends Data {
  def getType: StringID = commonConstants.DataTypeID.HeightDataTypeID

  def getID: DataID = DataID(typeID = commonConstants.DataTypeID.HeightDataTypeID, hashID = this.generateHashID)

  def zeroValue: Data = DecData(AttoNumber.zero)

  def getBytes: Array[Byte] = this.value.getBytes

  def generateHashID: HashID = commonUtilities.ID.generateHashID(this.getBytes)

  def asProtoHeightData: HeightDataV1.HeightData = HeightDataV1.HeightData.newBuilder().setValue(this.value.asProtoHeight).build()

  def toAnyData: AnyDataV1.AnyData = AnyDataV1.AnyData.newBuilder().setHeightData(this.asProtoHeightData).build()
}

object HeightData {

  def apply(value: HeightDataV1.HeightData): HeightData = HeightData(Height(value.getValue))
}
