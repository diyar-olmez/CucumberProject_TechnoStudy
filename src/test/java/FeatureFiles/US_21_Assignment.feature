Feature: Student Assignment Submission

  As a student,
  I want to submit my homework through the Assignments page
  So that my teacher can evaluate it faster.

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully

  Scenario: Full assignment submission flow with text, attachment and confirmation
    Given I navigate to the Assignments page
    When I see the list of homework
    And I click the Submit icon next to a homework
    Then A rich text editor modal should appear

    When I write This is my homework in the editor
    And I attach files image.png and sample.pdf
    And I click the Save As Draft button
    Then I should see a Success message

    When I check the Send button before saving draft
    Then The Send button should be disabled

    When I click the Send button after saving
    Then A confirmation dialog should appear

    When I confirm the submission
    Then I should see a Success message

    When I go to the assignment detail page
    Then I should see a New Submission button

    When I click the New Submission button
    Then A new rich text editor modal should appear
    And All previous preconditions should be applicable again
