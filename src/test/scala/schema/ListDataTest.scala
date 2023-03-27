package schema.TestData

import utilities.ID.getClassificationID
import org.scalatest.funsuite.AnyFunSuite
import schema.data.Data
import schema.data.base.{IDData, ListData, StringData}
import schema.id.base.{ClassificationID, PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.MetaProperty
import schema.qualified.{Immutables, Mutables}

class ListDataTest extends AnyFunSuite {

  val AuthenticationProperty: MetaProperty = MetaProperty(id = PropertyID(keyID = StringID("authentication"), typeID = ListData(Seq()).getType), data = ListData(Seq()).toAnyData)
  val NubPropertyID: MetaProperty = MetaProperty(id = PropertyID(keyID = StringID("nubID"), typeID = IDData(StringID("").toAnyID).getType), data = IDData(StringID("").toAnyID).toAnyData)
  val immutables = Immutables(PropertyList(Seq(NubPropertyID)))
  println(immutables.generateHashID.getBytes.length)
  println(immutables.generateHashID.getBytes.mkString("Array(", ", ", ")"))
  val NubClassificationID: ClassificationID = getClassificationID(Immutables(PropertyList(Seq(NubPropertyID))), Mutables(PropertyList(Seq(AuthenticationProperty))))
  println(NubClassificationID.asString)
}
