package StepDefinition;


import Helper.Check;
import Pages.Hotels.HelpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HotelsHelpEmptyFeedbackErrorSD {

    HelpPage hp = new HelpPage();

    @When("^I click the 'Help' button in the hotels webpage$")
    public void clickHelpButtonInHotelPage() {
    hp.clickHelpButton();
    }

    @And("^I select the 'Website feedback' option$")
    public void clickWebsiteFeedbackButtonInHotelPage() {
        hp.clickWebsiteFeedbackOption();
    }

    @And("^I click the 'Submit' button in the feedback page with empty fields$")
    public void clickHelpSubmitButtonInHotelPage() {
        hp.clickHelpSubmitOption();
    }

    @Then("^I verify the display of  error message 'Please fill in the required information highlighted below.' in the feedback page$")
    public void verifyErrorMessageForEmptyFeedback() {
       boolean helpErrorMessageForEmptyFeedback= hp.verifyHelpErrorMessageForEmptyFeedback();
        Check.checkTrue(helpErrorMessageForEmptyFeedback,"The Empty FeedBack Error Message is not displayed");
    }


    @Then("^I verify that the 'Overall Satisfaction with Page' star section is displayed within a red dotted box$")
    public void verifyOverallSatisfactionWithPageWithRedBorder() {
        boolean overallPageSatisfactionSectionRedBorderDisplay = hp.verifyOverallPageSatisfactionSectionRedBorderDisplay();
Check.checkTrue(overallPageSatisfactionSectionRedBorderDisplay,"The Overall Satisfaction with Page section is not displayed within a red dotted box");
    }

}


