package tests.functional_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PDFReports.AgedPartnerBalance;
import pages.PDFReports.JournalsAudit;
import pages.PDFReports.TaxReport;
import utilities.BrowserUtils;
import utilities.TestBase;

public class TaxReportTest extends TestBase {

    @Test
    public void TaxReportTitleCheck(){

        pages.login().loginAsManager();
        pages.agedPartners().PDFReportsButton.click();

        String title = pages.taxReport().TaxReportTitle.getText();
        Assert.assertEquals(title , "Tax Reports");
        System.out.println("Titles match");
    }

    @Test
    public void taxReportsViewTest(){

        pages.login().loginAsManager();
        pages.agedPartners().PDFReportsButton.click();
        pages.taxReport().TaxReportButton.click();
        pages.taxReport().startDate.click();
        pages.taxReport().startDate.sendKeys("02/10/2019");
        pages.taxReport().endDate.click();
        pages.taxReport().endDate.sendKeys("10/10/2019");
        pages.taxReport().printButton.click();

        BrowserUtils.wait(3);
        String startdate = pages.taxReport().startDate.getText();
        startdate = startdate.replace("/", "-");
        BrowserUtils.wait(3);
        String endDate = pages.taxReport().endDate.getText();
        endDate = endDate.replace("/","-");

        Assert.assertEquals(startdate, "02-10-2019");
        Assert.assertEquals(endDate, "10-10-2019");
        System.out.println("Both dates match");
    }

    @Test
    public void printedTaxReportTitleCheck() {

        pages.login().loginAsManager();
        pages.agedPartners().PDFReportsButton.click();
        pages.taxReport().TaxReportButton.click();
        pages.taxReport().startDate.sendKeys("02/10/2019");
        pages.taxReport().endDate.click();
        pages.taxReport().endDate.sendKeys("10/10/2019");
        pages.taxReport().printButton.click();

        BrowserUtils.wait(3);
        String tax = pages.taxReport().deneme.getText();
        Assert.assertEquals(tax, "Tax Report");

        BrowserUtils.wait(8);
        String title = pages.taxReport().printedTaxReportTitle.getText();
        Assert.assertEquals(title, "Customer InvoicesTax Report");
    }

}
