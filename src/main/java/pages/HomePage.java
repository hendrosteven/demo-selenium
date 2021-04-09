package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class HomePage {

    private final WebDriver driver;
//    private final By formAuthenticationLink = By.linkText("Form Authentication");
//    private final By shiftContentLink = By.linkText("Shifting Content");
//    private final By checkboxLink = By.linkText("Checkboxes");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthenticationLink(){
        //driver.findElement(formAuthenticationLink).click();
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public ShiftContentPage clickShiftContentLink(){
        //driver.findElement(shiftContentLink).click();
        clickLink("Shifting Content");
        return new ShiftContentPage(driver);
    }

    public CheckBoxPage clickCheckBoxLink(){
        //driver.findElement(checkboxLink).click();
        clickLink("Checkboxes");
        return new CheckBoxPage(driver);
    }

    public DropdownPage clickDropdownLink(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoverPage clickHoverLink(){
        clickLink("Hovers");
        return new HoverPage(driver);
    }

    public KeyPressesPage clickKeyPressesLink(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSliderLink(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlertPage clickAlertLink(){
        clickLink("JavaScript Alerts");
        return new AlertPage(driver);
    }

    public ModalPage clickModalLink(){
        clickLink("Entry Ad");
        return new ModalPage(driver);
    }

    public WysiwygEditorPage clickWysiwygLInk(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    public FramePage clickFrameLink(){
        clickLink("Frames");
        return new FramePage(driver);
    }

    public ContextMenuPage clickContextMenuLink(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public UploadPage clickUploadLink(){
        clickLink("File Upload");
        return new UploadPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingLink(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDomLink(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScrollLink(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowPage clickMultipleWindowLink(){
        clickLink("Multiple Windows");
        return new MultipleWindowPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public void setCookie(){
        Cookie cookie = new Cookie.Builder("data", "Training Selenium")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }

    public void getAllCookie(){
        Set<Cookie> cookies = driver.manage().getCookies();
        cookies.forEach(cookie -> System.out.println(cookie.getName()));
    }

    public void removeAllCookie(){
        driver.manage().deleteAllCookies();
    }

    public Cookie getCookie(String name){
       return driver.manage().getCookieNamed(name);
    }
}
