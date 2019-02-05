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


}