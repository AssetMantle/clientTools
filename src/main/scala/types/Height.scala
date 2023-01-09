package types

import java.nio.{ByteBuffer, ByteOrder}

case class Height(value: Long) {

  def AsString: String = this.value.toString

  def getBytes: Array[Byte] = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.value).array()

  def asProtoHeight: HeightV1.Height = HeightV1.Height.newBuilder().setValue(this.value).build()

}

object Height {

  def apply(value: HeightV1.Height): Height = Height(value.getValue)

}