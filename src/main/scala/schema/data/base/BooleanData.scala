package schema.data.base

import commonUtilities.AttoNumber
import com.data.{AnyData, BooleanData => protoBooleanData}
import schema.data.Data
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

  def asProtoBooleanData: protoBooleanData = protoBooleanData.newBuilder().setValue(this.value).build()

  def toAnyData: AnyData = AnyData.newBuilder().setBooleanData(this.asProtoBooleanData).build()

  def getProtoBytes: Array[Byte] = this.asProtoBooleanData.toByteArray
}

object BooleanData {

  def apply(value: protoBooleanData): BooleanData = BooleanData(value.getValue)
}