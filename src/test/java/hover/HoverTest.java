package hover;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoverPage;

public class HoverTest extends BaseTest {

    @Test
    public void testHoverUser1(){
        HoverPage hoverPage = homePage.clickHoverLink();
        HoverPage.FigureCaption caption = hoverPage.hoverOverImage(0);
        Assert.assertTrue(caption.isCaptionDisplayed(),"Caption not displayed");
        Assert.assertEquals(caption.getTitle(), "name: user1", "Caption is incorrect");
        Assert.assertEquals(caption.getLinkText(), "View profile", "Caption link incorrect");
        Assert.assertTrue(caption.getLink().endsWith("/users/1"),"Link incorrect");
    }
}
