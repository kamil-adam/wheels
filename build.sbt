libraryDependencies += "org.projectlombok" % "lombok" % "1.18.4"


lazy val equals = (project in file("equals")).settings(
  compileOrder := CompileOrder.JavaThenScala,

  libraryDependencies += "com.google.guava" % "guava" % "27.0.1-jre",
  //  libraryDependencies += "org.projectlombok" % "lombok" % "1.18.4" % "provided",
    libraryDependencies += "org.projectlombok" % "lombok" % "1.18.4",
  libraryDependencies += "org.junit.jupiter" % "junit-jupiter-api" % "5.3.2" % Test,
  libraryDependencies += "com.google.truth" % "truth" % "0.42" % Test,


    libraryDependencies += "io.vavr" % "vavr" % "0.10.0"

)
