package pages.PDFReports;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class JournalsAudit {

    public JournalsAudit () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "radio280_posted")
    public WebElement allPostedEntriesRadioButton;

    @FindBy (id = "radio280_all")
    public WebElement allEntriesRadioButton;

    @FindBy(xpath = "(//div[@class='o_field_radio o_vertical o_field_widget o_required_modifier'])[1]")
    public WebElement targetMoves;

    @FindBy (xpath = "(//div[@class='o_field_radio o_vertical o_field_widget o_required_modifier'])[2]")
    public WebElement entriesSortedBy;

    @FindBy (id = "radio311_date")
    public WebElement dateRadioButton;

    @FindBy (id = "radio311_move_name")
    public WebElement journalEntryNumberRadioButton;

    @FindBy (xpath = "(//span[@class='oe_menu_text'])[78]")
    public WebElement journalsAuditButton;

    @FindBy (xpath = "//*[@class='modal-title']")
    public WebElement journalsAuditTitle;

    @FindBy (id = "o_field_input_313")
    public WebElement startDate;

    @FindBy (id = "o_field_input_314")
    public WebElement endDate;

    @FindBy (id = "o_field_input_315")
    public WebElement journals;

    @FindBy (xpath = "//*[@class='btn btn-sm oe_highlight']")
    public WebElement printButton;

    @FindBy (xpath = "//button[@class='btn btn-sm btn btn-default']")
    public WebElement cancelButton;
}