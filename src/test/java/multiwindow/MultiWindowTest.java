package multiwindow;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.MultipleWindowPage;

public class MultiWindowTest extends BaseTest {

    @Test
    public void testSwitchTab(){
        MultipleWindowPage multipleWindowPage = homePage.clickMultipleWindowLink();
        multipleWindowPage.clickHere();
        getWindowManager().switchToTab("New Window");
    }
}
