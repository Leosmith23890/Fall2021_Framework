Feature: Verification of text and links in the  "Why book with Hotels.com?" section

  Scenario: Verify that user is able to access all the text and links in the 'Why book with Hotels.com?' section
    Given I launch hotels website
    When I verify the display of heading 'Why book with Hotels.com' in the hotels webpage
    And  I verify the display of 'Free cancellation on most hotels' text along with icon
    And  I verify the display of 'Our price guarantee find out more' link along with text and icon
    And  I verify the display of 'Get a reward night For every 10 nights you stay' link along with text and icon
    Then I click on the 'Our price guarantee find out more' link
    And  I verify that 'Price Guarantee' is displayed as heading in the webpage
    Then I go back to 'Why book with Hotels.com' section
    And  I click on 'Get a reward night For every 10 nights you stay' link
    Then I verify that 'Instant savings. Reward nights. And more ...' heading is displayed in the webpage


