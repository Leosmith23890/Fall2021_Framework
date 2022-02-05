package StepDefinition;

import Helper.Check;

import Pages.Hotels.TravelersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Arrays;

public class HotelsTravelersCountCheckSD {
TravelersPage tp=new TravelersPage();


    @When("^I click the 'Travelers' button is displayed with count details '1 room,2 Travelers' in the travellers page$")
    public void clickTravelerButton() {
        tp.clickTravelerButton();
        String initialTravelersText = tp.getTravelersText();
        System.out.println("The initial count of travelers is :"+initialTravelersText);
    }

    @And("^I increment  'Adult' count as '6' in Travelers page$")
    public void incrementAdultCount() {
        tp.clickAdultIncrementLocator();
    }

    @And("^I increment 'Children' count as '2' in Travelers page$")
    public void incrementChildCount() {
        tp.clickChildIncrementLocator();
    }

    @And("^I select the Child 1 age as '4' in Travelers page$")
    public void selectChild1AgeFromDropDown() {
        tp.selectChild1Age();
    }

    @And("^I select the Child 2 age as '1' in Travelers page$")
    public void selectChild2AgeFromDropDown() {
        tp.selectChild2Age();

    }

    @And("^I select the Done button in the Travelers page$")
    public void clickTravelersDoneButton() {
        tp.clickTravelersDoneButton();

    }
    @Then("^I Verify that the  'Travelers' button is displayed with new count details '1 room,8 travelers' in the hotels page$")
public void verifyTotalTravelersCount(){
        String totalTravelersCountText=tp.getTravelersText();
        System.out.println("Updated TravelersCountDetails is :"+totalTravelersCountText);
        String[] roomAndTravelers = totalTravelersCountText.split(",");
        System.out.println(Arrays.toString(roomAndTravelers));
        int roomCount = Integer.valueOf(roomAndTravelers[0].substring(0,1));
        int travelersCount = Integer.valueOf(roomAndTravelers[1].trim().substring(0,1));
        System.out.println("The room count is :"+roomCount);
        System.out.println("The guest count is :"+travelersCount);
       Check.checkTrue(roomCount==1,"The room count is not correct");
        Check.checkTrue(travelersCount==8,"The travelers count is not correct");
    }
}
