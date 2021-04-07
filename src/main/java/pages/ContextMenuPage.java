package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private final WebDriver driver;

    private final By hotSpot = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void rightClickHotspot(){
        WebElement hotspotBox = driver.findElement(hotSpot);
        Actions actions = new Actions(driver);
        actions.contextClick(hotspotBox).perform();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

}
