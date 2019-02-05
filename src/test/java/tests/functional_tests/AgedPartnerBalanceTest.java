package tests.functional_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PDFReports.AgedPartnerBalance;
import pages.PDFReports.JournalsAudit;
import pages.PDFReports.TaxReport;
import utilities.TestBase;

public class AgedPartnerBalanceTest extends TestBase {

    @Test
    public void AgedPartnerBalanceTitleCheck(){
        pages.login().loginAsManager();
        pages.agedPartners().PDFReportsButton.click();
        pages.agedPartners().AgedPartnerBalanceButton.click();
        String title = pages.agedPartners().agedPartnerBalanceTitle.getText();
        Assert.assertEquals(title , "Aged Partner Balance");
        System.out.println("Titles match");
    }
}