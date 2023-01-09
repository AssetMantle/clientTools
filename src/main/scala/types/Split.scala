package types

import schema.id.base.{IdentityID, OwnableID}

case class Split(ownerID: IdentityID, ownableID: OwnableID, value: BigDecimal) {

  def send(out: BigDecimal): Split = this.copy(value = this.value - out)

  def receive(in: BigDecimal): Split = this.copy(value = this.value + in)

  def canSend(out: BigDecimal): Boolean = this.value >= out

}

object Split {

  def apply(split: SplitV1.Split): Split = Split(ownerID = IdentityID(split.getOwnerID), ownableID = OwnableID(split.getOwnableID), value = BigDecimal(split.getValue))

}
