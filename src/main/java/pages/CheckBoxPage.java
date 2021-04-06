package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxPage {

    private final WebDriver driver;

    private By checkboxes = By.cssSelector("#checkboxes input");

    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }
    public void selectOneCheckBox(int index){
        List<WebElement> allCheckBox = getCheckBox();
        for(WebElement checkBox: allCheckBox){
            if(checkBox.isSelected()) {
                checkBox.click();
            }
        }
        allCheckBox.get(index).click();
    }

    public int getSelectedCheckBox(){
        int index = -1;
        List<WebElement> allCheckBox = getCheckBox();
        for(WebElement checkBox: allCheckBox){
            if(checkBox.isSelected()){
                ++index;
                break;
            }
        }
        return index;
    }


    private List<WebElement> getCheckBox(){
        return driver.findElements(checkboxes);
    }
}
