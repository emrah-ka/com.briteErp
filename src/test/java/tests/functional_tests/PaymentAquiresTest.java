package tests.functional_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Payment.PaymentAquires;
import utilities.BrowserUtils;
import utilities.TestBase;

import javax.sql.rowset.BaseRowSet;

public class PaymentAquiresTest extends TestBase {



    @Test
    public void  VerifyingNumberOfPayments(){
        extentLogger=report.createTest("Brite Invoice module/payment section");
        extentLogger.info("Loging to the application");

        extentLogger.info("loging in as a user");
        pages.login().loginAsUser();
        BrowserUtils.wait(5);

        extentLogger.info("cliccking on the invicing module");
        pages.peymentAquires().invoicing.click();
        BrowserUtils.wait(6);

        pages.peymentAquires().paymentLink.click();

        pages.peymentAquires().paymentAcquirersLink.click();
        BrowserUtils.wait(3);

        extentLogger.info("clicking on the create button");
        pages.peymentAquires().createButton.click();

        Assert.assertEquals("New",pages.peymentAquires().PaymentAcquirersPageHeader.getText());









    }
//   @Test
    // public void Verifying
}