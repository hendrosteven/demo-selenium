package frame;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramePage;

public class MultiFrameTest extends BaseTest {

    @Test
    public void testFrameLeft(){
        FramePage framePage = homePage.clickFrameLink();
        FramePage.NestedFramePage nestedFramePage = framePage.clickNestedFrameLink();
        String resultText = nestedFramePage.getLeftFrameText();
        Assert.assertEquals(resultText,
                "LEFT",
                "Result text is incorrect!");
    }

    @Test
    public void testFrameRight(){
        FramePage framePage = homePage.clickFrameLink();
        FramePage.NestedFramePage nestedFramePage = framePage.clickNestedFrameLink();
        String resultText = nestedFramePage.getRightFrameText();
        Assert.assertEquals(resultText,
                "RIGHT",
                "Result text is incorrect!");
    }

    @Test
    public void testFrameBottom(){
        FramePage framePage = homePage.clickFrameLink();
        FramePage.NestedFramePage nestedFramePage = framePage.clickNestedFrameLink();
        String resultText = nestedFramePage.getBottomFrameText();
        Assert.assertEquals(resultText,
                "BOTTOM",
                "Result text is incorrect!");
    }
}
