package tests.smoke_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.TestBase;

public class CheckTitleTest extends TestBase {


    @Test
    public void taxesTitleTest(){

        pages.login().loginAsManager();
        BrowserUtils.wait(5);
        pages.login().invoicingLink.click();
        pages.login().conf_accnt.click();
        pages.login().conf_acctn_taxes_link.click();
        BrowserUtils.wait(6);
        softAssertion.assertEquals(pages.taxes().pageName.getText(),"Tax.es");
        softAssertion.assertAll();


    }

    @Test
    public void fiscalPositionsTitleTest(){
        pages.login().loginAsManager();
        BrowserUtils.wait(5);
        pages.login().invoicingLink.click();
        pages.login().conf_accnt.click();
        pages.login().conf_acctn_FiscalPos_link.click();
        BrowserUtils.wait(6);
        // System.out.println(Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/ol/li")));
        softAssertion.assertEquals(pages.taxes().pageName.getText(),"Fiscal Positions");
        softAssertion.assertAll();
    }

    @Test
    public void JournalsTitleTest(){
        pages.login().loginAsManager();
        BrowserUtils.wait(5);
        pages.login().invoicingLink.click();
        pages.login().conf_accnt.click();
        pages.login().conf_acctn_Journal_link.click();
        BrowserUtils.wait(6);
        // System.out.println(Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/ol/li")));
        softAssertion.assertEquals(pages.taxes().pageName.getText(),"Jogjurnals");
        softAssertion.assertAll();
    }

    @Test
    public void BankAccountsTitleTest(){
        pages.login().loginAsManager();
        BrowserUtils.wait(5);
        pages.login().invoicingLink.click();
        pages.login().conf_accnt.click();
        pages.login().conf_acctn_BankAccounts_link.click();
        BrowserUtils.wait(6);
       // System.out.println(Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/ol/li")));
        softAssertion.assertEquals(pages.taxes().pageName.getText(),"Bank dss");
        softAssertion.assertAll();
    }



}
