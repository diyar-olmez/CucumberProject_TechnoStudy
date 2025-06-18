package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class US_023_Calendar2 {
    Elements e=new Elements();
    @Given("student is on the Weekly Course Plan page")
    public void studentIsOnTheWeeklyCoursePlanPage() {
        Assert.assertTrue(e.weekly.isDisplayed());

    }

    @When("student clicks on a course")
    public void studentClicksOnACourse() {
        e.wait.until(ExpectedConditions.visibilityOf(e.math));
        e.myClick(e.math);
    }

    @Then("student should see the course details page open")
    public void studentShouldSeeTheCourseDetailsPageOpen() {
        e.wait.until(ExpectedConditions.visibilityOf(e.coursedetail));
        Assert.assertTrue(e.coursedetail.isDisplayed());

    }

    @Given("student has opened the course details window")
    public void studentHasOpenedTheCourseDetailsWindow() {
        e.wait.until(ExpectedConditions.visibilityOf(e.math));
        e.myClick(e.math);

    }

    @Then("student should see the course name")
    public void studentShouldSeeTheCourseName() {
        e.wait.until(ExpectedConditions.visibilityOf(e.coursedetail));
        Assert.assertTrue(e.coursedetail.isDisplayed());

    }

    @Given("student is on the course schedule page")
    public void studentIsOnTheCourseSchedulePage() {
    }

    @When("student clicks on a published course")
    public void studentClicksOnAPublishedCourse() {
    }

    @Then("student should see the course name, teacher name, date, and time")
    public void studentShouldSeeTheCourseNameTeacherNameDateAndTime() {
        e.wait.until(ExpectedConditions.visibilityOf(e.coursedetail));
        Assert.assertTrue(e.math.isDisplayed());
        Assert.assertTrue(e.teacher.isDisplayed());
        Assert.assertTrue(e.date.isDisplayed());
        Assert.assertTrue(e.time.isDisplayed());

    }

    @Then("student should receive a warning message")
    public void studentShouldReceiveAWarningMessage() {
        e.wait.until(ExpectedConditions.visibilityOf(e.message));
        Assert.assertTrue(e.message.isDisplayed());
    }

    @Given("student has opened a published course")
    public void studentHasOpenedAPublishedCourse() {
    }

    @Then("student should see the links: Information, Topic, Attachments, and Recent Events")
    public void studentShouldSeeTheLinksInformationTopicAttachmentsAndRecentEvents() {
    }

    @Then("click the left button")
    public void clickTheLeftButton() throws InterruptedException {
        e.scrollToElement(e.left);
        Thread.sleep(5000);
        e.myClick(e.left);
    }
}
