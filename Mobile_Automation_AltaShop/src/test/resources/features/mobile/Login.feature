Feature: Login - As a user I want to buy some product So that I have to login

  @TC_Login_001 @Login
  Scenario: As a user, I login with valid email and password
    Given user on login homepage
    When user input valid email
    And user input valid password
    And click button login
    Then user can see product homepage

  @TC_Login_002 @Login
  Scenario: As a user, I login with invalid email
    Given user on login homepage
    When user input invalid email
    And user input valid password
    And click button login
    Then user see error message "Email atau password tidak valid."

  @TC_Login_003 @Login
  Scenario: As a user, I login without input password
    Given user on login homepage
    When user input valid email
    And click button login
    Then user see message in password field "password can not empty"

  @TC_Login_004 @Login
  Scenario: As a user, I login without input email and password
    Given user on login homepage
    When click button login
    Then user see  message in email field"email can not empty"
    And user see message in password field "password can not empty"

