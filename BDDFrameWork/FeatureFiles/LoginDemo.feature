@testlogin
Feature: Test Login functionality

  Scenario Outline: Check login is successful
    Given browser is open
    When user enter <username> and <password>
    And user is on login
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Raghav   |    12345 |
      | Ele      |    12345 |
 