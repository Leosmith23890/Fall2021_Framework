Feature: MessengerLogin

  Scenario: Verify user gets error message when user login with empty credentials on Messenger login screen
    Given  I launch facebook website
    When I click on Messenger link
    And I Click Log in button on Messenger screen with empty credentials
    And I verify login error 'Find your account and log in' is displayed
    And I verify Continue button is displayed and enabled
    Then I verify 'Keep me signed in' checkbox is NOT selected