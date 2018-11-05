addSbtPlugin("com.github.gseitz"     % "sbt-release"       % "1.0.10")
addSbtPlugin("com.lightbend.paradox" % "sbt-paradox-theme" % "0.4.3")
addSbtPlugin("com.dwijnand"          % "sbt-dynver"        % "3.1.0")
addSbtPlugin("org.foundweekends"     % "sbt-bintray"       % "0.5.2")

resolvers += Resolver.url("2m-sbt-plugin-releases", url("https://dl.bintray.com/2m/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)
