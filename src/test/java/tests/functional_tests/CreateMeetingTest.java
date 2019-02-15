package tests.functional_tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.TestBase;
public class CreateMeetingTest extends TestBase {
    @Test
    public void createMeeting(){
        extentLogger = report.createTest("Creating meeting test");

        extentLogger.info("click on vendors");
        pages.vendors().clickOnVendors();

        extentLogger.info("click on Erkins");
        pages.vendors().erkins.click();

        BrowserUtils.wait(2);
        extentLogger.info("click on meeting");
        pages.erkins().meetingButton.click();

        extentLogger.info("click on list button");
        pages.erkins().listButton.click();

        extentLogger.info("click on create ");
        pages.erkins().meetingCreateButton.click();

        extentLogger.info("type the meeting subject");
        pages.erkins().subjectInput.sendKeys("sprint planning ");

        extentLogger.info("click on start at");
        pages.erkins().startDate.click();

        extentLogger.info("click on feb 17");
        pages.erkins().feb17.click();

        extentLogger.info("click on save button");
        pages.erkins().saveButton.click();

        BrowserUtils.wait(4);
        extentLogger.info("verify subject is sprint planning");

        Assert.assertTrue(pages.erkins().subject.getText().equals("sprint planning"));
    }
}