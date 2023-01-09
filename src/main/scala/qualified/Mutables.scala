package qualified

import ids.base.PropertyID
import lists.{PropertyList, PropertyListV1}
import properties.Property

case class Mutables(propertyList: PropertyList) {

  def getProperty(id: PropertyID): Option[Property] = this.propertyList.getProperty(id)

  def getProperties: Seq[Property] = this.propertyList.getProperties

  def getProtoPropertyList: PropertyListV1.PropertyList = this.propertyList.asProtoPropertyList

  def getPropertyIDList: Seq[PropertyID] = this.getProperties.map(_.getID)

  def asProtoMutables: MutablesV1.Mutables = MutablesV1.Mutables.newBuilder().setPropertyList(this.getProtoPropertyList).build()

  def getProtoBytes: Array[Byte] = this.asProtoMutables.toByteArray
}


object Mutables {

  def apply(mutables: MutablesV1.Mutables): Mutables = Mutables(PropertyList(mutables.getPropertyList))

  def apply(protoBytes: Array[Byte]): Mutables = Mutables(MutablesV1.Mutables.parseFrom(protoBytes))

}