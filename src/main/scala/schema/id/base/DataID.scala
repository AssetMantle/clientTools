package schema.id.base

import ids.AnyIDV1.AnyID
import ids.DataIDV1
import schema.id.ID

case class DataID(typeID: StringID, hashID: HashID) extends ID {

  def getTypeID: StringID = this.typeID

  def getHashID: HashID = this.hashID

  def getHashIDString: String = commonUtilities.Secrets.base64URLEncoder(hashID.getBytes)

  def getBytes: Array[Byte] = this.typeID.getBytes ++ this.hashID.getBytes

  def asString: String = this.getTypeID + commonConstants.Blockchain.IDSeparator + this.getHashIDString

  def asProtoDataID: DataIDV1.DataID = DataIDV1.DataID.newBuilder().setTypeID(this.typeID.asProtoStringID).setHashID(this.hashID.asProtoHashID).build()

  def toAnyID: AnyID = AnyID.newBuilder().setDataID(this.asProtoDataID).build()
}

object DataID {
  def apply(anyID: DataIDV1.DataID): DataID = DataID(typeID = StringID(anyID.getTypeID), hashID = HashID(anyID.getHashID))
}