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
                "You successfully clicked an alert",
                "Result Text is incorrect!");
    }
}
