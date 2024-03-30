pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Learn Together"
include(":learntogether")
include(":taskmanager")
include(":composequadrant")
include(":businesscard")
include(":diceroller")
include(":lemonade")
