@all
Feature: user should able to buy product

  @registeredCustomer
  Scenario: user should able to buy product after Registration
    Given user is on register page
    When user fill all the mandatory fields and click on continue xyz
    And go to homepage
    And user select product and buy
    Then verify user placed successful order

  @guestCustomer
  Scenario: Guest user should able to buy product without registering
    Given user is on homepage
    When guest user select product and buy
    Then verify user placed successful order
