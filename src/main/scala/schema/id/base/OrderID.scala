package schema.id.base

import ids.AnyIDV1.AnyID
import ids.OrderIDV1
import schema.id.ID

case class OrderID(hashID: HashID) extends ID {

  def getBytes: Array[Byte] = this.hashID.getBytes

  def asString: String = commonUtilities.Secrets.base64URLEncoder(this.getBytes)

  def asProtoOrderID: OrderIDV1.OrderID = OrderIDV1.OrderID.newBuilder().setHashID(this.hashID.asProtoHashID).build()

  def toAnyID: AnyID = AnyID.newBuilder().setOrderID(this.asProtoOrderID).build()

}

object OrderID {
  def apply(anyID: OrderIDV1.OrderID): OrderID = OrderID(HashID(anyID.getHashID))
}