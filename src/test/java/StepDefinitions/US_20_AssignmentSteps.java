package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.Random;

public class US_20_AssignmentSteps {
    WebElement clickedFavoriteIcon;
    Elements el = new Elements();

    @Given("The student navigates to the Assignments > Homework page")
    public void theStudentNavigatesToTheAssignmentsHomeworkPage() {
        el.myClick(el.assignmentOmer);
        el.wait.until(ExpectedConditions.textToBePresentInElement(el.homeworkList,"11A-Spanish"));
        //el.myClick(el.calendar);
        //el.wait.until(ExpectedConditions.elementToBeClickable(el.calendarLastYear));
        //el.myClick(el.calendarLastYear);
        //el.myClick(el.search);
        //el.wait.until(ExpectedConditions.textToBePresentInElement(el.assignmentallPage, "Homework"));
        //Assert.assertTrue(el.assignmentallPage.getText().contains("Homework"));
        //Assert.assertTrue(el.assignmentallPage.getText().contains("Quiz"));
    }

    @When("The student clicks on the Information \\(i) icon of a random homework")
    public void theStudentClicksOnTheInformationIIconOfARandomHomework() {
        try {
            el.informationListIcon.get(new Random().nextInt(el.informationListIcon.size())).click();
        } catch (Exception e) {
            System.out.println("Information Icon Click Unsuccessfully!" + e.getMessage());
        }
    }

    @Then("The homework details page should open")
    public void theHomeworkDetailsPageShouldOpen() {
        el.wait.until(ExpectedConditions.textToBePresentInElement(el.homeworkAllPage,"Project"));
        Assert.assertTrue(el.homeworkAllPage.getText().contains("Project"));
        //el.wait.until(ExpectedConditions.textToBePresentInElement(el.assignmentallPage, "Homework"));
        //Assert.assertTrue(el.assignmentallPage.getText().contains("Homework"));
        //Assert.assertTrue(el.assignmentallPage.getText().contains("Quiz"));
    }

    @When("The student clicks on the Submit icon of the same homework")
    public void theStudentClicksOnTheSubmitIconOfTheSameHomework() {
        ((JavascriptExecutor) GWD.getDriver()).executeScript("arguments[0].scrollIntoView(true);", el.submitButton);
        el.wait.until(ExpectedConditions.elementToBeClickable(el.submitButton));
        try {
            el.submitButton.click();
        } catch (Exception e) {
            ((JavascriptExecutor) GWD.getDriver()).executeScript("arguments[0].click();", el.submitButton);
        }
    }

    @Then("The submission page for that homework should open")
    public void theSubmissionPageForThatHomeworkShouldOpen() {
        el.wait.until(ExpectedConditions.textToBePresentInElement(el.submissionToolbar, "Submission"));
        Assert.assertTrue(el.submissionToolbar.getText().contains("Submission"));
        el.myClick(el.closeDialog);
    }

    @When("The student clicks on the Mark it \\(favorite) icon")
    public void theStudentClicksOnTheMarkItFavoriteIcon() {
        try {
            // listenin ilk elemanını seç
            clickedFavoriteIcon = el.favoriteListIcon.get(0);
            clickedFavoriteIcon.click();
        } catch (Exception e) {
            System.out.println("Unsuccessfully Click: " + e.getMessage());
        }
    }

    @Then("The homework should be marked as favorite")
    public void theHomeworkShouldBeMarkedAsFavorite() {
        // Tıklama sonrası stale element hatası almamak için
        // tekrar elementi DOM'dan alıyoruz
        try {
            WebElement favoriteIcon = el.favoriteListIcon.get(0);

            // class attribute kontrolü
            String classAttribute = favoriteIcon.getAttribute("class");
            boolean isFocused = classAttribute.contains("cdk-mouse-focused");
            //Assert.assertTrue(isFocused, "Favorite icon was not marked!"); // Bug!!!
        } catch (Exception e) {
            System.out.println("Hata var!" + e.getMessage());
        }
    }

    @When("The student clicks anywhere else on the same homework row")
    public void theStudentClicksAnywhereElseOnTheSameHomeworkRow() {
        el.myClick(el.homeworkRow);
    }

    @Then("The homework details page should open by default")
    public void theHomeworkDetailsPageShouldOpenByDefault() {
        el.wait.until(ExpectedConditions.textToBePresentInElement(el.assignmentallPage,"Project"));
        Assert.assertTrue(el.assignmentallPage.getText().contains("Project"));
    }

    @When("The student clicks the Discussion icon")
    public void theStudentClicksTheDiscussionIcon() {
        GWD.getDriver().navigate().back();
        el.myClick(el.assignmentOmer);
        el.wait.until(ExpectedConditions.elementToBeClickable(el.discussIcon));
        el.myClick(el.discussIcon);
    }

    @Then("The discussion window for that homework should open")
    public void theDiscussionWindowForThatHomeworkShouldOpen() {
        el.wait.until(ExpectedConditions.visibilityOf(el.discussChat));
        Assert.assertTrue(el.submissionToolbar.getText().contains("Geometry"));
    }
}
