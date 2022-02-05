package Pages.Hotels;

import Helper.Check;
import Helper.DateUtil;
import Helper.Misc;
import Pages.WebCommands;

import Web.UseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.testng.collections.Lists;

import java.lang.reflect.Array;
import java.util.*;

public class LaunchPage<CheckinLocatorTwo> extends WebCommands {

    By searchTabLocator = By.xpath("//button[contains(@data-stid, 'destination-menu')]");
    By destinationSearchLocator1 = By.xpath("//input[@data-stid='sqm-destination']");
    By destinationSearchLocator2 = By.xpath("//input[@aria-label='Going to']");
    By destinationSearchLocator3=By.xpath("//button[@aria-label='Going to']");
    By destinationSearchLocator4=By.xpath("//input[@aria-label='Destination']");
    By destinationNewSearchLocator = By.xpath("//button[@data-stid='location-field-destination-dialog-trigger'");
    By searchBoxLocator = By.id("location-field-destination");
    By allSuggestionsLocator = By.xpath("//ul[contains(@data-stid, 'destination-results')]//strong");
    By checkinLocator1 = By.xpath("//span[text()='Check in' or text()='Check-in']");
    By checkinLocator2 = By.xpath("//button[starts-with(@aria-label,'Check-in')]");
    By checkOutDateLocator1 = By.xpath("//span[text()='Check out' or text()='Check-out']");
    By checkOutDateLocator2 = By.xpath("//button[starts-with(@aria-label,'Check-out')]");
    String[] dateFields = DateUtil.addDaysToTomorrow(1);
    By datesLocator = By.xpath("//h2[text()='" + dateFields[1] + " " + dateFields[2] + "']/following-sibling::table//button");
    String[] checkoutDateFields = DateUtil.addDaysToTomorrow(6);
    By checkoutDatesLocator = By.xpath("//h2[text()='" + checkoutDateFields[1] + " " + checkoutDateFields[2] + "']/following-sibling::table//button");
    By searchButtonHotelLocator = By.xpath("//button[@aria-label='Search']");
    By priceOptionLocator1 = By.xpath("//button[@aria-label='Price']");
    By priceOptionLocator2 = By.xpath("//button[contains(text(),'Price')]");
    By lowToHighPriceOptionLocator = By.xpath("//button[@value='PRICE']");
    By lowPriceHotel = By.xpath("//div[@id='0']//a");
    By lowPriceHotelPriceLocator = By.xpath("//span[@aria-label='Current price: $35']");
    By applyButtonLocator = By.xpath("//button[@aria-label='Apply']");
    By allFilterLocator = By.xpath("//legend[text()='Popular filters']/following::button");
    By allStarRatingLocator = By.xpath("//legend[text()='Star rating']/following::div//label");
    String[] checkInDateBoraFields = DateUtil.addDaysToToday(56);
    By checkInDateBoraLocator = By.xpath("//h2[text()='" + checkInDateBoraFields[1] + " " + checkInDateBoraFields[2] + "']/following-sibling::table//button");
    String[] checkOutDateBoraFields = DateUtil.addDaysToToday(65);
    By checkOutDateBoraLocator = By.xpath("//h2[text()='" + checkOutDateBoraFields[1] + " " + checkOutDateBoraFields[2] + "']/following-sibling::table//button");
    By pageSliderLocator=By.xpath("//button[@aria-label='Next']");
    By doneLocator=By.xpath("//button[@data-stid='apply-date-picker']");
By searchNewButtonLocator=By.xpath("//button[@data-testid='submit-button']");
By textHotelPageBottomLocator=By.xpath("//span[text()='Tell us how we can improve our site']");
By shareFeedBackLocator=By.xpath("//a[text()='Share feedback']");
By changeDateButtonLocator=By.xpath("//button[@aria-label='Change dates']");
By accommodationLocator=By.xpath("//span[text()='Accommodation type']//following::div//button");
By propertyNameLocator=By.xpath("//input[@placeholder='Property name']");
By signInLocator=By.xpath("//span[text()='Sign in']");
By signUpLocator=By.xpath("//a[text()='Sign up']");
By termsAndConditionsLocator=By.xpath("//a[text()='Terms and Conditions']");
By privacyStatementLocator=By.xpath("//a[text()='Privacy Statement']");
By allLinkLocator=By.xpath("//a[@class='popup-trigger']");
By backButtonCalenderLocator=By.xpath("//button[@aria-label='Previous']");
    String[] currentDateFields = DateUtil.addDaysToTomorrow(1);
    By currentMonthCalenderLocator = By.xpath("//h2[text()='" + dateFields[1] + " " + dateFields[2] + "']/following-sibling::table//button");
By adultUpdatedCountLocator=By.xpath("//input[@data-testid='adults-input']");


public List<WebElement> selectCurrentMonthCalender() {
    List<WebElement> allDatesOfCurrentMonth = getElements(currentMonthCalenderLocator);

return allDatesOfCurrentMonth;
}


