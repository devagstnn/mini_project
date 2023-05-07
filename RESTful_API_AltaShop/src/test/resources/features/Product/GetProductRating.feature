Feature: As a user I want to get product rating

  @Product @TC_Product_006
  Scenario: I want to get product rating
    Given user has api endpoint get product rating
    When user send HTTP request get product rating
    Then user receive response code 200
    And user validate response get product rating