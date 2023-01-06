package commonAbstract

import data.AnyDataV1.AnyData
import ids.HashIDV1.HashID
import ids.StringIDV1.StringID

abstract class Data {

  def getType: StringID

  def getID: DataID

  def toString: String

  def zeroValue: Data

  def generateHashID: HashID

  def toAnyData: AnyData

  def getBytes: Array[Byte]
}
