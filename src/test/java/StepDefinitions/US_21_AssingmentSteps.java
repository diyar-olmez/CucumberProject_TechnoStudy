package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.time.Duration;

public class US_21_AssingmentSteps {
    Elements el = new Elements();

    @Given("I navigate to the Assignments page")
    public void iNavigateToTheAssignmentsPage() {
        el.myClick(el.assignmentOmer);
    }

    @When("I see the list of homework")
    public void iSeeTheListOfHomework() {
        Assert.assertTrue(el.homeworkList1.isEmpty(), "No homework items found in the list");
    }

    @And("I click the Submit icon next to a homework")
    public void iClickTheSubmitIconNextToAHomework() {
        el.myClick(el.submitButton);
    }

    @Then("A rich text editor modal should appear")
    public void aRichTextEditorModalShouldAppear() {
        el.wait.until(ExpectedConditions.visibilityOf(el.submissionToolbar));
        Assert.assertTrue(el.submissionToolbar.getText().contains("Submission"));
    }

    @When("I write This is my homework in the editor")
    public void iWriteThisIsMyHomeworkInTheEditor() {
        el.wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("iframe.tox-edit-area__iframe")));
        // 1. ID kullanmadan iframe'i bekle ve locate et

        // 2. iframe'e geç
        GWD.getDriver().switchTo().frame(el.iframe);

        // 3. Text alanı bulunabilir hale gelene kadar bekle
        el.wait.until(ExpectedConditions.visibilityOf(el.textArea));

        // 4. Click ve yazma işlemi
        el.myClick(el.textArea);
        el.mySendKeys(el.textArea, "This is my homework");

        // 5. Ana içeriğe geri dön
        GWD.getDriver().switchTo().defaultContent();
    }

    @And("I attach files image.png and sample.pdf")
    public void iAttachFilesImagePngAndSamplePdf() throws AWTException {
        el.myClick(el.attachFiles);
        el.wait.until(ExpectedConditions.visibilityOf(el.fromLocal));
        el.myClick(el.fromLocal);
        el.copyAndPaste("C:\\Users\\boncu\\Downloads\\TechnoStudy_review.pdf");
        el.myClick(el.closeDialogInsade);
        el.myClick(el.attachFiles);
        el.wait.until(ExpectedConditions.visibilityOf(el.fromLocal));
        el.myClick(el.fromLocal);
        el.copyAndPaste("C:\\Users\\boncu\\Downloads\\pngimg.com - white_dove_PNG39.png");
        el.myClick(el.closeDialogInsade);
    }

    @And("I click the Save As Draft button")
    public void iClickTheSaveAsDraftButton() {
        el.myClick(el.saveAsDraft);
    }

    @Then("I should see a Success message")
    public void iShouldSeeASuccessMessage() {
        el.wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//*[contains(text(),'Successfully')]")
        ));
    }

    @When("I check the Send button before saving draft")
    public void iCheckTheSendButtonBeforeSavingDraft() {
        Assert.assertTrue(el.attachmentFiles.getText().contains("Techno"));
        Assert.assertTrue(el.attachmentFiles.getText().contains("pngimg"));
    }

    @Then("The Send button should be disabled")
    public void theSendButtonShouldBeDisabled() {
        Assert.assertTrue(el.submitButtonInsade.isDisplayed());
    }

    @When("I click the Send button after saving")
    public void iClickTheSendButtonAfterSaving() {
        el.myClick(el.submitButtonInsade);
    }

    @Then("A confirmation dialog should appear")
    public void aConfirmationDialogShouldAppear() {
        Assert.assertTrue(el.confirmDialog.getText().contains("Do you want to submit?"));
    }

    @When("I confirm the submission")
    public void iConfirmTheSubmission() {
        el.myClick(el.yesDialog);
    }

    @When("I go to the assignment detail page")
    public void iGoToTheAssignmentDetailPage() {
        String currentUrl = GWD.getDriver().getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://test.mersys.io/student-assignment"), "URL does not contain!");
    }

    @Then("I should see a New Submission button")
    public void iShouldSeeANewSubmissionButton() {
        Assert.assertTrue(el.submitButton5.isEnabled());
    }

    @When("I click the New Submission button")
    public void iClickTheNewSubmissionButton() throws InterruptedException {
        el.wait.until(ExpectedConditions.elementToBeClickable(el.submitButton5));
        Thread.sleep(1500);
        el.myClick(el.submitButton5);
    }

    @Then("A new rich text editor modal should appear")
    public void aNewRichTextEditorModalShouldAppear() {
        el.wait.until(ExpectedConditions.visibilityOf(el.submissionToolbar));
        Assert.assertTrue(el.submissionToolbar.getText().contains("Submission"));
    }

    @And("All previous preconditions should be applicable again")
    public void allPreviousPreconditionsShouldBeApplicableAgain() throws AWTException {
        el.wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("iframe.tox-edit-area__iframe")));

        GWD.getDriver().switchTo().frame(el.iframe);

        el.wait.until(ExpectedConditions.visibilityOf(el.textArea));

        el.myClick(el.textArea);
        el.mySendKeys(el.textArea, "This is my homework");

        GWD.getDriver().switchTo().defaultContent();

        el.myClick(el.attachFiles);
        el.wait.until(ExpectedConditions.visibilityOf(el.fromLocal));
        el.myClick(el.fromLocal);
        el.copyAndPaste("C:\\Users\\boncu\\Downloads\\TechnoStudy_review.pdf");
        el.myClick(el.closeDialogInsade);
        el.myClick(el.attachFiles);
        el.wait.until(ExpectedConditions.visibilityOf(el.fromLocal));
        el.myClick(el.fromLocal);
        el.copyAndPaste("C:\\Users\\boncu\\Downloads\\pngimg.com - white_dove_PNG39.png");
        el.myClick(el.closeDialogInsade);
        el.myClick(el.saveAsDraft);
        el.myClick(el.submitButtonInsade);
        el.myClick(el.yesDialog);
    }
}
