package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {

    private final WebDriver driver;

    private final By slider = By.tagName("input");
    private final By result = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void moveSliderWithKeys(String text){
        driver.findElement(slider).sendKeys(text);
    }

    public void moveSliderWithMouse(){
        WebElement sliderElement = driver.findElement(slider);
        Actions actions = new Actions(driver);
        actions.clickAndHold(sliderElement)
                .moveByOffset(40, 0)
                .release()
                .perform();
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }
}
