Feature: As a user I want to get all product

  @Product @TC_Product_001
  Scenario: I want to get all product
    Given user has api endpoint get all product
    When user send HTTP request get all product
    Then user receive response code 200
    And user validate response body get all product