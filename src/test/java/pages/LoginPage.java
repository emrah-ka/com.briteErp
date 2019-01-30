package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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

    @FindBy(className = "btn btn-primary")
    public WebElement loginButton;

    @FindBy(className = "alert alert-danger")
    public WebElement errorMessage;


    public void login(String usr, String pass) {
        username.sendKeys(usr);
        password.sendKeys(pass);
        loginButton.click();
    }


}
