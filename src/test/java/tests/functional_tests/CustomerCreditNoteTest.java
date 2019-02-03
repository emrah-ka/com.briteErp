package tests.functional_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import  pages.LoginPage;
import pages.configuration_accounting.CustomerCreditNotesPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.TestBase;

public class CustomerCreditNoteTest extends TestBase {

    @Test
    public void printFunctionTest() throws InterruptedException {
        extentLogger = report.createTest("Print Customer Credit Note Test BRIT-784");
        pages.login().loginAsManager();
        extentLogger.info("Opening the credit note page");
        pages.creditNotesPage().open();
        BrowserUtils.wait(10);

        BrowserUtils.waitForClickablility(pages.creditNotesPage().firstCustomer,10);
        extentLogger.info("Click on the first customer credit note");
        pages.creditNotesPage().firstCustomer.click();
        BrowserUtils.wait(5);

        extentLogger.info("Click on the print credit note outer button");
        pages.creditNotesPage().printButton.click();
        BrowserUtils.wait(5);
        extentLogger.info("Click on the print credit note inner button");
        pages.creditNotesPage().innerPrintButton.click();
        Assert.fail("System doesn't print");

    }

    @Test
    public void listOfCustomersDispayTest() throws InterruptedException {

        extentLogger = report.createTest("List of Customers credit notes displays test BRIT-787");
        pages.login().loginAsManager();
        extentLogger.info("Opening the credit note page");
        pages.creditNotesPage().open();
        BrowserUtils.wait(10);
        extentLogger.info("Verifying the customers credit notes displayed");
        BrowserUtils.verifyElementDisplayed(pages.creditNotesPage().customerCreditNoteTable);
    }

    @Test
    public void cancelImportTest() throws InterruptedException {

        extentLogger = report.createTest("Cancel import button test BRIT-801");
        pages.login().loginAsManager();
        extentLogger.info("Opening the credit note page");
        pages.creditNotesPage().open();
        BrowserUtils.wait(10);
        String titleBefore = Driver.getDriver().getTitle();
        extentLogger.info("Clicking on import button");
        pages.creditNotesPage().importButton.click();
        BrowserUtils.wait(5);
        Assert.assertEquals(Driver.getDriver().getTitle(), "Import a File - Odoo");
        extentLogger.info("Clicking on cancel button");
        pages.creditNotesPage().cancelButton.click();
        BrowserUtils.wait(5);
        Assert.assertEquals(Driver.getDriver().getTitle(),titleBefore);
        extentLogger.pass("Cancel button working as expected");

    }


}
