addSbtPlugin("com.thesamet" % "sbt-protoc" % scalapb.Version.sbtPluginVersion)

libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % scalapb.Version.scalapbVersion

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.0")
