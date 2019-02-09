package pages.PDFReports;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class JournalsAudit {

    public JournalsAudit () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//input[@class='o_radio_input'])[1]")
    public WebElement allPostedEntriesRadioButton;

    @FindBy (xpath = "(//input[@class='o_radio_input'])[2]")
    public WebElement allEntriesRadioButton;

    @FindBy(xpath = "(//div[@class='o_field_radio o_vertical o_field_widget o_required_modifier'])[1]")
    public WebElement targetMoves;

    @FindBy (xpath = "(//div[@class='o_field_radio o_vertical o_field_widget o_required_modifier'])[2]")
    public WebElement entriesSortedBy;

    @FindBy (xpath = "(//input[@class='o_radio_input'])[3]")
    public WebElement dateRadioButton;

    @FindBy (id = "(//input[@class='o_radio_input'])[4]")
    public WebElement journalEntryNumberRadioButton;

    @FindBy (xpath = "(//span[@class='oe_menu_text'])[78]")
    public WebElement journalsAuditButton;

    @FindBy (xpath = "//*[@class='modal-title']")
    public WebElement journalsAuditTitle;

    @FindBy (xpath = "(//input[@class='o_datepicker_input o_input'])[1]")
    public WebElement startDate;

    @FindBy (xpath = "(//input[@class='o_datepicker_input o_input'])[2]")
    public WebElement endDate;

    @FindBy (xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement journals;

    @FindBy (xpath = "//*[@class='btn btn-sm oe_highlight']")
    public WebElement printButton;

    @FindBy (xpath = "//button[@class='btn btn-sm btn btn-default']")
    public WebElement cancelButton;
}
