Feature: Register - As a user I want to login So that I have to register account

  @TC_Register_001 @Register
  Scenario: As a user, I register with valid data
    Given user on home page
    And user on login page
    And user click register feature
    And user on register page
    When user input fullname
    And user input email
    And user input password
    And user click button register
    Then user see product homepage

  @TC_Register_002 @Register
  Scenario: As a user, I register with registered email
    Given user on home page
    And user on login page
    And user click register feature
    And user on register page
    When user input new fullname
    And user input email
    And user input new password
    And user click button register
    Then user see error message

  @TC_Register_003 @Register
  Scenario: As a user, I register without filling fullname field
    Given user on home page
    And user on login page
    And user click register feature
    And user on register page
    When user not fill fullname
    And user input email
    And user input password
    And user click button register
    Then user see message in fullname field "fullname can not empty"

  @TC_Register_004 @Register
  Scenario: As a user, I register without filling fullname, email and password field
    Given user on home page
    And user on login page
    And user click register feature
    And user on register page
    When user not fill fullname, email, password field
    And user click button register
    Then user see message in every field










