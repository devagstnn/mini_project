Feature: As a user I want to get product comment

  @Product @TC_Product_008
  Scenario: I want to get product comment
    Given user has api endpoint get product comment
    When user send HTTP request get product comment
    Then user receive response code 200
    And user validate response body get product comment