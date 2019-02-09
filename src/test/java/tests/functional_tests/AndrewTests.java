package tests.functional_tests;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.TestBase;


import java.util.List;

public class AndrewTests extends TestBase {

    public void goToDocuments(ExtentTest extentLogger) {

        extentLogger.info("Login as a manager, going to Invoicing page");
        pages.login().loginAsManager();
        extentLogger.info("Open dropdown Documents in Purchases");
        pages.documents().documents.click();
        BrowserUtils.wait(5);
    }

    @Test (description = "http://jira.cybertekschool.com/browse/BRIT-1332")
    public void paymentsVerifyTitle() {

        extentLogger = report.createTest("Verify title of Payments page");
        goToDocuments(extentLogger);
        extentLogger.info("Clicking on Payments");
        pages.documents().payments.click();
        BrowserUtils.wait(5);
        extentLogger.info("Memorizing title of the page");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Payments - Odoo";
        expectedTitle.indexOf("Verifying that title is Payments - Odoo");
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test (description = "http://jira.cybertekschool.com/browse/BRIT-1335")
    public void createClickability() {

        extentLogger = report.createTest("Create button should be clickable");
        goToDocuments(extentLogger);
        extentLogger.info("Clicking on Payments");
        pages.documents().payments.click();
        BrowserUtils.wait(5);
        extentLogger.info("Verifying that Create button is clickable");
        Assert.assertTrue(BrowserUtils.isClickable(pages.paymentsPurchaseDocument().create));
    }

    @Test (description = "http://jira.cybertekschool.com/browse/BRIT-1334")
    public void verifyPaymentAmount() {

        extentLogger = report.createTest("User should be able to see same amount in the payments");
        goToDocuments(extentLogger);
        extentLogger.info("Clicking on Payments");
        pages.documents().payments.click();
        BrowserUtils.wait(5);
        extentLogger.info("Memorising first Payment amount in the table");
        String tableAmount = pages.paymentsPurchaseDocument().firstAmount.getText();
        extentLogger.info("Clicking on chosen payment");
        pages.paymentsPurchaseDocument().firstAmount.click();
        extentLogger.info("Memorizing payment amount on new page");
        String receiptAmount = pages.paymentsPurchaseDocument().receiptAmount.getText();
        extentLogger.info("Verifying that same payment amount is displayed");
        Assert.assertEquals(tableAmount,receiptAmount);
    }

    @Test (description = "http://jira.cybertekschool.com/browse/BRIT-1339")
    public void deletePostedPayment() {

        extentLogger = report.createTest("Verify that user can not delete posted payment");
        goToDocuments(extentLogger);
        extentLogger.info("Clicking on Payments");
        pages.documents().payments.click();
        BrowserUtils.wait(5);
        extentLogger.info("Clicking on first checkbox");
        pages.paymentsPurchaseDocument().firstCheckbox.click();
        extentLogger.info("Clicking on \"Action\" dropdown");
        pages.paymentsPurchaseDocument().action.click();
        BrowserUtils.wait(4);
        extentLogger.info("Clicking on \"Delete\"");
        pages.paymentsPurchaseDocument().delete.click();
        BrowserUtils.wait(4);
        extentLogger.info("Click on \"Ok\"");
        pages.paymentsPurchaseDocument().ok.click();
        BrowserUtils.wait(4);
        extentLogger.info("Memorizing displayed message");
        String messageAct = pages.paymentsPurchaseDocument().canNotDeletePostedPayment.getText();
        String messageExp = "You can not delete a payment that is already posted";
        extentLogger.info("Verifying that message matches with expected");
        Assert.assertEquals(messageAct,messageExp);
    }

    @Test (description = "http://jira.cybertekschool.com/browse/BRIT-1320")
    public void vendorCreditNotesVerifyTitle() {

        extentLogger = report.createTest("Verify the title of Vendor Credit Notes");
        goToDocuments(extentLogger);
        extentLogger.info("Clicking on Vendor Credit Notes");
        pages.documents().vendorCreditNotes.click();
        BrowserUtils.wait(7);
        extentLogger.info("Memorizing title of the page");
        String actualTitle = driver.getTitle();
        extentLogger.info("Verifying that the title matches with expected");
        String expectedTitle = "Vendor Credit Notes - Odoo";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test (description = "http://jira.cybertekschool.com/browse/BRIT-1318")
    public void deleteInvoice(){

        extentLogger = report.createTest("Verify that user can not delete \"Vendor Credit Note\" if it's not draft or canceled");
        goToDocuments(extentLogger);
        extentLogger.info("Clicking on Vendor Credit Notes");
        pages.documents().vendorCreditNotes.click();
        BrowserUtils.wait(5);
        extentLogger.info("Clicking on first checkbox");
        pages.vendorCreditNotes().firstCheckbox.click();
        extentLogger.info("Click on dropdown \"Action\"");
        pages.vendorCreditNotes().action.click();
        BrowserUtils.wait(5);
        extentLogger.info("Click on \"Delete\"");
        pages.vendorCreditNotes().delete.click();
        BrowserUtils.wait(5);
        extentLogger.info("Click on \"Ok\"");
        pages.vendorCreditNotes().ok.click();
        BrowserUtils.wait(5);
        extentLogger.info("Verify that system displays \"You cannot delete an invoice which is not draft or cancelled. You should create a credit note instead.\"");
        String messageAct = pages.vendorCreditNotes().canNotDeleteMessage.getText();
        String messageExp = "You cannot delete an invoice which is not draft or cancelled. You should create a credit note instead.";
        Assert.assertEquals(messageAct,messageExp);
    }

    @Test (description = "http://jira.cybertekschool.com/browse/BRIT-1317")
    public void importClickability() {

        extentLogger = report.createTest("Verify that import button is clickable");
        goToDocuments(extentLogger);
        extentLogger.info("Clicking on Vendor Credit Notes");
        pages.documents().vendorCreditNotes.click();
        BrowserUtils.wait(5);
        extentLogger.info("Verifying that import button is clickable");
        Assert.assertTrue(BrowserUtils.isClickable(pages.vendorBills().importButton));
    }

    @Test (description = "http://jira.cybertekschool.com/browse/BRIT-1299")
    public void isNotSelected() {

        extentLogger = report.createTest("Verify that checkbox is not selected by default");
        goToDocuments(extentLogger);
        extentLogger.info("Clicking on Vendor Bills");
        pages.documents().vendorBills.click();
        BrowserUtils.wait(5);
        extentLogger.info("Verify that first checkbox is not selected by default");
        Assert.assertFalse(pages.vendorBills().firstCheckbox.isSelected());
    }

    @Test (description = "http://jira.cybertekschool.com/browse/BRIT-1297")
    public void verifyVendor() {

        extentLogger = report.createTest("Verify Vendor's names");
        goToDocuments(extentLogger);
        extentLogger.info("Clicking on Vendor Bills");
        pages.documents().vendorBills.click();
        BrowserUtils.wait(6);
        extentLogger.info("Memorizing first Vendors name in the table");
        String tableVendor = pages.vendorBills().firstVendor.getText();
        extentLogger.info("Clicking on first Vendor Bill");
        pages.vendorBills().firstVendor.click();
        BrowserUtils.wait(4);
        extentLogger.info("Memorizing Vendors name on opened page");
        String receiptVendor = pages.vendorBills().receiptVendor.getText();
        extentLogger.info("Verifying that names matches");
        Assert.assertEquals(tableVendor,receiptVendor);
    }

    @Test (description = "http://jira.cybertekschool.com/browse/BRIT-1307")
    public void vendorBillsVerifyTitle() {

        extentLogger = report.createTest("Verify title of Vendor Bills page");
        goToDocuments(extentLogger);
        extentLogger.info("Clicking on Vendor Bills");
        pages.documents().vendorBills.click();
        BrowserUtils.wait(5);
        extentLogger.info("Memorizing title of the page");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Vendor Bills - Odoo";
        extentLogger.info("Verifying that the title matches with expected");
        Assert.assertEquals(actualTitle,expectedTitle);
    }



}