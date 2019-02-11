package tests.functional_tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.TestBase;

public class VendorCreateTest extends TestBase {
    Select select;
    BrowserUtils br;


    @Test
    public void createVendor(){
        extentLogger = report.createTest("Create vendor test");

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

        //TODO
          extentLogger.info("enter the city name");
//        pages.newVendor().cityInput.click();
//        pages.newVendor().cityInput.sendKeys("Hershey");

        //TODO
        extentLogger.info("enter the state name");
        //select=new Select(pages.newVendor().stateInput);
        //br.selectRandomTextFromDropdown(select);
//        pages.newVendor().stateInput.click();
//        pages.newVendor().stateInput.sendKeys("Virginia");

//        extentLogger.info("enter the zipcode");
//        pages.newVendor().zipCodeInput.click();
//        pages.newVendor().zipCodeInput.sendKeys("44789");
        //TODO
        extentLogger.info("select country from  list");
//        pages.newVendor().countryDropDown.click();
//        BrowserUtils.wait(3);
//        //pages.newVendor().countryDropDown.sendKeys("United States");
//        pages.newVendor().andorraButton.click();

//        extentLogger.info("enter mobile phone");
//        pages.newVendor().mobilePhoneInput.sendKeys("5324789874");
//
//        extentLogger.info("enter email");
//        pages.newVendor().emailInput.sendKeys("fit47@gmail.com");
//
//        extentLogger.info("enter website");
//        pages.newVendor().websiteInput.sendKeys("www.odoo.com");

        extentLogger.info("click on create button");
        pages.newVendor().saveButton.click();

        BrowserUtils.wait(3);

        Assert.assertTrue(Driver.getDriver().
                getTitle().contains(pages.newVendor().companyName.getText()));








    }
}
