package StepDefinition;


import Helper.Check;
import Pages.Hotels.HelpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HotelsHelpValidFeedbackSD {

    HelpPage hp = new HelpPage();

    @And("^I enter '5' star rating in the Overall Satisfaction with page option$")
    public void selectStarRatingInWebFeedback(){
hp.selectWebFeedBackStarRating();
    }
    @And("^I enter comments in the Page comments section$")
    public void enterWebFeedBackComments()
    {
        hp.enterWebFeedBackComments();
    }

    @And("^I select 'Highly Likely' option in the drop down of return to hotels.com option$")
    public void selectHighlyLikelyOptionInWebFeedBack() {
        hp.selectWebFeedBackReturnOption();
    }

    @Then("^I select 'No' button in the prior visit option$")
    public void selectPriorVisitOptionInWebFeedBack() {
hp.selectWebFeedBackPriorVisitOption();
    }

    @Then("^I select 'Yes' button in the accomplish option$")
    public void selectAccomplishOptionInWebFeedBack() {
        hp.selectWebFeedBackAccomplishOption();
    }

    @And("^I enter valid email address in the email address button$")
    public void enterWebFeedBackEmailAddress() {
       hp.enterWebFeedEmailAddress();
    }

    @And("^I click the 'Submit' button in the feedback page with all valid details$")
    public void selectWebFeedBackSubmitButton(){
        hp.selectWebFeedBackSubmitButton();
}

    @Then("^I verify the display of the message 'THANK YOU FOR YOUR FEEDBACK.'$")
    public void verifyWebFeedBackThankYouMessage(){
        boolean thankYouMessage=hp.verifyWebFeedBackThankYouMessageForValidDetails();
        Check.checkTrue(thankYouMessage,"Thank you message is not displayed after entering all details in Web Feedback form ");
    }

}


