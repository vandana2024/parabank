Feature: Registration of new user with valid details

  @regression @smoke
  Scenario: Create a New User
    Given user give all details
    When user click on button
    Then user account should be created
