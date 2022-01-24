package Pages.Darksky;

import Helper.Misc;
import Pages.WebCommands;
import Web.UseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Helper.DateUtil.textDateToDateFormat;

public class DarkSkyPage extends WebCommands {
    // Locators of elements on DarksKY
    By feelsLikeLocator = By.xpath("//span[@class='feels-like-text']");
    By lowTempLocator = By.xpath("//span[@class='low-temp-text']");
    By highTempLocator = By.xpath("//span[@class='high-temp-text']");
    By currentTemperatureFahLocator = By.xpath("//span[@class='summary swap']");
    By tempUnitButtonLocator = By.xpath("(//div[contains(@class, 'selectric-units')]//div[@class='selectric'])[1]//span");
    By firstDegCelsiusButtonLocator = By.xpath("(//div[contains(@class, 'selectric-open')]//div[@class='selectric-scroll']//li[contains(text(), '˚C')])[1]");
    By currentTemperatureCelLocator = By.xpath("//span[@class='summary swap']");
    By darkSkyApiLocator = By.partialLinkText("Dark Sky API");
    By blogPostLocator = By.partialLinkText("blog post");
    By date1Text = By.xpath("(//time[@itemprop='datePublished'])[1]");
    By date2Text = By.xpath("(//time[@itemprop='datePublished'])[2]");
    By date3Text = By.xpath("(//time[@itemprop='datePublished'])[3]");
    By date4Text = By.xpath("(//time[@itemprop='datePublished'])[4]");
    By allDateLocator = By.xpath("//time[@itemprop='datePublished']");
    By timeMachineLocator=By.xpath("//a[@class='button' and contains(text(),'Time Machine')]");
    By timeMachineDateLocator=By.xpath("//*[@class='is-today')]");


    //to get timemachine webelement by scrolling
    public void getTimeMachineElementByScroll(){
        getTimeMachineDateByScroll(timeMachineLocator);
    }

    //to get TimeMachine datetext  in darksky page
    public String timeMachineDateTextFromPage() {
        WebElement timeMachine=getTimeMachineDateByScroll(timeMachineLocator);
        WebElement timeMachineDate=getTimeMachineDateByScroll(timeMachineDateLocator);
      String dateText=timeMachineDate.getText();
        return dateText;
    }



    //to get text from feelslike tempValue
    public String feelsLikeTextFromWebElements() {
        return getTextFromWebElement(feelsLikeLocator);
    }

    //to get text from lowtempValue
    public String lowTempTextFromWebElements() {
        return getTextFromWebElement(lowTempLocator);

    }

    //to get text from high tempValue
    public String highTempTextFromWebElements() {
        return getTextFromWebElement(highTempLocator);

    }

    //to get text from current tempValue
    public String currentTempTextFromWebElements() {
        return getTextFromWebElement(currentTemperatureFahLocator);

    }

    //to get current temp in int
    public int currentTempValueInt() {
        return Misc.removeDegreeAndGetTempAsInt(currentTempTextFromWebElements());

    }

    //to convert current temp to celsius
    public int fahrenToCelsiusConversion() {
        return Misc.convertFTempIntoCTemp(currentTempValueInt());
    }

    //to get feelslike temp in int
    public int feelsLikeTempValueInt() {
        return Misc.removeDegreeAndGetTempAsInt(feelsLikeTextFromWebElements());
    }

    //to get low temp in int
    public int LowTempValueInt() {
        return Misc.removeDegreeAndGetTempAsInt(lowTempTextFromWebElements());
    }

    //to get high temp in int
    public int highTempValueInt() {
        return Misc.removeDegreeAndGetTempAsInt(highTempTextFromWebElements());
    }

    //to click tempUnitButton
    public void clickTempUnitButton() {
        clickThis(tempUnitButtonLocator);
    }

    //to click Dark Sky API link
    public void clickDarkSkyApi() {
        clickThis(darkSkyApiLocator);
    }

    //to click blog Post link
    public void clickBlogPost() {
        clickThis(blogPostLocator);
    }


    //to click CelsiusDegreeButton
    public void clickFirstDegCelsiusButton() {
        clickThis(firstDegCelsiusButtonLocator);
    }

    //to get text from current Temp in celsius in text
    public String celsiusTempTextFromWebElements() {
        return getTextFromWebElement(currentTemperatureCelLocator);
    }

    //to get celsius current temp in int
    public int currentTempValueCelsiusInInt() {
        return Misc.removeDegreeAndGetTempAsInt(celsiusTempTextFromWebElements());

    }

    //to get List of textValues from date webelements
    public List getTextFromListOfElementsInBlog() {
        return getTextFromListOfElements(allDateLocator);
    }
    public boolean stringToDateConversion() {
        List<String> newList11 = textDateToDateFormat(getTextFromListOfElementsInBlog(), "MMMM d, yyyy");
        List<String> newList22 = getTextFromListOfElementsInBlog();
        System.out.println("The newlist11 :"+newList11);
        System.out.println("The newList22 :"+newList22);
        boolean equals = newList11.equals(newList22);
        System.out.println("The equals value is :"+equals);
        return equals;
    }

        }





