Feature: Logout - As a user I want to logout So that i can end my session

  @Logout
  Scenario: As a user I want to logout
    Given user success login
    And user see product homepage
    When user click button logout
    Then user see home page
