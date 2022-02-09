package StepDefinition;


import Helper.Check;
import Pages.Hotels.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HotelsSignInErrorMessageSD {


    SignInPage si = new SignInPage();
@When("^I click the 'Sign in' button in the hotels launch page$")
public void clickSignInInHotelPage(){
    si.clickSignInHeaderButton();
}

    @And("^I enter '(.+)' as invalid login email in the SignIn page$")
    public void enterInvalidEmailAddressInSignIn(String inputEmail) {
        si.enterInValidLoginEmailAddress(inputEmail);

    }

    @And("^I enter '(.+)' as invalid login password in the SignIn page$")
    public void enterInvalidEmailPasswordInSignIn(String inputPassword) {
        si.enterInValidLoginPassword(inputPassword);

    }

    @And("^I select the 'Sign in' button in the SignIn page$")
    public void clickLoginSignInButton() {
        si.clickSignInButton();

    }

    @Then("^I verify the error message 'We don’t recognize the email and password combination you’ve entered' in the SignInPage$")
    public void verifyLoginEmailErrorMessage() {
        boolean loginInvalidCredentialErrorMsg = si.isInvalidCredentialsErrorMsgForSignInDisplayed();
        Check.checkTrue(loginInvalidCredentialErrorMsg, "Invalid Login Credentials error message is displayed");
    }


}