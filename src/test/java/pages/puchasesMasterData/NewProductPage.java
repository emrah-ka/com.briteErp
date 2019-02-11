package pages.puchasesMasterData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NewProductPage {

    public NewProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css= "[name='name']")
    public WebElement productNameInput;

    @FindBy(css = "[name='barcode']")
    public WebElement barcodeInput;

    @FindBy(css = "[name='lst_price'] [type]")
    public WebElement productPriceInput;

    @FindBy(css = "[name='standard_price'] [type]")
    public WebElement costInput;

    @FindBy(xpath = "//div[@class='o_form_buttons_edit']/button[1]")
    public WebElement saveButton;

    @FindBy(css = "[name='name']")
    public WebElement savedProduct;

    @FindBy(xpath = "(//td[@class='o_data_cell o_required_modifier']/..)[20]/td[3]")
    public WebElement ipadMini2Button;

    @FindBy(xpath = "(//td[@class='o_data_cell o_required_modifier']/..)[1]/td[3]")
    public WebElement vintageShirtButton;




















}
