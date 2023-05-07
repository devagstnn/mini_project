Feature: Product - As a user I want to buy product So that I have to select product

  @TC_Product_001 @Product
    Scenario: As a user, I select product to add to the cart
    Given user success login
    And user on product page
    When user select button Beli
    Then user success add product to the cart