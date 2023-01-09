package properties.base

import data.{AnyDataV1, SuperData}
import properties.{AnyPropertyV1, MetaPropertyV1, Property}
import ids.base.{DataID, PropertyID, StringID}

case class MetaProperty(id: PropertyID, data: AnyDataV1.AnyData) extends Property {

  def getID: PropertyID = this.id

  def getData: SuperData = SuperData(this.data)

  def getDataID: DataID = this.getData.getID

  def getKey: StringID = this.id.keyID

  def getType: StringID = this.getData.getType

  def isMeta: Boolean = true

  def asProtoMetaProperty: MetaPropertyV1.MetaProperty = MetaPropertyV1.MetaProperty.newBuilder().setId(this.id.asProtoPropertyID).setAnyData(this.data).build()

  def toAnyProperty: AnyPropertyV1.AnyProperty = AnyPropertyV1.AnyProperty.newBuilder().setMetaProperty(this.asProtoMetaProperty).build()

  def scrub(): MesaProperty = MesaProperty(id = this.id, dataID = this.getDataID)

  def getProtoBytes: Array[Byte] = this.asProtoMetaProperty.toByteArray
}

object MetaProperty {

  def apply(value: MetaPropertyV1.MetaProperty): MetaProperty = MetaProperty(id = PropertyID(value.getId), data = value.getAnyData)

}