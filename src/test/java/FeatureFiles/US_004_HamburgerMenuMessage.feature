Feature: Home Page Top Nav Hamburger Menu Message Functionality

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully

    Scenario Outline:

      When the student hovers over the Messaging link in the Hamburger Menu
      Then the "<menuItem>" link should be visible and be able to click the menuItem link and be navigated to "<expectedUrl>"


      Examples:
        | menuItem      | expectedUrl            |
        | Send Message  | user-messages/new      |
        | Inbox         | inbox                  |
        | Outbox        | outbox                 |
        | Trash         | trash                  |