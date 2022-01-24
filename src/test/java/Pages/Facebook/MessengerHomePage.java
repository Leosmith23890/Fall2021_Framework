package Pages.Facebook;

import Pages.WebCommands;
import Web.UseDriver;
import org.openqa.selenium.By;

public class MessengerHomePage extends WebCommands {

    By messengerLinkLocator = By.linkText("Messenger");
    By messengerLogInButtonLocator = By.id("loginbutton");
    By messengerContinueButtonLocator =By.id("loginbutton");
    By keepMeSignedInButtonLocator=By.xpath(("//input[@name='persistent']/following-sibling::span"));

    // to click the Messenger link
    public void clickMessengerLink()
    {
        clickThis(messengerLinkLocator);
    }


    //to click Log in button in messenger page
    public void clickMessengerLogInButton()
    {
        clickThis(messengerLogInButtonLocator);
    }

    //to verify Continue button is displayed in messenger page
    public boolean isContinueButtonDisplayed()
    {
        return isWebElementDisplayed(messengerContinueButtonLocator);
    }

    //to verify Continue button is enabled in messenger page
    public boolean isContinueButtonEnabled()
    {
        return isWebElementEnabled(messengerContinueButtonLocator);
    }

    //to verify KeepMeSignedIn button is selected  in messenger page
    public boolean isKeepMeSignedInButtonSelected()
    {
        return isWebElementSelected(keepMeSignedInButtonLocator);
    }

    //to verify error message
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
        }
    }}