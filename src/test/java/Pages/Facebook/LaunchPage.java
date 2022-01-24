package Pages.Facebook;

import Pages.WebCommands;
import Web.UseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LaunchPage extends WebCommands {


    // Locators of elements on Launch Page
    By loginEmailLocator = By.id("email");
    By loginPasswordLocator = By.id("pass");
    By loginButtonLocator = By.xpath("//button[@name='login']");
    By createNewAccLocator = By.linkText("Create new account");
    By messengerLocator = By.linkText("Messenger");
    By allLinksLocator = By.tagName("a");
    By facebookPayLocator = By.linkText("Facebook Pay");
    By invalidLoginErrorLocator = By.xpath("//div[text()='The email or mobile number you entered isn’t connected to an account. ']");
    By createNewAccountLocator = By.xpath("//a[text()='Create new account' or text()='Create New Account']");
    By firstNameLocator = By.name("firstname");
    By lastNameLocator = By.name("lastname");
    By mobileNumberEmailLocator = By.name("reg_email__");
    By newPasswordLocator = By.name("reg_passwd__");
    By birthdayMonthLocator = By.id("month");
    By birthdayDateLocator = By.id("day");
    By birthdayYearLocator = By.id("year");
    By signUpLocator = By.name("websubmit");
    By genderErrorMsgLocator = By.xpath("//div[text()='Please choose a gender. You can change who can see this later.']");
    By birthdayMonthLocatorText=By.xpath("//select[@id='month' and contains(text(),'Jan')]");
    // Methods to interact with elements of Launch Page

    //launch facebook

    // type in login emailBox
    public void enterLoginEmail(String loginEmail) {
        type(loginEmailLocator, loginEmail);
    }

    // type in signup firstname
    public void enterFirstName(String firstName) {
        type(firstNameLocator, firstName);
    }

    // type in signup lastname
    public void enterLastName(String lastName) {
        type(lastNameLocator, lastName);
    }

    // type in signup mobileNumberEmail
    public void enterMobileNumberEmail(String mobileNumberEmail) {
        type(mobileNumberEmailLocator, mobileNumberEmail);
    }

    // type in signup newPassword
    public void enterNewPassword(String newPassword) {
        type(newPasswordLocator, newPassword);
    }

    // click facebook signup button
    public void clickSignUpButton() {
        clickThis(signUpLocator);
    }

    // to select Birthday month
    public void selectBirthdayMonth(String month) {
        selectFromDropdownMonth(birthdayMonthLocator, month);
    }

    // to select Birthday Date
    public void selectBirthdayDate(String date) {
        selectFromDropdownDate(birthdayDateLocator, date);
    }

    // to select Birthday Year
    public void selectBirthdayYear(int indexValue) {
        selectFromDropdownYear(birthdayYearLocator, indexValue);
    }

    public boolean isGenderLoginErrorDisplayed() {
        return isWebElementDisplayed(genderErrorMsgLocator);
    }


    // if login emailBox is enabled
    public boolean isLoginEmailBoxEnabled() {
        return getElement(loginEmailLocator).isEnabled();
    }

    // type in login passwordBox
    public void enterLoginPassword(String loginPwd) {
        type(loginPasswordLocator, loginPwd);
    }
    // if login passwordBox is enabled

    // click login button
    public void clickLoginButton() {
        clickThis(loginButtonLocator);
    }

    //to click create new account
    public void clickCreateNewAccountButton1() {
        clickThis(createNewAccountLocator);
    }

    //to verify error message
    public void verifyLoginError(String errorMsg) {
        switch (errorMsg) {
            case "The email or mobile number you entered isn’t connected to an account. Find your account and log in.":
                // verify incorrect email or password msg is displayed
                break;
            case "enter credentials again":
                // verify enter credentials again msg is displayed
                break;
            default:
                System.out.println("Not implemented for " + errorMsg + " msg");
        }
    }

    public boolean isInvalidLoginErrorDisplayed() {
        return isWebElementDisplayed(invalidLoginErrorLocator);
    }


    // to get number of links
    public int getNumberOfLinks() {
        List<WebElement> allLinks = getElements(allLinksLocator);
        return allLinks.size();
    }

    public void clickFacebookPay() {
        clickThis(facebookPayLocator);
    }


    public void clickCreateNewAccountButton() {
        clickThis(createNewAccLocator);
    }

    public String getTextFromWebElementBirthdayMonth() {
        String birthMonth = getTextFromWebElement(birthdayMonthLocator);
        return birthMonth;
    }

    public String getTextFromWebElementBirthdayYear() {
        String birthYear= getTextFromWebElement(birthdayYearLocator);
        return birthYear;
    }

    public String getTextFromWebElementBirthdayDate() {
        String birthDate= getTextFromWebElement(birthdayDateLocator);
        return birthDate;
    }

    public void verifyBirthdayFieldDate(){

    }

}
