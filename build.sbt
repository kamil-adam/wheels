
val LombokVersion = "1.18.4"
val GuavaVersion = "27.0.1-jre"
val JUnitVersion = "4.12"
val JUnitInterfaceVersion = "0.11"
val TruthVersion = "0.42"
val VavrVersion = "0.10.0"

lazy val equals = (project in file("equals"))
  .settings(
  autoScalaLibrary := false,
  testOptions += Tests.Argument(TestFrameworks.JUnit),

  libraryDependencies ++= Seq(
    "io.vavr" % "vavr" % VavrVersion,
    "com.google.guava" % "guava" % GuavaVersion,
    "org.projectlombok" % "lombok" % LombokVersion,
    "junit" % "junit" % JUnitVersion % Test,
    "com.novocode" % "junit-interface" % JUnitInterfaceVersion % Test,
    "com.google.truth" % "truth" % TruthVersion % Test,
  )
)

lazy val monads = (project in file("monads"))
  .settings(
    autoScalaLibrary := false,
    testOptions += Tests.Argument(TestFrameworks.JUnit),

    libraryDependencies ++= Seq(
      "io.vavr" % "vavr" % VavrVersion,
      "com.google.guava" % "guava" % GuavaVersion,
      "org.projectlombok" % "lombok" % LombokVersion,
      "junit" % "junit" % JUnitVersion % Test,
      "com.novocode" % "junit-interface" % JUnitInterfaceVersion % Test,
      "com.google.truth" % "truth" % TruthVersion % Test,
    )
  )