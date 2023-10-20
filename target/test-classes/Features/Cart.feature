Feature: Cart
  Scenario: Successful to go to checkout page
    Given I open browser
    And Open website saucedemo
    And Located on saucedemo website
    And I input valid username
    And I input valid password
    And I go to homepage
    When I click add to cart button
    And I click cart button
    And I click checkout button
    Then I go to checkout page