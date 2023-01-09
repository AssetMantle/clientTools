package schema.id.base

import ids.AnyIDV1.AnyID
import ids.ClassificationIDV1
import schema.id.ID

case class ClassificationID(hashID: HashID) extends ID {

  def getBytes: Array[Byte] = this.hashID.getBytes

  def asString: String = commonUtilities.Secrets.base64URLEncoder(this.getBytes)

  def asProtoClassificationID: ClassificationIDV1.ClassificationID = ClassificationIDV1.ClassificationID.newBuilder().setHashID(this.hashID.asProtoHashID).build()

  def toAnyID: AnyID = AnyID.newBuilder().setClassificationID(this.asProtoClassificationID).build()

}

object ClassificationID {
  def apply(anyID: ClassificationIDV1.ClassificationID): ClassificationID = ClassificationID(HashID(anyID.getHashID))
}
