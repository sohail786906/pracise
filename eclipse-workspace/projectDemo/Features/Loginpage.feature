Feature: Login Functionality

  Scenario: Valid Login
    Given I am on the NopCommerce login page
    When I enter valid username and password
    And click on the login button
    Then I should verify to the "Dashboard"
    When I click to logout button
    Then I am on the "NopCommerce login page"
