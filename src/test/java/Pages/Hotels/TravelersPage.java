package Pages.Hotels;

import Helper.Misc;
import Pages.WebCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;

public class TravelersPage extends WebCommands {

    By travelerLocator = By.xpath("//button[@data-testid='travelers-field-trigger']");
    By addAdultLocator2=By.xpath("//*[text()='Increase adults in room 1']");
    By addAdultLocator3=By.xpath("//*[starts-with(@aria-labelledby,'uitk-step-increase-adults')]");
    By addChildLocator2=By.xpath("//*[text()='Increase children in room 1']");
    By addChildLocator3=By.xpath("//*[starts-with(@aria-labelledby,'uitk-step-increase-children')]");
    By doneLocator = By.xpath("//*[@data-testid='guests-done-button']");
    By hotelLastNameLocator = By.id("sign-up-last-name");
    By child1InputLocator=By.id("child-age-input-0-0");
    By child2InputLocator=By.id("child-age-input-0-1");
By travelerLocatorText=By.xpath("//button[@data-testid='travelers-field-trigger']");


public void clickTravelerButton(){
    clickThisByLocator(travelerLocator);
    Misc.sleep(4);
}

    public void clickAdultIncrementLocator(){
        try {
            clickThis(addAdultLocator3);
            clickThis(addAdultLocator3);
            clickThis(addAdultLocator3);
            clickThis(addAdultLocator3);
        }
        catch(ElementClickInterceptedException e){
            clickThis(addAdultLocator2);
            clickThis(addAdultLocator2);
            clickThis(addAdultLocator2);
            clickThis(addAdultLocator2);
        }
    }

    public void clickChildIncrementLocator(){

        try {
            clickThis(addChildLocator3);
            clickThis(addChildLocator3);
        }
        catch(ElementClickInterceptedException e){
            clickThis(addChildLocator2);
            clickThis(addChildLocator2);
        }
    }

    public void clickChild1Input(){
        clickThisByLocator(child1InputLocator);
    }

    public void selectChild1Age(){
    selectFromDropdown(child1InputLocator,"4");
    }

    public void clickChild2Input(){
        clickThis(child2InputLocator);
    }

    public void selectChild2Age(){
        selectFromDropdown(child2InputLocator,"2");
    }

    public void clickTravelersDoneButton(){
        clickThis(doneLocator);
    }

public String getTravelersText(){
return getElement(travelerLocatorText).getText();
}


    ///////////////////////////////
    By guestLocator11 = By.xpath("//span[text()='Guests']']");
    By addAdultLocator211=By.xpath("//*[text()='Increase adults in room 1']");
    By addChildLocator11=By.xpath("//*[text()='Increase children in room 1']");
    By doneLocator11 = By.xpath("//*[@data-testid='guests-done-button']");
    By hotelLastNameLocator11 = By.id("sign-up-last-name");
    By child1InputLocator11=By.id("child-age-input-0-0");
    By child2InputLocator11=By.id("child-age-input-0-1");
    By travelerLocatorText11=By.xpath("//button[@data-testid='travelers-field-trigger']");

}