    public void clickDestinationPlace() {
        try {
            clickThis(destinationSearchLocator4);
          //  System.out.println("loc1");
        } catch (NoSuchElementException e) {
            clickThis(destinationSearchLocator3);
           // System.out.println("loc2");
        }
        Misc.sleep(2);

    }
    public void clickBackButtonCalender(){
        clickThis(backButtonCalenderLocator);
    }


    public void propertyLocator(){
        clickThis(propertyNameLocator);
    }

    public void clickSignIn(){
        clickThis(signInLocator);
    }
    public void clickSignUp(){
        clickThis(signUpLocator);
    }

    public String clickTermsAndConditions() {
        List<WebElement> allLinksWeb = getElements(allLinkLocator);
        System.out.println("Total no of links Available: " + allLinksWeb.size());
        int k = allLinksWeb.size();
        Set<String> allNewHandles = new HashSet<>();
        String title = "";
        System.out.println("List of links Available: " + k);
        for (int i = 0; i < k; i++) {
            if (allLinksWeb.get(i).getAttribute("href").contains("customer_care/terms_conditions")){
                {
                    String link = allLinksWeb.get(i).getAttribute("href");
                    System.out.println("the link name is siva:" + link);
                    Misc.sleep(2);
                    UseDriver.openUrl(link);
                  title= UseDriver.getDriver().getTitle();
                    System.out.println("The title value siva:" + title);
                    Misc.sleep(2);
                }
            }}
        for (int i = 0; i < k; i++) {
            if ((allLinksWeb.get(i).getAttribute("href").contains("customer_care/privacy"))) {
                {
                    String link = allLinksWeb.get(i).getAttribute("href");
                    System.out.println("the link name is siva:" + link);
                    Misc.sleep(2);
                    UseDriver.openUrl(link);
                    title= UseDriver.getDriver().getTitle();
                    System.out.println("The title value siva:" + title);
                    Misc.sleep(2);
                }
        }


    }
        allNewHandles=UseDriver.getDriver().getWindowHandles();
        System.out.println("size:"+allNewHandles.size());
        System.out.println("siva allhanddd:"+allNewHandles);
        return title;
    }


    public String getWindowHandle(){
        String launchWindowHandle=getHandle();
        return launchWindowHandle;
    }
    public Set<String> getWindowHandles(){
        return getAllHandles();
    }

    public Set<String> getWindowHandlesUrl(){
        return getAllHandles();
    }

    public void switchToHandleWindow(String handle){
        switchToHandle(handle);
    }

    public List<String> getToSwitchToAnotherHandle(String currentWindowHandle) {
        Set<String> hotelCareHandles = getWindowHandles();
        String mainWindowHandle = currentWindowHandle;
        System.out.println("The set of hotelCare Handles are :" + hotelCareHandles);
        System.out.println("the size of hotelCare Handles is :" + hotelCareHandles.size());
        String launchWindowHandle = currentWindowHandle;
        List<String> handleUrlName = new ArrayList<>();
        for (String handle : hotelCareHandles) {
            if (!handle.equals(mainWindowHandle)) {
                String newHandle = handle;
                System.out.println("THE handle is :" + handle);
                switchToHandleWindow(handle);
                System.out.println("The new handle after switch value is :" + newHandle);
                Misc.sleep(2);
                String handleUrl = getWebPageUrl();
            }
            handleUrlName.add(getWebPageUrl());

        }
        return handleUrlName;
    }



    public String getTitleOfWebPage(){
        String webPageTitle=getWebPageTitle();
        return webPageTitle;
    }
    public void clickTermsAndConditionLink(){
        clickThis(termsAndConditionsLocator);
    }
    public void clickPrivacyStatementLink(){
        clickThis(privacyStatementLocator);
    }


