package commonConstants

import ids.StringIDV1.StringID

object DataID {

  val AccAddressDataID: StringID = StringID.newBuilder().setIDString("A").build()
  val BooleanDataID: StringID = StringID.newBuilder().setIDString("B").build()
  val DecDataID: StringID = StringID.newBuilder().setIDString("D").build()
  val HeightDataID: StringID = StringID.newBuilder().setIDString("H").build()
  val IDDataID: StringID = StringID.newBuilder().setIDString("I").build()
  val ListDataID: StringID = StringID.newBuilder().setIDString("L").build()
  val StringDataID: StringID = StringID.newBuilder().setIDString("S").build()

}
