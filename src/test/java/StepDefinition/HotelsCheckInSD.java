package StepDefinition;

import Helper.Check;
import Helper.Misc;
import Pages.Hotels.LaunchPage;
import Web.UseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HotelsCheckInSD {

    LaunchPage lp = new LaunchPage();

    @Given("^I launch hotels website$")
    public void launchHotels() {
        UseDriver.openUrl("https://www.hotels.com/");
    }

    @When("^I click the destination search place$")
    public void clickDestinationPlace() {
        lp.clickDestinationPlace();
    }

    @And("^I enter the destination place in the Search box$")
    public void enterDestinationPlace() {
        lp.enterDestinationPlace("little");
    }

    @And("^I choose the destination place$")
    public void chooseDestinationPlace() {
        lp.selectSDestFromSearchSuggestions("Little Rock");
    }

    @And("^I enter the Check in Date$")
    public void enterCheckInDate() {
        lp.clickCheckIn();
        lp.selectTomorrowCheckInDate();
    }
    @And("^I enter the Check out Date$")
    public void enterCheckOutDate() {
        lp.clickCheckOut();
        lp.selectCheckOutDate();
        lp.clickApplyButton();
    }
    @And("^I click the Search Button$")
        public void clickSearchButton(){
        lp.clickSearchHotelButton();
        }

    @And("^I sort the search results from low to high price option$")
    public void sortPriceOption(){
lp.clickPriceOptionButton();
lp.clickLowToHighSortOption();
    }

    @Then("^I verify the lowest Hotels price option is less than or equal to 100$")
    public void verifyLowPriceOption(){
        String lowPrice=lp.getPriceFromPriceOption();
        int result=Misc.removeDollarAndValueAsInt(lowPrice);
        System.out.println("The lowest hotel price is:"+result);
        boolean finalValue = result <= 100;
        Check.checkTrue(finalValue,"Low to high price is not sorted");
    }

    @Then("^I verify that 'popular filters' checkbox are not checked$")
    public void checkPopularFilter(){
        Boolean pfCheck=lp.popularFilterCheckBox();
        Check.checkFalse(pfCheck,"Popular Filter check box are checked");
    }
    @Then("^I verify that 'star rating' button is in increasing order$")
    public void checkStarRating()
    {
        List starRating=lp.starRatingCheckBox();
     System.out.println("The star rating values before sorting is :"+starRating);
       List starRating1=lp.starRatingSortCheckBox();
       Collections.sort(starRating1);
       System.out.println("The star Rating values after sorting is :"+starRating1);
     Check.checkEquals(starRating1,starRating,"Star Rating is not in increasing order");
    }

    }
