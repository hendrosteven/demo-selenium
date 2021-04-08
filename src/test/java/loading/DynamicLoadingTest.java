package loading;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExamplePage1;
import pages.DynamicLoadingPage;

public class DynamicLoadingTest extends BaseTest {

    @Test
    public void testWaitUntilHidden() {
        DynamicLoadingExamplePage1 loadPage = homePage.clickDynamicLoadingLink().clickExample1();
        loadPage.clickStartButton();
        Assert.assertEquals(loadPage.getLoadedText(),
                "Hello World!",
                "Loaded text is incorrect!");
    }

    @Test
    public void testNavigator(){
        DynamicLoadingExamplePage1 loadPage = homePage.clickDynamicLoadingLink().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().gotTo("https://google.com");
    }
}
