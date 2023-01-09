package schema.id.base

import com.ids.{AnyID, OwnableID => protoOwnableID}
import schema.id.ID

case class OwnableID(stringID: StringID) extends ID {

  def getBytes: Array[Byte] = this.stringID.asString.getBytes

  def asString: String = this.stringID.asString

  def asProtoOwnableID: protoOwnableID = protoOwnableID.newBuilder().setStringID(this.stringID.asProtoStringID).build()

  def toAnyID: AnyID = AnyID.newBuilder().setOwnableID(this.asProtoOwnableID).build()

  def getProtoBytes: Array[Byte] = this.asProtoOwnableID.toByteArray
}

object OwnableID {
  def apply(anyID: protoOwnableID): OwnableID = OwnableID(StringID(anyID.getStringID))
}