package ids.base

import ids.AnyIDV1.AnyID
import ids.{ID, OwnableIDV1}

case class OwnableID(stringID: StringID) extends ID {

  def getBytes: Array[Byte] = this.stringID.asString.getBytes

  def asString: String = this.stringID.asString

  def asProtoOwnableID: OwnableIDV1.OwnableID = OwnableIDV1.OwnableID.newBuilder().setStringID(this.stringID.asProtoStringID).build()

  def toAnyID: AnyID = AnyID.newBuilder().setOwnableID(this.asProtoOwnableID).build()

  def getProtoBytes: Array[Byte] = this.asProtoOwnableID.toByteArray
}

object OwnableID {
  def apply(anyID: OwnableIDV1.OwnableID): OwnableID = OwnableID(StringID(anyID.getStringID))
}