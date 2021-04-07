package frame;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

public class FrameTest extends BaseTest {

    @Test
    public void testEditor(){
        WysiwygEditorPage wysiwygEditorPage = homePage.clickWysiwygLInk();
        wysiwygEditorPage.clearTextArea();

        String text1 = "Hello";
        String text2 = "Selenium";

        wysiwygEditorPage.setTextArea(text1);
        wysiwygEditorPage.clickIncreaseIndentButton();
        wysiwygEditorPage.setTextArea(text2);

        Assert.assertEquals(wysiwygEditorPage.getTextArea(),
                text1+text2,
                "Text is incorrect");
    }
}
