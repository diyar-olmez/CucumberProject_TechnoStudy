package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;
import java.awt.event.KeyEvent;

public class  TC_017_GradingPageSteps {
    Elements el = new Elements();

    @When("the student clicks the Grade button")
    public void students_clicks_button(){
        el.myClick(el.grading);
    }

    @Then("the student clicks the Print icon")
    public void students_clicks_printBtn(){
        el.myClick(el.printBtn);
    }

    @And("the student clicks the Download button in the PDF preview")
    public void download2() throws AWTException {
        Robot rbt = new Robot();
        rbt.delay(2000);
        for (int i = 0; i <= 14; i++) {
            rbt.delay(100);  //Döngüyü yavaşlatmadığımızda tab'a basma sayısı değişip hata verebiliyor.
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        }
        rbt.delay(500);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        rbt.delay(500);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
    }
}
