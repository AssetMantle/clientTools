package schema.data.base
import com.data.AnyData
import schema.data.Data
import schema.id.base.{DataID, HashID, StringID}
import schema.list.AnyDataList
import com.data.{ListData => protoListData}

import java.math.BigInteger
import scala.collection.mutable.ArrayBuffer

case class ListData(value: AnyDataList) extends Data {
  def getType: StringID = commonConstants.DataTypeID.ListDataTypeID

   def getID: DataID = DataID(typeID = commonConstants.DataTypeID.ListDataTypeID, hashID = this.generateHashID)

   def zeroValue: Data = ListData(value = AnyDataList(dataList = Seq()))

   def generateHashID: HashID = commonUtilities.ID.generateHashID(this.getBytes)

   def asProtoListData: protoListData = protoListData.newBuilder().setValue(this.value.asProtoAnyDataList).build()

   def toAnyData: AnyData = AnyData.newBuilder().setListData(this.asProtoListData).build()

   def getBytes: Array[Byte] = {
      this.value.dataList.map(x => Data(x).getBytes).filter(_.length != 0).sortWith((x, y) => new BigInteger(x).compareTo(new BigInteger(y)) == -1).toArray.flatten
   }

   def getProtoBytes: Array[Byte] = this.asProtoListData.toByteArray
}

object ListData {

 def apply(value: protoListData): ListData = ListData(AnyDataList(value.getValue))

 def apply(protoBytes: Array[Byte]): ListData = ListData(protoListData.parseFrom(protoBytes))

}
