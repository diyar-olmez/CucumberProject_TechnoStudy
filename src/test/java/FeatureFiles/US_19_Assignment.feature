Feature: Start a discussion on a homework assignment

  As a student,
  I want to start a discussion on the homework detail page
  So that I can share my thoughts and exchange ideas about the assignment.

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully
    Given the student is on the homepage
    When the student clicks on the Assignments link

  Scenario: Student starts a discussion on a random homework
    When the student clicks on a random homework assignment
    Then the student should see a Discussion button or icon
    When the student clicks on the Discussion button
    Then a discussion window should appear
    And the student should see a Chats icon to view existing discussions
    And the student should see a Contacts option to select participants
    And the student should be able to attach a file
    When the student types a message and sends it with an attachment
    Then the system should NOT show a Success notification
    And the student should see the sent message content
    And the student should see the attached file name (if any)
    And the student should see the message's date and time

