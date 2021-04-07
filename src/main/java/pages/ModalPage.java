package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalPage {

    private final WebDriver driver;

    private By closeButton = By.xpath(".//p[text()='Close']");
    private By modal = By.id("modal");

    public ModalPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickClose(){
        driver.findElement(closeButton).click();
    }

    public boolean modalIsDisplayed(){
        return driver.findElement(modal).isDisplayed();
    }
}
