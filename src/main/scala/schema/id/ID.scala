package schema.id

import ids.AnyIDV1
import org.slf4j.{Logger, LoggerFactory}
import schema.id.base._

abstract class ID {

  def getBytes: Array[Byte]

  def asString: String

  def toAnyID: AnyIDV1.AnyID

}

object ID {

  private implicit val module: String = commonConstants.Module.SCHEMA_ID

  private implicit val logger: Logger = LoggerFactory.getLogger(this.getClass)
  def apply(anyID: AnyIDV1.AnyID): ID = anyID.getImplCase.getNumber match {
    case 1 => AssetID(anyID.getAssetID)
    case 2 => ClassificationID(anyID.getClassificationID)
    case 3 => DataID(anyID.getDataID)
    case 4 => HashID(anyID.getHashID)
    case 5 => IdentityID(anyID.getIdentityID)
    case 6 => MaintainerID(anyID.getMaintainerID)
    case 7 => OrderID(anyID.getOrderID)
    case 8 => OwnableID(anyID.getOwnableID)
    case 9 => PropertyID(anyID.getPropertyID)
    case 10 => SplitID(anyID.getSplitID)
    case 11 => StringID(anyID.getStringID)
    case _ => commonConstants.Response.UNKNOWN_ID_TYPE.throwBaseException()
  }
}
