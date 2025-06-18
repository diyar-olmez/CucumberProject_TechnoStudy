Feature: Accessing and Watching Finished Course Videos
  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully

  Scenario: Student should see the recording button for a finished course
    When the student clicks the Calendar button
    Then the student should be on the Calendar page
    Given student is on the Weekly Course Plan page
    And the student should be click 2Calendar button
    Then click the left button
    When Student clicks on a finished course
    Then Student should see the Recording button in the opened window

  Scenario: Student should access the course video by clicking the recording button
    Given Student sees the Recording button
    When Student clicks the Recording button
    Then Student should be able to access the course video

  Scenario: Student should click the play button in the course video
    Given Student opens the course video
    When Student clicks the Play button
    Then The video should start playing for the Student