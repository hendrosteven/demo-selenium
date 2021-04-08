package utility;

import org.openqa.selenium.WebDriver;

public class WindowManager {

    private final WebDriver driver;

    public WindowManager(WebDriver driver){
        this.driver = driver;
    }

    public void goBack(){
        driver.navigate().back();
    }

    public void goForward(){
        driver.navigate().forward();
    }

    public void refreshPage(){
        driver.navigate().refresh();
    }

    public void gotTo(String url){
        driver.navigate().to(url);
    }
}
