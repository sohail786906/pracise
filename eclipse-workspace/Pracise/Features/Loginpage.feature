Feature: Login page
Scenario: Login with valid credentials
Given I am on the Parabank login page
When I enter valid username and password
And I click on the login button
Then I should be logged in Successfully