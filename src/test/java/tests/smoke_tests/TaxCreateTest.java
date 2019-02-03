package tests.smoke_tests;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.BooleanType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.TestBase;

public class TaxCreateTest extends TestBase {
    @Test
    public void createATax(){
        pages.login().loginAsManager();
        BrowserUtils.wait(5);
        pages.login().invoicingLink.click();
        pages.login().conf_accnt.click();
        pages.login().conf_acctn_taxes_link.click();
        BrowserUtils.wait(6);

        pages.taxes().createBtn.click();
        BrowserUtils.wait(3);
        pages.taxes().newTaxName.sendKeys(ConfigurationReader.getProperty("fakedataname"));
        pages.taxes().newPercentageAmount.clear();
        pages.taxes().newPercentageAmount.sendKeys(ConfigurationReader.getProperty("fakedatanum"));
        pages.taxes().newSaveButton.click();

        Assert.assertEquals(pages.taxes().savedTitleName.getText(),ConfigurationReader.getProperty("fakedataname"));
        Assert.assertEquals(pages.taxes().savedPercentage.getText(),ConfigurationReader.getProperty("fakedatanum"));

        pages.taxes().savedTaxOnPage().click();



    }
}
