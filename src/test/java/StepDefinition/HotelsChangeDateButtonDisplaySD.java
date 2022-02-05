package StepDefinition;

import Helper.Check;
import Pages.Hotels.LaunchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class HotelsChangeDateButtonDisplaySD {

    LaunchPage lp = new LaunchPage();

    @When("^I enter the destination place in the Search box as 'Bora'$")
    public void enterDestinationPlace() {
        lp.enterDestinationPlace("Bora");
    }

    @And("^I choose the destination place as 'Bora Bora'$")
    public void chooseDestinationPlace() {
        lp.selectSDestFromSearchSuggestions("Bora Bora");
    }

    @And("^I enter the Check in Date as Apr-01$")
    public void enterCheckInDate() {
        lp.clickCheckIn();
        lp.clickPageSlider();
        lp.selectAprilCheckInDate();
    }
    @And("^I enter the Check out Date as Apr-10$")
    public void enterCheckOutDate() {
        lp.clickCheckOut();
        lp.selectAprilCheckOutDate();
        lp.clickApplyButton();
    }
@And("^I click and enter 'villa' in the Property name$")
public void clickAndEnterPropertyName(){
      lp.propertyLocator();
      lp.enterPropertyName("villa");
}
    @Then("^I scroll to the bottom of the webpage to find the 'Change Dates' button$")
    public void scrollToTheBottomOfHotelPage()
    {
WebElement changeDateDisplayButton=lp.changeDateButtonDisplay();
    }

    @Then("^I verify that the 'Change Dates button' is displayed at the end of search results$")
    public void verifyShareFeedback(){
        WebElement changeButton=lp.changeDateButtonDisplay();
        boolean changeButtonDisplay=changeButton.isDisplayed();
        System.out.println("Is Change button displayed "+changeButtonDisplay);
        Check.checkTrue(changeButtonDisplay,"Change Date button is not displayed");
    }

    @Then("^I verify that the 'Change Dates button' is enabled at the end of search results$")
    public void changeDateAtTheHotelPageBottom(){
        WebElement changeButton=lp.changeDateButtonDisplay();
        boolean changeButtonEnabled=changeButton.isEnabled();
        System.out.println("Is Change button enabled :"+changeButtonEnabled);
        Check.checkTrue(changeButtonEnabled,"Change Date button is not enabled");
        String textValue=changeButton.getText();
        System.out.println("The text in the change date button is "+textValue);
        Check.checkEquals(textValue, "CHANGE DATES","Change Date text is not  equal");

    }
        }
