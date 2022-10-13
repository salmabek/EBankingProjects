
Feature: Login page feature
  Scenario: Login with correct credentials
    Given user is on login page
    When user enters username and password
    And user clicks on Login button
    Then user gets the title of the page
