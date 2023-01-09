package ids.base

import com.google.protobuf.ByteString
import ids.AnyIDV1.AnyID
import ids.{HashIDV1, ID}

case class HashID(value: Array[Byte]) extends ID {

  def getBytes: Array[Byte] = this.value

  def asString: String = commonUtilities.Secrets.base64URLEncoder(this.getBytes)

  def asProtoHashID: HashIDV1.HashID = HashIDV1.HashID.newBuilder().setIDBytes(ByteString.copyFrom(this.getBytes)).build()

  def toAnyID: AnyID = AnyID.newBuilder().setHashID(this.asProtoHashID).build()

  def getProtoBytes: Array[Byte] = this.asProtoHashID.toByteArray

}

object HashID {
  def apply(anyID: HashIDV1.HashID): HashID = HashID(anyID.getIDBytes.toByteArray)
}
