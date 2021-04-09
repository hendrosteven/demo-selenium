package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;
import utility.EventReporter;
import utility.WindowManager;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    private EventFiringWebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.register(new EventReporter());
    }

    @BeforeMethod
    public void goHome(){
        driver.get("http://the-internet.herokuapp.com");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    @AfterMethod
    public void takeScreenshot(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            TakesScreenshot camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            Files.move(screenshot,
                    new File("screenshot/" + currentDateTime()
                            + "_" + result.getName() + ".png"));
        }
    }

    private String currentDateTime(){
        SimpleDateFormat sdm = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss");
        return sdm.format(new Date());
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);
        options.setHeadless(true);
        return options;
    }

    @Test
    private void testSetCookie(){
        homePage.setCookie();
    }

    @Test
    private void testGetAllCookie(){
        homePage.setCookie();
        homePage.getAllCookie();
    }

    @Test
    private void testGetCookie(){
        homePage.setCookie();
        Cookie cookie = homePage.getCookie("data");
        Assert.assertEquals(cookie.getValue(),
                "Training Selenium",
                "Value is incorrect!");
    }

    @Test
    private void testRemoveCookie(){
        homePage.removeAllCookie();
    }

}
