Feature: Login
  Scenario: Failed login with empty username
    Given I open browser
    And Open website saucedemo
    And Located on saucedemo website
    When I input invalid username
    And I input valid password
    Then I stay on login page

  Scenario: Successful login
    Given I open browser
    And Open website saucedemo
    And Located on saucedemo website
    When I input valid username
    And I input valid password
    Then I go to homepage