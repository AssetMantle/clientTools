package utilities

import java.net.URI
import java.net.http.HttpResponse.BodyHandlers
import java.net.http.{HttpClient, HttpRequest, HttpResponse}
import scala.concurrent.Future
import scala.jdk.FutureConverters._

object doGET {

  def synchronous(uri: String): String = {
    val request = HttpRequest.newBuilder(URI.create(uri)).GET.build
    val client = HttpClient.newHttpClient
    client.send(request, BodyHandlers.ofString).body
  }

  def asynchronous(uri: String): Future[HttpResponse[String]] = {
    val request = HttpRequest.newBuilder(URI.create(uri)).GET.build
    val client = HttpClient.newHttpClient
    client.sendAsync(request, BodyHandlers.ofString).asScala
  }


}
