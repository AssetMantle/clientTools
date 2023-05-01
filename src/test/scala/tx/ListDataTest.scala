package tx

import org.scalatest.funsuite.AnyFunSuite
import schema.data.base.{IDData, ListData}
import schema.id.base.{ClassificationID, PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.MetaProperty
import schema.qualified.{Immutables, Mutables}
import schema.utilities.ID.getClassificationID

class ListDataTest extends AnyFunSuite {

  val AuthenticationProperty: MetaProperty = MetaProperty(id = PropertyID(keyID = StringID("authentication"), typeID = ListData(Seq()).getType), data = ListData(Seq()))
  val NubPropertyID: MetaProperty = MetaProperty(id = PropertyID(keyID = StringID("nubID"), typeID = IDData(StringID("")).getType), data = IDData(StringID("")))
  val immutables = Immutables(PropertyList(Seq(NubPropertyID)))
  println(immutables.generateHashID.getBytes.length)
  println(immutables.generateHashID.getBytes.mkString("Array(", ", ", ")"))
  val NubClassificationID: ClassificationID = getClassificationID(Immutables(PropertyList(Seq(NubPropertyID))), Mutables(PropertyList(Seq(AuthenticationProperty))))
  println(NubClassificationID.asString)
}
