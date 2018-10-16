import sbt._

object Version {
  val foundation = "6.4.3"
  val prettify   = "4-Mar-2013-1"
  val sbtParadox = "0.4.2"
}

object Library {
  val foundation = "org.webjars"           % "foundation"  % Version.foundation
  val prettify   = "org.webjars"           % "prettify"    % Version.prettify
  val sbtParadox = "com.lightbend.paradox" % "sbt-paradox" % Version.sbtParadox
}
