package StepDefinition;

import Helper.Check;
import Helper.DateUtil;
import Pages.Facebook.LaunchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Date;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

public class FacebookLoginSD {

    LaunchPage launchPage = new LaunchPage();

    @When("^I enter '(.+)' as login email$")
    public void enterEmail(String inputEmail) {
        launchPage.enterLoginEmail(inputEmail);
    }

    @When("^I enter '(.+)' as login password$")
    public void enterPassword(String inputPwd) {
        launchPage.enterLoginPassword(inputPwd);
    }

    @When("^I click on login button in facebook page$")
    public void clickLogin() {
        launchPage.clickLoginButton();
    }


    @Then("^I verify error message 'find your account and log in' is displayed$")
    public void verifyLoginErrorMessage() {

        Check.checkTrue(launchPage.isInvalidLoginErrorDisplayed(),
                "Invalid Login error is NOT displayed");
    }


    //////////////////////////////////////////////////////////////

    @When("^I click on Create new account$")
    public void clickCreateNewAccount() {
        launchPage.clickCreateNewAccountButton1();
    }

    @When("^I enter '(.+)' as First Name$")
    public void enterFirstname(String firstName) {
        launchPage.enterFirstName(firstName);
    }

    @When("^I enter '(.+)' as Last Name$")
    public void enterLastname(String lastName) {
        launchPage.enterLastName(lastName);
    }

    @When("^I enter '(.+)' as Mobile number or email$")
    public void entermobileNumberEmail(String mobileNumberEmail) {
        launchPage.enterMobileNumberEmail(mobileNumberEmail);
    }

    @When("^I enter '(.+)' as new Password$")
    public void enterNewPassword(String NewPassword) {
        launchPage.enterNewPassword(NewPassword);
    }

    @When("I enter '(.+)' as Birthday Month$")
    public void selectBirthdayMonth(String month) {
        launchPage.selectBirthdayMonth(month);
    }

    @When("I enter '(.+)' as Birthday Date$")
    public void selectBirthdayDate(String date) {
        launchPage.selectBirthdayDate(date);
    }

    @When("I enter '(.+)' as index value for Birthday Year$")
    public void selectBirthdayYear(int indexValue) {
        launchPage.selectBirthdayYear(indexValue);
    }


    @When("^I click on Sign Up button without entering gender details$")
    public void clickSignUpButton() {
        launchPage.clickSignUpButton();
    }

    @Then("^I verify error message 'Please choose a gender. You can change who can see this later.' is displayed$")
    public void verifyGenderErrorMsg() {
        Check.checkTrue(launchPage.isGenderLoginErrorDisplayed(), "Please select gender error msg is NOT displayed");

    }

    /////////////////////////////////////////////////////////////////



    @When("^I verify Birthday Month in DropDown of Sign Up Page$")
    public String verifyBirthdayMonth() {
        String birthDayMonth = launchPage.getTextFromWebElementBirthdayMonth();
     //   System.out.println("the selected BirthMonth from SignUp page is :" + birthDayMonth);
        return launchPage.getTextFromWebElementBirthdayMonth();

    }


    @When("^I verify Birthday Day in DropDown of Sign Up Page$")
    public String verifyBirthdayDay() {
    String birthDate=launchPage.getTextFromWebElementBirthdayDate();
       // System.out.println("the selected BirthDate from SignUp page is :"+birthDate);
        return birthDate;

        }


    @When("^I verify Birthday Year in DropDown of Sign Up Page$")
    public String  verifyBirthdayYear() {
        String birthYear = launchPage.getTextFromWebElementBirthdayYear();
        //System.out.println("the selected BirthYear from SignUp page is :"+birthYear);
    return launchPage.getTextFromWebElementBirthdayYear();}

    @Then("^I verify that current date is displayed in Birthday field of Sign Up Page$")
    public void verifyBirthdayFieldDate()
    {
        System.out.println("The Selected Month in Birthday field is :"+verifyBirthdayMonth());
        System.out.println("The Selected Date in Birthday field is :"+verifyBirthdayDay());
        System.out.println("The Selected Year in Birthday field is :"+verifyBirthdayYear());

  Check.checkEquals(verifyBirthdayMonth(),(DateUtil.getCurrentDateMonth()),"Birthday Month is not equal");
      Check.checkEquals(verifyBirthdayDay(),(DateUtil.getCurrentDateDate()),"Birthday Date is not equal");
     Check.checkEquals(verifyBirthdayYear(),(DateUtil.getCurrentDateYear()),"Birthday Year is not equal");

    }

}