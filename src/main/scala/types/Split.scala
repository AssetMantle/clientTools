package types

import ids.base.{IdentityID, OwnableID}

case class Split(ownerID: IdentityID, ownableID: OwnableID, value: BigDecimal) {

  def send(out: BigDecimal): Split = this.copy(value = this.value - out)

  def receive(in: BigDecimal): Split = this.copy(value = this.value + in)

  def canSend(out: BigDecimal): Boolean = this.value >= out

  def asProtoSplit: SplitV1.Split = SplitV1.Split.newBuilder().setOwnerID(ownerID.asProtoIdentityID).setOwnableID(ownableID.asProtoOwnableID).setValue(value.toString()).build()

  def getProtoBytes: Array[Byte] = this.asProtoSplit.toByteArray

}

object Split {

  def apply(split: SplitV1.Split): Split = Split(ownerID = IdentityID(split.getOwnerID), ownableID = OwnableID(split.getOwnableID), value = BigDecimal(split.getValue))

  def apply(protoBytes: Array[Byte]): Split = Split(SplitV1.Split.parseFrom(protoBytes))

}
