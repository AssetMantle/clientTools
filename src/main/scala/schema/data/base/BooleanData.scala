package schema.data.base

import commonUtilities.AttoNumber
import data.{AnyDataV1, DecDataV1}
import schema.data.Data
import schema.id.DataID
import schema.id.base.{DataID, HashID, StringID}

case class BooleanData(value: Boolean) extends Data {
  def getType: StringID = commonConstants.DataTypeID.BooleanDataTypeID

  def getID: DataID = DataID(typeID = commonConstants.DataTypeID.BooleanDataTypeID, hashID = this.generateHashID)

  def zeroValue: Data = DecData(AttoNumber.zero)

  def getBytes: Array[Byte] = {
    val res: Byte = if (this.value) 1 else 0
    Seq(res).toArray
  }

  def generateHashID: HashID = commonUtilities.ID.generateHashID(this.getBytes)

  def toAnyData: AnyDataV1.AnyData = AnyDataV1.AnyData.newBuilder().setDecData(DecDataV1.DecData.newBuilder().setValue(this.value.toString).build()).build()
}