Feature: Checkout
  Scenario: Successful checkout product
    Given I open browser
    And Open website saucedemo
    And Located on saucedemo website
    And I input valid username
    And I input valid password
    And I go to homepage
    And I click add to cart button
    And I click cart button
    And I click checkout button
    When I input the first name
    And I input the last name
    And I input the postal code
    And I click continue button
    And I click finish button
    Then Checkout product completed