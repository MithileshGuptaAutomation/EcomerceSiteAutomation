# 🧪 E-commerce Automation Testing Project

## 📌 Project Overview
This project is a Selenium-based automation framework built to test core user flows of an e-commerce application using **Java, Selenium WebDriver, TestNG, and Maven**.
The automation covers key functionalities such as login, adding products to cart, and validating cart behavior.
---
## 🚀 Tech Stack
* Java
* Selenium WebDriver
* TestNG
* Maven
* Eclipse IDE
---
## 🌐 Application Under Test
* SauceDemo
---
## 📂 Project Structure
EcommerceAutomation/
│
├── src/main/java
│   ├── ecomerceBasePackage
│   │   └── BaseTest.java
│   │
│   ├── ecommercePagesPackage
│   │   ├── LoginPage.java
│   │   ├── ProductPage.java
│   │   └── CartPage.java
│
├── src/test/java
│   └── ecomerceTestsPackage
│       ├── LoginTest.java
│       └── AddToCartTest.java
│
├── pom.xml
└── .gitignore
...
---

## 🧪 Test Scenarios Covered

### ✅ 1. Login Test

* Valid login with correct credentials
* Validation using URL assertion

### ✅ 2. Add to Cart Test

* Add product to cart
* Navigate to cart
* Validate product name
---
## 🧠 Framework Design
This project follows **Page Object Model (POM)** design pattern:
* **BaseTest** → Browser setup & teardown
* **Pages** → UI interactions (locators + methods)
* **Tests** → Test scenarios using TestNG
---
## ▶️ How to Run the Project
### Prerequisites:

* Java installed
* Maven installed
* Chrome browser
### Run using Maven:
```bash
mvn test
## 📊 Test Execution
TestNG is used for execution and reporting.

## ⚠️ Notes
* `test-output/` and `target/` folders are excluded using `.gitignore`
* These folders are auto-generated during execution
---
## 📌 Future Improvements
* Add Checkout flow automation
* Implement Explicit Waits
* Add Data-Driven Testing
* Integrate Reporting tools (Extent Reports)

## 👨‍💻 Author
**Mithilesh Gupta**

## 📎 Submission Details

* Manual Test Cases: Attached separately (Excel/Google Sheet)
* Bug Report: Attached separately
* Proof of Work: Screenshots / Recording shared via email

## ⭐ Conclusion
This project demonstrates a basic automation framework for e-commerce testing with scalable design using Selenium and TestNG.
