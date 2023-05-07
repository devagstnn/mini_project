Feature: As a user I want get all order

  @Order @TC_Orders_002
  Scenario: I want to get all order
    Given user has api endpoint get all order
    When user input bearer token
    And user send HTTP request get all order
    Then user receive response code 200
    And user validate response body get all order