package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;
    private final By formAuthenticationLink = By.linkText("Form Authentication");
    private final By shiftContentLink = By.linkText("Shifting Content");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthenticationLink(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public ShiftContentPage clickShiftContentLink(){
        driver.findElement(shiftContentLink).click();
        return new ShiftContentPage(driver);
    }
}
