Examples of how to run tests on Testable. 
This includes via main class, JUnit, and TestNG and built via either Maven or Gradle.

Examples:

* `MainSampleTest`: Main class that requests a sample stock quote.
* `JUnitSampleTest`: JUnit test that requests a sample stock quote
* `TestNGSampleTest`: TestNG test that requests a sample stock quote.

There a variety of ways to run this on Testable:

* Upload a jar and specify the main class or test classes
* Upload an executable jar that runs your main class
* Upload this project in a zip file. Choose Gradle or Maven as the build tool and specify the right goals:
  * `Gradle`: `build test` (for JUnit/TestNG) or `build run` (for main class)
  * `Maven`: `test` (for JUnit/TestNG) or `compile exec:exec` (for main class)
