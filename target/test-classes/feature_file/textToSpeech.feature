Feature: text to speech in api demos app

  @sixthTC
  Scenario: testing text to speech functionality
    Given app is open
    When user hits app options
    Then user is navigated to app page
    When next user swipe down
    And clicks text to speech
    Then the fuctionaltity starts working and is validated
