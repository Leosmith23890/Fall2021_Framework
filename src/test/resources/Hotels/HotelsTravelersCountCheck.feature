Feature: Verification of increment of travelers count on Hotels page based on User selection

  Scenario: Verify that user can update number of travelers on Hotels page
    Given  I launch hotels website
    When I click the 'Travelers' button is displayed with count details '1 room,2 Travelers' in the travellers page
    And I increment  'Adult' count as '6' in Travelers page
    And I increment 'Children' count as '2' in Travelers page
    And I select the Child 1 age as '4' in Travelers page
    And I select the Child 2 age as '1' in Travelers page
    And I select the Done button in the Travelers page
    Then I Verify that the  'Travelers' button is displayed with new count details '1 room,8 travelers' in the hotels page
