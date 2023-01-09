package schema.id.base

import ids.AnyIDV1.AnyID
import ids.IdentityIDV1
import schema.id.ID

case class IdentityID(hashID: HashID) extends ID {

  def getBytes: Array[Byte] = this.hashID.getBytes

  def asString: String = commonUtilities.Secrets.base64URLEncoder(this.getBytes)

  def asProtoIdentityID: IdentityIDV1.IdentityID = IdentityIDV1.IdentityID.newBuilder().setHashID(this.hashID.asProtoHashID).build()

  def toAnyID: AnyID = AnyID.newBuilder().setIdentityID(this.asProtoIdentityID).build()

}

object IdentityID {
  def apply(anyID: IdentityIDV1.IdentityID): IdentityID = IdentityID(HashID(anyID.getHashID))
}