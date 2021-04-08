package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {

    private final WebDriver driver;

    private final By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromDropdown(String option){
        findDropdownElement().selectByVisibleText(option);
    }

    public void selectMultiple(){
        String script = "arguments[0].setAttribute('multiple','')";
        ((JavascriptExecutor)driver).executeScript(script, findDropdownElement());
        selectFromDropdown("Option 1");
        selectFromDropdown("Option 2");
    }

    public List<String> getSelectedOption(){
        List<WebElement> selectedElements =
                findDropdownElement().getAllSelectedOptions();
        List<String> selectedOptions = new ArrayList<>();

        for(WebElement element: selectedElements){
            selectedOptions.add(element.getText());
        }
        return selectedOptions;
//        return selectedElements
//                .stream()
//                .map(WebElement::getText)
//                .collect(Collectors.toList());
    }

    private Select findDropdownElement(){
        return new Select(driver.findElement(dropdown));
    }
}
