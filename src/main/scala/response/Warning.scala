package response

import play.api.routing.JavaScriptReverseRoute

class Warning(private val response: String, private val actionController: JavaScriptReverseRoute = null) {
  val message: String = common.PREFIX + common.WARNING_PREFIX + response
}