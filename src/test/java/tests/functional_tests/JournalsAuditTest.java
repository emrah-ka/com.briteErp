package tests.functional_tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PDFReports.AgedPartnerBalance;
import pages.PDFReports.JournalsAudit;
import pages.PDFReports.TaxReport;
import utilities.BrowserUtils;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class JournalsAuditTest extends TestBase {

    AgedPartnerBalance agedPartnerBalance;
    LoginPage loginPage;
    JournalsAudit journalsAudit;
    TaxReport taxReport;

    @Test
    public void JournalsAuditTitleCheck() {
        pages.login().loginAsManager();
        pages.agedPartners().PDFReportsButton.click();
        journalsAudit.journalsAuditButton.click();

        String title = journalsAudit.journalsAuditTitle.getText();
        Assert.assertEquals(title, "Journals Audit");
        System.out.println("Titles match");
    }

    @Test
    public void mainPageUnderPDFReportsTitlesCheck() {
        pages.login().loginAsManager();
        pages.agedPartners().PDFReportsButton.click();

        String journalsAuditTitleMainPage = journalsAudit.journalsAuditButton.getText();
        String agedPartnerBalanceTitleMainPage = agedPartnerBalance.AgedPartnerBalanceButton.getText();
        String taxReportTitleMainPage = taxReport.TaxReportButton.getText();

        Assert.assertEquals(journalsAuditTitleMainPage, "Journals Audit");
        Assert.assertEquals(agedPartnerBalanceTitleMainPage, "Aged Partner Balance");
        Assert.assertEquals(taxReportTitleMainPage, "Tax Report");
        System.out.println("All titles match");
    }

    @Test
    public void journalsAuditFullClickabilityCheck() {
        pages.login().loginAsManager();
        pages.agedPartners().PDFReportsButton.click();
        pages.journalsAudit().journalsAuditButton.click();

        BrowserUtils.wait(3);
        journalsAudit.allEntriesRadioButton.click();
        journalsAudit.dateRadioButton.click();

        BrowserUtils.wait(3);
        journalsAudit.startDate.sendKeys("02/02/2019");
        journalsAudit.endDate.click();
        journalsAudit.endDate.sendKeys("03/03/2019");
        journalsAudit.journals.click();
        journalsAudit.cancelButton.click();

        System.out.println("All tests passed for journalsAuditFullClickabilityCheck");
    }
}
