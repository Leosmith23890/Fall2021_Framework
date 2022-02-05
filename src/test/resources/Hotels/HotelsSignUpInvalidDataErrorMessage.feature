Feature: Verification of error message for invalid login details in SignUp page

  Scenario: Verify that error message is displayed for invalid login details in SignUp page
    Given  I launch hotels website
    When I click the 'Sign in' button in the hotels webpage
    And I click the 'Sign up' button in the hotels webpage
    And I enter '#!@###' as login email in the hotels webpage
    Then I verify the error message 'Please check your email address' in the webpage
    And I enter 'abc1' as login password with password less than 6-characters
    Then I verify the error message 'Please enter a password containing at least six characters' in the webpage
    And I enter 'abc12345678912345678912' as login password with password greater than 20-characters
    Then I verify the error message 'Your password cannot be more than 20 characters long.' in the webpage
    And I enter '12345' as first name in the hotels webpage
    Then I verify the error message 'Please check your first name' in the webpage
    And I enter '123&&5' as last name in the hotels webpage
    Then I verify the error message 'Please check your last name' in the webpage


