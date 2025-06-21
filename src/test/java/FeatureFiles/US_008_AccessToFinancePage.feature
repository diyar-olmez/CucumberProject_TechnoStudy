Feature: Hamburger Menu Access To Finance Page

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully

  Scenario: Access To Finance Page
    Given Go to the my finance page from the hamburger menu
    Then User should be able to view my finance page