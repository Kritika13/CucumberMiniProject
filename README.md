# Selenium-Cucumber TestNG BDD UI Automation Project

## Overview

This project demonstrates UI automation testing using Selenium, Cucumber, and TestNG. 
It follows a Behavior-Driven Development (BDD) approach for writing test scenarios.

### Tools and Technology
```
Cucumber - Java Lib / Selenium 4.x
JDK 1.8
Maven
Cucumber-TestNG
Cucumber, Gherkin BDD Plugins in Eclipse
Eclipse - IDE
Gherkin
Feature Files
```

### Prerequisites

Before running the tests, ensure you have the following installed:

- Java (JDK 8 or higher)
- Maven
- WebDriver (e.g., ChromeDriver)

### Project Structure

The project is organized as follows:

```
MySeleniumProject
|-- src
|   |-- main
|   |   |-- java
|   |   |   |-- com.pages
|   |   |       |-- LoginPage.java
|   |-- test
|       |-- java
|       |   |-- com.runner
|       |       |-- TestRunner.java
|       |   |-- com.stepDefinitons
|       |       |-- LoginPageSteps.java
|       |-- resources
|       |   |-- features
|       |       |-- loginpage.feature
|-- target (reports)
|-- pom.xml
```

## Execution Steps

### 1. Clone the Repository:
```
git clone (https://github.com/Kritika13/CucumberMiniProject.git)
cd CucumberMiniProject
```
### 2.Configure WebDriver:

Download the appropriate WebDriver executable (e.g., ChromeDriver) and update the 
`webdriver.path in src/main/resources/config/config.properties`

### 3.Run the Tests:
`mvn clean test`
The tests will execute in parallel, and you can view the test results in the target/cucumber-reports directory.

