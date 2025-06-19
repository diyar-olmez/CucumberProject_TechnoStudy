Feature: Grading Page Functionality
  As a student
  I want to access the Grading page
  So that I can view my grades and transcripts

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully

  Scenario: Access and Validate Grading Page Components
    When the student clicks on the 'Grading' link on the homepage
    And the 'Course Grade' button should be visible and clickable
    When the student's clicks on the 'Course Name' with grades
    Then the student's course grades should be displayed

    When the student clicks on the 'Reports' button
    And the 'Student Transcript' button should be visible
    Then the 'Academic Year','Academic Period' and 'Data Created' should be displayed