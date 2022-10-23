name := "udemy-akka-http"

version := "0.1"

scalaVersion := "2.13.9"

val akkaVersion      = "2.7.0"
val akkaHttpVersion  = "10.4.0"
val scalaTestVersion = "3.2.14"

libraryDependencies ++= Seq(
  // akka streams
  "com.typesafe.akka" %% "akka-stream"          % akkaVersion,
  // akka http
  "com.typesafe.akka" %% "akka-http"            % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
)
