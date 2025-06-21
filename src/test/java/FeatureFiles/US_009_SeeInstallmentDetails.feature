Feature: Hamburger Menu See Installment Details

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully

  Scenario: See Installment Details
    Given Go to the my finance page from the hamburger menu
    When Click on the line with your name and the fee balance detail button
    Then The user should be able to see the installment table