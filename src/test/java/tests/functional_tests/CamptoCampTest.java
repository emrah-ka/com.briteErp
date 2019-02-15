package tests.functional_tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Pages;
import utilities.TestBase;
public class CamptoCampTest extends TestBase {
    @Test
    public void verifyCamp(){
        extentLogger = report.createTest("Vendors functionality test");

        extentLogger.info("click on vendors");
        pages.vendors().clickOnVendors();

        extentLogger.info("click on camptocamp");
        pages.vendors().camptocamp.click();

        extentLogger.info("verify the tables");
        Assert.assertTrue(pages.camptocamp().camptocampTable.getText().contains("Opportunities"));
        Assert.assertTrue(pages.camptocamp().camptocampTable.getText().contains("Meetings"));
        Assert.assertTrue(pages.camptocamp().camptocampTable.getText().contains("On Website"));
        Assert.assertTrue(pages.camptocamp().camptocampTable.getText().contains("Sales"));
        Assert.assertTrue(pages.camptocamp().camptocampTable.getText().contains("Vendor Bills"));
        Assert.assertTrue(pages.camptocamp().camptocampTable.getText().contains("Active"));
        Assert.assertTrue(pages.camptocamp().camptocampTable.getText().contains("Invoiced"));

        extentLogger.info("Verify the tabs");
        Assert.assertTrue(pages.camptocamp().camptocampTab.getText().contains("Contacts & Addresses"));
        Assert.assertTrue(pages.camptocamp().camptocampTab.getText().contains("Internal Notes"));
        Assert.assertTrue(pages.camptocamp().camptocampTab.getText().contains("Sales & Purchases"));
        Assert.assertTrue(pages.camptocamp().camptocampTab.getText().contains("Invoicing"));

        extentLogger.info("verify the tags");
        Assert.assertTrue(pages.camptocamp().camptocampTag.getText().contains("Partner / Gold"));
        Assert.assertTrue(pages.camptocamp().camptocampTag.getText().contains("Services"));
    }
}