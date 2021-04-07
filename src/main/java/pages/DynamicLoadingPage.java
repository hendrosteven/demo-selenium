package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private final WebDriver driver;

    private final By linkExample1 = By.xpath(".//a[contains(text(),'Example 1')]");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExamplePage1 clickExample1(){
        driver.findElement(linkExample1).click();
        return new DynamicLoadingExamplePage1(driver);
    }
}
