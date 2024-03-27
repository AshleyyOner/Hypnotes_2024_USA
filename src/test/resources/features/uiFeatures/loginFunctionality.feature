@UI @loginPage
Feature:As a user I should be able to login with my valid account
  Scenario:TC_001 Email address and password button should be functional
    Given user goes to the homepage
    When User clicks on the login button
    Then User verify Email address should be functional
    Then User verify password button should be functional

  Scenario: TC_002 Email and password must be entered
    Given user goes to the homepage
    When User clicks on the login button
    And User enters valid email and password
    Then When it is clicked Login button and relevant page should be displayed.


