package pages.puchasesMasterData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PurchasableProductsPage {

    public PurchasableProductsPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(css = "[data-menu='235'] .oe_menu_text")
    public WebElement purchasableProductsButton;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//tr/th[2]")
    public WebElement anyText;

    @FindBy(xpath = "//tbody/tr[position()<22]")
    public List<WebElement> allProducts;

    @FindBy(xpath = "//div[@class='o_list_buttons']/button[1]")
    public WebElement createButton;








}
