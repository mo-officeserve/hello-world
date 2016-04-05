organization  := "scala-test"

name := "hello-world"

version       := "0.1"

scalaVersion  := "2.11.7"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  Seq(
    "org.scalatest"       %  "scalatest_2.11" % "2.2.4" % "test"
  )
}