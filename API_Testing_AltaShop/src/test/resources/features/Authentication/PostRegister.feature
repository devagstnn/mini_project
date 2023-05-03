Feature: As a user I want to post register


  @Authentication @TC_Authentication_001
  Scenario: I want to post register
    Given user has api endpoint post register
    When user send request body post register
    Then user receive response code 200
    And user validate response body post register