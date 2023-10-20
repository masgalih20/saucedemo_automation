Feature: Filter
  Scenario: Successful to go to checkout page
    Given I open browser
    And Open website saucedemo
    And Located on saucedemo website
    And I input valid username
    And I input valid password
    And I go to homepage
    When I click sort button
    And I click Name (Z to A)
    Then The last product is on the top