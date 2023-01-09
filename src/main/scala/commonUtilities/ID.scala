package commonUtilities

import com.google.protobuf.ByteString
import commonConstants.DataTypeID._
import ids.HashIDV1
import org.slf4j.{Logger, LoggerFactory}
import ids.base.{HashID, StringID}

import java.math.BigInteger


object ID {

  private implicit val module: String = commonConstants.Module.COMMON_UTILITIES_ID

  private implicit val logger: Logger = LoggerFactory.getLogger(this.getClass)

  def getDataTypeID(id: String): StringID = id match {
    case "A" => AccAddressDataTypeID
    case "B" => BooleanDataTypeID
    case "D" => DecDataTypeID
    case "H" => HeightDataTypeID
    case "I" => IDDataTypeID
    case "L" => ListDataTypeID
    case "S" => StringDataTypeID
    case _ => commonConstants.Response.INVALID_DATA_TYPE.throwBaseException()
  }

  def getDataTypeID(implNumber: Int): StringID = implNumber match {
    case 1 => AccAddressDataTypeID
    case 2 => BooleanDataTypeID
    case 3 => DecDataTypeID
    case 4 => HeightDataTypeID
    case 5 => IDDataTypeID
    case 6 => StringDataTypeID
    case 7 => ListDataTypeID
    case _ => commonConstants.Response.INVALID_DATA_TYPE.throwBaseException()
  }

  def generateHashID(bytesList: Array[Byte]*): HashID = {
    HashID(HashIDV1.HashID.newBuilder().setIDBytes(ByteString.copyFrom(
      commonUtilities.Secrets.sha256Hash(bytesList.filter(_.length != 0).sortWith((x, y) => new BigInteger(x).compareTo(new BigInteger(y)) == -1).toArray.flatten)
    )).build())
  }

  def generateHashIDFromList(bytesList: Seq[Array[Byte]]): HashID = {
    HashID(HashIDV1.HashID.newBuilder().setIDBytes(ByteString.copyFrom(
      commonUtilities.Secrets.sha256Hash(bytesList.filter(_.length != 0).sortWith((x, y) => new BigInteger(x).compareTo(new BigInteger(y)) == -1).toArray.flatten)
    )).build())
  }

}
