Feature: As a user I want to get product

  @Product @TC_Product_003
  Scenario: I want to get product by id
    Given user has api endpoint get product by id
    When user send HTTP request get product by id
    Then user receive response code 200
    And user validate response body get product by id