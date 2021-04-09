package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
       LoginPage loginPage = homePage.clickFormAuthenticationLink();
       loginPage.setUserNameField("tomsmith");
       loginPage.setPasswordField("SuperSecretPassword!XX");
       SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
       String alertText = secureAreaPage.getAlertText();
//       Assert.assertEquals(
//                alertText,
//                "You logged into a secure area!",
//                "Alert text is incorrect");
        Assert.assertTrue(alertText.contains("You logged into a secure area!"));
    }

}
