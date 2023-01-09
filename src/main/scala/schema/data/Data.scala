package schema.data

import data.AnyDataV1.AnyData
import schema.id.DataID
import schema.id.base.{HashID, StringID}

abstract class Data {

  def getType: StringID

  def getID: DataID

  def zeroValue: Data

  def generateHashID: HashID

  def toAnyData: AnyData

  def getBytes: Array[Byte]
}
