package commonAbstract.base

import commonUtilities.AttoNumber
import data.{AnyDataV1, DecDataV1}
import ids.{HashIDV1, StringIDV1}

case class DecData(value: AttoNumber) extends commonAbstract.Data {
  def getType: StringIDV1.StringID = commonConstants.DataTypeID.DecDataTypeID

  def getID: commonAbstract.DataID = DataID(typeID = commonConstants.DataTypeID.DecDataTypeID, hashID = this.generateHashID)

  def zeroValue: commonAbstract.Data = DecData(AttoNumber.zero)

  def getBytes: Array[Byte] = this.value.getSortableDecBytes

  def generateHashID: HashIDV1.HashID = commonUtilities.ID.generateHashID(this.getBytes)

  override def toString: String = this.value.toString

  def toAnyData: AnyDataV1.AnyData = AnyDataV1.AnyData.newBuilder().setDecData(DecDataV1.DecData.newBuilder().setValue(this.value.toString).build()).build()
}
