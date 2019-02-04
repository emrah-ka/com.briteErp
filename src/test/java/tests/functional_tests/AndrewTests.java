package tests.functional_tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;


import java.util.List;

    public class AndrewTests extends TestBase {

        @Test (description = "http://jira.cybertekschool.com/browse/BRIT-1334")
        public void VerifyPaymentAmount() {

            pages.login().loginAsManager();

////        3. Open dropdown "Documents"
            pages.documents().documents.click();
////        4. Click on "Payments"
            pages.documents().payments.click();
//        5. Memorise "Payment amount" one of the payments
            String amountExp = driver.findElement(By.xpath(
                    "//td[@class='o_data_cell o_list_number o_required_modifier']")).getText();

//        6. Click on choosen payment
            driver.findElement(By.xpath(
                    "//td[@class='o_data_cell o_list_number o_required_modifier']")).click();
//        7. Verify that same payment amount is displayed
            String amountAct = driver.findElement(By.xpath(
                    "//span[@name='amount']")).getText();

            Assert.assertEquals(amountAct,amountExp);
        }

        @Test (description = "http://jira.cybertekschool.com/browse/BRIT-1339")
        public void DeletePostedPaymnet() throws InterruptedException {

            pages.login().loginAsManager();
////        3. Open dropdown "Documents"
            pages.documents().documents.click();
            Thread.sleep(2000);

////        4. Click on "Payments"
            pages.documents().payments.click();
            Thread.sleep(2000);

//        5. Choose one of payments by clicking on its checkbox
            driver.findElement(By.xpath("//td[@width='1']")).click();
            Thread.sleep(2000);


//        6. Click on "Action" dropdown
            driver.findElement(By.xpath("(//button[@data-toggle='dropdown'])[2]")).click();
            Thread.sleep(2000);

//        7. Click on "Delete"
            driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
            Thread.sleep(2000);
//        8. Click on "Ok"

            driver.findElement(By.xpath("//div[@class='modal-footer']//span[.='Ok']")).click();
            Thread.sleep(2000);

//        9. Verify that system displays message "You can not delete a payment that is already posted"
            String messageAct = driver.findElement(By.xpath(
                    "//div[@class='o_dialog_warning modal-body']")).getText();
            String messageExp = "You can not delete a payment that is already posted";

            Assert.assertEquals(messageAct,messageExp);
        }

        @Test (description = "http://jira.cybertekschool.com/browse/BRIT-1318")
        public void DuplicateBill() throws InterruptedException {
            pages.login().loginAsManager();
////        3. Open dropdown "Documents"
            pages.documents().documents.click();
            Thread.sleep(3000);
//        4. Click on "Vendor Credit Notes"
            pages.documents().vendorCreditNotes.click();
            Thread.sleep(4000);

//        5. Choose one of the notes by clicking on it's checkbox
            driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
            Thread.sleep(2000);

//        6. Click on dropdown "Action"
            driver.findElement(By.xpath("(//button[@data-toggle='dropdown'])[2]")).click();
            Thread.sleep(2000);

//        7. Click on "Delete"
            driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
            Thread.sleep(2000);
//        8. Click on "Ok"
            driver.findElement(By.xpath("//div[@class='modal-footer']//span[.='Ok']")).click();
            Thread.sleep(2000);

//        9. Verify that system displays "You cannot delete an invoice which is not draft or cancelled. You should create a credit note instead."
            String messageAct = driver.findElement(By.xpath(
                    "//div[@class='o_dialog_warning modal-body']")).getText();
            String messageExp = "You cannot delete an invoice which is not draft or cancelled. You should create a credit note instead.";

            Assert.assertEquals(messageAct,messageExp);
        }

    }
