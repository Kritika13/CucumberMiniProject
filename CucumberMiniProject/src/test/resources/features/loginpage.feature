Feature: Login functionality for SauceDemo ecommerce website
  
  As a user of the saucedemo website
  I want to be able to login with my account 
  So that I can manage my account related featuresnd manage my orders

  Background: 
    Given I am on the sauceDemo login page

  Scenario: Successfully login with valid credentials
    Given I have entered a valid username and password
    When I click on the login button
    Then I should be logged in successfully

  #scenario outline is for parametrization
  Scenario Outline: Unsuccessful login with invalid or empty credentials
    Given I have entered invalid "<username>" and "<password>"
    When I click on the login button
    Then I should see an error message indicating "<error_message>"

    Examples: 
      | username          | password        | error_message                                                             |
      | invalid@gamil.com | invalidPassword | Epic sadface: Username and password do not match any user in this service |
      | inval@emall.com   | alidPassrd      | Epic sadface: Username and password do not match any user in this service |
 # Scenario: Navigating to forgotten password page
  #  When I click on the "Forgotten Password" link
   # Then I should be redirected to the password reset page
