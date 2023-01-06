package TestCommonAbstract.base

import commonAbstract.base.StringData
import org.scalatest.funsuite.AnyFunSuite

class StringDataTest extends AnyFunSuite {
  val testData: StringData = StringData("as")
//  test("StringData") {
//    assert()
//  }

  println(testData.asString)
  println(testData.asString.length)
  print(testData.getBytes.mkString(", "))
  print(testData.getBytes.length)

}