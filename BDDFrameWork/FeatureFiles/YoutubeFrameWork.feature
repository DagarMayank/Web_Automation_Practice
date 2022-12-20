@YoutubeFrameWork
Feature: YoutubeFrameWork

  Background: Browser is Open user have to enter the login cred
    Given Click on the Signup tab
    And User is Navigated to EnterLogin Enter username and password and click on next
    Then User is Navigated to HomePage

  Scenario: clicking on History tab
    And Click on Hisotry
    Then User is Navigated to History tab

  Scenario: clicking on Trending Tab
    And Click on Trending
    And User is Navigated to Trending tab
