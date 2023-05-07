Feature: As a user I want to get all categories

  @ProductCategories @TC_Categories_003
  Scenario: I want to get all categories
    Given user has api endpoint get all categories
    When user send HTTP request get all categories
    Then user receive response code 200
    And user validate response body get all categories