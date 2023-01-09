package schema.data

import com.data.AnyData
import org.slf4j.{Logger, LoggerFactory}
import schema.data.base._
import schema.id.base.{DataID, HashID, StringID}

abstract class Data {

  def getType: StringID

  def getID: DataID

  def zeroValue: Data

  def generateHashID: HashID

  def toAnyData: AnyData

  def getBytes: Array[Byte]

  def getProtoBytes: Array[Byte]
}

object Data {

  private implicit val module: String = commonConstants.Module.SCHEMA_DATA

  private implicit val logger: Logger = LoggerFactory.getLogger(this.getClass)

  def apply(anyData: AnyData): Data = anyData.getImplCase.getNumber match {
    case 1 => AccAddressData(anyData.getAccAddressData)
    case 2 => BooleanData(anyData.getBooleanData)
    case 3 => DecData(anyData.getDecData)
    case 4 => HeightData(anyData.getHeightData)
    case 5 => IDData(anyData.getIDData)
    case 6 => StringData(anyData.getStringData)
    //    case 7 => AccAddressData(anyData.getListData)
    case _ => commonConstants.Response.INVALID_DATA_TYPE.throwBaseException()
  }

  def apply(protoBytes: Array[Byte]): Data = Data(AnyData.parseFrom(protoBytes))

}
