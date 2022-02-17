package Pages.Hotels;

import Helper.Misc;
import Pages.WebCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignUpPage extends WebCommands {

    By loginEmailAddressLocator = By.id("sign-up-email");
    By loginEmailPasswordLocator = By.id("sign-up-password");
    By hotelFirstNameLocator = By.id("sign-up-first-name");
    By hotelLastNameLocator = By.id("sign-up-last-name");
    By invalidLoginEmailErrorLocator = By.xpath("//small[text()='Please check your email address']");
    By invalidLoginPasswordLessErrorLocator = By.xpath("//small[text()='Please enter a password containing at least six characters']");
    By invalidLoginPasswordMoreErrorLocator = By.xpath("//small[text()='Your password cannot be more than 20 characters long.']");
    By invalidLoginFirstNameErrorLocator = By.xpath("//small[text()='Please check your first name']");
    By invalidLoginLastNameErrorLocator = By.xpath("//small[text()='Please check your last name']");
    By createAccountLocator=By.xpath("//button[@id='signup-button']");
    By signUpTickMarkLocatorForEmail=By.xpath("//label[@for='sign-up-email']/parent::*");
    By signUpTickMarkLocatorForPassword=By.xpath("//label[@for='sign-up-password']/parent::*");
    By signUpTickMarkLocatorForFirstName=By.xpath("//label[@for='sign-up-first-name']/parent::*");
    By signUpTickMarkLocatorForLastName=By.xpath("//label[@for='sign-up-last-name']/parent::*");

    // type in login email address box
    public void enterLoginEmailAddress(String loginEmail) {
        type(loginEmailAddressLocator, loginEmail);
        clickThis(createAccountLocator);
        Misc.sleep(15);
    }

    // type in login email password box
    public void enterLoginEmailPassword(String loginPassword) {
        type(loginEmailPasswordLocator, loginPassword);
clickThis(createAccountLocator);
        Misc.sleep(4);
    }

    // type in signup firstname
    public void enterSignUpFirstName(String firstName) {
        type(hotelFirstNameLocator, firstName);
clickThis(createAccountLocator);
        Misc.sleep(4);
    }

    // type in signup lastname
    public void enterSignUpLastName(String lastName) {
        type(hotelLastNameLocator, lastName);
clickThis(createAccountLocator);
        Misc.sleep(4);
    }

    public void clearEmail(){
        clear(loginEmailAddressLocator);
    }

    public void clearPassword(){
        clear(loginEmailPasswordLocator);
    }

    public void clearFirstName(){
        clear(hotelFirstNameLocator);
    }

    public void clearLastName(){
        clear(hotelLastNameLocator);
    }

    public boolean isInvalidLoginEmailErrorForSignUpDisplayed() {
        return isWebElementDisplayed(invalidLoginEmailErrorLocator);
    }
    public boolean isInvalidLoginPasswordLessErrorForSignUpDisplayed() {
        return isWebElementDisplayed(invalidLoginPasswordLessErrorLocator);
    }
    public boolean isInvalidLoginPasswordMoreErrorForSignUpDisplayed() {
        return isWebElementDisplayed(invalidLoginPasswordMoreErrorLocator);
    }
    public boolean isInvalidLoginFirstNameErrorForSignUpDisplayed() {
        return isWebElementDisplayed(invalidLoginFirstNameErrorLocator);
    }
    public boolean isInvalidLoginLastNameErrorForSignUpDisplayed() {
        return isWebElementDisplayed(invalidLoginLastNameErrorLocator);
    }

public String verifyEmailTickMark() {
    WebElement emailTickMark = getElement(signUpTickMarkLocatorForEmail);
    String emailTicketValue=emailTickMark.getAttribute("class");
    return emailTicketValue;
}

    public String verifyPasswordTickMark(){
        WebElement passwordTickMark = getElement(signUpTickMarkLocatorForPassword);
        String passwordTickValue=passwordTickMark.getAttribute("class");
        return passwordTickValue;

    }

    public String verifyFirstNameTickMark() {
        WebElement firstNameTickMark = getElement(signUpTickMarkLocatorForFirstName);
        String firstNameTicketValue=firstNameTickMark.getAttribute("class");
        return firstNameTicketValue;
    }
    public String verifyLastNameTickMark() {
        WebElement lastNameTickMark = getElement(signUpTickMarkLocatorForLastName);
        String lastNameTicketValue=lastNameTickMark.getAttribute("class");
        return lastNameTicketValue;
    }
}

