package pages.configurationAccounting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Journals {
    public Journals(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//li[@class='active'])[3]")
    public WebElement pageName;

}
