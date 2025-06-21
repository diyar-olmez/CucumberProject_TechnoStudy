Feature: Hamburger Menu Messaging Move The Message To Trash

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully

  Scenario: Move The Message To Trash Box
    Given Click on the Outbox link and see the sent message items in a list
    When Click the trash button and confirm the deletion
    Then User should be able to view the message the message was deleted successfully