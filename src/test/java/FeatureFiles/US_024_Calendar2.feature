Feature: Course Details and Information for Student
  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully

  Scenario: Student opens course details page from weekly course plan
    When the student clicks the Calendar button
    Then the student should be on the Calendar page
    Given student is on the Weekly Course Plan page
    When student clicks on a course
    Then student should see the course details page open

  Scenario: Student sees the course name in the opened window
    When the student clicks the Calendar button
    Then the student should be on the Calendar page
    Given student is on the Weekly Course Plan page
    Given student has opened the course details window
    Then student should see the course name

  Scenario: Student sees course and teacher info when clicking published course in schedule
    When the student clicks the Calendar button
    Then the student should be on the Calendar page
    Given student is on the Weekly Course Plan page
    Given student has opened the course details window
    Then student should see the course name, teacher name, date, and time

  Scenario: Student receives a warning when clicking on a course
    When the student clicks the Calendar button
    Then the student should be on the Calendar page
    Given student is on the Weekly Course Plan page
    Given student has opened the course details window
    Then student should receive a warning message

  Scenario: Student sees Information, Topic, Attachments, and Recent Events links on published course
    When the student clicks the Calendar button
    Then the student should be on the Calendar page
    Given student is on the Weekly Course Plan page
    And the student should be click 2Calendar button
    Then click the left button
    Given student has opened a published course
    Then student should see the links: Information, Topic, Attachments, and Recent Events