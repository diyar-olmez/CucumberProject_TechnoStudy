package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends ParentPage{
    public Elements() {
        PageFactory.initElements(GWD.getDriver(),this);
    }




}
