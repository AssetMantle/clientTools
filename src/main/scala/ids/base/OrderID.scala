package ids.base

import ids.AnyIDV1.AnyID
import ids.{ID, OrderIDV1}

case class OrderID(hashID: HashID) extends ID {

  def getBytes: Array[Byte] = this.hashID.getBytes

  def asString: String = commonUtilities.Secrets.base64URLEncoder(this.getBytes)

  def asProtoOrderID: OrderIDV1.OrderID = OrderIDV1.OrderID.newBuilder().setHashID(this.hashID.asProtoHashID).build()

  def toAnyID: AnyID = AnyID.newBuilder().setOrderID(this.asProtoOrderID).build()

  def getProtoBytes: Array[Byte] = this.asProtoOrderID.toByteArray

}

object OrderID {
  def apply(anyID: OrderIDV1.OrderID): OrderID = OrderID(HashID(anyID.getHashID))
}