Feature: As a user I want to delete product

  @Product @TC_Product_004
  Scenario: I want to delete product
    Given user has api endpoint delete product
    When user send HTTP request delete product
    Then user receive response code 200
    And user validate response body delete product
