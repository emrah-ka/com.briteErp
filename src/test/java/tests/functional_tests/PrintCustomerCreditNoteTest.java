package tests.functional_tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import  pages.LoginPage;
import pages.configuration_accounting.CustomerCreditNotesPage;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class PrintCustomerCreditNoteTest extends TestBase {

    @Test
    public void printFunctionTest() throws InterruptedException {
        extentLogger = report.createTest("PrintCustomerCreditNoteTest");
        pages.login().loginAsManager();
        pages.creditNotesPage().invocing();
        pages.creditNotesPage().sideBarNavigation();
        pages.creditNotesPage().setCustomerCreditNoteOpen();



    }


}
