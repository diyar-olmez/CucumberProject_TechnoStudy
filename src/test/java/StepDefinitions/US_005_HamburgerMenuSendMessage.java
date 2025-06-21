package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US_005_HamburgerMenuSendMessage {

    Elements el = new Elements();

    @Given("Go to the message sending page from the hamburger menu")
    public void goToTheMessageSendingPageFromTheHamburgerMenu() {
        el.HamMenu.click();

        el.wait.until(ExpectedConditions.visibilityOf(el.Messaging));

        el.Messaging.click();

        el.SendMessage.click();

    }

    @When("Add receivers and subject")
    public void addReceiversAndSubject() {

        el.wait.until(ExpectedConditions.elementToBeClickable(el.AddReceivers));

        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].click();", el.AddReceivers);

        el.mySendKeys(el.AddRecInput, "Stu");

        List<WebElement> students = el.StudentsList;

        int rnd = (int) (Math.random() * students.size());

        el.StudentsList.get(rnd).click();

        el.myClick(el.AddAndClose);

        el.mySendKeys(el.Subject, "Campus");

    }

    @Then("Enter text in the text editor, create a table, attach a file and send message")
    public void enterTextInTheTextEditorPasteTextCreateATableAttachAFileAndSendMessage() throws AWTException, InterruptedException {

        WebElement iframe = GWD.getDriver().findElement(By.cssSelector("iframe[id^='tiny-angular']"));

        GWD.getDriver().switchTo().frame(iframe);

        el.mySendKeys(el.TextEditor, "Test Test");

        GWD.getDriver().switchTo().defaultContent();

        new Actions(GWD.getDriver())
                .moveToElement(el.InsertButton)
                .click()
                .build()
                .perform();

        for (int i = 0; i < 4; i++) {
            new Actions(GWD.getDriver())
                    .sendKeys(Keys.DOWN)
                    .build()
                    .perform();
        }

        for (int i = 0; i < 5; i++) {
            new Actions(GWD.getDriver())
                    .sendKeys(Keys.ARROW_RIGHT)
                    .sendKeys(Keys.ARROW_DOWN)
                    .build()
                    .perform();
        }

        new Actions(GWD.getDriver())
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        el.myClick(el.AttachFiles);

        for (int i = 0; i < 2; i++) {
            new Actions(GWD.getDriver())
                    .sendKeys(Keys.UP)
                    .build()
                    .perform();
        }

        new Actions(GWD.getDriver())
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        el.mySendKeys(el.NameInput, "MySQLL");

        el.myClick(el.Search);

        new Actions(GWD.getDriver())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .build()
                .perform();
        el.wait.until(ExpectedConditions.elementToBeClickable(el.SelectButton));

        Thread.sleep(2000);

        el.myClick(el.SelectButton);

        el.SendButton.click();

        // According to US, when you click on the Send button,
        // the message "Success" should be displayed, but no message is displayed.
        // This situation is reported as a 'BUG'. (The message is sent successfully.)
    }

    @And("Click on the Outbox link and see the sent message items in a list")
    public void clickOnTheOutboxLinkAndSeeTheSentMessageItemsInAList() {

        el.HamMenu.click();

        el.wait.until(ExpectedConditions.visibilityOf(el.Messaging));

        el.Messaging.click();

        el.OutBox.click();

        el.wait.until(ExpectedConditions.elementToBeClickable(el.LastMessage));

        List<WebElement> OutboxList=el.OutBoxMessageList;

        if(!OutboxList.isEmpty())
            System.out.println("Outbox displayed successfully");
    }
}
