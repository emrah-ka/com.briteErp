package pages.configuration_accounting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class DocumentsPage {

    public void open() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


    public DocumentsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-menu='205']")
    public WebElement documents;

    @FindBy(xpath = "//a[@data-menu='224']")
    public WebElement payments;

    @FindBy(xpath = "//a[@data-menu='242']")
    public WebElement vendorCreditNotes;

//        @FindBy(xpath = "//a[@class='login']")
//        public WebElement submit;
//
//        public void login(String name, String password) {
//            this.username.sendKeys(name);
//            this.password.sendKeys(password);
//            this.loginClickButton.click();
//        }






}