package Web;


import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UseDriver {

  private  static WebDriver driver;

    public static void openUrl(String url) {
        System.out.println("Hi");
        System.setProperty("webdriver.chrome.driver" , "Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        // Misc.sleep(2);
    }

        public static WebDriver getDriver() {
            return driver;
        }


        public static void quitWebPages() {
            driver.quit();
        }



    }