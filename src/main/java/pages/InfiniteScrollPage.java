package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    private final WebDriver driver;
    private final By paragraphBlock = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToParagraph(int count){
        String script = "window.scrollTo(0,document.body.scrollHeight)";
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        while(getNumberOfParagraph() < count){
            executor.executeScript(script);
        }
    }

    private int getNumberOfParagraph() {
        return driver.findElements(paragraphBlock).size();
    }


}
