package schema.id.base

import ids.AnyIDV1.AnyID
import ids.PropertyIDV1
import schema.id.ID

case class PropertyID(keyID: StringID, typeID: StringID) extends ID {

  def getBytes: Array[Byte] = this.keyID.getBytes ++ this.typeID.getBytes

  def asString: String = this.keyID.asString + commonConstants.Blockchain.IDSeparator + this.typeID.asString

  def asProtoPropertyID: PropertyIDV1.PropertyID = PropertyIDV1.PropertyID.newBuilder().setTypeID(this.typeID.asProtoStringID).setKeyID(this.keyID.asProtoStringID).build()

  def toAnyID: AnyID = AnyID.newBuilder().setPropertyID(this.asProtoPropertyID).build()
}

object PropertyID {
  def apply(anyID: PropertyIDV1.PropertyID): PropertyID = PropertyID(keyID = StringID(anyID.getKeyID), typeID = StringID(anyID.getKeyID))
}