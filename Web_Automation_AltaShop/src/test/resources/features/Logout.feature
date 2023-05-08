Feature: Logout - As a user I want to logout So that i can end my session

  @Logout @TC_Logout_001
    Scenario: As a user I want to logout to end my session
    Given user success login
    And user can see product homepage
    When user click profil
    And user click logout
    Then user see login homepage
