Feature: Shortcut icons on the homework list should allow the student to quickly perform actions

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully

  Scenario: Using Information, Submit, Mark it, and Discussion icons on homework rows
    Given The student navigates to the Assignments > Homework page
    When The student clicks on the Information (i) icon of a random homework
    Then The homework details page should open
    When The student clicks on the Submit icon of the same homework
    Then The submission page for that homework should open

    When The student clicks on the Mark it (favorite) icon
    Then The homework should be marked as favorite

    When The student clicks anywhere else on the same homework row
    Then The homework details page should open by default

    When The student clicks the Discussion icon
    Then The discussion window for that homework should open
