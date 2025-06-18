
  Feature: Home Page Logo Functionality

    Background:
      Given Navigate to Campus
      When Enter valid username and password and click login button
      Then User should login successfully

    Scenario: Redirecting to the course homepage by clicking the logo

      Then The user should see the company logo at the top-left corner and click
      When The user should be redirected to "https://techno.study/"
