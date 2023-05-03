Feature: Login - As a user I want to buy some product So that I have to login

  @TC_Login_001
  Scenario: As a user, I login with valid email dan password
    Given user on login page
    When user input valid email
    And user input valid password
    And click button login
    Then user can see product homepage

  @TC_Login_002
  Scenario: As a user, I login with invalid email
    Given user on login page
    When user input invalid email
    And user input valid password
    And click button login
    Then user see error message "record not found"

  @TC_Login_003
  Scenario: As a user, I login with invalid password
    Given user on login page
    When user input valid email
    And user input invalid password
    And click button login
    Then user see error message "record not found"

  @TC_Login_004
  Scenario: As a user, I login without input email or password
    Given user on login page
    When user input valid email
    And click button login
    Then user see error message "record not found"

  @TC_Login_005
  Scenario: As a user, I login with invalid email and password
    Given user on login page
    When user input invalid email
    And user input invalid password
    And click button login
    Then user see error message "record not found"

  @TC_Login_006
  Scenario: As a user, I login without input email and password
    Given user on login page
    When click button login
    Then user see error message "record not found"