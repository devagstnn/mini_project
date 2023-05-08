Feature: Cart - As a user I want to pay for the product So that I have to check the cart to pay

  @TC_Cart_001 @Cart
  Scenario: As a user, I want to add more product to the cart
    Given user success login
    And user success add product to the cart
    When user click the cart
    And user click button plus
    Then user success add more quantity product

  @TC_Cart_002 @Cart
  Scenario: As a user, I want to pay the product
    Given user success login
    And user success add product to the cart
    When user click the cart
    And user click button Bayar
    Then the app displays form transaction

  @TC_Cart_003 @Cart
  Scenario: As a user, I want to reduce the quantity of a product in the cart
    Given user success login
    And user success add product to the cart
    When user click the cart
    And user click button min
    Then user success reduce quantity product

  @TC_Cart_004 @Cart
  Scenario: As a user, I want to delete product in the cart
    Given user success login
    And user success add product to the cart
    When user click the cart
    And user clicks button min until quantity 0
    Then user success delete product from the cart

  @TC_Cart_005 @Cart
  Scenario: As a user, I want to see cart without login
    Given user on login page
    When user click the cart
    Then user see message Order is Empty!

