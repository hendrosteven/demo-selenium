package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadPage {

    private final WebDriver driver;

    private final By inputFile = By.id("file-upload");
    private final By uploadButton = By.id("file-submit");
    private final By uploadedFileName = By.id("uploaded-files");

    public UploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUploadFile(String pathToFile){
        driver.findElement(inputFile).sendKeys(pathToFile);
        clickUploadButton();
    }

    private void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    public String getUploadedFileName(){
        return driver.findElement(uploadedFileName).getText();
    }

}
