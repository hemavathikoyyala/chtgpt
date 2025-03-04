Feature: Flipkart Login

  Scenario: Successful login with valid credentials
    Given User navigates to Flipkart homepage
    When User enters valid username and password
    Then User should be logged in successfully

