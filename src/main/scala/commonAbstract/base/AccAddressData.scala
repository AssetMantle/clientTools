package commonAbstract.base

import com.google.protobuf.ByteString
import commonUtilities.AttoNumber
import data.{AccAddressDataV1, AnyDataV1}
import ids.{HashIDV1, StringIDV1}

case class AccAddressData(value: Array[Byte]) extends commonAbstract.Data {
  def getType: StringIDV1.StringID = commonConstants.DataTypeID.AccAddressDataTypeID

  def getID: commonAbstract.DataID = DataID(typeID = commonConstants.DataTypeID.AccAddressDataTypeID, hashID = this.generateHashID)

  def zeroValue: commonAbstract.Data = AccAddressData(Array())

  def getBytes: Array[Byte] = this.value

  def generateHashID: HashIDV1.HashID = commonUtilities.ID.generateHashID(this.getBytes)

  override def toString: String = commonUtilities.Crypto.convertAccountAddressBytesToBech32Address(this.value)

  def toAnyData: AnyDataV1.AnyData = AnyDataV1.AnyData.newBuilder().setAccAddressData(AccAddressDataV1.AccAddressData.newBuilder().setValue(ByteString.copyFrom(this.value)).build()).build()
}
