package modal;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ModalPage;

public class ModalTest extends BaseTest {

    @Test
    public void testModal() throws InterruptedException {
        ModalPage modalPage = homePage.clickModalLink();
        Thread.sleep(2000);
        modalPage.clickClose();
        Assert.assertFalse(modalPage.modalIsDisplayed(),
                "Modal is still displayed!");
    }
}
