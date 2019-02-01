package pages.configuration_accounting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class TaxesPage {
    public TaxesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void open() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @FindBy(className = "btn btn-primary btn-sm o_list_button_add")
    public WebElement createBtn;

    @FindBy(className = "btn btn-sm btn-default o_button_import")
    public WebElement importBtn;






}
