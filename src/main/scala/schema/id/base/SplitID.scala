
package schema.id.base

import ids.AnyIDV1.AnyID
import ids.SplitIDV1
import schema.id.ID

case class SplitID(ownerID: IdentityID, ownableID: OwnableID) extends ID {

  def getBytes: Array[Byte] = this.ownerID.getBytes ++ this.ownableID.getBytes

  def asString: String = this.ownerID.asString + commonConstants.Blockchain.IDSeparator + this.ownableID.asString

  def asProtoSplitID: SplitIDV1.SplitID = SplitIDV1.SplitID.newBuilder().setOwnerID(this.ownerID.asProtoIdentityID).setOwnableID(this.ownableID.asProtoOwnableID).build()

  def toAnyID: AnyID = AnyID.newBuilder().setSplitID(this.asProtoSplitID).build()
}

object SplitID {
  def apply(anyID: SplitIDV1.SplitID): SplitID = SplitID(ownerID = IdentityID(anyID.getOwnerID), ownableID = OwnableID(anyID.getOwnableID))
}