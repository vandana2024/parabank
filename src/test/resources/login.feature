Feature: user should open Url and login with valid credential

  @regression @smoke
  Scenario Outline: Verification of Login Function
    Given user enters "username" and "password"
    When user click "log in" button
    Then user should see "My Account"
    Examples:
      | username | password |
      | User5 | 1234 |

