# AECProject

## Overview
AECProject is an automated testing framework designed for testing e-commerce websites, specifically Flipkart and Amazon, using Selenium WebDriver. This project provides a structured approach to writing and executing automated tests.

## Project Structure
```
AECProject
├── src
│   └── main
│       └── java
│           └── com
│               └── aecproject
│                   ├── AECProject.java
│                   └── tests
│                       └── SampleTest.java
├── pom.xml
└── README.md
```

## Prerequisites
- Java Development Kit (JDK) 8 or higher
- Apache Maven
- An IDE (e.g., IntelliJ IDEA, Eclipse, or any text editor)

## Setup Instructions
1. **Clone the Repository**
   ```bash
   git clone <repository-url>
   cd AECProject
   ```

2. **Install Dependencies**
   Run the following command to install the necessary dependencies:
   ```bash
   mvn install
   ```

3. **Configure WebDriver**
   Ensure that the appropriate WebDriver (e.g., ChromeDriver, GeckoDriver) is installed and available in your system's PATH.

## Usage
- To run the automated tests, execute the following command:
  ```bash
  mvn test
  ```

- You can add additional test cases in the `SampleTest.java` file located in the `src/main/java/com/aecproject/tests` directory.

## Contributing
Contributions are welcome! Please feel free to submit a pull request or open an issue for any enhancements or bug fixes.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.