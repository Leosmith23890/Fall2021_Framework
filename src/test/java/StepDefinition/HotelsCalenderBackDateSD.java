package StepDefinition;

import Helper.Check;
import Helper.Misc;
import Pages.Hotels.LaunchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HotelsCalenderBackDateSD {

    LaunchPage lp = new LaunchPage();

    @And("^I enter the Check-in Date$")
    public void enterCheckInDate() {
        lp.clickCheckIn();
        Misc.sleep(2);
    }

    @Then("^I verify that back button on current month calender is disabled$")
    public void checkBackButtonCalender() {
        lp.clickBackButtonCalender();
        boolean backButtonDisplay = lp.isElementDisplayed();
        System.out.println("Is Back Button displayed :" + backButtonDisplay);
        boolean backButtonEnable = lp.isElementEnabled();
        System.out.println("Is Back Button Enabled :" + backButtonEnable);

        Check.checkTrue(backButtonDisplay, "Back Button is not displayed");
        Check.checkTrue(backButtonEnable, "Back Button is enabled");
    }
    @Then("^I verify that the past dates on current month calender is disabled$")
    public void checkPastDate(){
List<WebElement> allDatesOfCurrentMonth=lp.selectCurrentMonthCalender();
String text1="",text2="";
boolean value=true;
        List<String> disabledDates = new ArrayList<String>();
        List<String> disabledDates1 = new ArrayList<String>();
        int k = allDatesOfCurrentMonth.size();
        for (int i = 0; i < k; i++) {
            if (allDatesOfCurrentMonth.get(i).getText().contains("Disabled")) {
                text1 = (allDatesOfCurrentMonth.get(i).getText().substring(allDatesOfCurrentMonth.get(i).getText().length() - 8));
                text2 = allDatesOfCurrentMonth.get(i).getText().substring(0, 1);
                Misc.sleep(2);
                value = allDatesOfCurrentMonth.get(i).isEnabled();
                System.out.println("is the disabled date " + (allDatesOfCurrentMonth.get(i).getText().substring(0, 1)) + " is enabled :" + value);
                Check.checkFalse(value,"The past dates are enabled");
                disabledDates.add(text1);
                disabledDates1.add(text2);
            }
        }
        System.out.println("The list of disabled date is: " + disabledDates1);
        System.out.println("The disabled dates enabled status is :" + disabledDates);
        }
    }
