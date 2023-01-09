package documents

import ids.base.{ClassificationID, HashID, PropertyID}
import properties.Property
import qualified.{Immutables, Mutables}

case class Document(classificationID: ClassificationID, immutables: Immutables, mutables: Mutables) {

  def generateHashID: HashID = commonUtilities.ID.generateHashID(this.classificationID.getBytes, this.immutables.generateHashID.getBytes)

  def getProperty(id: PropertyID): Option[Property] = {
    val immutable = this.immutables.getProperty(id)
    if (immutable.isEmpty) {
      val mutable = this.mutables.getProperty(id)
      if (mutable.nonEmpty) mutable else None
    } else immutable
  }

  def asProtoDocument: DocumentV1.Document = DocumentV1.Document.newBuilder()
    .setClassificationID(this.classificationID.asProtoClassificationID)
    .setImmutables(this.immutables.asProtoImmutables)
    .setMutables(this.mutables.asProtoMutables)
    .build()

  def getProtoBytes: Array[Byte] = this.asProtoDocument.toByteArray
}

object Document {

  def apply(document: DocumentV1.Document): Document = Document(classificationID = ClassificationID(document.getClassificationID), immutables = Immutables(document.getImmutables), mutables = Mutables(document.getMutables))

  def apply(protoBytes: Array[Byte]): Document = Document(DocumentV1.Document.parseFrom(protoBytes))

}
