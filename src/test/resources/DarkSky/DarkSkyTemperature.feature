Feature: DarkSkyTemperature verification

  Scenario:  Verify feelsLike tempValue is in between the lowTemp and highTemp value in DarkSky page
    Given  I launch DarkSky website
    When I verify the feelslike tempValue in the darksky page
    And I verify the low tempValue in the darksky page
    And I verify the high tempValue in the darksky page
    And I verify the feeslike tempValue is between the low tempValue and high tempValue

  Scenario:  Verify Current temp value is displayed correctly when user changes the temp unit from ˚F to ˚C
    Given  I launch DarkSky website
    When I verify the current Temperature value in Fahrenheit in darksky page
    And I convert Temperature in Fahrenheit to celsius
    And I click the tempUnitButton in darksky page
    And I click the firstDegCelsiusButton from the tempUnitButton option
    And I verify the current Temperature value in celsius in darksky page
    Then I verify current temp value is displayed correctly when user changes the temp unit from ˚F to ˚C


  Scenario:  Verify  blog post date in darksky page is showing in correct format MonthName, Date Year
    Given  I launch DarkSky website
    And I click the Dark Sky API link in the darksky page
    And I click the blog post link in the Dark Sky API
    Then I verify all dates in blog posts are displayed in 'MonthName, Date Year' format

  Scenario:  Verify  that Current date is highlighted in the TimeMachine calender of DarkSky Page
    Given  I launch DarkSky website
      When I scroll down to click the TimeMachine button
      Then I verify that Current date is highlighted in the Time machine calender


