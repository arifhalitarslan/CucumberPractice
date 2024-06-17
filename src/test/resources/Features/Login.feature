
Feature: Login test


  Scenario: Positive login test
    Given User goes the login page
    When user enters the inputs
    Then user should be in "Secure Area"


    Scenario: Negative Login test
      Given User goes the login page
      When user enters the fault inputs
      Then user should be at "Login Page"