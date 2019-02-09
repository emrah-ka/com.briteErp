package tests.smoke_tests;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.TestBase;

public class AndrewSmokeTest extends TestBase {
    public void goToDocuments(ExtentTest extentLogger) {

        extentLogger.info("Login as a manager, going to Invoicing page");
        pages.login().loginAsManager();
        extentLogger.info("Open dropdown Documents in Purchases");
        pages.documents().documents.click();
        BrowserUtils.wait(5);
    }

    @Test(description = "http://jira.cybertekschool.com/browse/BRIT-1332")
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


}
