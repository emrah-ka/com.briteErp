package pages.puchasesMasterData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class NewVendorPage {

    public NewVendorPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input.o_radio_input[data-index='1']")
    public WebElement companyRadioButton;

    @FindBy(css = "input.o_field_char.o_field_widget.o_input.o_required_modifier")
    public WebElement companyNameInput;

    @FindBy(id = "o_field_input_754")
    public WebElement cityInput;

    @FindBy(css = "[name='street']")
    public WebElement streetInput;

    @FindBy(xpath = "//input[@id='o_field_input_755']")
    public WebElement stateInput;

    @FindBy(xpath = "//input[@id='o_field_input_756']")
    public WebElement zipCodeInput;

    @FindBy(css = "#o_field_input_758")
    public WebElement tinInput;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[3]")
    public WebElement countryDropDown;


    @FindBy(css = "#o_field_input_762")
    public WebElement mobilePhoneInput;

    @FindBy(css = "#o_field_input_764")
    public WebElement emailInput;

    @FindBy(css = "#o_field_input_765")
    public WebElement websiteInput;

    @FindBy(css = "button.btn.btn-primary.btn-sm.o_form_button_save")
    public WebElement saveButton;

    @FindBy(id = "ui-id-37")
    public WebElement andorraButton;

    @FindBy(xpath = "//span[.='TreeStar']")
    public WebElement companyName;








}
