package tests.smoke_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.TestBase;

import static org.testng.Assert.fail;

public class CheckTitleTest extends TestBase {


    @Test
    public void taxesTitleTest(){
        extentLogger = report.createTest("Invoice functionality test");
        extentLogger.info("Verify the Accounting Configuration Taxes page up and running");
        extentLogger.info("Log in as Manager");
        pages.login().loginAsManager();
        BrowserUtils.wait(5);
        extentLogger.info("Go to invoicing function");
        pages.login().invoicingLink.click();
        pages.login().conf_accnt.click();
        extentLogger.info("Click on Taxes in Account Configuration");
        pages.login().conf_acctn_taxes_link.click();
        BrowserUtils.wait(6);
        extentLogger.info("Verify the page header is Taxes");
        softAssertion.assertEquals(pages.taxes().pageName.getText(),"Taxes");
        softAssertion.assertAll();


    }

    @Test
    public void fiscalPositionsTitleTest(){
        extentLogger = report.createTest("Invoice functionality test");
        extentLogger.info("Verify the Accounting Configuration Fiscal Positions page up and running");
        extentLogger.info("Log in as Manager");
        pages.login().loginAsManager();
        BrowserUtils.wait(5);
        extentLogger.info("Go to invoicing function");
        pages.login().invoicingLink.click();
        pages.login().conf_accnt.click();
        extentLogger.info("Click on Fiscal Positions in Account Configuration");
        pages.login().conf_acctn_FiscalPos_link.click();
        BrowserUtils.wait(6);
        extentLogger.info("Verify the page header is Fiscal Positions");
        softAssertion.assertEquals(pages.taxes().pageName.getText(), "Fiscal Posit;;;ions");
        softAssertion.assertAll();

    }

    @Test
    public void JournalsTitleTest(){
        extentLogger = report.createTest("Invoice functionality test");
        extentLogger.info("Verify the Accounting Configuration Journals page up and running");
        extentLogger.info("Log in as Manager");
        pages.login().loginAsManager();
        BrowserUtils.wait(5);
        extentLogger.info("Go to invoicing function");
        pages.login().invoicingLink.click();
        pages.login().conf_accnt.click();
        extentLogger.info("Click on Journals in Account Configuration");
        pages.login().conf_acctn_Journal_link.click();
        BrowserUtils.wait(6);
        extentLogger.info("Verify the page header is Journals");
        softAssertion.assertEquals(pages.taxes().pageName.getText(),"Journals");
        softAssertion.assertAll();
    }

    @Test
    public void BankAccountsTitleTest(){
        extentLogger = report.createTest("Invoice functionality test");
        extentLogger.info("Verify the Accounting Configuration Bank Accounts page up and running");
        extentLogger.info("Log in as Manager");
        pages.login().loginAsManager();
        BrowserUtils.wait(5);
        extentLogger.info("Go to invoicing function");
        pages.login().invoicingLink.click();
        pages.login().conf_accnt.click();
        extentLogger.info("Click on Bank Accounts in Account Configuration");
        pages.login().conf_acctn_BankAccounts_link.click();
        BrowserUtils.wait(6);
       // System.out.println(Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/ol/li")));
        softAssertion.assertEquals(pages.taxes().pageName.getText(),"Bank Accounts");
        softAssertion.assertAll();
    }



}
