package ids.base

import ids.AnyIDV1.AnyID
import ids.{ID, StringIDV1}

case class StringID(value: String) extends ID {

  def getBytes: Array[Byte] = this.value.getBytes

  def asString: String = this.value

  def asProtoStringID: StringIDV1.StringID = StringIDV1.StringID.newBuilder().setIDString(this.value).build()

  def toAnyID: AnyID = AnyID.newBuilder().setStringID(this.asProtoStringID).build()

  def getProtoBytes: Array[Byte] = this.asProtoStringID.toByteArray
}

object StringID {

  def apply(anyID: StringIDV1.StringID): StringID = StringID(anyID.getIDString)
}
