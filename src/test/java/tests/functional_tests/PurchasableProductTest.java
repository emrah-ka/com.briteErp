package tests.functional_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.Pages;
import utilities.TestBase;

public class PurchasableProductTest extends TestBase {

    @Test
    public void verifyPurchasableProducts(){
        extentLogger = report.createTest("purchasable product test");

        extentLogger.info("entering login information");
        pages.login().loginAsUser();

        extentLogger.info("click on master data");
        pages.vendors().masterDataButton.click();

        BrowserUtils.wait(2);

        extentLogger.info("click on purchasable products");
        pages.purchasablePro().purchasableProductsButton.click();
        //BrowserUtils.waitForClickablility(pages.purchasablePro().anyText,10);
        BrowserUtils.wait(7);

        extentLogger.info("verify that list of products is displayed");
        for(int i=0;i<pages.purchasablePro().allProducts.size();i++){
            Assert.assertTrue(pages.purchasablePro().allProducts.get(i).isDisplayed());
        }





    }
}
