package tests.functional_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Pages;
import utilities.TestBase;

public class NewProductTest extends TestBase {

    @Test
    public void newProduct(){
        extentLogger = report.createTest("new product  test");

        extentLogger.info("entering login information");
        pages.login().loginAsUser();

        extentLogger.info("click on master data");
        pages.vendors().masterDataButton.click();

        BrowserUtils.wait(2);

        extentLogger.info("click on purchasable products");
        pages.purchasablePro().purchasableProductsButton.click();

        extentLogger.info("click on create button");
        //BrowserUtils.waitForClickablility(pages.purchasablePro().createButton,10);
        BrowserUtils.wait(5);
        pages.purchasablePro().createButton.click();
        BrowserUtils.wait(3);

        extentLogger.info("enter the product name");
        pages.newProduct().productNameInput.sendKeys("iphone 7");

        extentLogger.info("enter the product price");
        pages.newProduct().productPriceInput.click();
        pages.newProduct().productPriceInput.sendKeys("750");

        extentLogger.info("enter the cost");
        pages.newProduct().costInput.click();
        pages.newProduct().costInput.sendKeys("0");

        extentLogger.info("click on save button");
        pages.newProduct().saveButton.click();
        BrowserUtils.wait(4);

        extentLogger.info("verify the saved product");
        Assert.assertTrue(pages.newProduct().savedProduct.getText().equals("iphone 7"));








    }
}
