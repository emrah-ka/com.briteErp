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

    @FindBy (id = "radio422_customer")
    public WebElement receivableAccountsRadio;

    @FindBy (id = "radio422_supplier")
    public WebElement payableAccountsRadio;

    @FindBy (id = "radio422_customer_supplier")
    public WebElement receivablePayableRadio;

    @FindBy (id = "radio424_posted")
    public WebElement allPostedRadio;

    @FindBy (id = "radio424_all")
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

}