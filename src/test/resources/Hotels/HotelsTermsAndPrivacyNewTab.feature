Feature: Verification of opening of Terms and Conditions link and Privacy Statement link in a new tab

  Scenario: Verify that "Terms and Conditions” and Privacy Statement” links opens in a new tab
    Given  I launch hotels website
    When I click the 'Sign in' button in the hotels webpage
    And I click the 'Sign up' button in the hotels webpage
    And I click the 'Terms and Conditions' Link and 'Privacy Statement' Link in the SignUp page
    And I Verify that 'Terms and Conditions' Link and 'Privacy Statement' Link opens in a new tab
