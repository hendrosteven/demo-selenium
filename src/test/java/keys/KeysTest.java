package keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

public class KeysTest extends BaseTest {

    @Test
    public void testBackspace(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPressesLink();
        keyPressesPage.enterText("A"+ Keys.BACK_SPACE);
        Assert.assertEquals(keyPressesPage.getResult(),
                "You entered: BACK_SPACE",
                "Key Press invalid");
    }

    @Test
    public void testPi(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPressesLink();
        keyPressesPage.enterPi();
    }
}
