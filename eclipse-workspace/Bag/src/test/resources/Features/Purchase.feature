Feature: Purchase Products

  Scenario: Signup, Login, Add to Cart, Add Address, and Pay with Cash
    Given I navigate to the signup page
    When I sign up with username "testuser", password "testpass", and email "testuser@example.com"
    Then I should be logged in

    Given I add "Product A" to the cart
    And I view the cart
    When I add the address "123 Main St, City"
    And I pay with cash
    Then the purchase should be successful