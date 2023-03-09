Feature: sms messaging in api demos app

  @fifthTC
  Scenario: sending sms messages in api demos app
    Given the app is open
    When user hits OS
    Then user is navigated to os page
    When next user hits sms messaging
    Then user is navigated to sms messaging page
    When user enters recipient name
    And enters message
    Then hits the send button and the message is sent successfully.
