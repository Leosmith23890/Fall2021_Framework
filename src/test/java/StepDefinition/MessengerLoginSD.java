package StepDefinition;

import Helper.Check;
import Pages.Facebook.LaunchPage;
import Pages.Facebook.MessengerHomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MessengerLoginSD {

   MessengerHomePage messengerPage=new MessengerHomePage();


@When("^I click on Messenger link$")
    public void clickMessengerLink()
{
        messengerPage.clickMessengerLink();
    }

    @When("^I Click Log in button on Messenger screen with empty credentials")
    public void clickMessengerLogin()
    {messengerPage.clickMessengerLogInButton();
    }

    @When("^I click on login button$")
    public void clickLogin()
    {
        messengerPage.clickMessengerLink();

    }

    @When("^I verify login error '(.+)' is displayed$")
    public void verifyLoginError(String errorMsg) {
        switch (errorMsg) {
            case "incorrect email or password":
                // verify incorrect email or password msg is displayed
                break;
            case "enter credentials again":
                // verify enter credentials again msg is displayed
                break;
            case "Find your account and log in":
                // verify your account details msg is displayed
                break;
            default:
                System.out.println("Not implemented for " + errorMsg + " msg");
        }}
    @When("^I verify Continue button is displayed and enabled$")
    public void ContinueButtonDisplayedAndEnabled(){

   messengerPage.isContinueButtonEnabled();
    Check.checkTrue(messengerPage.isContinueButtonDisplayed(),"Continue button is NOT displayed");
    Check.checkTrue(messengerPage.isContinueButtonEnabled(),"Continue button is NOT enabled");

    }
    @Then("^I verify 'Keep me signed in' checkbox is NOT selected$")
    public void verifyKeepMeSignedIn()
    {
        Check.checkFalse(messengerPage.isKeepMeSignedInButtonSelected(),"Keep me Sign in checkBox is selected");
    }


   }