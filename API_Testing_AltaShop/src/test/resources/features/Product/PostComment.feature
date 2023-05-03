Feature: As a user I want to post create comment

  @PostComment
  Scenario: I want to post create comment
    Given user has api endpoint post create comment
    When user input bearer token
    And user send request body post create comment
    Then user receive response code 200
    And user validate response post create comment