package schema.data.base
import com.data.AnyData
import schema.data.Data
import schema.id.base.{DataID, HashID, StringID}
import com.data.{ListData => protoListData}

import java.math.BigInteger
import scala.jdk.CollectionConverters._


case class ListData(dataList: Seq[AnyData]) extends Data {
  def getType: StringID = commonConstants.DataTypeID.ListDataTypeID

   def getID: DataID = DataID(typeID = commonConstants.DataTypeID.ListDataTypeID, hashID = this.generateHashID)

   def zeroValue: Data = ListData(dataList = Seq())

   def generateHashID: HashID = commonUtilities.ID.generateHashID(this.getBytes)

   def asProtoListData: protoListData = protoListData.newBuilder().addAllDataList(this.dataList.asJava).build()

   def toAnyData: AnyData = AnyData.newBuilder().setListData(this.asProtoListData).build()

   def getBytes: Array[Byte] = {
      this.dataList.map(x => Data(x).getBytes).filter(_.length != 0).sortWith((x, y) => new BigInteger(x).compareTo(new BigInteger(y)) == -1).toArray.flatten
   }

   def getProtoBytes: Array[Byte] = this.asProtoListData.toByteArray

   def viewString: String = this.dataList.map(x => Data(x).viewString).filter(_.length != 0).mkString(", ")
}

object ListData {

 def apply(value: protoListData): ListData = ListData(value.getDataListList.asScala.toSeq)

 def apply(protoBytes: Array[Byte]): ListData = ListData(protoListData.parseFrom(protoBytes))

}
