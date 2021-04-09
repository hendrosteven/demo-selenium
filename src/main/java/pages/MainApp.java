package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import utility.EventReporter;

public class MainApp {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        EventFiringWebDriver driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new EventReporter());
        driver.get("http://the-internet.herokuapp.com");
        HomePage homePage = new HomePage(driver);

        LoginPage page = homePage.clickFormAuthenticationLink();
        page.setUserNameField("tomsmith");
        page.setPasswordField("SuperSecretPassword!");
        page.clickLoginButton();

        driver.quit();
    }
}
