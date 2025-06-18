package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

public class US_003_HomeTopNavSteps {
    Elements e = new Elements();

    @When("The user views the top navigation bar should see the menu items and click")
    public void theUserViewsTheTopNavigationBarShouldSeeTheMenuItemsAndClick() throws AWTException{
        Robot rbt = new Robot();
        String[] urlCTNS = {"user-courses", "courses-calendar", "student-attendance", "student-assignment", "student-grading"};
        String[] dialogTitle={"Announcements","Messages"};
        String[] hamburgerMenu={"Messaging","Finance","Attendance","Video Conference","Surveys"};
        String[] profileMenu={"My Certificates","My Files","Change Password","Settings","Sign Out"};

        for (int i = 0; i < e.topMenu.size(); i++) {
            e.myClick(e.topMenu.get(i));
            if (i == 2) {
                e.wait.until(ExpectedConditions.visibilityOf(e.graphic));
            }
            if (i <= 4) {
                e.wait.until(ExpectedConditions.urlContains(urlCTNS[i]));
                Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains(urlCTNS[i]));
            }
            if (i==5){
                for (int j = 0; j < e.hamburgerMenu.size(); j++) {
                    Assert.assertTrue(e.hamburgerMenu.get(j).getText().equalsIgnoreCase(hamburgerMenu[j]));
                }
                rbt.keyPress(KeyEvent.VK_ESCAPE);
                rbt.keyRelease(KeyEvent.VK_ESCAPE);
            }
            if (i>5 & i<8){
                e.wait.until(ExpectedConditions.visibilityOf(e.dialogTitle));
                Assert.assertTrue(e.dialogTitle.getText().equalsIgnoreCase(dialogTitle[(i-6)]));
                e.myClick(e.closeDLG);
            }
            if (i==8){
                for (int j = 0; j < e.hamburgerMenu.size(); j++) {
                    Assert.assertTrue(e.hamburgerMenu.get(j).getText().equalsIgnoreCase(profileMenu[j]));
                }
            }
        }
    }
}
