# Repo-to-Selenium-Testcases

Type of Framework: Data driven framework by using page object model design pattern with Page Factory

POM: As per the Page Object Model, There is a class for every web page. Each web page has a separate class and that class holds the functionality and members of that web page. Separate classes for every individual test.

Packages:  separate packages for Pages and Tests. All the web page related classes come under the Pages package and all the tests related classes come under Tests package.

Test Base Class: Test Base class (TestBase.java) deals with all the common functions used by all the pages. This class is responsible for loading the configurations from properties files, Initializing the WebDriver, Implicit Waits,Delete Cookies, maximize screen.

Utility Class: Utility class (TestUtil.java) stores and handles the functions (The code which is repetitive in nature such as waits, actions, capturing screenshots, accessing excels, sending email, etc.,) which can be commonly used across the entire framework. The reason behind creating a utility class is to achieve reusability. This class extends the TestBase class to inherit the properties of TestBase in TestUtil.

Properties file: This file (config.properties) stores the information that remains static throughout the framework such as browser-specific information, application URL, screenshots path, etc.

Test Data: All the historical test data will be kept in an excel sheet .I use Apache POI to handle excel sheets.

Maven: Using Maven for build, execution, and dependency purpose. Integrating the TestNG dependency in the POM.xml file and running this POM.xml file using Jenkins
***********************
for executing this.
#Run Testng.xml file.
