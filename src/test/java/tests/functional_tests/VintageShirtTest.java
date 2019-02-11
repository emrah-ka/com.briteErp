package tests.functional_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.TestBase;

public class VintageShirtTest extends TestBase {

    @Test
    public void vintageShirtexportTest(){
        extentLogger = report.createTest("new product  test");

        extentLogger.info("entering login information");
        pages.login().loginAsUser();

        extentLogger.info("click on master data");
        pages.vendors().masterDataButton.click();

        BrowserUtils.wait(7);

        extentLogger.info("click on purchasable products");
        pages.purchasablePro().purchasableProductsButton.click();
        BrowserUtils.wait(5);

        extentLogger.info("click on vintage shirt");
        pages.newProduct().vintageShirtButton.click();
        BrowserUtils.wait(3);

        extentLogger.info("click on edit button");
        pages.vintageShirt().editButton.click();

        extentLogger.info("click on sale price");
        pages.vintageShirt().salePrice.click();
        pages.vintageShirt().salePrice.clear();
        pages.vintageShirt().salePrice.sendKeys("35");

        extentLogger.info("click on cost");
        pages.vintageShirt().costInput.click();
        pages.vintageShirt().costInput.clear();
        pages.vintageShirt().costInput.sendKeys("20");

        extentLogger.info("click on save button");
        pages.vintageShirt().saveButton.click();

        System.out.println(pages.vintageShirt().salePriceAfterSAve.getText());
        System.out.println(pages.vintageShirt().costAfterSave.getText());

        extentLogger.info("verify sale price is 35");
        Assert.assertTrue(pages.vintageShirt().salePriceAfterSAve.getText().substring(2,4).equals("35"));

        extentLogger.info("verify cost is 20");
        Assert.assertTrue(pages.vintageShirt().costAfterSave.getText().substring(2,4).equals("20"));


    }
}
