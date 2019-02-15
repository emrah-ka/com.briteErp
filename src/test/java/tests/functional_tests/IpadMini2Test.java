package tests.functional_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.TestBase;

public class IpadMini2Test extends TestBase {

    @Test
    public void ipadMini2Test(){
        extentLogger = report.createTest("new product test(Ipadmini2");

        extentLogger.info("entering login information");
        pages.login().loginAsUser();

        extentLogger.info("click on master data");
        pages.vendors().masterDataButton.click();

        BrowserUtils.wait(5);

        extentLogger.info("click on purchasable products");
        pages.purchasablePro().purchasableProductsButton.click();
        BrowserUtils.wait(3);

        extentLogger.info("click on ipad mini2");
        pages.newProduct().ipadMini2Button.click();
        BrowserUtils.wait(5);

        extentLogger.info("verify that selected product is iPadMini 2");
        String title=Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("iPad Mini2"));



    }


}
