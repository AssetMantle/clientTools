name := "clientTools"

version := "1.0.0"

scalaVersion := "2.13.10"

lazy val root = (project in file("."))

resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"

resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

resolvers += "Maven Central Server" at "https://repo1.maven.org/maven2"

libraryDependencies ++= Seq(
  "org.scodec" %% "scodec-bits" % "1.1.37",
  "org.scorexfoundation" %% "scrypto" % "2.3.0",
  "org.bitcoinj" % "bitcoinj-core" % "0.16.2",
  "org.bouncycastle" % "bcpg-jdk15on" % "1.70"
)

libraryDependencies += "com.google.protobuf" % "protobuf-java" % "3.22.2"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test

libraryDependencies += "org.scalaj" % "scalaj-http_2.11" % "2.4.2"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "2.0.6",
  "org.slf4j" % "slf4j-simple" % "2.0.6"
)

libraryDependencies += "io.spray" %%  "spray-json" % "1.3.6"