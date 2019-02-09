package pages.purchasesDocuments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VendorBills {

    public VendorBills() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importButton;

    @FindBy (xpath = "(//div[@class='o_checkbox'])[4]")
    public WebElement firstCheckbox;

    @FindBy (xpath = "//td[@class='o_data_cell o_required_modifier']")
    public WebElement firstVendor;

    @FindBy (xpath = "//a[@name='partner_id']")
    public WebElement receiptVendor;
}