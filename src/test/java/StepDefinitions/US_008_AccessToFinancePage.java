package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class US_008_AccessToFinancePage {

    Elements el = new Elements();

    @Given("Go to the my finance page from the hamburger menu")
    public void goToTheMyFinancePageFromTheHamburgerMenu() {

        el.myClick(el.HamMenu);

        el.myClick(el.Finance);

        el.myClick(el.MyFinanceButton);

    }

    @Then("User should be able to view my finance page")
    public void userShouldBeAbleToViewMyFinancePage() {

        el.wait.until(ExpectedConditions.urlToBe("https://test.mersys.io/student-finance/active"));

        String acturl= GWD.getDriver().getCurrentUrl();

        String expurl="https://test.mersys.io/student-finance/active";

        Assert.assertEquals(acturl,expurl,"The URL does not match what is expected!");

    }
}
