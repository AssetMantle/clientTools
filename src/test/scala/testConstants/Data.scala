package testConstants

import schema.data.base._
import schema.types.Height
import utilities.AttoNumber

object Data {

  val listData: ListData = ListData(Seq(
    AccAddressData(testConstants.setup.balanceAccount.address),
    BooleanData(true),
    DecData(AttoNumber(0.002)),
    HeightData(Height(99)),
    IDData(testConstants.setup.nubIdentityID.toAnyID),
    NumberData(95),
    StringData("listDataString"),
    IDData(testConstants.setup.assetID.toAnyID),
    IDData(testConstants.setup.identityClassificationID.toAnyID),
    IDData(testConstants.setup.assetClassificationID.toAnyID)
  ).map(_.toAnyData))
}
