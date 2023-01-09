package properties.base

import properties.{AnyPropertyV1, MesaPropertyV1, Property}
import ids.base.{DataID, PropertyID, StringID}

case class MesaProperty(id: PropertyID, dataID: DataID) extends Property {

  def getID: PropertyID = this.id

  def getDataID: DataID = this.dataID

  def getKey: StringID = this.id.keyID

  def getType: StringID = this.dataID.getTypeID

  def isMeta: Boolean = false

  def asProtoMesaProperty: MesaPropertyV1.MesaProperty = MesaPropertyV1.MesaProperty.newBuilder().setId(this.id.asProtoPropertyID).setDataID(this.dataID.asProtoDataID).build()

  def toAnyProperty: AnyPropertyV1.AnyProperty = AnyPropertyV1.AnyProperty.newBuilder().setMesaProperty(this.asProtoMesaProperty).build()

  def getProtoBytes: Array[Byte] = this.asProtoMesaProperty.toByteArray
}

object MesaProperty {

  def apply(value: MesaPropertyV1.MesaProperty): MesaProperty = MesaProperty(id = PropertyID(value.getId), dataID = DataID(value.getDataID))

}