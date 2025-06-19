Feature: Profile Theme Selection

  As a student
  I want to select and apply a theme to my profile
  So that I can personalize the look and feel of the campus application

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully
    
  Scenario: Select and apply a theme from the dropdown
    When the user clicks on the profile picture2
    Then an upload window should open and clicks on settings2
    When the user locates the Theme dropdown menu and clicks on the Default Theme dropdown
    Then the user should see the following theme options:
      | Purple      |
      | Green      |
      | Dark Purple |
      | Indigo      |
    When the user selects the themes one by one
    Then the theme should be applied immediately
    When the user clicks the Save button
    And a "Profile successfully updated" message should be displayed2
