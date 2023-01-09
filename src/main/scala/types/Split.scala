package types

import schema.id.base.{IdentityID, OwnableID}

case class Split(ownerID: IdentityID, ownableID: OwnableID, value: BigDecimal) {

  def send(out: BigDecimal): Split = this.copy(value = this.value - out)

  def receive(in: BigDecimal): Split = this.copy(value = this.value + in)

  def canSend(out: BigDecimal): Boolean = this.value >= out

}
