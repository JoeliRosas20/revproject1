
Feature: feature to sign up as an employee

  Scenario Outline: Title of your scenario outline
    Given A new tab is open
    And User is on the login page
    When User enters <name> and <password>
    And User clicks on login button of test project
    Then User is navigated to the page 

    Examples: 
      | name     | password  |
      | 'Ronald' | '12345678'|
      | 'Clay'   | '12345678'|
