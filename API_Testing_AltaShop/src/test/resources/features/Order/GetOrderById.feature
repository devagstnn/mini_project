Feature: As a user I want get order by id

  @Order @TC_Orders_003
  Scenario: I want to get order by id
    Given user has api endpoint get order by id
    When user input bearer token
    And user send request body get order by id
    Then user receive response code 200
    And user validate response body get order by id