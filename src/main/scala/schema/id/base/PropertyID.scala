package schema.id.base

import com.ids.{AnyID, PropertyID => protoPropertyID}
import schema.id.ID

case class PropertyID(keyID: StringID, typeID: StringID) extends ID {

  def getBytes: Array[Byte] = this.keyID.getBytes ++ this.typeID.getBytes

  def asString: String = this.keyID.asString + commonConstants.Blockchain.IDSeparator + this.typeID.asString

  def asProtoPropertyID: protoPropertyID = protoPropertyID.newBuilder().setTypeID(this.typeID.asProtoStringID).setKeyID(this.keyID.asProtoStringID).build()

  def toAnyID: AnyID = AnyID.newBuilder().setPropertyID(this.asProtoPropertyID).build()

  def getProtoBytes: Array[Byte] = this.asProtoPropertyID.toByteString.toByteArray
}

object PropertyID {
  def apply(anyID: protoPropertyID): PropertyID = {
    val keyID = StringID(anyID.getKeyID)
    println(keyID)
    val typeID = StringID(anyID.getTypeID)
    println(typeID)
    PropertyID(keyID = keyID, typeID = typeID)
  }
}