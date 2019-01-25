
//val LombokVersion = "1.18.4"
val LombokVersion = "1.16.16"

libraryDependencies += "org.projectlombok" % "lombok" % LombokVersion


lazy val equals = (project in file("equals")).settings(
  autoScalaLibrary := false,

  libraryDependencies += "com.google.guava" % "guava" % "27.0.1-jre",
  //  libraryDependencies += "org.projectlombok" % "lombok" % LombokVersion % "provided",
  libraryDependencies += "org.projectlombok" % "lombok" % LombokVersion,
//  libraryDependencies += "org.junit.jupiter" % "junit-jupiter-engine" % "5.3.2" % Test,
//  libraryDependencies += "org.junit.jupiter" % "junit-jupiter-api" % "5.3.2" % Test,
  libraryDependencies += "junit" % "junit" % "4.12" % Test,
  libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test,
    libraryDependencies += "com.google.truth" % "truth" % "0.42" % Test,


  libraryDependencies += "io.vavr" % "vavr" % "0.10.0",
//  excludeDependencies += "junit" % "junit",
  testOptions += Tests.Argument(TestFrameworks.JUnit
    //tests to run, Only individual test case names are matched
    //, --tests=<REGEXPS>
  )
)
//  .disablePlugins(JupiterPlugin)
