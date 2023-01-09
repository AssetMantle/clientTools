package schema.data.base

import com.data.{AnyData, DecData => protoDecData}
import commonUtilities.AttoNumber
import schema.data.Data
import schema.id.base.{DataID, HashID, StringID}

case class DecData(value: AttoNumber) extends Data {
  def getType: StringID = commonConstants.DataTypeID.DecDataTypeID

  def getID: DataID = DataID(typeID = commonConstants.DataTypeID.DecDataTypeID, hashID = this.generateHashID)

  def zeroValue: Data = DecData(AttoNumber.zero)

  def getBytes: Array[Byte] = this.value.getSortableDecBytes

  def generateHashID: HashID = commonUtilities.ID.generateHashID(this.getBytes)

  def asProtoDecData: protoDecData = protoDecData.newBuilder().setValue(this.value.toString).build()

  def toAnyData: AnyData = AnyData.newBuilder().setDecData(this.asProtoDecData).build()
}

object DecData {

  def apply(value: protoDecData): DecData = DecData(AttoNumber(value.getValue))
}
