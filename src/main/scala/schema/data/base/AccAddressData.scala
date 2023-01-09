package schema.data.base

import com.google.protobuf.ByteString
import data.{AccAddressDataV1, AnyDataV1}
import schema.data.Data
import schema.id.DataID
import schema.id.base.{DataID, HashID, StringID}

case class AccAddressData(value: Array[Byte]) extends Data {
  def getType: StringID = commonConstants.DataTypeID.AccAddressDataTypeID

  def getID: DataID = DataID(typeID = commonConstants.DataTypeID.AccAddressDataTypeID, hashID = this.generateHashID)

  def zeroValue: Data = AccAddressData(Array())

  def getBytes: Array[Byte] = this.value

  def generateHashID: HashID = commonUtilities.ID.generateHashID(this.getBytes)

  def toWalletString: String = commonUtilities.Crypto.convertAccountAddressBytesToBech32Address(this.value)

  def toAnyData: AnyDataV1.AnyData = AnyDataV1.AnyData.newBuilder().setAccAddressData(AccAddressDataV1.AccAddressData.newBuilder().setValue(ByteString.copyFrom(this.value)).build()).build()
}
