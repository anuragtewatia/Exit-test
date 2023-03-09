Feature: Set alarm in api demos app

  @firstTC
  Scenario: setting one shot alarm
    Given user is on the homepage
    When user hits app
    Then user is navigated to next page
    When next user hits alarm
    Then user is navigated to alarm page
    When user next hits Alarm Controller
    Then user is navigated to Alarm controller page
    And user next hits one shot alarm
    Then the alarm is set succesfully
