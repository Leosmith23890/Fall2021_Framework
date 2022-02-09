package StepDefinition;


import Helper.Check;
import Pages.Hotels.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class HotelsSignUpInvalidDataErrorMessageSD {

    SignUpPage sp = new SignUpPage();


    @And("^I enter '(.+)' as login email in the hotels webpage$")
    public void enterLoginEmailAddress(String inputEmail)
    {
    sp.enterLoginEmailAddress(inputEmail);
    }

    @Then("^I verify the error message 'Please check your email address' in the webpage$")
    public void verifyLoginEmailErrorMessage()
    {
        boolean loginEmailErrorMsg= sp.isInvalidLoginEmailErrorForSignUpDisplayed();
        Check.checkTrue(loginEmailErrorMsg,"Invalid Login Email error message is displayed");
    }


    @And("^I enter '(.+)' as login password with password less than 6-characters$")
    public void enterEmailPassWordWithLessCharacters(String inputPassword)
    {
        sp.enterLoginEmailPassword(inputPassword);
    }

    @Then("^I verify the error message 'Please enter a password containing at least six characters' in the webpage$")
    public void verifyLoginLessPasswordErrorMessage()
    {

        boolean loginEmailPasswordLessErrorMsg= sp.isInvalidLoginPasswordLessErrorForSignUpDisplayed();
        Check.checkTrue(loginEmailPasswordLessErrorMsg,"Invalid Login Email less character password error message is displayed");
    }

    @And("^I enter '(.+)' as login password with password greater than 20-characters$")
    public void enterEmailPassWordWithMoreCharacters(String inputPassword)
    {

        sp.enterLoginEmailPassword(inputPassword);
    }

    @Then("^I verify the error message 'Your password cannot be more than 20 characters long.' in the webpage$")
    public void verifyLoginMorePasswordErrorMessage()
    {
        boolean loginEmailPasswordMoreErrorMsg= sp.isInvalidLoginPasswordMoreErrorForSignUpDisplayed();
        Check.checkTrue(loginEmailPasswordMoreErrorMsg,"Invalid Login Email more character password error message is displayed");
    }



    @And("^I enter '(.+)' as first name in the hotels webpage$")
    public void enterSignUpFirstName(String inputFirstName)
    {
        sp.enterSignUpFirstName(inputFirstName);
    }

    @Then("^I verify the error message 'Please check your first name' in the webpage$")
    public void verifyLoginFirstNameErrorMessage()
    {
        boolean loginFirstNameErrorMsg= sp.isInvalidLoginFirstNameErrorForSignUpDisplayed();
        Check.checkTrue(loginFirstNameErrorMsg,"Invalid First name error message is displayed");

    }

    @And("^I enter '(.+)' as last name in the hotels webpage$")
    public void enterSignUpLastName(String inputLastName)
    {
        sp.enterSignUpLastName(inputLastName);
    }
    @Then("^I verify the error message 'Please check your last name' in the webpage$")
    public void verifyLoginLastNameErrorMessage()
    {
        boolean loginLastNameErrorMsg= sp.isInvalidLoginLastNameErrorForSignUpDisplayed();
        Check.checkTrue(loginLastNameErrorMsg,"Invalid Last name error message is displayed");
    }

    }



