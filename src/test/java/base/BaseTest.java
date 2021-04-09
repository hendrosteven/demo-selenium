package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import utility.EventReporter;
import utility.WindowManager;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    private EventFiringWebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new EventReporter());
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

}
