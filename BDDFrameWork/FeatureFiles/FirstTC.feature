@FaceBook
Feature: Login functionality

  Scenario: To test the login functionlaity
    Given user is on login page
    When user enter the username
    And user enter the password
    Then user should be able to login
