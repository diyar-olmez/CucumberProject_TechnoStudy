Feature: Viewing Weekly Course Plan

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully

  Scenario: Student navigates to the Calendar page
    When the student clicks the Calendar button
    Then the student should be on the Calendar page

  Scenario: Student should see the weekly course plan
    When the student clicks the Calendar button
    Then the student should be on the Calendar page
    Then The weekly course plan should be visible
    Then The student should see today button

  Scenario: Student sees status icons for planned lessons
    When the student clicks the Calendar button
    Then the student should be on the Calendar page
    And the student should be click 2Calendar button
    And the student should be click month button
    Then The student should be able to see the lessons with icons

  Scenario: Student should see the meaning of status icons
    When the student clicks the Calendar button
    Then the student should be on the Calendar page
    Then The student should see what P, S, E, and C icons mean

  Scenario: Student should see and click Weekly Plan and Calendar links
    When the student clicks the Calendar button
    Then the student should be on the Calendar page
    Then The student should see  Weekly button
    Then The student should see  Calendar  button
    And The student should be able to click both links

  Scenario: Student should see and click Previous, Today, and Next buttons
    When the student clicks the Calendar button
    Then the student should be on the Calendar page
    And The student should be able to click Previous button