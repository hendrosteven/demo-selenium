package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;

    private final By input = By.id("target");
    private final By result = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(input).sendKeys(text);
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }

    public void enterPi(){
        enterText(Keys.chord(Keys.ALT, "p")+ " = 3.14");
    }
}
