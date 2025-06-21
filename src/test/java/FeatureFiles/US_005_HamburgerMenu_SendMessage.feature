Feature: Hamburger Menu Messaging

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully

    Scenario: Send a message
      Given Go to the message sending page from the hamburger menu
      When Add receivers and subject
      Then Enter text in the text editor, create a table, attach a file and send message
      And Click on the Outbox link and see the sent message items in a list