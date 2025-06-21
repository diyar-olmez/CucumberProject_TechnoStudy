package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class US_18_AssignmentSteps {
    Elements el = new Elements();

    @Given("the student is on the homepage")
    public void theStudentIsOnTheHomepage() {
        el.wait.until(ExpectedConditions.textToBePresentInElement(el.welcomeText,"Welcome"));
        Assert.assertTrue(el.welcomeText.getText().contains("Welcome"));
    }

    @When("the student clicks on the Assignments link")
    public void theStudentClicksOnTheAssignmentsLink() {
        el.myClick(el.assignmentOmer);
    }

    @Then("the system should display all tasks assigned to the student in a list")
    public void theSystemShouldDisplayAllTasksAssignedToTheStudentInAList() {
        //el.myClick(el.calendar);
        //el.myClick(el.calendarLastYear);
        //el.myClick(el.search);
        el.wait.until(ExpectedConditions.textToBePresentInElement(el.homeworkList,"11A-Spanish"));
    }

    @And("each task should show its title and task type \\(homework, quiz)")
    public void eachTaskShouldShowItsTitleAndTaskTypeHomeworkQuiz() {
        Assert.assertTrue(el.homeworkList.getText().contains("Project"));
        //el.wait.until(ExpectedConditions.textToBePresentInElement(el.assignmentallPage,"Homework"));
        //Assert.assertTrue(el.assignmentallPage.getText().contains("Homework"));
        //Assert.assertTrue(el.assignmentallPage.getText().contains("Quiz"));
    }
}
