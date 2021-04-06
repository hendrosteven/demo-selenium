package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {

    private final WebDriver driver;

    private final By alertButtonOne = By.xpath(".//button[text()='Click for JS Alert']");
    private final By resultText = By.id("result");


    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlertButtonOne(){
        driver.findElement(alertButtonOne).click();
    }

    public void clickOkOnAlert(){
        driver.switchTo().alert().accept();
    }

    public String getResultText(){
        return driver.findElement(resultText).getText();
    }
}
