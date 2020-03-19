This example demonstrates how to analyze a simple project built with gradle.

Prerequisites
=============
* [SonarQube](http://www.sonarqube.org/downloads/) 5.6+
* A gradle wrapper is included that bundles gradle. All other required plugins will be pulled by gradle as needed.
* JDK8 and JDK11 both available for your command line

Usage
=====
Run the following command (updating the sonar.host.url property as appropriate):
* On Unix-like systems:
  `./gradlew -Dsonar.host.url=http://myhost:9000 sonarqube`
* On Windows:
  `.\gradle.bat -Dsonar.host.url=http://myhost:9000 sonarqube`

Coverage
=====
To get the project [test coverage](https://community.sonarsource.com/t/coverage-test-data-importing-jacoco-coverage-report-in-xml-format) computed, add gradle task `jacocoTestReport` to your command line.

Java8 builds
=====
This flavour of the tutorial is built on purpose with dependencies on JDK 8 Corba libraries (removed from JDK11). It includes code generated with jidl tool, which was not meant to be analyzed.
This code wasn't meant to be run, do not use it, or any binary built from it, in any of your application.

The analysis of this project on JDK11 requires two steps
* on jdk8
  * Run build and unit tests with `gradle build`
* on jdk11
  * Run only jacoco reporting and sonarqube tasks with:
  * `gradle  -x compileJava -x compileTestJava -x processResource -x test jacocoTestReport sonarqube`





