name := "play-java-dagger-dependency-injection"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaCore,
  "com.squareup.dagger" % "dagger" % "1.2.2",
  "com.squareup.dagger" % "dagger-compiler" % "1.2.2",
  "junit" % "junit" % "4.12" % "test"
)

lazy val root = (project in file(".")).enablePlugins(PlayJava)
