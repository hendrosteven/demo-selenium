package shifting;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MenuElementPage;
import pages.ShiftContentPage;

public class ShiftingContentTest extends BaseTest {

    @Test
    public void testTabsCount(){
        ShiftContentPage shiftContentPage = homePage.clickShiftContentLink();
        MenuElementPage menuElementPage = shiftContentPage.clickExample1Link();
        int tabsCount = menuElementPage.getTabsCount();
        Assert.assertEquals(tabsCount, 5, "Tabs count is wrong");
    }
}
