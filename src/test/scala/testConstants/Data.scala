package testConstants

import schema.data.base._
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
    IDData(testConstants.setup.assetID),
    IDData(testConstants.setup.identityClassificationID),
    IDData(testConstants.setup.assetClassificationID)
  ))
}
