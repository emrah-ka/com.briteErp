package pages.puchasesMasterData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class CamptocampPage {

    public CamptocampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[@class='o_not_full oe_button_box']")
    public WebElement camptocampTable;

    @FindBy(xpath = "//ul[@class='nav nav-tabs']")
    public WebElement camptocampTab;

    @FindBy(xpath = "//table[@class='o_group o_inner_group o_group_col_6'][1]//tr[4][1]")
    public WebElement camptocampTag;


}