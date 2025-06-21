package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class ParentPage {
    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));

    public void mySendKeys(WebElement e, String  text)
    {
        wait.until(ExpectedConditions.visibilityOf(e));
        scrollToElement(e);
        e.clear();
        e.sendKeys(text);
    }

    public void myClick(WebElement e)
    {
        wait.until(ExpectedConditions.elementToBeClickable(e));
        scrollToElement(e);
        e.click();
    }

    //elemente kadar scroll yap
    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void copyAndPaste (String file) throws AWTException {
        StringSelection stringSelection = new StringSelection(file);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        Robot robot = new Robot();
        robot.setAutoDelay(500);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.setAutoDelay(500);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }



}
