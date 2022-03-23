Feature: feature to sign up as an employee

  Scenario Outline: Title of your scenario outline
    Given A new tab is open
    And User is on the sign up page
    When User enters <name> and <password>
    And User clicks on login button of test project
    Then User is navigated to <status> 

    Examples: 
      | name  | password  | status  |
      | 'Roy' | '12345678'| success |
      | 'Ace' | '12345'   | Fail    |
