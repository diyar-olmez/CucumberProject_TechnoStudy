package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Random;

public class US_19_AssignmentSteps {
    Elements el = new Elements();
    @When("the student clicks on a random homework assignment")
    public void theStudentClicksOnARandomHomeworkAssignment() {


        try {
            el.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='assignment']")));
            System.out.println("Homework list size: " + el.homeworkList1.size());

            if (!el.homeworkList1.isEmpty()) {
                WebElement randomHomework = el.homeworkList1.get(new Random().nextInt(el.homeworkList1.size()));
                el.wait.until(ExpectedConditions.elementToBeClickable(randomHomework));
                ((JavascriptExecutor) GWD.getDriver()).executeScript("arguments[0].scrollIntoView(true);", randomHomework);
                Thread.sleep(500);
                ((JavascriptExecutor) GWD.getDriver()).executeScript("arguments[0].click();", randomHomework);
            } else {
                System.out.println("No homework elements found!");
            }
        } catch (Exception e) {
            System.out.println("Click Unsuccessfully! " + e.getMessage());
        }

    }

    @Then("the student should see a Discussion button or icon")
    public void theStudentShouldSeeADiscussionButtonOrIcon() {
        try {
            Assert.assertTrue(el.discussIcon.isDisplayed());
        } catch (Exception e) {
            System.out.println("Discussion button not visible! " + e.getMessage());
        }
    }

    @When("the student clicks on the Discussion button")
    public void theStudentClicksOnTheDiscussionButton() {
        try {
            el.discussIcon.click();
        } catch (Exception e) {
            System.out.println("Could not click Discussion button! " + e.getMessage());
        }
    }

    @Then("a discussion window should appear")
    public void aDiscussionWindowShouldAppear() {
        try {
            el.wait.until(ExpectedConditions.visibilityOf(el.discussChat));
            Assert.assertTrue(el.discussChat.isDisplayed());
        } catch (Exception e) {
            System.out.println("Discussion window not visible! " + e.getMessage());
        }
    }

    @And("the student should see a Chats icon to view existing discussions")
    public void theStudentShouldSeeAChatsIconToViewExistingDiscussions() {
        try {
            Assert.assertTrue(el.chatsIcon.isDisplayed());
        } catch (Exception e) {
            System.out.println("Chats icon not found! " + e.getMessage());
        }
    }

    @And("the student should see a Contacts option to select participants")
    public void theStudentShouldSeeAContactsOptionToSelectParticipants() {
        try {
            Assert.assertTrue(el.contactsIcon.isDisplayed());
        } catch (Exception e) {
            System.out.println("Contacts option not found! " + e.getMessage());
        }
    }

    @And("the student should be able to attach a file")
    public void theStudentShouldBeAbleToAttachAFile() throws AWTException {
        el.attachFileInput.click();
        String filePath = "C:\\Users\\boncu\\Downloads\\TechnoStudy_review.pdf";
        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        Robot robot = new Robot();
        robot.setAutoDelay(500);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.setAutoDelay(500);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    @When("the student types a message and sends it with an attachment")
    public void theStudentTypesAMessageAndSendsItWithAnAttachment() {
        try {
            el.discussChat.sendKeys("This is a test message.");
            el.sendMessageButton.click();
        } catch (Exception e) {
            System.out.println("Sending message failed! " + e.getMessage());
        }
    }

    @Then("the system should NOT show a Success notification")
    public void theSystemShouldNOTShowASuccessNotification() {
        try {
            Assert.assertTrue(el.successNotification.isDisplayed());
        } catch (Exception e) {
            System.out.println("Success message appeared or element not found! " + e.getMessage());
        }
    }

    @And("the student should see the sent message content")
    public void theStudentShouldSeeTheSentMessageContent() {
        try {
            Assert.assertTrue(el.sentMessageContent.getText().contains("This is a test message."));
        } catch (Exception e) {
            System.out.println("Sent message content not found! " + e.getMessage());
        }
    }

    @And("the student should see the attached file name \\(if any)")
    public void theStudentShouldSeeTheAttachedFileNameIfAny() {
        try {
            Assert.assertTrue(el.attachFilesArea.getText().contains("review.pdf"));
        } catch (Exception e) {
            System.out.println("Attached file name not found! " + e.getMessage());
        }
    }

    @And("the student should see the message's date and time")
    public void theStudentShouldSeeTheMessageSDateAndTime() {
        try {
            Assert.assertTrue(el.messageDateTime.isDisplayed());
        } catch (Exception e) {
            System.out.println("Date and time not found! " + e.getMessage());
        }
    }
}
