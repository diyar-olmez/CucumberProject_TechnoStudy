package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class US_006_MoveTheMessageToTrash {

    Elements el = new Elements();

    @When("Click the trash button and confirm the deletion")
    public void clickTheTrashButtonAndConfirmTheDeletion() {

        el.wait.until(ExpectedConditions.elementToBeClickable(el.WaitPointTrash));

        List<WebElement> trashbox = el.TrashButtonList;

        int rnd = (int) (Math.random() * trashbox.size());

       el.myClick(el.TrashButtonList.get(rnd));

       el.myClick(el.Yes);

    }

    @Then("User should be able to view the message the message was deleted successfully")
    public void userShouldBeAbleToViewTheMessageTheMessageWasDeletedSuccessfully() {

    el.wait.until(ExpectedConditions.visibilityOf(el.MovedToTrashSuccesfully));

        Assert.assertTrue(el.MovedToTrashSuccesfully.getText().contains("Message successfully moved to trash!"),"---Message could not be displayed!---");

    }
}
