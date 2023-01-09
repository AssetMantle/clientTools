package commonTypes

import java.nio.{ByteBuffer, ByteOrder}

case class Height(value: Int) {

  def AsString: String = this.value.toString

  def getBytes: Array[Byte] = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putInt(this.value).array()

}
