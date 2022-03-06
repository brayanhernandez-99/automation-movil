Feature: Aplication movile

  Background: Login the app
    Given the user is in the mobile app
    When The user enters her credentials
      | username | password |
      | company  | company  |

  @FirstScenario
  Scenario: Validate started session
    Then the user will validate that he started the session

  @SecondScenario
  Scenario: Validate payment
    When the user wants to make a payment
      | phone     | name   | amount | country |
      | 123456789 | Brayan | 10      | Canada  |
    Then the user validates that they can payment
