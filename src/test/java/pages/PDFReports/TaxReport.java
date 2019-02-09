package pages.PDFReports;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TaxReport {

    public TaxReport () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[80]")
    public WebElement TaxReportButton;

    @FindBy (xpath = "(//input[@class='o_datepicker_input o_input'])[1]")
    public WebElement startDate;

    @FindBy (xpath = "(//input[@class='o_datepicker_input o_input'])[2]")
    public WebElement endDate;

    @FindBy(xpath = "//*[@name='check_report']")
    public WebElement printButton;

    @FindBy (xpath = "//*[@class='btn btn-sm btn btn-default']")
    public WebElement cancelButton;

    @FindBy (xpath = "//*[@class='modal-title']")
    public WebElement TaxReportTitle;

    @FindBy (xpath = "//div[@class='page']//h3")
    public WebElement printedTaxReportTitleSecond;

    @FindBy (xpath = "//*[.='2019-02-08']")
    public WebElement printedFromDate;

    @FindBy (xpath = "//*[.='2019-02-10']")
    public WebElement printedEndDate;

    @FindBy (xpath = "//div[@class='o_control_panel']")
    public WebElement printedTaxReportTitle;

    @FindBy(xpath = "//div[@class='page']//h3")
    public WebElement deneme;

}



Collapse 
5:23 PM
AgedPartnerBalanceTest 
package tests.functional_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PDFReports.AgedPartnerBalance;
import pages.PDFReports.JournalsAudit;
import pages.PDFReports.TaxReport;
import utilities.BrowserUtils;
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

    @Test

    public void AgedPartnerBalanceFullClickabilityCheck (){
        pages.login().loginAsManager();
        pages.agedPartners().PDFReportsButton.click();
        pages.agedPartners().AgedPartnerBalanceButton.click();

        BrowserUtils.wait(3);
        String agedPartnerBalanceText = pages.agedPartners().agedPartnerBalanceText.getText();
        String agedPartnerBalanceTextExpected = "Aged Partner Balance is a more detailed report of your receivables by intervals. Odoo calculates a table of credit balance by start Date. So if you request an interval of 30 days Odoo generates an analysis of creditors for the past month, past two months, and so on.";
        Assert.assertEquals(agedPartnerBalanceText , agedPartnerBalanceTextExpected);
        System.out.println("agedPartnerBalanceTexts are matching");

        pages.agedPartners().space.click();

        BrowserUtils.waitForClickablility(pages.agedPartners().payableAccountsRadio, 2);
        pages.agedPartners().payableAccountsRadio.click();
        BrowserUtils.waitForClickablility(pages.agedPartners().receivablePayableRadio, 2);
        pages.agedPartners().receivablePayableRadio.click();
        BrowserUtils.waitForClickablility(pages.agedPartners().allEntries, 2);
        pages.agedPartners().allEntries.click();
        pages.agedPartners().printButton.click();
        String agedPartnerBalanceTitle = "Aged Partner Balance";
        Assert.assertEquals(agedPartnerBalanceTitle , "Aged Partner Balance");
        System.out.println("All tests passed for agedPartnerBalanceFullClickabilityCheck");
    }
    @Test
    public void checkReportNotification(){
        pages.login().loginAsManager();
        pages.agedPartners().PDFReportsButton.click();
        pages.agedPartners().AgedPartnerBalanceButton.click();
        pages.agedPartners().space.click();

        pages.agedPartners().receivablePayableRadio.click();
        pages.agedPartners().allEntries.click();

        pages.agedPartners().printButton.click();

        String title = pages.agedPartners().reportNotification.getText();
        Assert.assertEquals("Report", title);
        System.out.println("Report titles match");
        BrowserUtils.wait(3);
      String reportNotificationTexts = pages.agedPartners().reportNotificationText.getText();
      Assert.assertEquals(reportNotificationTexts, "Unable to find Wkhtmltopdf on this system. The report will be shown in html." );
      System.out.println("Report texts match");
//

    }

}
