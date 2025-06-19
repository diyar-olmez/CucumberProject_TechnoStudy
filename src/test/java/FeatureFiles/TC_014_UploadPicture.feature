Feature: Profile Picture Upload

  As a student
  I want to upload or change my profile picture
  So that I can personalize my experience in the campus application

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully

  Scenario: Upload and change profile picture successfully
    When the user clicks on the profile picture
    Then an upload window should open and clicks on settings
    When the user clicks the Upload button
    And the user selects a valid image file
    Then the file size should be displayed
    When the user confirms the upload
    And the user clicks the save button
    Then a "Profile successfully updated" message should be displayed