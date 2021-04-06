package checkbox;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBoxPage;

public class CheckBoxTest extends BaseTest {

    @Test
    public void testCheckBox(){
        CheckBoxPage checkBoxPage = homePage.clickCheckBoxLink();
        checkBoxPage.selectOneCheckBox(1);
        int resultIndex = checkBoxPage.getSelectedCheckBox();
        Assert.assertEquals(resultIndex,1,"Invalid selected index");
    }
}
