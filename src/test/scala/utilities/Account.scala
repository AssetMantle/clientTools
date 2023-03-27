package utilities

object Account {

  case class BaseAccount(address: String, account_number: String, sequence: String)


  def getSequenceAndAccountNumber(address: String): (Int, Int) = {
    val response = doGET.synchronous(testConstants.setup.chainRPC + "/cosmos/auth/v1beta1/accounts/" + address)
    //    response.toJson
    (0, 0)
  }
}
