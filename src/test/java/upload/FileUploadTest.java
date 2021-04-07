package upload;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UploadPage;

public class FileUploadTest extends BaseTest {

    @Test
    public void testFileUpload(){
        UploadPage uploadPage = homePage.clickUploadLink();
        uploadPage.setUploadFile("/Users/jarvis/Documents/training/selenium/demo-selenium/src/main/java/pages/AlertPage.java");
        String uploadedFileName = uploadPage.getUploadedFileName();
        Assert.assertEquals(uploadedFileName,
                "AlertPage.java",
                "Invalid uploaded file!");
    }
}
