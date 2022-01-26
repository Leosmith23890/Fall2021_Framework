package StepDefinition;

import Pages.Facebook.LaunchPage;
import Web.UseDriver;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FacebookPaySD {
    @Given("^I launch facebook website$")
    public void launchFacebook() {
//        System.setProperty("webdriver.chrome.driver" , "Drivers/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//      //  driver.get("https://www.facebook.com/");
       UseDriver.openUrl("https://www.facebook.com/");
    }

    @Then("^I click on Facebook Pay$")
    public void clickFbPay() {
        LaunchPage lp = new LaunchPage();
        lp.clickFacebookPay();
    }


}
