package StepDefinition;


import Helper.Check;
import Pages.Hotels.WhyBookWithHotelsSectionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HotelsWhyBookWithHotelsSectionSD {

 WhyBookWithHotelsSectionPage wp=new WhyBookWithHotelsSectionPage();


    @When("^I verify the display of heading 'Why book with Hotels.com?' in the hotels webpage$")
    public void verifyWhyBookWithHotelsDisplay ()
    {
wp.verifyWhyBookWithHotelsOptionDisplay();
    }


    @And("^I verify the display of 'Free cancellation on most hotels' text along with icon$")
    public void verifyFreeCancellationDisplay()
    {
        boolean freeCancellationText1Display=wp.verifyFreeCancellationText1Display();
        boolean freeCancellationText2Display=wp.verifyFreeCancellationText2Display();
        boolean freeCancellationIconDisplay=wp.verifyFreeCancellationIconDisplay();
        Check.checkTrue(freeCancellationText1Display,"Free cancellation text is not displayed");
        Check.checkTrue(freeCancellationText2Display,"on most hotels* text is not displayed");
        Check.checkTrue(freeCancellationIconDisplay,"freeCancellation Icon is not displayed");
    }

    @And("^I verify the display of 'Our price guarantee find out more*' link along with text and icon$")
    public void verifyOurPriceGuaranteeDisplay()
    {
        boolean ourPriceGuaranteeTextDisplay=wp.verifyOurPriceGuaranteeTextDisplay();
        boolean ourPriceGuaranteeLinkDisplay=wp.verifyGetARewardNightLinkDisplay();
        boolean ourPriceGuaranteeIconDisplay=wp.verifyOurPriceGuaranteeIconDisplay();
        Check.checkTrue(ourPriceGuaranteeTextDisplay,"Our price guarantee text is not displayed");
        Check.checkTrue(ourPriceGuaranteeLinkDisplay,"Our price guarantee Link 'Find out more' is not displayed");
        Check.checkTrue(ourPriceGuaranteeIconDisplay,"OurPriceGuarantee Icon is not displayed");
    }

    @And("^I verify the display of 'Get a reward night For every 10 nights you stay' link along with text and icon$")
    public void verifyGetARewardNightDisplay()
    {
        boolean getARewardNightTextDisplay=wp.verifyOurPriceGuaranteeTextDisplay();
        boolean getARewardNightLinkDisplay=wp.verifyGetARewardNightLinkDisplay();
        boolean getARewardNightIconDisplay=wp.verifyOurPriceGuaranteeIconDisplay();
        Check.checkTrue(getARewardNightTextDisplay,"Get a reward night text is not displayed");
        Check.checkTrue(getARewardNightLinkDisplay,"Get a reward night link 'for every 10 nights you stay' is not displayed");
        Check.checkTrue(getARewardNightIconDisplay,"Get a reward night  Icon is not displayed");
    }

    @Then("^I click on the 'Our price guarantee find out more' link$")
    public void clickOurPriceGuaranteeLink() {
    wp.clickTheOurPriceGuaranteeLink();
    }

    @And("^I verify that 'Price Guarantee' is displayed as heading in the webpage$")
    public void verifyOurPriceGuaranteePageHeading ()
    {
        boolean ourPriceGuaranteePageHeadingDisplay=wp.verifyOurPriceGuaranteePageHeadingDisplay();
        Check.checkTrue(ourPriceGuaranteePageHeadingDisplay,"our Price Guarantee Page Heading is not displayed");
        String ourPriceGuaranteePageHeadingValue=wp.verifyOurPriceGuaranteePageHeadingText();
        System.out.println("ourPriceGuarantee Page Heading text is : "+ourPriceGuaranteePageHeadingValue);
        Check.checkEquals(ourPriceGuaranteePageHeadingValue,"Price Guarantee","The Price Guarantee Heading text is mismatched");
    }

    @Then("^I go back to 'Why book with Hotels.com' section$")
    public void navigateBackToHotelsPage() {
    wp.navigateBackToHotelsWhyBooKWithHotelsSection();
    }

    @And("^I click on 'Get a reward night For every 10 nights you stay' link$")
    public void clickGetARewardNightLink() {
    wp.clickTheGetARewardNightLinkInHotelsPage();
    }

    @Then("^I verify that 'Instant savings. Reward nights. And more ...' heading is displayed in the webpage$")
    public void VerifyGetARewardNightPageHeading ()
    {
        boolean getARewardNightHeadingDisplay=wp.verifyGetARewardNightHeadingDisplay();
        Check.checkTrue(getARewardNightHeadingDisplay,"Get A Reward Night Page heading is not displayed ");
        String getARewardNightTextValue=wp.verifyGetARewardNightHeadingText();
        System.out.println(" getARewardNight Page Heading text is : "+getARewardNightTextValue);
        Check.checkEquals(getARewardNightTextValue,"Instant savings. Reward* nights. And more ...","The GetaRewardNight Text is mismatched");
    }
}


