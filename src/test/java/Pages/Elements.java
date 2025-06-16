package Pages;

import Utilities.GWD;
import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements extends ParentPage{
    public Elements() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "[aria-label='LOGIN']")
    public WebElement loginBTN;

    @FindBy(css = "[class='logo-text']")
    public WebElement internshipTXT;

    @FindBy(css = "[class='mat-expansion-panel-header-description'] div")
    public WebElement invalidUserMSG;

    @FindBy(css = "[fxlayoutalign='end center'] img")
    public WebElement logo;

    @FindBy(xpath = "//student-toolbar-horizontal//button")
    public List<WebElement> topMenu;

    @FindBy(css = "[class='apexcharts-inner apexcharts-graphical']")
    public WebElement graphic;

    @FindBy(css = "[aria-label='Close dialog']")
    public WebElement closeDLG;

    @FindBy(css = "[class='title dialog-title']")
    public WebElement dialogTitle;

    @FindBy (css = "[class='mat-mdc-menu-item-text']")
    public List<WebElement> hamburgerMenu;

    @FindBy(xpath = "(//*[@class='mat-mdc-menu-content'])[2]//button")
    public List<WebElement> messageMenu;

    public WebElement getWebElement(String strElement){

        switch (strElement.toLowerCase()){
            case "send message": return this.messageMenu.get(0);
            case "inbox": return this.messageMenu.get(1);
            case "outbox": return this.messageMenu.get(2);
            case "trash": return this.messageMenu.get(3);
        }

        return null;
    }
}
