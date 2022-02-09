Feature: Verification of error message for invalid login credentials in SignIn page

  Scenario: Verify that error message is displayed for invalid credentials in SignIn page
    Given  I launch hotels website
    When I click the 'Sign in' button in the hotels launch page
    And I enter 'jj@###' as invalid login email in the SignIn page
    And I enter 'abc1' as invalid login password in the SignIn page
    And I select the 'Sign in' button in the SignIn page
    Then I verify the error message 'We don’t recognize the email and password combination you’ve entered' in the SignInPage


