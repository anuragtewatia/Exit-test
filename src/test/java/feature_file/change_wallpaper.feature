Feature: Change device wallpaper

  @secondTC
  Scenario: changing the wallpaper of device
    Given application is open
    And user is on home page
    When user clicks app
    Then user is naigated to the next page
    When user next clicks activity
    Then user is navigated to the actitivity page
    And next user scrolls down the page and click set wallpaper
    When user selects a new wallpaper and hits set wallpaper
    Then the new wallpaper is successfully applied to the device