    public void enterPropertyName(String text){
        type(propertyNameLocator, text);
    }
    public void enterDestinationPlace(String text) {
        try{
            type(destinationSearchLocator4, text);
        }
        catch (NoSuchElementException e){
            type(destinationSearchLocator3, text);
        }
    }

    public boolean isElementDisplayed(){
        Boolean elementDisplay=isWebElementDisplayed(backButtonCalenderLocator);
        return elementDisplay;
    }

    public boolean isElementEnabled(){
        Boolean elementEnable=getElement(backButtonCalenderLocator).getAttribute("aria-disabled").equalsIgnoreCase("true");
        return elementEnable;
    }

    public void selectSDestFromSearchSuggestions(String text) {
        try{
            clickOneOfElementsUsingText(destinationSearchLocator4, text);
        }
        catch (NoSuchElementException e){
            clickOneOfElementsUsingText(destinationSearchLocator3, text);
        }
    }
public void webPageBottom(){
    pageScrollToBottom();
}
    public void clickCheckIn() {
        try {
            clickThis(checkinLocator1);
           // System.out.println("checkin");
        } catch (ElementClickInterceptedException e) {
            clickThis(checkinLocator2);
           // System.out.println("checkin2");
        }
        Misc.sleep(2);

    }

    public void clickPageSlider(){
        clickThis(pageSliderLocator);
    }

    public void selectAprilCheckInDate() {
        List<WebElement> allDates = getElements(checkInDateBoraLocator);

        for (WebElement date : allDates) {
            String dateValue = date.getText();
            String dateAttributeValue = date.getAttribute("data-day");
            if (dateAttributeValue == null) {
                dateAttributeValue = "";
            }
            if (dateValue.equalsIgnoreCase(checkInDateBoraFields[0]) || dateAttributeValue.equalsIgnoreCase(checkInDateBoraFields[0])) {
                date.click();
                //System.out.println("date done");
            }
            if (dateValue.equalsIgnoreCase(checkInDateBoraFields[0]) || dateAttributeValue.equalsIgnoreCase(checkInDateBoraFields[0])) {
                date.click();
                //System.out.println("date done");
            }
        }
    }

    public void clickDoneButton(){
        clickThis(doneLocator);
    }

    public void clickSearchNewButton(){
        clickThis(searchNewButtonLocator);
    }

    public WebElement webElementScrollToBottom(){
return getWebElementByScroll(changeDateButtonLocator);
    }

    public String textAtTheHotelPageBottom(){
       WebElement textAtBottom=getElement(textHotelPageBottomLocator);
       String textValue=textAtBottom.getText();
       return textValue;
    }

    public String changeDateAtTheHotelPageBottom(){
        WebElement textAtBottom=getElement(changeDateButtonLocator);
        String buttonTextValue=textAtBottom.getText();
        return buttonTextValue;
    }
    public WebElement changeDateButtonDisplay(){
        WebElement changeDateButton=getElementWithScroll(changeDateButtonLocator);
        return changeDateButton;
    }

    public void accommodationButtonDisplay(){
        WebElement accommodationButton=getTimeMachineDateByScroll(accommodationLocator);
                //getElementWithScroll(accommodationLocator);
        accommodationButton.click();
    }

    public WebElement shareFeedBack(){
        WebElement shareFeedBackButton=getElement(shareFeedBackLocator);
        return shareFeedBackButton;
    }

    public void selectTomorrowCheckInDate() {
        List<WebElement> allDates = getElements(datesLocator);

        for (WebElement date : allDates) {
            String dateValue = date.getText();
            String dateAttributeValue = date.getAttribute("data-day");
            if (dateAttributeValue == null) {
                dateAttributeValue = "";
            }
            if (dateValue.equalsIgnoreCase(dateFields[0]) || dateAttributeValue.equalsIgnoreCase(dateFields[0])) {
                date.click();
                //System.out.println("date done");
            }
            if (dateValue.equalsIgnoreCase(dateFields[0]) || dateAttributeValue.equalsIgnoreCase(dateFields[0])) {
                date.click();
                //System.out.println("date done");
            }
        }
    }

