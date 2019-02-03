package tests.functional_tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.Pages;
import utilities.TestBase;

public class LoginPageTest extends TestBase {

    @Test
    public void positiveLogInTest() {
       // extentLogger = report.createTest("Login Test");
     //   extentLogger.info("stepleri yaz ");
        pages.login().loginAsManager();





    }


}
