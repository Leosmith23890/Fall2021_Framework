package Pages.Hotels;


import Pages.WebCommands;
import Web.UseDriver;
import org.openqa.selenium.By;


public class WhyBookWithHotelsSectionPage extends WebCommands {

    LaunchPage lp=new LaunchPage();
    By whyBookWithHotelsLocator=By.xpath("//h2[text()='Why book with Hotels.com?']");
    By freeCancellationLocator=By.xpath("//h3[text()='Free cancellation']");
    By freeCancellationLocatorNewText1=By.xpath("//b[text()='Free cancellation']");
    By freeCancellationLocatorNewText2=By.xpath("//p[text()='on most hotels*']");
    By freeCancellationIconLocator=By.xpath("//img[contains(@src,'Icon_spotlight_free_cancellation')]");
    By ourPriceGuaranteeLocator=By.xpath("//h3[text()='Our price guarantee']");
    By ourPriceGuaranteeHeadingLocator=By.xpath("//h1[text()='Price Guarantee']");
    By ourPriceGuaranteeHeadingLocator2=By.xpath("//p[text()='Found a better price? Let us know and we’ll match it.']");
    By ourPriceGuaranteeLocatorNewText1=By.xpath("//span[text()='Our price guarantee']");
    By ourPriceGuaranteeIconLocator=By.xpath("//img[contains(@src,'Icon_spotlight_price-guarantee')]");
    By ourPriceGuaranteeLinkLocator=By.xpath("//a[text()='Find out more ']");
    By ourPriceGuaranteeLinkHeadingLocator=By.xpath("//h1[text()='Price Guarantee']");
    By getARewardNightLocator=By.xpath("//h3[text()='Get a reward night']");
    By getARewardNightLocatorNewText1=By.xpath("//span[text()='Get a reward night']");
    By getARewardNightLocatorIconLocator=By.xpath("//img[contains(@src,'Icon_spotlight_reward_nights')]");
    By getARewardNightLinkLocator=By.xpath("//a[text()='for every 10 nights you stay ']");
    By getARewardNightLinkHeadingLocator=By.xpath("//h1[contains(text(),'Instant savings. Reward* nights. And more')]");

    By getARewardNightHeadingLocator=By.xpath("//h1[contains(text(),'Instant savings')]");

    public boolean verifyWhyBookWithHotelsOptionDisplay()
    {
        return  isWebElementDisplayed(whyBookWithHotelsLocator);
    }

    public boolean verifyFreeCancellationText1Display()
    {
        return  isWebElementDisplayed(freeCancellationLocatorNewText1);
    }

    public boolean verifyFreeCancellationText2Display()
    {
        return  isWebElementDisplayed(freeCancellationLocatorNewText2);
    }

    public boolean verifyFreeCancellationIconDisplay()
    {
        return  isWebElementDisplayed(freeCancellationIconLocator);
    }


    public boolean verifyOurPriceGuaranteeTextDisplay()

    {
        return  isWebElementDisplayed(ourPriceGuaranteeLocatorNewText1);
    }
    public boolean verifyOurPriceGuaranteeLinkDisplay()
    {
        return  isWebElementDisplayed(ourPriceGuaranteeLinkLocator);
    }


    public boolean verifyOurPriceGuaranteeIconDisplay()
    {
        return  isWebElementDisplayed(freeCancellationIconLocator);
    }


    public boolean verifyGetARewardNightTextDisplay()
    {
        return  isWebElementDisplayed(getARewardNightLocatorNewText1);
    }
    public boolean verifyGetARewardNightLinkDisplay(){
        return isWebElementDisplayed(getARewardNightLinkLocator);
    }
    public boolean verifyGetARewardNightIconDisplay(){
        return isWebElementDisplayed(getARewardNightLocatorIconLocator);
    }

    public void clickTheOurPriceGuaranteeLink(){
        clickThis(ourPriceGuaranteeLinkLocator);
    }

    public boolean verifyOurPriceGuaranteePageHeadingDisplay(){
        return isWebElementDisplayed(ourPriceGuaranteeLinkHeadingLocator);
    }

    public String verifyOurPriceGuaranteePageHeadingText()
    {
       return getTextValueFromWebElement(ourPriceGuaranteeLinkHeadingLocator);
    }

    public void navigateBackToHotelsWhyBooKWithHotelsSection()
    {
        UseDriver.getDriver().navigate().back();
    }

    public void clickTheGetARewardNightLinkInHotelsPage()
    {
       clickThis(getARewardNightLinkLocator);
    }

    public boolean verifyGetARewardNightHeadingDisplay(){
        return isWebElementDisplayed(getARewardNightLinkHeadingLocator);
    }

    public String verifyGetARewardNightHeadingText()
    {
    return getTextValueFromWebElement(getARewardNightLinkHeadingLocator);
    }

}
