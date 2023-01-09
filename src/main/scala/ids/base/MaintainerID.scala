package ids.base

import ids.AnyIDV1.AnyID
import ids.{ID, MaintainerIDV1}

case class MaintainerID(hashID: HashID) extends ID {

  def getBytes: Array[Byte] = this.hashID.getBytes

  def asString: String = commonUtilities.Secrets.base64URLEncoder(this.getBytes)

  def asProtoMaintainerID: MaintainerIDV1.MaintainerID = MaintainerIDV1.MaintainerID.newBuilder().setHashID(this.hashID.asProtoHashID).build()

  def toAnyID: AnyID = AnyID.newBuilder().setMaintainerID(this.asProtoMaintainerID).build()

  def getProtoBytes: Array[Byte] = this.asProtoMaintainerID.toByteArray

}

object MaintainerID {
  def apply(anyID: MaintainerIDV1.MaintainerID): MaintainerID = MaintainerID(HashID(anyID.getHashID))
}