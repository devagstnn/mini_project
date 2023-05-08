Feature: Register - As a user I want to login So that I have to register account

  @TC_Register_001
  Scenario: As a user, I register with valid data
    Given user on login homepage
    And user click register
    When user input full name
    And user input email
    And user input password
    And user click button register
    Then user see login homepage


  @TC_Register_002
  Scenario: As a user, I register with registered email
    Given user on login homepage
    And user click register
    When user input Full Name
    And user input email
    And user input password
    And user click button register
    Then user can see error message

  @TC_Register_003
  Scenario: As a user, I register with a weak password
    Given user on login homepage
    And user click register
    When user input full name
    And user input email
    And user input password
    And user click button register
    Then user see login homepage

  @TC_Register_004
  Scenario: As a user, I register without filling name or email or password field
    Given user on login homepage
    And user click register
    When user input full name
    And user input password
    And user click button register
    Then user can see error message