package lists

import ids.base.PropertyID
import properties.{AnyPropertyV1, Property}
import properties.base.MetaProperty

import scala.jdk.CollectionConverters._

case class PropertyList(propertyList: Seq[Property]) {

  def getProperties: Seq[Property] = this.propertyList

  def getAnyProperties: Seq[AnyPropertyV1.AnyProperty] = this.getProperties.map(_.toAnyProperty)

  def getProperty(id: PropertyID): Option[Property] = this.getProperties.find(x => x.getID.asString == id.asString)

  def getPropertyAsAnyProperty(id: PropertyID): Option[AnyPropertyV1.AnyProperty] = this.getProperty(id).map(_.toAnyProperty)

  def asProtoPropertyList: PropertyListV1.PropertyList = PropertyListV1.PropertyList.newBuilder().addAllPropertyList(this.propertyList.map(_.toAnyProperty).asJava).build()

  def scrub: PropertyList = PropertyList(this.getProperties.map { property =>
    if (property.isMeta) property.asInstanceOf[MetaProperty].scrub() else property
  })

  def getProtoBytes: Array[Byte] = this.asProtoPropertyList.toByteArray
}

object PropertyList {

  def apply(properties: PropertyListV1.PropertyList): PropertyList = PropertyList(properties.getPropertyListList.asScala.toSeq.map(x => Property(x)))

  def apply(protoBytes: Array[Byte]): PropertyList = PropertyList(PropertyListV1.PropertyList.parseFrom(protoBytes))

}
