#Parabank Assignment

# BDD: Java Maven Cucumber Selenium Setup

Java + Junit + Cucumber + Selenium testing cases

This repo contains the Maven setup for Cucumber / Selenium, with parabank registration, login and going homepage, which can be run on local.

This repo can be run on local Windows / Mac / Linux Platform, as long as you have Java/Maven setup correctly.

## Setup
Installed intellij Idea ,
set up dependencies from maven reposistory and cucumber java plugin.

### Install on Local Machine

Install Java & Maven on your local machine

= To Run (Maven command line) =

Local machine with browser name (ie / chrome / firefox / safari)

- Test with Google Chrome (Mac / Windows for machineType):
```
> mvn test -DsiteUrl=http://www.google.com -DbrowserName="googlechrome" -DmachineType="mac"
```

- Test with Firefox (Mac / Windows for machineType):
```
> mvn test -DsiteUrl=http://www.google.com -DbrowserName="firefox" -DmachineType="mac"
```

- Test with IE (Windows Only):
```
> mvn test -DsiteUrl=http://www.google.com -DbrowserName="ie"
```

- Test with Safari (After install Safari extension, see /drivers/README.md):
```
> mvn test -DsiteUrl=http://www.google.com -DbrowserName="safari"
```

# WebDriver Update
See README inside /drivers folder
drivers - https://www.selenium.dev/downloads/
Drivers are in paraBankAssignment/drivers where you can find (chrome,geckodriver,IE)

# Before we start

## Feature file: Gherkin Syntax
Gherkin is the language that Cucumber understands. You can find more Gherin Syntax here:
https://github.com/cucumber/cucumber/wiki/Gherkin

## Selenium Syntax
Selenium is an automated web browser testing. You can find some commonly used Selenium commands here:
http://www.seleniumhq.org/docs/02_selenium_ide.jsp#commonly-used-selenium-commands

# Configure your project siteUrl
You can update the siteUrl in the pom.xml property (default is http://www.google.com for my example) for your application need, also you can pass in from command line

# Your first BDD Test Case
All explaination of sturcture of cucumber 
https://cucumber.io/docs/gherkin/step-organization/

## resources - feature file
Create a feature file under src\test\resources\ (You can group your feature in same directory, i.e. homepage / contact / products etc)

1. Copy your story / feature description (ideally same as from Jira description, As a site user, I want to ...., So that ...)
2. Under `Scenario Outline:` will contain all the Given / When / Then Gherkin
You can specify "<keyword>" as parameter from Data Table.
3. Fill in the Data Table for parameters listed in your step 2

The Data Table (even only 1 row) can help you to change the data input in the future and easier to understand the feature testing data. I reserved the use of the PageType / ScreenSize defined in CommonStepDef, so we can have responsive testing ready.

4. Then run the mvn test, it will throw the exception of missing implementation, and it will print out the Java Selenium function you need to implement (for next step)

# step definitions
5. Create a java file under src\test\java\stepDefinitions (same, you can group as folder as the structure of feature folder)
here specified the steps in class for the feature file

# pageObject
object reposistory for storing web elements src/java/pageobjects, considers each web page of and application

#Runner file
To run the features and step definitions ,acts as interlink between feature files and step defintion classes

Copy printed function signatures from last step, and implement the selenium action you want to achieve.

#Pom.xml
all dependicies are from Maven reposistory- https://mvnrepository.com/

#Reporting
extent report 
plugin installet cucumber-extentreport  and extentsreport and then config file created in target.
for running add plugin in testrunner file.


