package slider;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;


public class SliderTest extends BaseTest {

    @Test
    public void testMoveSliderWithKey(){
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSliderLink();
        for(int x=0; x<8; x++){
            horizontalSliderPage.moveSliderWithKeys(Keys.ARROW_RIGHT+"");
        }
        Assert.assertEquals(horizontalSliderPage.getResult(), "4", "Result is incorrect!");
    }

    @Test
    public void testMoveSliderWithMouse(){
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSliderLink();
        horizontalSliderPage.moveSliderWithMouse();
        Assert.assertEquals(horizontalSliderPage.getResult(), "4", "Result is incorrect!");
    }
}
