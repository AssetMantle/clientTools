package schema.list

import com.data.{AnyData, AnyDataList => protoAnyDataList}
import schema.data.Data

import scala.jdk.CollectionConverters._

case class AnyDataList(dataList: Seq[Data])  {

  def getData: Seq[Data] = this.dataList

  def getAnyData: Seq[AnyData] = this.getData.map(_.toAnyData)

  def asProtoAnyDataList: protoAnyDataList = protoAnyDataList.newBuilder().addAllDataList(this.dataList.map(_.toAnyData).asJava).build()

  def getProtoBytes: Array[Byte] = this.asProtoAnyDataList.toByteArray

}

object AnyDataList {

  def apply(anyDataList: protoAnyDataList): AnyDataList = AnyDataList(anyDataList.getDataListList.asScala.toSeq.map(x => Data(x)))

  def apply(protoBytes: Array[Byte]): AnyDataList = AnyDataList(protoAnyDataList.parseFrom(protoBytes))

}

