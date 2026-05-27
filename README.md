# SauceDemo Purchase Workflow Automation

## Case Study
This project automates the happy path purchase workflow of the SauceDemo website using Selenium and TestNG.

## Test Environment
- OS: Windows 11
- Browser: Google Chrome
- Test URL: https://www.saucedemo.com/

## Tech Stack
- Programming Language: Java
- Test Framework: TestNG
- Design Pattern: Page Object Model (POM)
- Build Tool: Maven

## Dependencies
- Selenium WebDriver
- TestNG

## Test Steps
1) Login with valid credentials (standard_user, secret_sauce)
2) Add backpack to cart
3) Click the cart icon 
4) Check if the backpack is added to the cart
5) Click the "Checkout" button
6) Fill checkout information
7) Click the "Continue" button and complete the purchase 
8) Navigate to checkout: overview and click the "Finish" button
9) Verify successful order confirmation 
