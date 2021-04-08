package javascript;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;
import pages.LargeAndDeepDomPage;

public class JavascriptTest extends BaseTest {

    @Test
    public void testScrollToTable(){
        LargeAndDeepDomPage largeAndDeepDomPage = homePage.clickLargeAndDeepDomLink();
        largeAndDeepDomPage.scrollToTable();
    }

    @Test
    public void testScrollToTenParagraph(){
        InfiniteScrollPage infiniteScrollPage = homePage.clickInfiniteScrollLink();
        infiniteScrollPage.scrollToParagraph(10);
    }
}
