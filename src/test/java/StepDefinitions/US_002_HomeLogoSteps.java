package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import java.util.Set;

public class US_002_HomeLogoSteps {
    Elements e=new Elements();

    @Then("The user should see the company logo at the top-left corner and click")
    public void theUserShouldSeeTheCompanyLogoAtTheTopLeftCornerAndClick() {
        e.myClick(e.logo);
    }

    @When("The user should be redirected to {string}")
    public void theUserShouldBeRedirectedTo(String website) {
        String windowID = "";
        Set<String> handles=GWD.getDriver().getWindowHandles();

        for (String st : handles) {
            windowID=st;
        }

        GWD.getDriver().switchTo().window(windowID);

        e.wait.until(ExpectedConditions.urlToBe("https://techno.study/"));
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().equalsIgnoreCase(website));
    }
}
