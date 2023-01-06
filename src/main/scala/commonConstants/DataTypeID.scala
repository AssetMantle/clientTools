package commonConstants

import ids.StringIDV1.StringID

object DataTypeID {

  val AccAddressDataTypeID: StringID = StringID.newBuilder().setIDString("A").build()
  val BooleanDataTypeID: StringID = StringID.newBuilder().setIDString("B").build()
  val DecDataTypeID: StringID = StringID.newBuilder().setIDString("D").build()
  val HeightDataTypeID: StringID = StringID.newBuilder().setIDString("H").build()
  val IDDataTypeID: StringID = StringID.newBuilder().setIDString("I").build()
  val ListDataTypeID: StringID = StringID.newBuilder().setIDString("L").build()
  val StringDataTypeID: StringID = StringID.newBuilder().setIDString("S").build()

}
