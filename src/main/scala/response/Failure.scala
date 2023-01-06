package response

import exceptions.BaseException
import org.slf4j.Logger

import scala.concurrent.{ExecutionContext, Future}

class Failure(private val response: String) {
  val message: String = common.PREFIX + common.FAILURE_PREFIX + response
  val logMessage: String = common.LOG_PREFIX + response

  def throwBaseException(exception: Exception = null)(implicit module: String, logger: Logger) = throw new BaseException(this, exception)

  def throwFutureBaseException(exception: Exception = null)(implicit module: String, logger: Logger, executionContext: ExecutionContext) = Future(throw new BaseException(this, exception))
}
