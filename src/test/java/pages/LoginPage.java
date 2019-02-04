package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;


public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void open() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @FindBy(id = "login")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement loginButton;

    @FindBy(className = "alert alert-danger")
    public WebElement errorMessage;

    @FindBy(xpath = "//*[@href='/web?db=BriteErpDemo']")
    public WebElement briteErpDatabaseBtn;

    @FindBy(xpath = "(//span[@class ='oe_menu_text'])[8]")
    public WebElement invoicingLink;

    @FindBy(xpath = "//a[@data-menu='218']")
    public WebElement conf_accnt;

    @FindBy(xpath = "//a[@data-menu='229']")
    public WebElement conf_acctn_taxes_link;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[83]")
    public WebElement conf_acctn_FiscalPos_link;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[84]")
    public WebElement conf_acctn_BankAccounts_link;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[85]")
    public WebElement conf_acctn_Journal_link;


    public void login(String usr, String pass)  {
        briteErpDatabaseBtn.click();
        BrowserUtils.wait(2);
        username.sendKeys(usr);
        password.sendKeys(pass);
        loginButton.click();
        BrowserUtils.wait(6);
        invoicingLink.click();
    }

    public void loginAsManager()  {
        briteErpDatabaseBtn.click();
        BrowserUtils.wait(3);
        username.sendKeys(ConfigurationReader.getProperty("username1"));
        password.sendKeys(ConfigurationReader.getProperty("password1"));
        loginButton.click();
        BrowserUtils.wait(6);
       invoicingLink.click();
    }

    public void loginAsUser()  {
        briteErpDatabaseBtn.click();
        BrowserUtils.wait(3);
        username.sendKeys(ConfigurationReader.getProperty("username2"));
        password.sendKeys(ConfigurationReader.getProperty("password2"));
        loginButton.click();
        BrowserUtils.wait(6);
      invoicingLink.click();
    }

}
