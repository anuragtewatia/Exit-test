Feature: play media in api demos app

  @thirdTC
  Scenario: playing audio from resources
    Given user is on the app homepage
    When user hits media
    Then user is navigated to nextPage
    When next user hits media player
    Then user is navigated to media player page
    And user hits play audio from resources
    Then the audio started playing successfully and the test case is validated!

  @fourthTC
  Scenario: playing video from local file
    Given user is on the homePage
    When user clicks media
    Then user is navigated to the nextpage
    When next user hits mediaPlayer
    Then user is navigated to mediaPlayer page
    And user hit play video from local file
    Then the video plays and test case is validated!
