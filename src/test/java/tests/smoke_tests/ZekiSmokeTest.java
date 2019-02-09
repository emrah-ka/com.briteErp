package tests.smoke_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.TestBase;


public class ZekiSmokeTest extends TestBase {


    @Test
    public void positiveLogin() {
        extentLogger = report.createTest("positive login test");

        extentLogger.info("open url");
        pages.login().open();

        extentLogger.info("create login page title");
        String loginTitle = Driver.getDriver().getTitle();

        extentLogger.info("click on BriteErpDemo ");
        pages.login().briteErpDatabaseBtn.click();
        BrowserUtils.wait(3);

        extentLogger.info("enter user name and password");
        pages.login().username.sendKeys(ConfigurationReader.getProperty("username2"));
        pages.login().password.sendKeys(ConfigurationReader.getProperty("password2"));

        extentLogger.info("click on login button");
        pages.login().loginButton.click();
        BrowserUtils.wait(3);

        extentLogger.info("verify login is successfull");
        Assert.assertFalse(loginTitle.equals(Driver.getDriver().getTitle()));

    }

    @Test
    public void verifyTitles() {
        extentLogger = report.createTest("verifying functionalities");

        extentLogger.info("open url");
        pages.login().open();

        extentLogger.info("login as a user and click on invoicing");
        pages.login().loginAsUser();
        BrowserUtils.wait(3);


        extentLogger.info("verify titles");
        for(int i=1;i<pages.login().list.size();i++){

            switch(pages.login().list.get(i).getText().trim()){
                case "Master Data":
                    pages.login().list.get(i).click();
                    BrowserUtils.wait(6);
                    Assert.assertTrue(Driver.getDriver().getTitle().equals("Customer Invoices - Odoo"));
                    break;
                case "Vendors":
                    pages.login().list.get(i).click();
                    BrowserUtils.wait(10);
                    Assert.assertTrue(Driver.getDriver().getTitle().equals("Vendors - Odoo"));
                    break;
                case "Purchasable Products":
                    pages.login().list.get(i).click();
                    BrowserUtils.wait(6);
                    Assert.assertTrue(Driver.getDriver().getTitle().equals("Purchasable Products - Odoo"));
                    break;

            }

        }
    }


    @Test
    public void verifyFunction(){
        extentLogger = report.createTest("Erkins  functionality test");
        extentLogger.info("Verify the Erkins Functionality");

        extentLogger.info("click on vendors");
        pages.vendors().clickOnVendors();

        extentLogger.info("create vendors url");
        String vendorsUrl= Driver.getDriver().getCurrentUrl();

        extentLogger.info("verify that erkins is clickable");
        Assert.assertTrue(BrowserUtils.isClickable(pages.vendors().erkins));

        extentLogger.info("click on Erkins");
        pages.vendors().erkins.click();
        BrowserUtils.wait(2);

        extentLogger.info("create erkins url");
        String erkinsUrl= Driver.getDriver().getCurrentUrl();

        extentLogger.info("verify that the url is changed");
        Assert.assertFalse(erkinsUrl.equals(vendorsUrl));
    }





}
