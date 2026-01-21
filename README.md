SincX UI Automation Project

The **SincX UI Automation Project** contains end-to-end automated test scripts designed to validate the UI of the SincX Learning App. Built using a hybrid automation framework, it leverages the power of TestNG, Selenium WebDriver, and Maven for scalable, maintainable, and reliable test execution.

## 🚀 Project Overview

- ✅ **Automation Type**: UI Testing
- 🔧 **Framework**: Hybrid (BDD + Data Driven + Modular)
- 🧪 **Testing Framework**: TestNG
- 📄 **Build Tool**: Maven (`pom.xml`)
- 📊 **Reports**: TestNG HTML reports via `testng.xml`
- 🧰 **Toolset**: Selenium WebDriver, Java, Maven, TestNG

Prerequisites
Make sure you have the following installed:
1. Java (JDK 11 or higher)
2. Maven
3. IDE: Eclipse
4. ChromeDriver or relevant browser driver in the system path

 How to Run the Tests

 Run Using Maven
bash 
"mvn clean test"


 Run Specific Suite with TestNG
bash
mvn test -DsuiteXmlFile=testng.xml


 Test Reports

After test execution, a default **TestNG HTML report** will be generated.  
You can find it under:

<project-root>/test-output/index.html

# 💡 Features of the Framework

1. Modular test structure for easy scalability
2. Uses `testng.xml` for flexible suite/test configurations
3. Parameterized tests for better data coverage
4. Supports cross-browser testing (if configured)
5. Easily maintainable `pom.xml` with dependencies

Benefits of the BDD + Data-Driven Hybrid Automation Framework

1. Readable, Business-Friendly Test Scenarios (BDD)
Uses natural language (e.g., Gherkin syntax) to describe test cases (Given-When-Then)

Bridges the gap between developers, testers, and non-technical stakeholders

Makes test cases self-explanatory and easier to review

2. High Test Coverage with Minimal Effort (Data-Driven)
Enables running the same test scenario with multiple sets of input data

Increases test coverage without duplicating test logic

Data can be sourced from Excel, CSV, JSON, or databases

3. Separation of Test Logic and Test Data
Keeps test scenarios clean and focused

Makes it easy to update inputs without modifying the test scripts

4. Reusable Step Definitions
Step definitions written for one scenario can be reused in others

Encourages modular, DRY (Don’t Repeat Yourself) code structure

5. Scalability and Maintainability
Easy to add new scenarios and datasets as the application grows

Organized test design leads to easier maintenance and debugging

6. Enhanced Collaboration
BDD format (e.g., *.feature files) promotes collaboration between QA, dev, and business teams

Improves understanding of requirements and test coverage

7. Support for Parallel Execution
Combine POM and BDD execution with TestNG or Cucumber runners for faster test cycles
Supports parallel threads for running the same test with different data

8. Powerful Reporting
Integrated with TestNG HTML reports

Includes test step status, logs, and captured screenshots for failures

9. CI/CD Ready
Integrates easily with Jenkins, GitHub Actions, or Azure DevOps

Supports automated test execution in build pipelines with data-driven and BDD support

