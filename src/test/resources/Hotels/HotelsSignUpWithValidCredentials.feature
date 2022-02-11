Feature: Verification of display of tick mark when the user enters valid details in SignUp page

  Scenario: Verify that tick-mark is displayed when user enters correct data in SignUp form
    Given  I launch hotels website
    When I click the 'Sign in' button in the hotels webpage
    And I click the 'Sign up' button in the hotels webpage
    And I enter 'bella@test.com' as valid login email in the hotels webpage
    Then I verify that tick mark is displayed for valid email address in the SignUp page
    And I enter 'bella1234' as valid login password in the hotels webpage
    Then I verify that tick mark is displayed for valid password in the SignUp page
    And I enter 'bella' as valid first name in the hotels webpage
    Then I verify that tick mark is displayed for valid first name in the SignUp page
    And I enter 'jones' as valid last name in the hotels webpage
    Then I verify that tick mark is displayed for valid last name in the SignUp page


