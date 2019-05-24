scalaVersion := "2.12.7"
parallelExecution in Test := false

val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"

lazy val homework = (project in file("."))
  .settings(
    name := "Homework",
    libraryDependencies += scalaTest % Test,
  )