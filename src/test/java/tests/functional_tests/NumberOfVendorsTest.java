package tests.functional_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Pages;
import utilities.TestBase;

import java.security.cert.Extension;

public class NumberOfVendorsTest extends TestBase {

    @Test
    public void numberOfVendorsTest(){
        extentLogger = report.createTest("Vendors functionality test");

        extentLogger.info("click on vendors");
        Pages pages=new Pages();

        extentLogger = report.createTest("Vendors functionality test");
        extentLogger.info("entering login information");
        pages.login().loginAsUser();

        extentLogger.info("click on master data");
        pages.vendors().masterDataButton.click();

        BrowserUtils.wait(2);

        extentLogger.info("click on vendors");
        pages.vendors().vendorsButton.click();

        BrowserUtils.wait(3);;

        extentLogger.info("verify that companies are clickable");
        for(int i=0;i<pages.vendors().allVendors.size()/2;i++){
            Assert.assertTrue(BrowserUtils.isClickable(pages.vendors().allVendors.get(i)));
        }


        extentLogger.info(" verify that total number of vendors are more than 80");
        for (int i = 0; i < pages.vendors().allVendors.size()-1 ; i++) {

         Assert.assertTrue(pages.vendors().allVendors.size()>80);

        }




    }
}
