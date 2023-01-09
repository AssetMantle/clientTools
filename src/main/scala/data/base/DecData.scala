package data.base

import commonUtilities.AttoNumber
import data.{AnyDataV1, SuperData, DecDataV1}
import ids.base.{DataID, HashID, StringID}

case class DecData(value: AttoNumber) extends SuperData {
  def getType: StringID = commonConstants.DataTypeID.DecDataTypeID

  def getID: DataID = DataID(typeID = commonConstants.DataTypeID.DecDataTypeID, hashID = this.generateHashID)

  def zeroValue: SuperData = DecData(AttoNumber.zero)

  def getBytes: Array[Byte] = this.value.getSortableDecBytes

  def generateHashID: HashID = commonUtilities.ID.generateHashID(this.getBytes)

  def asProtoDecData: DecDataV1.DecData = DecDataV1.DecData.newBuilder().setValue(this.value.toString).build()

  def toAnyData: AnyDataV1.AnyData = AnyDataV1.AnyData.newBuilder().setDecData(this.asProtoDecData).build()

  def getProtoBytes: Array[Byte] = this.asProtoDecData.toByteArray
}

object DecData {

  def apply(value: DecDataV1.DecData): DecData = DecData(AttoNumber(value.getValue))
}
