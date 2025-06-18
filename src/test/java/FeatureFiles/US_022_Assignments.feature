Feature: Student Assignment Search and Sorting

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully
    And The student navigates to the Assign page


  Scenario: Student can see and click the Search button
    When The student navigates to the Assign page
    Then The student should see the Search button
    When The student clicks the Search button

  Scenario: Default search without any filters
    When The student navigates to the Assign page
    Then The student should see the Search button
    When The student clicks the Search button without applying any filters
    Then All assigned tasks should be listed

  Scenario: Search with filters
    When The student selects Course, Status, and Semester filters
    And Clicks the Search button
    Then Only filtered tasks should be displayed

  Scenario: Access and use the sorting dropdown
    Then The student should see a dropdown menu for sorting (Show By ...)
    When The student opens the sorting dropdown

  Scenario Outline: Sort search results by different criteria
    Given The student opens the sorting dropdown
    When The student selects "<option>" from the dropdown
    Then The tasks should be sorted by "<option>"

    Examples:
      | option  |
      | Course  |
      | Type    |
      | Date    |
      | Table   |