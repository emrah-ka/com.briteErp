package pages.puchasesMasterData;

import gherkin.lexer.Pa;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IpadMini2Page {

    public IpadMini2Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='o_field_char o_field_widget o_required_modifier']")
    public WebElement selectedProduct;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[1]")
    public WebElement printDropdownButton;

    @FindBy(linkText = "Products Labels")
    public WebElement productLabelsButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_report_print' and @type='button']")
    public WebElement printButton;

    @FindBy(css = ".o_notification_title")
    public WebElement report;












}
