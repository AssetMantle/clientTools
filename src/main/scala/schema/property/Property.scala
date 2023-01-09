package schema.property

import org.slf4j.{Logger, LoggerFactory}
import properties.AnyPropertyV1
import schema.id.base.{DataID, PropertyID, StringID}
import schema.property.base.{MesaProperty, MetaProperty}

abstract class Property {

  def getID: PropertyID

  def getDataID: DataID

  def getKey: StringID

  def getType: StringID

  def isMeta: Boolean

  def toAnyProperty: AnyPropertyV1.AnyProperty

}

object Property {

  private implicit val module: String = commonConstants.Module.SCHEMA_PROPERTY

  private implicit val logger: Logger = LoggerFactory.getLogger(this.getClass)

  def apply(anyProperty: AnyPropertyV1.AnyProperty): Property = anyProperty.getImplCase.getNumber match {
    case 1 => MesaProperty(anyProperty.getMesaProperty)
    case 2 => MetaProperty(anyProperty.getMetaProperty)
    case _ => commonConstants.Response.INVALID_PROPERTY_TYPE.throwBaseException()
  }
}
