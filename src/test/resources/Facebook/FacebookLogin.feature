Feature: FacebookLogin

  Scenario: Verify user gets error message 'find your account and log in ' when user enters invalid credentials in facebook page
    Given  I launch facebook website
    When I enter '%#&&*&&' as login email
    And I enter 'abcd@1234' as login password
    And I click on login button in facebook page
    Then I verify error message 'find your account and log in' is displayed


  Scenario: Verify user gets error message 'Please choose a gender' when user Sign up facebook without entering gender details
    Given  I launch facebook website
    When I click on Create new account
    And I enter 'James' as First Name
    And I enter 'Ford' as Last Name
    And I enter '9846353738' as Mobile number or email
    And I enter 'John1234!' as new Password
    And I enter 'Feb' as Birthday Month
    And I enter '2' as Birthday Date
    And I enter '15' as index value for Birthday Year
    And I click on Sign Up button without entering gender details
    Then I verify error message 'Please choose a gender. You can change who can see this later.' is displayed


  Scenario: Verify that Current date is displayed in Birthday field of facebook page
    Given  I launch facebook website
    When I click on Create new account
    And I verify Birthday Month in DropDown of Sign Up Page
    And I verify Birthday Day in DropDown of Sign Up Page
    And I verify Birthday Year in DropDown of Sign Up Page
    Then I verify that current date is displayed in Birthday field of Sign Up Page
