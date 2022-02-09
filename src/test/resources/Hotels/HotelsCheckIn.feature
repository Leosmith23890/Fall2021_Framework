Feature: verification of sorting of HotelsPrice

  Scenario: Verify that on sorting the hotel price the lowest hotel price option is less than or equal to 100
    Given  I launch hotels website
    When I click the destination search place
    And I enter the destination place in the Search box
    And I choose the destination place
    And I enter the Check in Date
    And I enter the Check out Date
    And I click the Search Button
   And  I sort the search results from low to high price option
    Then I verify the lowest Hotels price option is less than or equal to 100

  Scenario: Verify that the 'popular filters' checkbox are not checked
              and 'star rating' button is in increasing order
    Given  I launch hotels website
    When I click the destination search place
    And I enter the destination place in the Search box
    And I choose the destination place
    And I enter the Check in Date
    And I enter the Check out Date
    And I click the Search Button
    Then  I verify that 'popular filters' checkbox are not checked
    Then I verify that 'star rating' button is in increasing order
