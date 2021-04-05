package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://localhost:7080");

        homePage = new HomePage(driver);
//        driver.manage().window().maximize();
//        driver.manage().window().fullscreen();
//        driver.manage().window().setSize(new Dimension(375,667));

//        WebElement inputLink = driver.findElement(By.linkText("Inputs"));
//        inputLink.click();
//        //pindah ke halaman input
//        driver.findElement(By.tagName("input")).sendKeys("123456");

//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        for(WebElement element: links){
//            System.out.println(element.getText());
//        }

//        driver.findElement(By.linkText("Shifting Content")).click();
//        driver.findElement(By.linkText("Example 1: Menu Element")).click();
//        List<WebElement> tabs = driver.findElements(By.tagName("li"));
//        System.out.println("Tabs: "+ tabs.size());

        //driver.quit();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

//    public static void main(String[] args){
//        BaseTest test = new BaseTest();
//        test.setup();
//    }
}
