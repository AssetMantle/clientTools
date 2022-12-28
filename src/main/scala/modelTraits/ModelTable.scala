package modelTraits

trait ModelTable[PK] {

  def id : slick.lifted.Rep[PK]
}
