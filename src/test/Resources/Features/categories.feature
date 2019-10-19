Feature: categories

  @test
  Scenario Outline: user should able to go navigate to categories list
    Given user is on homepage
    When user click on "<category>"link
    Then  user should able to navigate to "<related_page>"
    Examples:
      | category | related_page |
      |Computers|  https://demo.nopcommerce.com/computers|
      |Electronics| https://demo.nopcommerce.com/electronics|
      |Apparel| https://demo.nopcommerce.com/apparel|
      |Digital Download|https://demo.nopcommerce.com/digital-downloads|
      |Books|https://demo.nopcommerce.com/books|
    |Jewelry|https://demo.nopcommerce.com/jewelry|
    |Gift Cards|https://demo.nopcommerce.com/gift-cards|

