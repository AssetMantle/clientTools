package schema.list

import ids.AnyIDV1
import lists.IdListV1
import schema.id.ID

import scala.jdk.CollectionConverters._

case class IDList(idList: Seq[AnyIDV1.AnyID]) {

  def getIDs: Seq[ID] = idList.map(x => ID(x))

  def asProtoIDList: IdListV1.IDList = IdListV1.IDList.newBuilder().addAllIDList(this.idList.asJava).build()

}

object IDList {

  def apply(ids: Seq[ID]): IDList = IDList(ids.map(_.toAnyID))

}
