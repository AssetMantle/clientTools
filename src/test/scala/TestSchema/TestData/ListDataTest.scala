package TestSchema.TestData

import org.scalatest.funsuite.AnyFunSuite
import schema.data.Data
import schema.data.base.{ListData, StringData}
import schema.list.AnyDataList

class ListDataTest extends AnyFunSuite {
  var x = ListData(AnyDataList(Seq(StringData("mukund").toAnyData, StringData("prabhav").toAnyData)))
  var stringx = x.toString
  var valX = Data.apply(x.toAnyData)
  var lol = valX
}
