Feature: Hamburger Menu Delete or Restore Message

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully

    Scenario: Delete Permanently or Restore Message
      Given Click on the trash button and the restore icon from the hamburger menu
      When The user should receive a successful restore message
      Then Click on the trash can icon and confirm the message to permanently delete the message
      And User should receive a success message indicating that the message has been completely deleted