    public void clickCheckOut() {
        try {
            clickThis(checkOutDateLocator1);
            //System.out.println("checkout");
        } catch (ElementClickInterceptedException e) {
            clickThis(checkOutDateLocator2);
           // System.out.println("checkout2");
        }
        Misc.sleep(2);

    }


    public void selectCheckOutDate() {

        List<WebElement> allCheckoutDates = getElements(checkoutDatesLocator);
        for (WebElement date : allCheckoutDates) {
            String dateValue = date.getText();
            String dateAttributeValue = date.getAttribute("data-day");
            if (dateAttributeValue == null) {
                dateAttributeValue = "";
            }
            if (dateValue.equalsIgnoreCase(checkoutDateFields[0]) || dateAttributeValue.equalsIgnoreCase(checkoutDateFields[0])) {
                date.click();
               // System.out.println("checkout date done");
                break;
            }
        }
    }


    public void selectAprilCheckOutDate() {
        List<WebElement> allCheckoutDates = getElements(checkOutDateBoraLocator);
        for (WebElement date : allCheckoutDates) {
            String dateValue = date.getText();
            String dateAttributeValue = date.getAttribute("data-day");
            if (dateAttributeValue == null) {
                dateAttributeValue = "";
            }
            if (dateValue.equalsIgnoreCase(checkOutDateBoraFields[0]) || dateAttributeValue.equalsIgnoreCase(checkOutDateBoraFields[0])) {
                date.click();
                // System.out.println("checkout date done");
                break;
            }
        }
    }

    public void clickApplyButton() {
        clickThis(applyButtonLocator);
        //System.out.println("apply");
    }

    public void clickSearchHotelButton() {
        clickThis(searchButtonHotelLocator);
        //System.out.println("search button");
    }

    public void clickPriceOptionButton() {
        try {
            clickThis(priceOptionLocator1);
            //System.out.println("price1");
        } catch (ElementClickInterceptedException e) {
            clickThis(priceOptionLocator2);
           // System.out.println("price2");
        }
        Misc.sleep(2);

    }

    public void clickLowToHighSortOption() {
        clickThis(lowToHighPriceOptionLocator);
        //System.out.println("sort");
    }

    public String getPriceFromPriceOption() {
        clickThis(lowPriceHotel);
        //System.out.println("priceClick");
        String lowPrice = getElement(lowPriceHotelPriceLocator).getText();
        return lowPrice;
    }

    public void clickSearchTab() {
        clickThis(searchTabLocator);
    }

    public void enterSearchText(String searchText) {
        type(searchBoxLocator, searchText);
    }

    public void selectFromSearchSuggestions(String destinationName) {
        clickOneOfElementsUsingText(allSuggestionsLocator, destinationName);
    }


    public boolean popularFilterCheckBox() {
        boolean checkBox = false;
        List<WebElement> allFilterOptions = getElements(allFilterLocator);
        for (WebElement data : allFilterOptions) {

            String dateValue = data.getText();
            if ((dateValue.equalsIgnoreCase("parking")) ||
                    (dateValue.equalsIgnoreCase("pet friendly")) ||
                    (dateValue.equalsIgnoreCase("breakfast included")) ||
                    (dateValue.equalsIgnoreCase("pool")) ||
                    (dateValue.equalsIgnoreCase("wifi included"))) {
                checkBox = data.isSelected();
                System.out.println("Is " + dateValue + " option is selected - " + checkBox);
            }
        }
        return checkBox;
    }



    public List starRatingCheckBox() {
        List<WebElement> allRateOptions = getElements(allStarRatingLocator);
        List<String> starRating=new ArrayList<>();
        for (WebElement star : allRateOptions){
            String dateValue = star.getText();
              starRating.add(dateValue);
    }
        return starRating;

}

    public List starRatingSortCheckBox() {
        List<WebElement> allRateOptions = getElements(allStarRatingLocator);
        List<String> starRating1=new ArrayList<>();
        for (WebElement star : allRateOptions){
            String dateValue = star.getText();
            starRating1.add(dateValue);
        }
        return starRating1;

    }

    public void accommodationSelectCheckBox() {

        List<WebElement> allFilterOptions = getElements(accommodationLocator);
        for (WebElement data : allFilterOptions) {

            String dateValue = data.getText();
            if (dateValue.equalsIgnoreCase("hotels"))
            {
                data.click();
            }
        }

    }




}



