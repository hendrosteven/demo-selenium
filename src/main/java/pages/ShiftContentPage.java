package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftContentPage {

    private final WebDriver driver;
    private final By example1Link = By.linkText("Example 1: Menu Element");

    public ShiftContentPage(WebDriver driver){
        this.driver = driver;
    }

    public MenuElementPage clickExample1Link(){
        driver.findElement(example1Link).click();
        return new MenuElementPage(driver);
    }
}
