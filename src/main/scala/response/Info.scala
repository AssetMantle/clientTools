package response

class Info(private val response: String) {
  val message: String = common.PREFIX + common.INFO_PREFIX + response
}