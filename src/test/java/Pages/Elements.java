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

    @FindBy(css = "body > app > student-layout > div > student-toolbar-horizontal > mat-toolbar > div > div:nth-child(2) > button > span.mdc-button__label > div > div")
    public WebElement profileSettings;

    @FindBy(xpath = "//*[text()='Settings']")
    public WebElement settings;

    @FindBy(css = "[class='profile-image avatar huge']")
    public WebElement picture;

    @FindBy(css = "[class='mat-mdc-form-field-icon-suffix'] div > button")
    public WebElement uploadPicture;

    @FindBy(xpath = "//*[text()=' Upload ']")
    public WebElement uploadBtn;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveBtn;

    @FindBy(xpath = "//*[text()='Profile successfully updated']")
    public WebElement profileUpdated;

    @FindBy(xpath = "(//*[@class='mat-mdc-select-arrow-wrapper'])[4]")
    public WebElement themeMenu;

    @FindBy(css = "[id='mat-option-3']")
    public WebElement purpleTheme;

    @FindBy(css = "[id='mat-option-4']")
    public WebElement greenTheme;

    @FindBy(css = "[id='mat-option-5']")
    public WebElement darkPurpleTheme;

    @FindBy(css = "[id='mat-option-6']")
    public WebElement indigoTheme;

    @FindBy(xpath = "//*[text()='Grading']")
    public WebElement grading;

    @FindBy(xpath = "//*[text()=' Reports ']")
    public WebElement gradingReports;

    @FindBy(xpath = "//*[text()='Student Transcripts']")
    public WebElement studentTranscripts;

    @FindBy(css = "[class='display-but-dont-print']")
    public WebElement printBtn;

    @FindBy(xpath = "//div[@class='mat-mdc-select-arrow-wrapper']")
    public WebElement courseMenu;

    @FindBy(xpath = "//*[text()=' 11A-Dutch ']")
    public WebElement dutchButton;

    @FindBy(xpath = "(//mat-option)[6]")
    public WebElement mathematicsButton;

    @FindBy(xpath = "//*[text()=' Course Grade ']")
    public WebElement courseGradeBttn;

    @FindBy(xpath = "(//*[@class='mat-mdc-select-arrow-wrapper'])[2]")
    public WebElement semesterMenu;

    @FindBy(xpath = "//span[text()=' Semester 1 ']")
    public WebElement semester1;

    @FindBy(xpath = "//span[text()=' Semester 2 ']")
    public WebElement semester2;

    @FindBy(xpath = "//span[text()=' Final ']")
    public WebElement semesterFinal;

    @FindBy(xpath = "//*[@id='ms-standard-button-1']//span[2]")
    public WebElement expandButton;

    @FindBy(xpath = "(//*[@class='mat-focus-indicator'])[19]")
    public WebElement expandButton2;

    @FindBy(xpath = "//*[text()=' Reports ']")
    public WebElement reportsButton;

    @FindBy(xpath = "(//*[text()=' Academic Year '])[2]")
    public WebElement acamedicYear;

    @FindBy(xpath = "(//*[text()=' Academic Period '])[2]")
    public WebElement acamedicPeriod;

    @FindBy(xpath = "(//*[text()=' Date Created '])[2]")
    public WebElement dataCreated;

    @FindBy(xpath = "[class='mat-mdc-option mdc-list-item']")
    public List<WebElement> themes2;




}
