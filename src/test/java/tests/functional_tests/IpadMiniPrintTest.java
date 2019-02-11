package tests.functional_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.TestBase;

public class IpadMiniPrintTest extends TestBase {


    @Test
    public void printTest(){
        extentLogger = report.createTest("new product  test");

        extentLogger.info("entering login information");
        pages.login().loginAsUser();

        extentLogger.info("click on master data");
        pages.vendors().masterDataButton.click();

        BrowserUtils.wait(7);

        extentLogger.info("click on purchasable products");
        pages.purchasablePro().purchasableProductsButton.click();
        BrowserUtils.wait(5);

        extentLogger.info("click on ipad mini2");
        pages.newProduct().ipadMini2Button.click();
        BrowserUtils.wait(3);

        extentLogger.info("click on print dropdown  button");
        pages.ipadMini2().printDropdownButton.click();

        extentLogger.info("click on products labels");
        pages.ipadMini2().productLabelsButton.click();

        extentLogger.info("click on print button");
        pages.ipadMini2().printButton.click();

        Assert.assertTrue(pages.ipadMini2().report.isDisplayed());




    }


}
