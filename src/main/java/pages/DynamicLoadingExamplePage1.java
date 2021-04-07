package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Clock;
import java.time.Duration;

public class DynamicLoadingExamplePage1 {

    private final WebDriver driver;

    private final By startButton = By.cssSelector("#start button");
    private final By laodingIndicator = By.id("loading");
    private final By loadedText = By.id("finish");

    public DynamicLoadingExamplePage1(WebDriver driver){
        this.driver = driver;
    }

    public void clickStartButton(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until((ExpectedConditions.invisibilityOf(driver.findElement(laodingIndicator))));
//        FluentWait wait = new FluentWait(driver)
//                .withTimeout(Duration.ofSeconds(5))
//                .pollingEvery(Duration.ofSeconds(1))
//                .ignoring(NoSuchElementException.class);
//        wait.until((ExpectedConditions.invisibilityOf(driver.findElement(laodingIndicator))));
    }

    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }
}
