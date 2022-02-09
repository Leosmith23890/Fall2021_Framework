Feature: PastDate and back button on Hotels current month's calender is disabled

  Scenario: Verify that PastDate and back button on Hotels current month's calender is disabled
    Given  I launch hotels website
    When I click the destination search place
    And I enter the destination place in the Search box
    And I choose the destination place
    And I enter the Check-in Date
    Then I verify that back button on current month calender is disabled
    Then  I verify that the past dates on current month calender is disabled


