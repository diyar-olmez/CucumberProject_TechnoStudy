package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class US_022_Assignments {
    Elements e=new Elements();
    @Given("The student is logged in")
    public void theStudentIsLoggedIn() {
    }

    @And("The student navigates to the Assign page")
    public void theStudentNavigatesToTheAssignPage() {

        e.Assignments.click();
    }


    @Then("The student should see the Search button")
    public void theStudentShouldSeeTheSearchButton() {
        Assert.assertTrue(e.search.isDisplayed());


    }

    @When("The student clicks the Search button")
    public void theStudentClicksTheSearchButton() {
       e.myClick(e.search);


    }

    @When("The student clicks the Search button without applying any filters")
    public void theStudentClicksTheSearchButtonWithoutApplyingAnyFilters() {
        e.view.click();

    }

    @Then("All assigned tasks should be listed")
    public void allAssignedTasksShouldBeListed() {
        Assert.assertTrue(e.view.getText().contains("Default View"));

    }

    @When("The student selects Course, Status, and Semester filters")
    public void theStudentSelectsCourseStatusAndSemesterFilters() {
        List<WebElement> filters = Arrays.asList(
                e.course,
                e.biology,
                e.results,
                e.semester
        );

        for (WebElement filter : filters) {
            filter.click();
        }
    }

    @And("Clicks the Search button")
    public void clicksTheSearchButton() {
        e.search.click();
    }

    @Then("Only filtered tasks should be displayed")
    public void onlyFilteredTasksShouldBeDisplayed() {
        Assert.assertTrue(e.biologyy.getText().contains("11A-Biology"));
    }

    @Then("The student should see a dropdown menu for sorting \\(Show By ...)")
    public void theStudentShouldSeeADropdownMenuForSortingShowBy() {
        Assert.assertTrue(e.showbytype.isDisplayed());
        e.showbytype.click();

    }

    @When("The student opens the sorting dropdown")
    public void theStudentOpensTheSortingDropdown() {
        e.showbytype.click();

    }

    @When("The student selects {string} from the dropdown")
    public void theStudentSelectsFromTheDropdown(String option) {
        switch (option) {
            case "Course":
                e.showbycourse.click();
                break;
            case "Type":
                e.showbytype.click();
                break;
            case "Date":
                e.showbydate.click();
                break;
            case "Table":
                e.showbychart.click();
                break;
            default:
                throw new IllegalArgumentException("Unsupported sorting option: " + option);
        }


    }

    @Then("The tasks should be sorted by {string}")
    public void theTasksShouldBeSortedBy(String arg0) {
    }
}
