package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class US_009_SeeInstallmentDetails {

    Elements el = new Elements();

    @When("Click on the line with your name and the fee balance detail button")
    public void clickOnTheLineWithYourNameAndTheFeeBalanceDetailButton() {

    el.myClick(el.StudentFinancePage);

    el.wait.until(ExpectedConditions.elementToBeClickable(el.Alert));

    el.myClick(el.Alert);

    el.wait.until(ExpectedConditions.elementToBeClickable(el.FeeBalanceDetail));

    Actions act=new Actions(GWD.getDriver());
    act.moveToElement(el.FeeBalanceDetail)
            .click()
            .perform();


//    el.myClick(el.FeeBalanceDetail);

    }

    @Then("The user should be able to see the installment table")
    public void theUserShouldBeAbleToSeeTheInstallmentTable() {

        el.wait.until(ExpectedConditions.elementToBeClickable(el.WaitPointPayerInf));

        List<WebElement>  Installments= el.InstallmentTable;

        if(!Installments.isEmpty()){
            System.out.println("--- Installment Table Displayed!---");
        }
        else{
            System.out.println("--- Something went wrong!Installment Table Did Not Displayed!---");
        }

    }
}
