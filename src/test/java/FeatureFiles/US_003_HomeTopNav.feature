Feature: Home Page Top Nav Functionality

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully

    Scenario: The user can view and interact with all top navigation items

      When The user views the top navigation bar should see the menu items and click
