package pages.PDFReports;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AgedPartnerBalance {

    public AgedPartnerBalance() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//span[@class='oe_menu_text'])[79]")
    public WebElement AgedPartnerBalanceButton;

    @FindBy (id = "o_field_input_420")
    public WebElement startDate;

    @FindBy (id = "o_field_input_421")
    public WebElement periodLength;

    @FindBy (xpath = "(//input[@class='o_radio_input'])[1]")
    public WebElement receivableAccountsRadio;

    @FindBy (xpath = "(//input[@class='o_radio_input'])[2]")
    public WebElement payableAccountsRadio;

    @FindBy (xpath = "(//input[@class='o_radio_input'])[3]")
    public WebElement receivablePayableRadio;

    @FindBy (xpath = "(//input[@class='o_radio_input'])[4]")
    public WebElement allPostedRadio;

    @FindBy (xpath = "(//input[@class='o_radio_input'])[5]")
    public WebElement allEntries;

    @FindBy (name = "check_report")
    public WebElement printButton;

    @FindBy (xpath = "//*[@class='btn btn-sm btn btn-default']")
    public WebElement cancelButton;

    @FindBy (xpath = "//div[@class='o_horizontal_separator']")
    public WebElement agedPartnerBalanceTitle;

    @FindBy (xpath = "(//label[@class='o_form_label'])[1]")
    public WebElement agedPartnerBalanceText;

    //PDFReportsButton --- Hamide.
    @FindBy (xpath = "(//span[@class='oe_menu_text'])[77]")
    public WebElement PDFReportsButton;

    @FindBy (xpath = "/t[1]/t[1]/t[1]/div[1]/h2[1]")
    public WebElement getAgedPartnerBalanceReportTitle;

    @FindBy (xpath = "//div[@class='modal-header']")
    public WebElement space;

    @FindBy (xpath = "//div[@class='o_notification_title']")
    public WebElement reportNotification;

    @FindBy (xpath = "//div[@class='o_notification_content']")
    public WebElement reportNotificationText;

}
