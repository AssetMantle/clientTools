package schema.qualified

import lists.PropertyListV1
import qualified.MutablesV1
import schema.id.base.PropertyID
import schema.list.PropertyList
import schema.property.Property

case class Mutables(propertyList: PropertyList) {

  def getProperty(id: PropertyID): Option[Property] = this.propertyList.getProperty(id)

  def getProperties: Seq[Property] = this.propertyList.getProperties

  def getProtoPropertyList: PropertyListV1.PropertyList = this.propertyList.asProtoPropertyList

  def getPropertyIDList: Seq[PropertyID] = this.getProperties.map(_.getID)

  def asProtoMutables: MutablesV1.Mutables = MutablesV1.Mutables.newBuilder().setPropertyList(this.getProtoPropertyList).build()

}


object Mutables {

  def apply(mutables: MutablesV1.Mutables): Mutables = Mutables(PropertyList(mutables.getPropertyList))

}