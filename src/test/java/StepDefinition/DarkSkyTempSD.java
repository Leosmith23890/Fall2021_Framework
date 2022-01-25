package StepDefinition;

import Helper.Check;
import Helper.DateUtil;
import Pages.Darksky.DarkSkyPage;
import Pages.Facebook.LaunchPage;
import Web.UseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DarkSkyTempSD {
    DarkSkyPage darkSkyPage = new DarkSkyPage();
    int currentTempValueInCelsius = 0;
    int celsiusTempValueForFahren = 0;

    @Given("^I launch DarkSky website$")
    public void launchFacebook() {
        UseDriver.openUrl("https://darksky.net/");
    }

    @When("^I verify the feelslike tempValue in the darksky page$")
    public void feelsLikeTempValue() {
        String feelslike = darkSkyPage.feelsLikeTextFromWebElements();
        System.out.println("The feelslike temp is :" + feelslike);
    }

    @When("^I verify the low tempValue in the darksky page$")
    public void lowTempValue() {
        String lowTempValue = darkSkyPage.lowTempTextFromWebElements();
        System.out.println("The low temp is :" + lowTempValue);
    }

    @When("^I verify the high tempValue in the darksky page$")
    public void highTempValue() {
        String highTempValue = darkSkyPage.highTempTextFromWebElements();
        System.out.println("The high temp is :" + highTempValue);
    }

    @Then("^I verify the feeslike tempValue is between the low tempValue and high tempValue$")
    public void checkFeelslikeTempValue() {
        Check.checkTrue(darkSkyPage.highTempValueInt() >= darkSkyPage.feelsLikeTempValueInt() && darkSkyPage.feelsLikeTempValueInt() >= darkSkyPage.LowTempValueInt(),
                "feelsLike tempValue is NOT in between the lowTemp and highTemp value");
    }


//////////////////////////////////////////////////////////////////////////////////////////

    @When("^I verify the current Temperature value in Fahrenheit in darksky page$")
    public void currentTempvalue() {
        String currentTemp = darkSkyPage.currentTempTextFromWebElements();
        int currentTempValue = darkSkyPage.currentTempValueInt();
        System.out.println("The current temperature value is : " + currentTempValue);
    }

    @And("^I convert Temperature in Fahrenheit to celsius$")
    public void fahrenToCelsiusConversion() {
        celsiusTempValueForFahren = darkSkyPage.fahrenToCelsiusConversion();
        System.out.println("The celsius value of fahrenheit temp is :" + celsiusTempValueForFahren);
    }

    @And("^I click the tempUnitButton in darksky page$")
    public void clickTempUnitButton() {
        darkSkyPage.clickTempUnitButton();
    }

    @And("^I click the firstDegCelsiusButton from the tempUnitButton option$")
    public void clickCelsiusDegreeButton() {
        darkSkyPage.clickFirstDegCelsiusButton();
    }

    @And("^I verify the current Temperature value in celsius in darksky page$")
    public void currentTempValueCelsiusInInt() {
        currentTempValueInCelsius = darkSkyPage.currentTempValueCelsiusInInt();
        System.out.println("The current Temperature value in Celsius is :" + currentTempValueInCelsius);
    }

    @Then("^I verify current temp value is displayed correctly when user changes the temp unit from ˚F to ˚C$")
    public void checkfTempIntoCTempConversion() {

        Check.checkEquals(currentTempValueInCelsius, celsiusTempValueForFahren,
                "temp value is NOT displayed correctly when user changes the temp unit from ˚F to ˚C");
    }

    //____________________________________________________________
    @And("^I click the Dark Sky API link in the darksky page$")
    public void clickDarkSkyApi() {
        darkSkyPage.clickDarkSkyApi();
    }

    @And("^I click the blog post link in the Dark Sky API$")
    public void clickBlogPost() {
        darkSkyPage.clickBlogPost();
    }

    @Then("^I verify all dates in blog posts are displayed in 'MonthName, Date Year' format$")
    public void verifyDatesformat(){
        boolean result=darkSkyPage.stringToDateConversion();
        Check.checkTrue(result,"All dates are not in correct format");
    }
    /////////////////////////////////////////////////////////////

    @When("^I scroll down to click the TimeMachine button$")
    public void ScrollToClickTimeMachineButton(){
            darkSkyPage.getTimeMachineElementByScroll();
    }
@Then("^I verify that Current date is highlighted in the Time machine calender$")
    public void verifyTimeMachineDate(){

    String currentDate=DateUtil.getCurrentDateDate();
    String timeMachineCurrentDate= darkSkyPage.timeMachineDateTextFromPageMouseOver();
    System.out.println("The Date from page is :"+timeMachineCurrentDate);
    Check.checkEquals(timeMachineCurrentDate,currentDate,"Date is not same");

}
}