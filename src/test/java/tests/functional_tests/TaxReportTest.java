package tests.functional_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PDFReports.AgedPartnerBalance;
import pages.PDFReports.JournalsAudit;
import pages.PDFReports.TaxReport;
import utilities.TestBase;

public class TaxReportTest extends TestBase {

    AgedPartnerBalance agedPartnerBalance;
    LoginPage loginPage;
    JournalsAudit journalsAudit;
    TaxReport taxReport;


    @Test
    public void TaxReportTitleCheck(){
        pages.login().loginAsManager();
        pages.agedPartners().PDFReportsButton.click();

        String title = taxReport.TaxReportTitle.getText();
        Assert.assertEquals(title , "Tax Reports");
        System.out.println("Titles match");
    }
}