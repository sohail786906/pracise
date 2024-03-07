Feature: Login and Add new Customer

  Scenario: Add New Customer and Verify Success Message
    Given User is on the login page
    When User enters username and password and clicks login
    When User clicks on Customers
    Then User click to Add new button
    When User fills customer details
    When User clicks on Save
    Then User sees the message "The new customer has been added successfully"
