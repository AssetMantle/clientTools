package schema.data.base
import com.data.{AnyData}
import schema.data.Data
import schema.id.base.{DataID, HashID, StringID}
import schema.list.AnyDataList

case class ListData(value: AnyDataList) extends schema.data.Data {
  def getType: StringID = commonConstants.DataTypeID.ListDataTypeID

   def getID: DataID = DataID(typeID = commonConstants.DataTypeID.ListDataTypeID, hashID = this.generateHashID)

   def zeroValue: Data = ListData(value = AnyDataList(dataList = Seq[Data]()))

   def generateHashID: HashID = ???

   def toAnyData: AnyData = ???

   def getBytes: Array[Byte] = ???

   def getProtoBytes: Array[Byte] = ???
}
