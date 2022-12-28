package exceptions

import play.api.Logger

class BaseException(val failure: response.Failure, val exception: Exception = null)(implicit module: String, logger: Logger) extends Exception {
  logger.error(failure.logMessage, exception)
}
