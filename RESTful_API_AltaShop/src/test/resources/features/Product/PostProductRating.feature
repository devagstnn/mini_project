Feature: As a user I want to post product rating

  @Product @TC_Product_005
  Scenario: I want to post product rating
    Given user has api endpoint post product rating
    When user input bearer token
    And user send request body post product rating
    Then user receive response code 200
    And user validate response post product rating