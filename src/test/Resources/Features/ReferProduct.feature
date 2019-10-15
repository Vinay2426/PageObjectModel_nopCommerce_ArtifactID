@all
Feature: user should able to refer product

  @referProduct
  Scenario: user should able to refer product to friend after registering account
    Given user is on register page
    When user fill all the mandatory fields and click on continue abcd
    And select product and refer it to a friend
    Then user should get successful message of referring product

  @referProductWithoutRegistration
  Scenario: User should not able to refer product without registration
    Given user is on homepage
    When select product and refer it to a friend
    Then verify user should not able to refer product to friend
