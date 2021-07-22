import sbt._
import sbt.Keys._
import sbt.plugins.JvmPlugin
import xerial.sbt.Sonatype.autoImport.sonatypeProfileName

object Publish extends AutoPlugin {

  override def trigger = allRequirements

  override def buildSettings = Seq(
    sonatypeProfileName := "com.lightbend",
  )

  override def projectSettings = Seq(
    licenses += "Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0.html"),
  )

}
