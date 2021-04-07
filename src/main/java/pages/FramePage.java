package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {

    private final WebDriver driver;

    private final By nestedFrameLink = By.linkText("Nested Frames");
    private final By frameTop = By.xpath(".//frame[@name='frame-top']");
    private final By frameLeft = By.xpath(".//frame[@name='frame-left']");
    private final By frameRight = By.xpath(".//frame[@name='frame-right']");
    private final By frameButtom = By.xpath(".//frame[@name='frame-bottom']");

    private final By body = By.tagName("body");

    public FramePage(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFramePage clickNestedFrameLink(){
        driver.findElement(nestedFrameLink).click();
        return new NestedFramePage(driver);
    }

    public class NestedFramePage {

        private WebDriver driver;

        public NestedFramePage(WebDriver driver) {
            this.driver = driver;
        }

        private void enterTopFrame(){
            driver.switchTo().frame(driver.findElement(frameTop));
        }

        private void enterSubFrame(By frame){
            driver.switchTo().frame(driver.findElement(frame));
        }

        public String getLeftFrameText(){
            enterTopFrame();
            enterSubFrame(frameLeft);
            String text = driver.findElement(body).getText();
            driver.switchTo().parentFrame();
            return text;
        }

        public String getRightFrameText(){
            enterTopFrame();
            enterSubFrame(frameRight);
            String text = driver.findElement(body).getText();
            driver.switchTo().parentFrame();
            return text;
        }

        public String getBottomFrameText(){
            enterSubFrame(frameButtom);
            String text = driver.findElement(body).getText();
            driver.switchTo().parentFrame();
            return text;
        }
    }
}
