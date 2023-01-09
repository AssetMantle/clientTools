package schema.list

import ids.AnyIDV1
import lists.IdListV1
import schema.id.ID

import scala.jdk.CollectionConverters._

case class IDList(idList: Seq[ID]) {

  def getIDs: Seq[ID] = this.idList

  def getAnyIDs: Seq[AnyIDV1.AnyID] = this.getIDs.map(_.toAnyID)

  def asProtoIDList: IdListV1.IDList = IdListV1.IDList.newBuilder().addAllIDList(this.idList.map(_.toAnyID).asJava).build()

  def getProtoBytes: Array[Byte] = this.asProtoIDList.toByteArray

}

object IDList {

  def apply(idList: IdListV1.IDList): IDList = IDList(idList.getIDListList.asScala.toSeq.map(x => ID(x)))

  def apply(protoBytes: Array[Byte]): IDList = IDList(IdListV1.IDList.parseFrom(protoBytes))

}
