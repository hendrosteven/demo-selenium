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
}
