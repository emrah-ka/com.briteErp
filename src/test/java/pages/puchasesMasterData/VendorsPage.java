package pages.puchasesMasterData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.Pages;
import utilities.TestBase;

import java.util.List;

public class VendorsPage extends TestBase {

    public VendorsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "[data-menu='206'] .oe_menu_text")
    public WebElement masterDataButton;

    @FindBy(css = "[data-menu='236'] .oe_menu_text")
    public WebElement vendorsButton;

    @FindBy(xpath = "//div[@class='o_kanban_view o_res_partner_kanban o_kanban_ungrouped']/div[8]")
    public WebElement camptocamp;

    @FindBy(xpath = "//div[@class='o_kanban_view o_res_partner_kanban o_kanban_ungrouped']/div[16]")
    public WebElement erkins;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createVendorButton;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]")
    public WebElement filtersButton;

    @FindBy(xpath = "//div[@class='o_kanban_view o_res_partner_kanban o_kanban_ungrouped']/div")
    public List<WebElement> allVendors;


    public void clickOnVendors(){
        Pages pages=new Pages();

        extentLogger = report.createTest("Vendors functionality test");
        extentLogger.info("entering login information");
        pages.login().loginAsUser();

        extentLogger.info("click on master data");
        pages.vendors().masterDataButton.click();

        BrowserUtils.wait(2);

        extentLogger.info("click on vendors");
        pages.vendors().vendorsButton.click();

        BrowserUtils.wait(3);

    }









}