Feature: Students should be able to view all tasks assigned to them from the Assignments page

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully

  Scenario: Display assigned tasks when the student clicks on the Assignments link
    Given the student is on the homepage
    When the student clicks on the Assignments link
    Then the system should display all tasks assigned to the student in a list
    And each task should show its title and task type (homework, quiz)
