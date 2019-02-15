package tests.functional_tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.TestBase;

public class VendorCreateTest extends TestBase {


    @Test
    public void createVendor(){
        extentLogger = report.createTest("create new vendor test");

        extentLogger.info("click on vendors");
        pages.vendors().clickOnVendors();

        extentLogger.info("click on create new vendor button");
        pages.vendors().createVendorButton.click();
        BrowserUtils.wait(2);

        extentLogger.info("select  radio button  company");
        pages.newVendor().companyRadioButton.click();

        extentLogger.info("enter company name");
        pages.newVendor().companyNameInput.sendKeys("TreeStar");

        extentLogger.info("enter the company address");
        pages.newVendor().streetInput.click();
        pages.newVendor().streetInput.sendKeys("5478  South Street");
        BrowserUtils.wait(3);


        extentLogger.info("enter the city name");
        pages.newVendor().cityInput.click();
        pages.newVendor().cityInput.sendKeys("Hershey");


        extentLogger.info("click on create button");
        pages.newVendor().saveButton.click();

        BrowserUtils.wait(3);
        System.out.println(pages.newVendor().companyName.getText());

        Assert.assertTrue(Driver.getDriver().
                getTitle().contains(pages.newVendor().companyName.getText()));








    }
}
