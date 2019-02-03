package pages.configurationAccounting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

public class TaxesPage {
    public TaxesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public WebElement  savedTaxOnPage() {
    return Driver.getDriver().findElement(By.xpath("//td[@class='o_data_cell o_required_modifier'][contains(text(),'"+ConfigurationReader.getProperty("fakedataname")+"')]"));
    }

    @FindBy(xpath = "(//li[@class='active'])[3]")
    public WebElement pageName;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createBtn;

    @FindBy(className = "btn btn-sm btn-default o_button_import")
    public WebElement importBtn;

    @FindBy(xpath = "(//input[contains(@id,'o_field_input')])[1]")
    public WebElement newTaxName;

    @FindBy(xpath = "(//input[contains(@id,'o_field_input')])[2]")
    public WebElement newPercentageAmount;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement newSaveButton;

    @FindBy(xpath = "//*[@class='o_field_char o_field_widget o_required_modifier'][@name='name']")
    public WebElement savedTitleName;

    @FindBy(xpath = "//*[@class='o_field_float o_field_number o_field_widget o_required_modifier oe_inline'][@name='amount']")
    public WebElement savedPercentage;

    @FindBy(className = "o_list_view table table-condensed table-striped o_list_view_ungrouped")
    public List<WebElement> taxesTable;






}
