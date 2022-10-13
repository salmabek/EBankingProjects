
Feature: Login page feature

  Scenario Accept All Cookies
    Given user is on login page
    When User clicks on accepts all cookies
    Then Login page shows up

  Scenario: Login with correct credentials
    Given user is on login page
    When user enters username and password
    And user clicks on Login button
    Then user gets the title of the page
