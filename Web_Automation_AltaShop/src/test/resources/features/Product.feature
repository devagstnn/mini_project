Feature: Product - As a user I want to buying a product So that I have to select product

  @TC_Product_001
  Scenario: As a user, I want to buy some product
    Given user success login
    When user click button Beli
    Then user success to add product to cart

  @TC_Product_002
  Scenario: As a user, I want to see detail product
    Given user success login
    When user click button Detail
    Then user can see detail product

  @TC_Product_003
  Scenario: As a user, I want to give rating the product
    Given user success login
    When user click button Detail
    And user fills product rating
    Then user success add a product rating

  @TC_Product_004
  Scenario: As a user, I want to search for products by categories
    Given user success login
    When user clicks a dropdown category
    And user clicks one of the categories
    Then user can see message "Products is empty!"
