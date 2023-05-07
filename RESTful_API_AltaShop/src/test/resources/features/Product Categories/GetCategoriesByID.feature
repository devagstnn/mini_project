Feature: As a user I want to get categories by id

  @ProductCategories @TC_Categories_002
  Scenario: I want to get categories by id
    Given user has api endpoint get categories by id
    When user send HTTP request get categories by id
    Then user receive response code 200
    And user validate response body get categories by id