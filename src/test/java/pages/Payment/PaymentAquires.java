package pages.Payment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class PaymentAquires  {


    public PaymentAquires() {
        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']//li[8]/a/span")
    public  WebElement invoicing;

    @FindBy(xpath = "(//div[@class = 'o_list_buttons']//button)[1]")
    public WebElement createButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importButton;

    @FindBy(xpath =  "(//li[@class='active'])[1]")
    public WebElement PaymentAcquirersPageHeader;

    @FindBy(xpath = "//li[.='New']")
    public WebElement newTagOnCreatingPage;

    @FindBy(xpath = "oe_menu_text")
    public WebElement paymentLink;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[62]")
    public WebElement paymentAcquirersLink;



}