package pages.purchasesDocuments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VendorCreditNotes {

    public VendorCreditNotes() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//input[@type='checkbox'])[4]")
    public WebElement firstCheckbox;

    @FindBy (xpath = "(//button[@data-toggle='dropdown'])[2]")
    public WebElement action;

    @FindBy (xpath = "//a[contains(text(),'Delete')]")
    public WebElement delete;

    @FindBy (xpath = "//div[@class='modal-footer']//span[.='Ok']")
    public WebElement ok;

    @FindBy (xpath = "//div[@class='o_dialog_warning modal-body']")
    public WebElement canNotDeleteMessage;


}