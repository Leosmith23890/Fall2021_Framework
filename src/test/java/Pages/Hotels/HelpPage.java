package Pages.Hotels;


import Pages.WebCommands;

import Web.UseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import java.util.Set;

public class HelpPage extends WebCommands {
    LaunchPage lp=new LaunchPage();



    By signInLocator11=By.xpath("//span[text()='Sign in']");
    By helpButtonLocator2=By.xpath("//label[@for='primary-section-Help']");
    By helpButtonLocator1=By.xpath("//span[text()='Help']");
    By websiteFeedbackLocator=By.xpath("//a[text()='Website feedback']");
    By websiteFeedbackLocator2=By.xpath("//a[not(@id) and  contains(text(),'Website feedback')]");
    By helpSubmitLocator=By.xpath("//button[@id='submit-button']");
    By helpErrorMessageForEmptyFeedback=By.xpath("//p[text()='Please fill in the required information highlighted below.']");
    By overallPageSatisfactionSectionRedBorderLocator=By.id("required_box_page_rating");
    By webFeedbackStarRatingLocator5=By.xpath("//label[@for='page-rating-5']");
    By webFeedbackStarRatingLocator4=By.xpath("//label[@for='page-rating-4']");
    By webFeedbackStarRatingLocator3=By.xpath("//label[@for='page-rating-3']");
    By webFeedbackStarRatingLocator2=By.xpath("//label[@for='page-rating-2']");
    By webFeedbackStarRatingLocator1=By.xpath("//label[@for='page-rating-1']");
    By webFeedbackCommentsLocator=By.xpath("//textarea[@id='verbatim']");
    By webFeedbackReturnLocator=By.xpath("//select[@id='will-you-return']");
    By webFeedbackNoPriorVisitLocator=By.xpath("//label[@for='booked-here-before-no']   ");
    By webFeedbackYesAccomplishLocator=By.xpath("//label[@for='were-you-successful-yes']");
    By webFeedbackEmailLocator=By.xpath("//input[@id='email_address']");
    By webFeedbackSubmitLocator=By.xpath("//button[@id='submit-button']");
By webFeedbackThankYouMessageLocator=By.xpath("//h5[@data-localization='thank-you-heading']");
    public void clickSignInButtonInHotelPage()
    {
        clickThis(signInLocator11);
    }


    // click help button
    public void clickHelpButton()
    {

        clickThis(helpButtonLocator1);
       // clickThis(helpButtonLocator2);
    }

    public void clickWebsiteFeedbackOption()
    {
       // clickThis(websiteFeedbackLocator);
        clickThis(websiteFeedbackLocator2);
    }
    public void clickHelpSubmitOption() {
        switchHandleToAnotherPage(helpSubmitLocator,250);
    }


    public boolean verifyHelpErrorMessageForEmptyFeedback()
    {
        return  isWebElementDisplayed(helpErrorMessageForEmptyFeedback);
    }
    public boolean verifyOverallPageSatisfactionSectionRedBorderDisplay()
    {
        return  isWebElementDisplayed(overallPageSatisfactionSectionRedBorderLocator);
    }



    public void selectWebFeedBackStarRating()
    {

        switchHandleToAnotherPage(webFeedbackStarRatingLocator5,1);
        //clickThisByLocator(webFeedbackStarRatingLocator5);
    }


    public void enterWebFeedBackComments()
    {
    getElement(webFeedbackCommentsLocator).sendKeys("I enjoyed the stay in the hotel.The maintenance and service were all good.");
    }

    public void selectWebFeedBackReturnOption(){
        selectFromDropdownText(webFeedbackReturnLocator,"Highly likely");
    }
    public void selectWebFeedBackPriorVisitOption()
    {
        clickThisByLocator(webFeedbackNoPriorVisitLocator);
    }

    public void selectWebFeedBackAccomplishOption()
    {
        clickThisByLocator(webFeedbackYesAccomplishLocator);
    }
    public void enterWebFeedEmailAddress(){
        type(webFeedbackEmailLocator,"king@test.com");
    }

    public void selectWebFeedBackSubmitButton()
    {
        clickThisByLocator(webFeedbackSubmitLocator);
    }

    public boolean verifyWebFeedBackThankYouMessageForValidDetails()
    {
        return  isWebElementDisplayed(webFeedbackThankYouMessageLocator);

    }

}
