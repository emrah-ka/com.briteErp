package pages.configuration_accounting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class CustomerCreditNotesPage {
    public CustomerCreditNotesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "menu_more_container")
    public WebElement invoicingButton;

    @FindBy(className = "oe_menu_leaf")
    public WebElement customerCreditNoteButton;

    @FindBy(id = "oe_main_menu_navbar")
    public WebElement sideBar;



    public void invocing () throws InterruptedException {
        Thread.sleep(10);
        invoicingButton.click();

    }

    public void sideBarNavigation(){
        Actions action = new Actions(Driver.getDriver());

        action.moveToElement(sideBar).perform();

    }

    public void setCustomerCreditNoteOpen() throws InterruptedException {
        Thread.sleep(10);
        customerCreditNoteButton.click();
    }

}
