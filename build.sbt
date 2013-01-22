resolvers <+= sbtResolver

organization := "org.corespring"

name := "cmd-example"

version := "0.1"

scalaVersion := "2.9.2"

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)


libraryDependencies ++= Seq(
  "org.clapper" %% "grizzled-scala" % "1.0.13"
  )

resolvers ++= Seq(
  "Sbt plugins" at "http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/",
  "Sonatype OSS" at "http://oss.sonatype.org/content/repositories/releases/",
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
  "mvn repo" at "http://repo1.maven.org/maven2/",
  "repo.novus rels" at "http://repo.novus.com/releases/",
  "repo.novus snaps" at "http://repo.novus.com/snapshots/"
)
