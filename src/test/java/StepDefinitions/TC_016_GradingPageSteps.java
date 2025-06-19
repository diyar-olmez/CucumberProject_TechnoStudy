package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TC_016_GradingPageSteps {
    Elements el = new Elements();

    @When("the student clicks on the 'Grading' link on the homepage")
    public void clicks_on_grading(){
        el.myClick(el.grading);
    }

    @And("the 'Course Grade' button should be visible and clickable")
    public void grading_displayed(){
        el.myClick(el.courseGradeBttn);
    }

    @When("the student's clicks on the 'Course Name' with grades")
    public void course_name_grade(){
        el.myClick(el.dutchButton);
    }

    @Then("the student's course grades should be displayed")
    public void grades_displayed(){
        el.myClick(el.semesterMenu);
        el.myClick(el.semester1);
        el.myClick(el.expandButton);
        el.myClick(el.expandButton);
        el.myClick(el.semesterMenu);
        el.myClick(el.semesterFinal);

        el.myClick(el.courseMenu);
        el.myClick(el.mathematicsButton);
        el.myClick(el.semesterMenu);
        el.myClick(el.semester2);
        el.myClick(el.expandButton2);

    }

    @When("the student clicks on the 'Reports' button")
    public void click_on_reports(){
        el.myClick(el.reportsButton);
    }

    @And("the 'Student Transcript' button should be visible")
    public void student_transcipt(){
        el.wait.until(ExpectedConditions.textToBePresentInElement(el.studentTranscripts,"Student Transcripts"));
        Assert.assertEquals(el.studentTranscripts.getText(),"Student Transcripts");
        System.out.println("el.studentTranscripts.getText() = " + el.studentTranscripts.getText());
    }

    @Then("the 'Academic Year','Academic Period' and 'Data Created' should be displayed")
    public void acamedic_year_period_data_created(){
        el.wait.until(ExpectedConditions.textToBePresentInElement(el.acamedicYear,"Academic Year"));
        Assert.assertEquals(el.acamedicYear.getText(),"Academic Year");
        System.out.println("el.acamedicYear.getText() = " + el.acamedicYear.getText());

        el.wait.until(ExpectedConditions.textToBePresentInElement(el.acamedicPeriod,"Academic Period"));
        Assert.assertEquals(el.acamedicPeriod.getText(),"Academic Period");
        System.out.println("el.acamedicPeriod.getText() = " + el.acamedicPeriod.getText());

        el.wait.until(ExpectedConditions.textToBePresentInElement(el.dataCreated,"Date Created"));
        Assert.assertEquals(el.dataCreated.getText(),"Date Created");
        System.out.println("el.dataCreated.getText() = " + el.dataCreated.getText());

    }
}
