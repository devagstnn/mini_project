Feature: As a user I want to get user information

  @Authentication @TC_Authentication_003
  Scenario: I want to get user information
    Given user has api auth
    And user send request body auth
    When user has api endpoint get user information
    And user send HTTP request get user information
    Then user receive response code 200
    And user validate response body get user information
