package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuElementPage {

    private WebDriver driver;

    private final By tabs = By.tagName("li");

    public MenuElementPage(WebDriver driver){
        this.driver = driver;
    }

    public int getTabsCount(){
        List<WebElement> tabsElement = driver.findElements(tabs);
        return tabsElement.size();
    }
}
