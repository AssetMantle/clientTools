package schema.property.base

import data.AnyDataV1
import properties.{AnyPropertyV1, MetaPropertyV1}
import schema.data.Data
import schema.id.DataID
import schema.id.base.{PropertyID, StringID}
import schema.property.Property

case class MetaProperty(id: PropertyID, data: AnyDataV1.AnyData) extends Property {

  def getID: PropertyID = this.id

  def getData: Data = Data(this.data)

  def getDataID: DataID = this.getData.getID

  def getKey: StringID = this.id.keyID

  def getType: StringID = this.getData.getType

  def isMeta: Boolean = true

  def asProtoMetaProperty: MetaPropertyV1.MetaProperty = MetaPropertyV1.MetaProperty.newBuilder().setId(this.id.asProtoPropertyID).setAnyData(this.data).build()

  def toAnyProperty: AnyPropertyV1.AnyProperty = AnyPropertyV1.AnyProperty.newBuilder().setMetaProperty(this.asProtoMetaProperty).build()

  def scrub(): MesaProperty = MesaProperty(id = this.id, dataID = this.getDataID)

}

object MetaProperty {

  def apply(value: MetaPropertyV1.MetaProperty) = MetaProperty(id = PropertyID(value.getId), data = value.getAnyData)

}