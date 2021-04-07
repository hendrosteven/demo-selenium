package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {

    private final WebDriver driver;

    private final By alertButtonOne = By.xpath(".//button[text()='Click for JS Alert']");
    private final By alertButtonTwo = By.xpath(".//button[text()='Click for JS Confirm']");
    private final By alertButtonThree = By.xpath(".//button[text()='Click for JS Prompt']");
    private final By resultText = By.id("result");

    public void historyBack(){
        driver.navigate().back();
    }

    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlertButtonOne(){
        driver.findElement(alertButtonOne).click();
    }

    public void triggerAlertButtonTwo(){
        driver.findElement(alertButtonTwo).click();
    }

    public void triggerAlertButtonThree(){
        driver.findElement(alertButtonThree).click();
    }

    public String getConfirmText(){
        return driver.switchTo().alert().getText();
    }

    public void setPromptText(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public void clickOkOnAlert(){
        driver.switchTo().alert().accept();
    }

    public void clickDismissOnAlert(){
        driver.switchTo().alert().dismiss();
    }

    public String getResultText(){
        return driver.findElement(resultText).getText();
    }
}
