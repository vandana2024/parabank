Feature: Navigate to the Home screen and extract all the links to a notepad

  @regression @smoke
  Scenario: user should click on home link and write in notepad
    Given user click on home icon
    Given user write ATM service in notepad
    Given user write online service in notepad
    Given user write latest news in notepad
    Then  User should be navigate to home page

