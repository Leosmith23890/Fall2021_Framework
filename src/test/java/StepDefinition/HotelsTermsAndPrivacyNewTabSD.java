package StepDefinition;

import Helper.Check;
import Helper.Misc;
import Pages.Hotels.LaunchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class HotelsTermsAndPrivacyNewTabSD {

    LaunchPage lp = new LaunchPage();

    @When("^I click the 'Sign in' button in the hotels webpage$")
    public void clickSignIn() {
        lp.clickSignIn();
    }

    @And("^I click the 'Sign up' button in the hotels webpage$")
    public void clickSignUp() {
        lp.clickSignUp();
    }

    @And("^I click the 'Terms and Conditions' Link and 'Privacy Statement' Link in the SignUp page$")
    public void clickTermsAndConditions() {
        String mainWindowHandle = lp.getWindowHandle();
        System.out.println("the main window handle before switch is :" + mainWindowHandle);
        String mainWindowTitle = lp.getTitleOfWebPage();
        System.out.println("the main window handle title is :" + mainWindowTitle);
        lp.clickTermsAndConditionLink();
        Misc.sleep(2);
        lp.clickPrivacyStatementLink();
    }

    @And("^I Verify that 'Terms and Conditions' Link and 'Privacy Statement' Link opens in a new tab$")
    public void verifyWindowHandleOfTermsAndConditions() {
        String mainWindowHandle = lp.getWindowHandle();
        List<String> handleUrlName = lp.getToSwitchToAnotherHandle(mainWindowHandle);
        System.out.println("The List of handleUrl names are :" + handleUrlName);
        System.out.println("The size of handle url lists are :" + handleUrlName.size());
        String hotelUrl = "", termUrl = "", privacyUrl = "";

        for (int i = 0; i <= handleUrlName.size() - 1; i++) {
            {
                if (i == 0) {
                    hotelUrl = handleUrlName.get(i);
                }
                if (i == 1) {
                    privacyUrl = handleUrlName.get(i);
                }
                if (i == 2) {
                     termUrl= handleUrlName.get(i);
                }
            }
        }
        Check.checkEquals(termUrl, "https://www.hotels.com/customer_care/terms_conditions.html", "The term Url is not same");
        Check.checkEquals(privacyUrl, "https://www.hotels.com/customer_care/privacy.html", "The privacy  Url is not same");

    }
}



