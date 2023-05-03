Feature: As a user I want to post create new product

  @Product @TC_Product_002
  Scenario: I want to post create new product
    Given user has api endpoint post create new product
    When user send request body post create new product
    Then user receive response code 200
    And user validate response body post create new product