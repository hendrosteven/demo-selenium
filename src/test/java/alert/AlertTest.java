package alert;


import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AlertPage;

public class AlertTest extends BaseTest {

    private AlertPage alertPage;

    @BeforeMethod
    public void init(){
        alertPage = homePage.clickAlertLink();
    }

    @Test
    public void testOkAlert(){
        alertPage.triggerAlertButtonOne();
        alertPage.clickOkOnAlert();
        String resultText = alertPage.getResultText();
        Assert.assertEquals(resultText,
                "You successfuly clicked an alert",
                "Result Text is incorrect!");
    }

    @Test
    public void testGetTextFromAlert(){
        alertPage.triggerAlertButtonTwo();
        String text = alertPage.getConfirmText();
        alertPage.clickDismissOnAlert();
        Assert.assertEquals(text,
                "I am a JS Confirm",
                "Result text is incorrect");
    }

    @Test
    public void testSetTextPromptAlert(){
        alertPage.triggerAlertButtonThree();
        String text = "Hello Selenium";
        alertPage.setPromptText(text);
        alertPage.clickOkOnAlert();
        String result = alertPage.getResultText();
        Assert.assertTrue(result.contains(text),"Result text is incorrect!");
    }
}
