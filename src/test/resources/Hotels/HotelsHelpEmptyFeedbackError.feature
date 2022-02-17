Feature: Verification of display of error message when user submits the empty feedback form

  Scenario: Verify that error message is displayed when the user submits the empty feedback form
    Given  I launch hotels website
    When I click the 'Help' button in the hotels webpage
    And I select the 'Website feedback' option
    And I click the 'Submit' button in the feedback page with empty fields
    Then I verify the display of  error message 'Please fill in the required information highlighted below.' in the feedback page
    Then I verify that the 'Overall Satisfaction with Page' star section is displayed within a red dotted box


