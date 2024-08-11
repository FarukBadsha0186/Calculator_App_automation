# Automated Test for Calculator Series with APPIUM

##This Project Involves:
- Writing automated test cases for a Calculator app using Appium in Java.
- Generating test allure reports using TestNG.
- Performing basic arithmetic operations (addition, subtraction, multiplication, division)..
- Generating test reports.



## Prerequisites:
- Java Development Kit (JDK): Ensure that JDK is installed and set up in your system environment.
- Android Studio: Installed and configured, including the Android SDK and AVD (Android Virtual Device) Manager.
- Appium: Installed on pc, either via Node.js (npm install -g appium) or by downloading the Appium Desktop application.
- gradle: For managing project dependencies Selenium  and TestNG.
- Appium Java Client: Include in gradle dependencies.
- IDE: IntelliJ IDE with gradle support

## How to run?
### Execute the following commands:
#How to Run?
- Clone the Project
  ``` git clone <repo_url> ```
- Navigate to the Project Directory
 ``` cd <project-directory> ```
- Install  gradle Dependencies
- Start Appium Server in cmd 
 ``` appium in  ```
- Run the Test Runner Using TestNG
- In the terminal, This will run the TestNG test suite specified in the suite.xml file located in the project resources file directory.
 ``` gradle clean test  ```
- Generate Test Report 
 ``` target/surefire-reports/testng-results.xml ```
- View the HTML report
 ``` open target/site/surefire-report.html```


## Output
![image](https://github.com/user-attachments/assets/008b28ff-e022-4a09-a69b-1ef70c573f9d)
## Output Video
https://github.com/user-attachments/assets/459a0a6a-8539-4f45-9f3c-3bd2f3088b37









