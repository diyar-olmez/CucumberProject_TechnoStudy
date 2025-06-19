package StepDefinitions;

import Pages.Elements;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class TC_015_ThemeSelectionSteps {
    Elements el = new Elements();

    @When("the user clicks on the profile picture2")
    public void the_profile_picture(){
        el.myClick(el.profileSettings);
    }

    @Then("an upload window should open and clicks on settings2")
    public void upload_window(){
        el.myClick(el.settings);
    }

    @When("the user locates the Theme dropdown menu and clicks on the Default Theme dropdown")
    public void theme_dropdown_menu(){
        el.myClick(el.themeMenu);
    }

    @Then("the user should see the following theme options:")
    public void theme_options(DataTable userlar){
        List<String> listUserlar = userlar.asList();
        for (String themes : listUserlar)
            System.out.println(themes);
    }

    @When("the user selects the themes one by one")
    public void select_themes(){
        el.myClick(el.purpleTheme);
        el.myClick(el.themeMenu);
        el.myClick(el.greenTheme);
        el.myClick(el.themeMenu);
        el.myClick(el.darkPurpleTheme);
        el.myClick(el.themeMenu);
        el.myClick(el.indigoTheme);
    }

    @Then("the theme should be applied immediately")
    public void applied_themes(){

    }

    @When("the user clicks the Save button")
    public void click_savebtn(){
        el.myClick(el.saveBtn);
    }

    @And("a {string} message should be displayed2")
    public void message2(String button){
        el.wait.until(ExpectedConditions.textToBePresentInElement(el.profileUpdated,button));
        Assert.assertTrue(el.profileUpdated.getText().contains(button));
    }


}
