package schema.id

import ids.DataIDV1
import schema.id.base.{HashID, StringID}

abstract class DataID extends ID {

  def getTypeID: StringID

  def getHashID: HashID

  def asProtoDataID: DataIDV1.DataID
}
