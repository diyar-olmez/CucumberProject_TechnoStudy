Feature: Download Course Grade and Student Transcript as PDF
  As a student
  I want to download my grades and transcript as PDF
  So that I can save or print them for personal use

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully

  Scenario: Download Course Grade as PDF
    When the student clicks the Grade button
    Then the student clicks the Print icon
    And the student clicks the Download button in the PDF preview
