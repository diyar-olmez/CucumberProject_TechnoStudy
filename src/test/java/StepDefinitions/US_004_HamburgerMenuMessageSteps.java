package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class US_004_HamburgerMenuMessageSteps {
    Elements e = new Elements();

    @When("the student hovers over the Messaging link in the Hamburger Menu")
    public void theStudentHoversOverTheLinkInTheHamburgerMenu() {
        e.myClick(e.topMenu.get(5));
        e.myClick(e.hamburgerMenu.getFirst());
    }

    @And("the student should be able to click on each of these links")
    public void theStudentShouldBeAbleToClickOnEachOfTheseLinks() {
        for (int i = 0; i < e.messageMenu.size(); i++) {
            e.wait.until(ExpectedConditions.visibilityOf(e.messageMenu.get(i)));
        }
    }

    @Then("the {string} link should be visible and be able to click the menuItem link and be navigated to {string}")
    public void theLinkShouldBeVisibleAndBeAbleToClickTheLinkAndBeNavigatedTo(String menuItem, String expectedURL) {
        Assert.assertTrue(e.getWebElement(menuItem).getText().equalsIgnoreCase(menuItem));
        e.myClick(e.getWebElement(menuItem));

        e.wait.until(ExpectedConditions.urlContains(expectedURL));
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains(expectedURL));
    }
}
