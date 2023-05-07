Feature: As a user I want to delete categories

  @ProductCategories @TC_Categories_004
  Scenario: I want to delete categories
    Given user has api endpoint delete categories
    When user send HTTP request delete categories
    Then user receive response code 200
    And user validate response body delete categories