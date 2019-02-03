package pages.configuration_accounting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class CustomerCreditNotesPage {
    public CustomerCreditNotesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//ul[@class='oe_secondary_submenu nav nav-pills nav-stacked']/li[2]/a)[12]")
    public WebElement customerCreditNoteButton;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']")
    public WebElement customerCreditNoteTable;

    @FindBy(xpath = "(//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr/td)[2]")
    public WebElement firstCustomer;

    @FindBy(xpath = "//button[.='Print Invoice'][2]")
    public WebElement printButton;

    @FindBy(xpath = "//button[@title='Print']")
    public WebElement innerPrintButton;

    @FindBy(xpath = "//div[@class='o_list_buttons']/button[@class='btn btn-sm btn-default o_button_import']  ")
    public WebElement importButton;

    @FindBy(xpath = "//button[.='Cancel']")
    public WebElement cancelButton;


    public void open () throws InterruptedException {
        BrowserUtils.waitForClickablility(customerCreditNoteButton,10);
        customerCreditNoteButton.click();
    }

}
