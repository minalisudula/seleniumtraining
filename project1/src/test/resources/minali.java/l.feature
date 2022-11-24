Feature: working on login window

  Scenario: newtours page
    Given user is in newtours page
    When user enters username and password and clicks on submit
    Then user stores in xlsheet
    And user takes screenshot