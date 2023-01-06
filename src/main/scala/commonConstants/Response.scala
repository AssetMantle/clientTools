package commonConstants

import response.Failure

object Response {

  val NUMBER_FORMAT_EXCEPTION = new Failure("NUMBER_FORMAT_EXCEPTION")
  val KEY_GENERATION_FAILED = new Failure("KEY_GENERATION_FAILED")
  val INVALID_ACCOUNT_ADDRESS = new Failure("INVALID_ACCOUNT_ADDRESS")
  val INVALID_OPERATOR_ADDRESS = new Failure("INVALID_OPERATOR_ADDRESS")
  val INVALID_BECH32_ADDRESS = new Failure("INVALID_BECH32_ADDRESS")
  val DATE_FORMAT_ERROR = new Failure("DATE_FORMAT_ERROR")
  val INVALID_HRP_OR_BYTES = new Failure("INVALID_HRP_OR_BYTES")
  val INVALID_MNEMONICS = new Failure("INVALID_MNEMONICS")
  val INVALID_BASE64_ENCODING = new Failure("INVALID_BASE64_ENCODING")
  val SIGNING_FAILED = new Failure("SIGNING_FAILED")
  val INVALID_DATA_TYPE = new Failure("INVALID_DATA_TYPE")

  val UNSORTABLE_ATTONUMBER =new Failure("UNSORTABLE_ATTONUMBER")

}
