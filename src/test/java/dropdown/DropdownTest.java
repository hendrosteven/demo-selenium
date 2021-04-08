package dropdown;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

public class DropdownTest extends BaseTest {

    @Test
    public void testSelectOption(){
        DropdownPage dropdownPage = homePage.clickDropdownLink();
        String option1 = "Option 1";
        dropdownPage.selectFromDropdown(option1);
        List<String> selectedOptions = dropdownPage.getSelectedOption();
        Assert.assertEquals(
                selectedOptions.size(),
                1,
                "Incorrect number of selections");
        Assert.assertTrue(
                selectedOptions.contains(option1),
                "Option not selected");
    }

    @Test
    public void testSelectMultiple(){
        DropdownPage dropdownPage = homePage.clickDropdownLink();
        dropdownPage.selectMultiple();
        List<String> selectedOptions = dropdownPage.getSelectedOption();
        Assert.assertEquals(
                selectedOptions.size(),
                2,
                "Incorrect number of selections");
        Assert.assertTrue(
                selectedOptions.contains("Option 1"),
                "Option not selected");
        Assert.assertTrue(
                selectedOptions.contains("Option 2"),
                "Option not selected");
    }
}
