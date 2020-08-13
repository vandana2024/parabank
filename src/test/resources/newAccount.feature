Feature: user should click open new account

  @regression @smoke
  Scenario: user new account creation
    Given user click on open new account
    And user enter the values
    Then account should be created