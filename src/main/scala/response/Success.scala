package response

class Success(private val response: String) {
  val message: String = common.PREFIX + common.SUCCESS_PREFIX + response
}