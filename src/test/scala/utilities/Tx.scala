package utilities

object Tx {

  def doTx(rawBytes: Array[Byte]) = {
    val txRawBytesString: String = "0x" + utilities.Encoding.byteArrayToString(rawBytes)
    println(utilities.doGET.synchronous(testConstants.setup.broadcastURI + txRawBytesString))
  }

}
