package pages.purchasesDocuments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Payments {

    public Payments() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//button[@accesskey='c']")
    public WebElement create;

    @FindBy (xpath = "//td[@class='o_data_cell o_list_number o_required_modifier']")
    public WebElement firstAmount;

    @FindBy (xpath = "//span[@name='amount']")
    public WebElement receiptAmount;

    @FindBy (xpath = "//td[@width='1']")
    public WebElement firstCheckbox;

    @FindBy (xpath = "(//button[@data-toggle='dropdown'])[2]")
    public WebElement action;

    @FindBy(xpath = "//a[contains(text(),'Delete')]")
    public WebElement delete;

    @FindBy (xpath = "//div[@class='modal-footer']//span[.='Ok']")
    public WebElement ok;

    @FindBy (xpath = "//div[@class='o_dialog_warning modal-body']")
    public WebElement canNotDeletePostedPayment;





}