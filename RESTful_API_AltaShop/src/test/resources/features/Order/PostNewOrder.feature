Feature: As a user I want post create new order

  @Order @TC_Orders_001
  Scenario: I want to post create new order
    Given user has api endpoint post create new order
    When user input bearer token
    And user send request body post create new order
    Then user receive response code 200
    And user validate response body post create new order