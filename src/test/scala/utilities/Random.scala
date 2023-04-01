package utilities

import scala.util.{Random => scalaRandom}

object Random {

  def getRandomLong: Long = {
    val rand = new scalaRandom()
    rand.nextLong(1000000)
  }

  def getRandomAbsLong: Long = {
    val rand = new scalaRandom()
    rand.nextLong(1000000).abs
  }

  def getRandomString: String = {
    val alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val rand = new scalaRandom()
    (1 to 10).map(_ => alpha(rand.nextInt(alpha.length))).mkString
  }

  def getRandomDouble: Double = {
    val rand = new scalaRandom()
    rand.nextDouble()
  }

}
