package schema.id

import com.ids.AnyOwnableID
import org.slf4j.{Logger, LoggerFactory}
import schema.id.base.{AssetID, CoinID}

abstract class OwnableID extends ID {
  def toAnyOwnableID: AnyOwnableID

}

object OwnableID {

  private implicit val module: String = commonConstants.Module.SCHEMA_OWNABLE_ID

  private implicit val logger: Logger = LoggerFactory.getLogger(this.getClass)

  def apply(anyOwnableID: AnyOwnableID): OwnableID = anyOwnableID.getImplCase.getNumber match {
    case 1 => AssetID(anyOwnableID.getAssetID)
    case 2 => CoinID(anyOwnableID.getCoinID)
    case _ => commonConstants.Response.INVALID_OWNABLE_ID_TYPE.throwBaseException()
  }

  def apply(protoBytes: Array[Byte]): OwnableID = OwnableID(AnyOwnableID.parseFrom(protoBytes))
}