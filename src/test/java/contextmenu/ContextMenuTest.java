package contextmenu;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

public class ContextMenuTest extends BaseTest {

    @Test
    public void testContextMenu(){
        ContextMenuPage contextMenuPage = homePage.clickContextMenuLink();
        contextMenuPage.rightClickHotspot();
        String text = contextMenuPage.getAlertText();
        contextMenuPage.acceptAlert();

        Assert.assertEquals(text,
                "You selected a context menu",
                "Alert text is incorrect!");
    }
}
