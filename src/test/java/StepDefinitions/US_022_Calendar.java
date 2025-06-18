package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class US_022_Calendar {
    Elements e=new Elements();
    Actions actions = new Actions(GWD.getDriver());
    @When("the student clicks the Calendar button")
    public void theStudentClicksTheCalendarButton() {
        e.wait.until(ExpectedConditions.visibilityOf(e.Calendar));
        e.Calendar.click();

    }

    @Then("the student should be on the Calendar page")
    public void theStudentShouldBeOnTheCalendarPage() {
        Assert.assertTrue(e.Calendar.isDisplayed());
    }

    @Then("The weekly course plan should be visible")
    public void theWeeklyCoursePlanShouldBeVisible() {

        e.wait.until(ExpectedConditions.visibilityOf(e.weekly));
        Assert.assertTrue(e.weekly.isDisplayed());

    }


    @Then("The student should see what P, S, E, and C icons mean")
    public void theStudentShouldSeeWhatPSEAndCIconsMean() {
        e.wait.until(ExpectedConditions.visibilityOf(e.Published));
        Assert.assertTrue(e.Published.isDisplayed());
    }



    @And("The student should be able to click both links")
    public void theStudentShouldBeAbleToClickBothLinks() {
        e.wait.until(ExpectedConditions.visibilityOf(e.weekly));
        e.myClick(e.weekly);
        e.wait.until(ExpectedConditions.visibilityOf(e.calendar2));
        e.myClick(e.calendar2);


    }



    @And("The student should be able to click them")
    public void theStudentShouldBeAbleToClickThem() throws InterruptedException {
        e.wait.until(ExpectedConditions.visibilityOf(e.previous));
        e.myClick(e.previous);
        e.wait.until(ExpectedConditions.visibilityOf(e.today));
        e.myClick(e.today);
        e.wait.until(ExpectedConditions.visibilityOf(e.next));
        e.myClick(e.next);


    }

    @Then("The student should see today button")
    public void theStudentShouldSeeTodayButton() {
        e.wait.until(ExpectedConditions.visibilityOf(e.today));
        Assert.assertTrue(e.today.isDisplayed());

    }

    @Then("The student should be able to see the lessons with icons")
    public void theStudentShouldBeAbleToSeeTheLessonsWithIcons(){



    }

    @And("the student should be click 2Calendar button")
    public void theStudentShouldBeClick2CalendarButton() throws InterruptedException {
        e.wait.until(ExpectedConditions.visibilityOf(e.calendar2));
        e.myClick(e.calendar2);

    }

    @And("the student should be click month button")
    public void theStudentShouldBeClickMonthButton() throws InterruptedException {
        Thread.sleep(3000);
        e.scrollToElement(e.weekly);
        e.wait.until(ExpectedConditions.visibilityOf(e.month));
        e.myClick(e.month);
        e.wait.until(ExpectedConditions.visibilityOf(e.left));
        e.myClick(e.left);

    }

    @Then("The student should see  Weekly button")
    public void theStudentShouldSeeWeeklyButton() {
        e.wait.until(ExpectedConditions.visibilityOf(e.weekly));
        Assert.assertTrue(e.weekly.isDisplayed());

    }

    @Then("The student should see  Calendar  button")
    public void theStudentShouldSeeCalendarButton() {

        e.wait.until(ExpectedConditions.visibilityOf(e.calendar2));
        Assert.assertTrue(e.calendar2.isDisplayed());
    }

    @Then("The student should see Previous")
    public void theStudentShouldSeePrevious() {
        actions.moveToElement(e.previous);
        Assert.assertTrue(e.previous.isDisplayed());
    }

    @And("The student should be able to click Previous button")
    public void theStudentShouldBeAbleToClickPreviousButton() throws InterruptedException {
        Thread.sleep(3000);
        e.myClick(e.previous);
    }
}
