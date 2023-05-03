Feature: As a user I want to post login

  @Authentication @TC_Authentication_002
  Scenario: I want to post login
    Given user has api endpoint post login
    When user send request body post login
    Then user receive response code 200
    And user validate response body post login