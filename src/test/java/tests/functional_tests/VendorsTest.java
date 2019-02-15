package tests.functional_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.TestBase;


public class VendorsTest extends TestBase {

    @Test
    public void verifyVendors(){
        extentLogger = report.createTest("Vendors functionality test");

        extentLogger.info("entering login information");
        pages.login().loginAsUser();

        extentLogger.info("click on master data");
        pages.vendors().masterDataButton.click();
        BrowserUtils.wait(2);

        extentLogger.info("click on vendors");
        pages.vendors().vendorsButton.click();
        BrowserUtils.wait(3);



        extentLogger.info(" verify vendors are displayed");
        for (int i = 0; i < pages.vendors().allVendors.size()/2 ; i++) {

            Assert.assertTrue(pages.vendors().allVendors.get(i).isDisplayed());

        }




    }
}