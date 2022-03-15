#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: feature to sign up as an employee

  Scenario Outline: Title of your scenario outline
    Given A new tab is open
    And User is on the login page
    When User enters <name> and <password>
    And User clicks on login button of test project
    Then User is navigated to <status> 

    Examples: 
      | name  | password  | status  |
      | 'Roy' | '12345678'| success |
      | 'Ace' | '12345'   | Fail    |
