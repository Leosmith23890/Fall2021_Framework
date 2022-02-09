Feature:  verification of display of ChangeDateButton at the end of search results

  Scenario: Verify that Change Dates button is displayed at the end of search results
    Given  I launch hotels website
    When I click the destination search place
    And I enter the destination place in the Search box as 'Bora'
    And I choose the destination place as 'Bora Bora'
    And I enter the Check in Date as Apr-01
    And I enter the Check out Date as Apr-10
    And I click the Search Button
    And I click and enter 'villa' in the Property name
    Then I scroll to the bottom of the webpage to find the 'Change Dates' button
    Then I verify that the 'Change Dates button' is displayed at the end of search results
    Then  I verify that the 'Change Dates button' is enabled at the end of search results
