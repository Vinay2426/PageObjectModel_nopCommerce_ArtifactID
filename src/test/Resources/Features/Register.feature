@all
Feature: register account
  @register
  Scenario: user should able to register successfully
    Given user is on register page
    When user fill all the mandatory fields and click on continue
    Then user should able to register successfully