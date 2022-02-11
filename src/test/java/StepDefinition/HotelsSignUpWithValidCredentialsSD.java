package StepDefinition;


import Helper.Check;
import Pages.Hotels.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class HotelsSignUpWithValidCredentialsSD {

    SignUpPage sp = new SignUpPage();


    @And("^I enter '(.+)' as valid login email in the hotels webpage$")
    public void enterValidLoginEmailAddressInSignUp(String inputEmail)
    {
    sp.enterLoginEmailAddress(inputEmail);
    }

    @Then("^I verify that tick mark is displayed for valid email address in the SignUp page$")
    public void verifyTickMarkForValidLoginEmailAddress()
    {
String emailTickMarkValue=sp.verifyEmailTickMark();
Check.checkTrue(emailTickMarkValue.equalsIgnoreCase("form-element valid"),"Email tick mark is not displayed");
    }


    @And("^I enter '(.+)' as valid login password in the hotels webpage$")
    public void enterValidEmailPassWordInSignUp(String inputPassword)
    {
        sp.enterLoginEmailPassword(inputPassword);
    }

    @Then("^I verify that tick mark is displayed for valid password in the SignUp page$")
    public void verifyTickMarkForValidLoginPassword()
    {
        String passwordTickMarkValue=sp.verifyPasswordTickMark();
        Check.checkTrue(passwordTickMarkValue.equalsIgnoreCase("form-element valid"),"Password tick mark is not displayed");
    }


    @And("^I enter '(.+)' as valid first name in the hotels webpage$")
    public void enterValidFirstNameInSignUp(String inputFirstName)
    {
        sp.enterSignUpFirstName(inputFirstName);
    }

    @Then("^I verify that tick mark is displayed for valid first name in the SignUp page$")
    public void verifyTickMarkForValidFirstName()
    {
        String firstNameTickMarkValue=sp.verifyFirstNameTickMark();
        Check.checkTrue(firstNameTickMarkValue.equalsIgnoreCase("form-element valid"),"First Name tick mark is not displayed");
    }


    @And("^I enter '(.+)' as valid last name in the hotels webpage$")
    public void enterValidLastNameInSignUp(String inputLastName)
    {
        sp.enterSignUpLastName(inputLastName);
    }
    @Then("^I verify that tick mark is displayed for valid last name in the SignUp page$")
    public void verifyTickMarkForValidLastName()
    {
        String lastNameTickMarkValue=sp.verifyLastNameTickMark();
        Check.checkTrue(lastNameTickMarkValue.equalsIgnoreCase("form-element valid"),"Last Name tick mark is not displayed");
    }

    }



