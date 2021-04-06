package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HoverPage {

    private final WebDriver driver;

    private final By figureBox = By.className("figure");
    private final By figureCaption = By.className("figcaption");

    public HoverPage(WebDriver driver) {
        this.driver = driver;
    }

    public FigureCaption hoverOverImage(int index){
        WebElement selectedFigure = driver.findElements(figureBox).get(index);
        Actions actions = new Actions(driver);
        actions.moveToElement(selectedFigure).perform();
        return new FigureCaption(selectedFigure.findElement(figureCaption));
    }

    public class FigureCaption{
        private WebElement caption;

        private final By header = By.tagName("h5");
        private final By link = By.tagName("a");

        public FigureCaption(WebElement caption){
            this.caption = caption;
        }

        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        public String getTitle(){
            return caption.findElement(header).getText();
        }

        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }

        public String getLinkText(){
            return caption.findElement(link).getText();
        }
    }
}
