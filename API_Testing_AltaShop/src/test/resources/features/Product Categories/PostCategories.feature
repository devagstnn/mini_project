Feature: As a user I want to post create categories

  @ProductCategories @TC_Categories_001
  Scenario: I want to post create categories
    Given user has api endpoint post create categories
    When user send request body post create categories
    Then user receive response code 200
    And user validate response body post create categories