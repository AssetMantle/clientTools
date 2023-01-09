package schema.qualified

import lists.PropertyListV1
import qualified.ImmutablesV1
import schema.id.base.{HashID, PropertyID}
import schema.list.PropertyList
import schema.property.Property

case class Immutables(propertyList: PropertyList) {

  def getProperty(id: PropertyID): Option[Property] = this.propertyList.getProperty(id)

  def getProperties: Seq[Property] = this.propertyList.getProperties

  def getProtoPropertyList: PropertyListV1.PropertyList = this.propertyList.asProtoPropertyList

  def getPropertyIDList: Seq[PropertyID] = this.getProperties.map(_.getID)

  def generateHashID: HashID = commonUtilities.ID.generateHashIDFromList(this.getProperties.map(x => x.getDataID.getHashID.getBytes))

  def asProtoImmutables: ImmutablesV1.Immutables = ImmutablesV1.Immutables.newBuilder().setPropertyList(this.getProtoPropertyList).build()

}

object Immutables {

  def apply(immutables: ImmutablesV1.Immutables): Immutables = Immutables(PropertyList(immutables.getPropertyList))

}