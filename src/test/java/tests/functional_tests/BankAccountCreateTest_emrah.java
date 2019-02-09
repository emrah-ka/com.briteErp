package tests.functional_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.TestBase;

public class BankAccountCreateTest_emrah extends TestBase {

    @Test
    public void bankAccountCreateTestAsManager(){
        extentLogger = report.createTest("Tax Create Function Test");
        extentLogger.info("Verify the Bank Accounts page that under Accounting Configuration menu is up and running");
        extentLogger.info("Log in as Manager");
        pages.login().loginAsManager();
        BrowserUtils.wait(5);

        extentLogger.info("Go to Bank Account Page");
        pages.bankaccounts().getBankAccountPage();
        BrowserUtils.wait(6);

        extentLogger.info("Click to Create Bank Account button");
        pages.bankaccounts().createBtn.click();

        extentLogger.info("Use template information to create new Bank Account");
        pages.bankaccounts().bankNameField.sendKeys(ConfigurationReader.getProperty("bankaccountname"));
        pages.bankaccounts().bankAccount.sendKeys(ConfigurationReader.getProperty("bankaccountnum"));
        pages.bankaccounts().bankAccount.sendKeys(Keys.TAB);
        pages.bankaccounts().bankAccountNum.sendKeys(ConfigurationReader.getProperty("bankaccountnum"));
        pages.bankaccounts().bankAccount.sendKeys(Keys.TAB);
        pages.bankaccounts().bankName.sendKeys(ConfigurationReader.getProperty("bankaccountname"));
        pages.bankaccounts().bankAccount.sendKeys(Keys.TAB);
        pages.bankaccounts().createABankAccntBtn.click();
        pages.bankaccounts().newSaveButton.click();

        extentLogger.info("Check after created, Bank Account information right");
        softAssertion.assertEquals(Driver.getDriver().findElement(By.xpath(
                "//span[@class='o_field_char o_field_widget o_required_modifier']")).getText(),
                ConfigurationReader.getProperty("bankaccountname"));

        extentLogger.info("Check created Bank Account information is shown on Bank Account Page");
        pages.bankaccounts().getBankAccountPage();
        BrowserUtils.wait(6);
        softAssertion.assertTrue(pages.bankaccounts().isDisplayed());

        softAssertion.assertEquals(pages.bankaccounts().savedBankAcctnOnPage().getText(),ConfigurationReader.getProperty("bankaccountname"));

        pages.bankaccounts().getBankAccountPage();
        BrowserUtils.wait(5);
        pages.bankaccounts().savedBankAcctnOnPage().click();
        BrowserUtils.wait(7);
        extentLogger.info("Go to Action than Delete it");
        pages.bankaccounts().actionButton.click();
        pages.bankaccounts().deleteBtn.click();
        pages.bankaccounts().okButtonAfterDelete.click();

        pages.bankaccounts().getBankAccountPage();

        extentLogger.info("Check deleted Bank Account information is not shown on Bank Account Page");
        BrowserUtils.wait(5);
        Driver.getDriver().navigate().refresh();
        softAssertion.assertFalse(pages.bankaccounts().isDisplayed());
    }

    @Test
    public void bankAccountCreateTestAsUser(){
        extentLogger = report.createTest("Tax Create Function Test");
        extentLogger.info("Verify the Bank Accounts page that under Accounting Configuration menu is up and running");
        extentLogger.info("Log in as Manager");
        pages.login().loginAsUser();
        BrowserUtils.wait(5);

        extentLogger.info("Go to Bank Account Page");
        pages.bankaccounts().getBankAccountPage();
        BrowserUtils.wait(6);

        extentLogger.info("Click to Create Bank Account button");
        pages.bankaccounts().createBtn.click();

        extentLogger.info("Use template information to create new Bank Account");
        pages.bankaccounts().bankNameField.sendKeys(ConfigurationReader.getProperty("bankaccountname"));
        pages.bankaccounts().bankAccount.sendKeys(ConfigurationReader.getProperty("bankaccountnum"));
        pages.bankaccounts().bankAccount.sendKeys(Keys.TAB);
        pages.bankaccounts().bankAccountNum.sendKeys(ConfigurationReader.getProperty("bankaccountnum"));
        pages.bankaccounts().bankAccount.sendKeys(Keys.TAB);
        pages.bankaccounts().bankName.sendKeys(ConfigurationReader.getProperty("bankaccountname"));
        pages.bankaccounts().bankAccount.sendKeys(Keys.TAB);
        pages.bankaccounts().createABankAccntBtn.click();
        pages.bankaccounts().newSaveButton.click();

        extentLogger.info("Check after created, Bank Account information right");
        softAssertion.assertEquals(Driver.getDriver().findElement(By.xpath(
                "//span[@class='o_field_char o_field_widget o_required_modifier']")).getText(),
                ConfigurationReader.getProperty("bankaccountname"));

        extentLogger.info("Check created Bank Account information is shown on Bank Account Page");
        pages.bankaccounts().getBankAccountPage();
        BrowserUtils.wait(6);
        softAssertion.assertTrue(pages.bankaccounts().isDisplayed());

        softAssertion.assertEquals(pages.bankaccounts().savedBankAcctnOnPage().getText(),ConfigurationReader.getProperty("bankaccountname"));

        pages.bankaccounts().getBankAccountPage();
        BrowserUtils.wait(5);
        pages.bankaccounts().savedBankAcctnOnPage().click();
        BrowserUtils.wait(7);
        extentLogger.info("Go to Action than Delete it");
        pages.bankaccounts().actionButton.click();
        pages.bankaccounts().deleteBtn.click();
        pages.bankaccounts().okButtonAfterDelete.click();

        pages.bankaccounts().getBankAccountPage();

        extentLogger.info("Check deleted Bank Account information is not shown on Bank Account Page");
        BrowserUtils.wait(5);
        Driver.getDriver().navigate().refresh();
        softAssertion.assertFalse(pages.bankaccounts().isDisplayed());
    }



}
