package testConstants

import schema.data.base._
import schema.id.base.{AssetID, ClassificationID, HashID}
import schema.types.Height

object Data {

  val listData: ListData = ListData(Seq(
    AccAddressData(testConstants.setup.balanceAccount.address),
    BooleanData(true),
    DecData(0.002),
    HeightData(Height(99)),
    IDData(testConstants.setup.nubIdentityID),
    NumberData(95),
    StringData("listDataString"),
    IDData(AssetID(HashID(utilities.Secrets.base64URLDecode("oTn0Pr8s890NR_orVP9__pdS0Nlsg_C7OA1FscRsKMw=")))),
    IDData(ClassificationID(HashID(utilities.Secrets.base64URLDecode("GnhwGkCKgvMft2Zk3a82J7UEe_qi9CrTfsmT589TCpA=")))),
    IDData(ClassificationID(HashID(utilities.Secrets.base64URLDecode("jbjL_4o9eLgMuw0nrFebUs_ClhitVxdFytC_TkPBuYA=")))),
  ))
}
