package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class US_001_LoginSteps {
    Elements e=new Elements();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter valid username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        e.mySendKeys(e.username, "Student_10");
        e.mySendKeys(e.password, "S12345");
        e.loginBTN.click();
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        e.wait.until(ExpectedConditions.textToBePresentInElement(e.internshipTXT,"Internship"));
        Assert.assertTrue(e.internshipTXT.getText().equalsIgnoreCase("Internship"));
    }

    @When("Enter invalid username and password and click login button")
    public void enterInvalidUsernameAndPasswordAndClickLoginButton() {
        e.mySendKeys(e.username, "InternErdem");
        e.mySendKeys(e.password, "Campus");
        e.loginBTN.click();
    }

    @Then("Error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        e.wait.until(ExpectedConditions.visibilityOf(e.invalidUserMSG));
        Assert.assertTrue(e.invalidUserMSG.getText().equalsIgnoreCase("Invalid username or password"));
    }
}
