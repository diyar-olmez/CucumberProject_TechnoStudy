package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.awt.*;
import java.util.List;

public class US_007_DeleteOrRestoreMessages {

    Elements el = new Elements();

    @Given("Click on the trash button and the restore icon from the hamburger menu")
    public void clickOnTheTrashButtonAndTheRestoreIconFromTheHamburgerMenu() throws InterruptedException, AWTException {

        el.myClick(el.HamMenu);

        el.myClick(el.Messaging);

        el.myClick(el.Trash);

        el.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='mdc-data-table__content ng-star-inserted'])/tr/td[2]")));

        List<WebElement> restoreboxes = el.Restories;

        int rnd = (int) (Math.random() * restoreboxes.size());

        new Actions(GWD.getDriver())
                .moveToElement(el.Restories.get(rnd))
                .click()
                .build()
                .perform();

    }

    @When("The user should receive a successful restore message")
    public void theUserShouldReceiveASuccessfulRestoreMessage() {

        el.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id^='mat-expansion-panel-header'] span div")));

        Assert.assertTrue(el.SuccessMsg.getText().contains("Message successfully restored from trash"));

    }

    @Then("Click on the trash can icon and confirm the message to permanently delete the message")
    public void clickOnTheTrashCanIconAndConfirmTheMessageToPermanentlyDeleteTheMessage(){

        el.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id^='mat-expansion-panel-header'] span div")));

        List<WebElement> deletebutlist=el.TrashBoxLists;

        int rnd=(int) (Math.random()*deletebutlist.size());

        new Actions(GWD.getDriver())
                .moveToElement(el.TrashBoxLists.get(rnd))
                .click()
                .build()
                .perform();

        el.wait.until(ExpectedConditions.elementToBeClickable(el.ConfirmDeleteButton));

        el.myClick(el.ConfirmDeleteButton);

    }

    @And("User should receive a success message indicating that the message has been completely deleted")
    public void userShouldReceiveASuccessMessageIndicatingThatTheMessageHasBeenCompletelyDeleted(){

        el.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id^='mat-expansion-panel-header'] span mat-panel-description div")));

        Assert.assertTrue(el.SuccessMsg2.isDisplayed());

    }
}
