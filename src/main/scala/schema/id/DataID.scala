package schema.id

import schema.id.base.{HashID, StringID}

abstract class DataID extends ID {

  def getTypeID: StringID
  def getHashID: HashID


  def asProto:
}
