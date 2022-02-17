Feature: Verification of submission of user feedback form with valid details

  Scenario: Verify that the user is able to  submit user feedback form with all valid details
    Given  I launch hotels website
    When I click the 'Help' button in the hotels webpage
    And I select the 'Website feedback' option
    And I enter '5' star rating in the Overall Satisfaction with page option
    And I enter comments in the Page comments section
    And I select 'Highly Likely' option in the drop down of return to hotels.com option
    Then I select 'No' button in the prior visit option
    Then I select 'Yes' button in the accomplish option
    And I enter valid email address in the email address button
    And I click the 'Submit' button in the feedback page with all valid details
    Then I verify the display of the message 'THANK YOU FOR YOUR FEEDBACK.'



