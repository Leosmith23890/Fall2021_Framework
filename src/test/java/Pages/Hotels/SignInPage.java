package Pages.Hotels;


import Helper.Misc;
import Pages.WebCommands;
import org.openqa.selenium.By;

import java.util.NoSuchElementException;

public class SignInPage extends WebCommands {

    By signInHeaderButtonLocator1=By.id("header-sign-in");
    By signInHeaderButtonLocator2=By.xpath("//a[text()='Sign in']");
    By SignInEmailLocator=By.xpath("//input[@id='sign-in-email']");
    By SignInPasswordLocator=By.xpath("//input[@id='sign-in-password']");
    By signInButtonLocator=By.id("sign-in-button");
    By invalidCredentialsErrorLocator=By.xpath("//*[contains(text(),'We don’t recognize the email and password combination you’ve entered')]");
    public void clickSignInHeaderButton(){

       try{
           clickThis(signInHeaderButtonLocator2);
       }
       catch(NoSuchElementException e){
           clickThis(signInHeaderButtonLocator1);
       }
    }

    public void clickSignInButton(){
        clickThis(signInButtonLocator);
    }

    public void enterInValidLoginEmailAddress(String inputEmail) {
        type(SignInEmailLocator, inputEmail);
        Misc.sleep(4);
    }

    public void enterInValidLoginPassword(String inputPassword) {
        type(SignInPasswordLocator, inputPassword);
        Misc.sleep(4);
    }

    public boolean isInvalidCredentialsErrorMsgForSignInDisplayed(){
        return  isWebElementDisplayed(invalidCredentialsErrorLocator);
    }
}

