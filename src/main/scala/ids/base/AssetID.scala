package ids.base

import ids.AnyIDV1.AnyID
import ids.{AssetIDV1, ID}

case class AssetID(hashID: HashID) extends ID {

  def getBytes: Array[Byte] = this.hashID.getBytes

  def asString: String = commonUtilities.Secrets.base64URLEncoder(this.getBytes)

  def asProtoAssetID: AssetIDV1.AssetID = AssetIDV1.AssetID.newBuilder().setHashID(this.hashID.asProtoHashID).build()

  def toAnyID: AnyID = AnyID.newBuilder().setAssetID(this.asProtoAssetID).build()

  def getProtoBytes: Array[Byte] = this.asProtoAssetID.toByteArray

}

object AssetID {
  def apply(anyID: AssetIDV1.AssetID): AssetID = AssetID(HashID(anyID.getHashID))
}
