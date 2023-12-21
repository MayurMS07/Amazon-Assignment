Feature: Amazon Registration Functionality

Scenario: Register a new user
    Given the user is on the registration page
    When the user fills in the registration form with valid information
    And submits the registration form
    Then the user should be successfully registered