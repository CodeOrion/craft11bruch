
name := "ReactiveBackend"

scalaVersion := "2.11.7"

val specs2Version = "3.6.4"

val compilerOptions = Seq(
  "-unchecked",
  "-deprecation"
)

val testDependencies = Seq(
  "org.specs2"               %% "specs2-core"    % specs2Version % "test"
)

libraryDependencies ++= testDependencies

scalacOptions ++= compilerOptions

fork in test := true

