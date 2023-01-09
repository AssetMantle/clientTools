package schema.property.base

import properties.{AnyPropertyV1, MesaPropertyV1}
import schema.id.DataID
import schema.id.base.{PropertyID, StringID}
import schema.property.Property

case class MesaProperty(id: PropertyID, dataID: DataID) extends Property {

  def getID: PropertyID = this.id

  def getDataID: DataID = this.dataID

  def getKey: StringID = this.id.keyID

  def getType: StringID = this.dataID.getTypeID

  def isMeta: Boolean = false

  def asProtoMesaProperty: MesaPropertyV1.MesaProperty = MesaPropertyV1.MesaProperty.newBuilder().setId(this.id.asProtoPropertyID).setDataID(this.dataID.asProtoDataID).build()

  def toAnyProperty: AnyPropertyV1.AnyProperty = AnyPropertyV1.AnyProperty.newBuilder().setMesaProperty(this.asProtoMesaProperty).build()

}

object MesaProperty {

  def apply(value: MesaPropertyV1.MesaProperty) = MesaProperty(id = PropertyID(value.getId), dataID = schema.id.base.DataID(value.getDataID))

}