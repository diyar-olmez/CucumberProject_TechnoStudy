package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class TC_014_UploadPictureSteps extends GWD {

    Elements el = new Elements();

    @When("the user clicks on the profile picture")
    public void the_profile_picture(){
        el.myClick(el.profileSettings);
    }

    @Then("an upload window should open and clicks on settings")
    public void upload_window(){
        el.myClick(el.settings);
    }

    @When("the user clicks the Upload button")
    public void upload_picture(){
        el.myClick(el.picture);
    }

    @And("the user selects a valid image file")
    public void select_image(){
        el.myClick(el.uploadPicture);
    }

    @Then("the file size should be displayed")
    public void file_size(){
    }

    @When("the user confirms the upload")
    public void confirm_upload() throws AWTException {

        StringSelection filePath = new StringSelection("C:\\Users\\atill\\Pictures\\1cat.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
        Robot robot = new Robot();

        robot.delay(1000); // hedef alanın hazır olduğundan emin olmak için
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        el.myClick(el.uploadBtn);
    }

    @And("the user clicks the save button")
    public void save_button(){
        el.wait.until(ExpectedConditions.visibilityOf(el.saveBtn));
        el.myClick(el.saveBtn);
    }

    @Then("a {string} message should be displayed")
    public void message(String message){
        el.wait.until(ExpectedConditions.textToBePresentInElement(el.profileUpdated,message));
        Assert.assertTrue(el.profileUpdated.getText().contains(message));
    }
}
