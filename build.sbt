name := "clientTools"

version := "1.0.0"

scalaVersion := "2.13.10"

lazy val root = (project in file("."))

resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"

resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

resolvers += "Maven Central Server" at "https://repo1.maven.org/maven2"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-slick" % "5.1.0",
  "com.typesafe.play" %% "play-slick-evolutions" % "5.1.0",
  "org.postgresql" % "postgresql" % "42.5.1"
)

libraryDependencies ++= Seq(
  "org.scodec" %% "scodec-bits" % "1.1.34",
  "org.scorexfoundation" %% "scrypto" % "2.2.1",
  "org.bitcoinj" % "bitcoinj-core" % "0.16.2",
  "org.bouncycastle" % "bcpg-jdk15on" % "1.70"
)

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk-s3" % "1.12.376",
  "com.amazonaws" % "aws-java-sdk" % "1.12.376"
)

libraryDependencies += "com.google.protobuf" % "protobuf-java" % "3.21.12"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % Test