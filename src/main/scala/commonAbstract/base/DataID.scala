package commonAbstract.base

import ids.HashIDV1.HashID
import ids.StringIDV1.StringID

case class DataID(typeID: StringID, hashID: HashID) extends commonAbstract.DataID {
  def getHashID: HashID = this.hashID

  def getBytes: Array[Byte] = this.typeID.getIDStringBytes.toByteArray ++ this.hashID.getIDBytes.toByteArray

  def asString: String = typeID + commonConstants.Blockchain.IDSeparator + hashID
}
