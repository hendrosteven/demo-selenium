package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;
//    private final By formAuthenticationLink = By.linkText("Form Authentication");
//    private final By shiftContentLink = By.linkText("Shifting Content");
//    private final By checkboxLink = By.linkText("Checkboxes");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthenticationLink(){
        //driver.findElement(formAuthenticationLink).click();
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public ShiftContentPage clickShiftContentLink(){
        //driver.findElement(shiftContentLink).click();
        clickLink("Shifting Content");
        return new ShiftContentPage(driver);
    }

    public CheckBoxPage clickCheckBoxLink(){
        //driver.findElement(checkboxLink).click();
        clickLink("Checkboxes");
        return new CheckBoxPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
