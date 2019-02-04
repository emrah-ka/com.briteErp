package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ErkinsPage {

    public ErkinsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//button[@class='btn btn-sm oe_stat_button'][1]")
    public WebElement meetingButton;

    @FindBy(xpath = "//button[@class='btn btn-icon fa fa-lg fa-list-ul o_cp_switch_list']")
    public WebElement listButton;

    @FindBy(css = ".o_list_buttons [type='button']:nth-of-type(1)")
    public WebElement meetingCreateButton ;

    @FindBy(css = "[name='name']")
    public WebElement subjectInput;

    @FindBy(css = "tr:nth-of-type(6) [type='text']")
    public WebElement startDate ;

    @FindBy(css = ".datepicker-days tr:nth-of-type(4) .weekend:nth-of-type(2)")
    public WebElement feb17 ;

    @FindBy(css = ".o_form_buttons_edit [type='button']:nth-of-type(1)")
    public WebElement saveButton ;

    @FindBy(css = "[name='name']")
    public WebElement subject ;

}