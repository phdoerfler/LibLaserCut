lazy val liblasercut = (project in file("."))
  .settings(
    name := "libLaserCut",
    version := "1.9-SNAPSHOT",
    autoScalaLibrary := false,
    crossPaths := false,
    Compile / javacOptions ++= Seq("-Xlint:unchecked", "-source", "11", "-target", "11"),
    Compile / doc / javacOptions := Seq("-Xdoclint:none"),
    Test / fork := true,
    Test / parallelExecution := true,
    libraryDependencies ++= Seq(
      "com.github.purejavacomm" % "purejavacomm" % "1.0.2.RELEASE",
      "net.sf.corn" % "corn-httpclient" % "1.0.12",
      "org.usb4java" % "usb4java" % "1.3.0",
      "commons-net" % "commons-net" % "3.6",
      "rhino" % "js" % "1.7R2" jar(),

      "org.jacoco" % "org.jacoco.agent" % "0.8.5" % "test",

      "com.novocode" % "junit-interface" % "0.11" % Test
    ),
    pomExtra := {
        <developers>
            <developer>
                <name>Thomas Oster</name>
                <email>mail@thomas-oster.de</email>
                <url>https://thomas-oster.de</url>
                <id>t-oster</id>
            </developer>
        </developers>
        
        <contributors>
            <contributor>
                <name>Michael Adams</name>
            </contributor>
            <contributor>
                <name>Max Gaukler</name>
            </contributor>
            <contributor>
                <name>René Bohne</name>
            </contributor>
            <contributor>
                <name>Marcel Schwittlick</name>
            </contributor>
            <contributor>
                <name>James Churchill</name>
            </contributor>
            <contributor>
                <name>Sven Jung</name>
            </contributor>
            <contributor>
                <name>Jürgen Weigert</name>
            </contributor>
            <contributor>
                <name>Google Inc.</name>
            </contributor>
        </contributors>
    }
  )

