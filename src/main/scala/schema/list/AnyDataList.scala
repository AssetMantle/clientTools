package schema.list

import com.data.{AnyData, AnyDataList => protoAnyDataList}
import schema.data.Data

import scala.jdk.CollectionConverters._

case class AnyDataList(dataList: Seq[AnyData]) {

  def getData: Seq[Data] = this.dataList.map(x => Data(x))

  def getAnyData: Seq[AnyData] = this.dataList

  def asProtoAnyDataList: protoAnyDataList = protoAnyDataList.newBuilder().addAllDataList(this.dataList.asJava).build()

  def getProtoBytes: Array[Byte] = this.asProtoAnyDataList.toByteArray

}

object AnyDataList {

  def apply(anyDataList: protoAnyDataList): AnyDataList = AnyDataList(anyDataList.getDataListList.asScala.toSeq)

  def apply(protoBytes: Array[Byte]): AnyDataList = AnyDataList(protoAnyDataList.parseFrom(protoBytes))

}

