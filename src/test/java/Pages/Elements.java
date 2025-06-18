package Pages;

import Utilities.GWD;
import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import javax.xml.xpath.XPath;


import java.util.List;

public class Elements extends ParentPage{

    public Elements() {
        PageFactory.initElements(GWD.getDriver(), this);
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



    //-----------
    @FindBy(xpath ="(//button//span)[normalize-space(text())='Assignments'][1]")
    public WebElement Assignments;

    @FindBy(xpath = "//span[text()='Search']")
    public WebElement search;

    @FindBy(xpath = "//*[@id='mat-select-value-6']")
    public WebElement course;

    @FindBy(xpath = "//*[@id='mat-option-31']")
    public WebElement biology;

    @FindBy(xpath = "//*[@id='mat-option-2']//span")
    public WebElement results;

    @FindBy(xpath = "//*[@class='mdc-list-item__primary-text']//span[text()='Semester 1']")
    public WebElement semester;

    @FindBy(xpath = "//*[@class='selected-flag']//fa-icon[1]")
    public WebElement showbycourse;

    @FindBy(xpath = "//*[@id='ms-date-range-1']/mat-form-field/div[1]/div/div[3]/mat-datepicker-toggle/button/span[4]")
    public WebElement calender;

    @FindBy(xpath = "//*[@class='iso'][text()='Show by Type']")
    public WebElement showbytype;

    @FindBy(xpath = "//*[@class='iso'][text()='Show by Date']")
    public WebElement showbydate;

    @FindBy(xpath = "//*[@class='iso'][text()='Show by Chart']")
    public WebElement showbychart;

    @FindBy(xpath = "//*[@class='assignment']")
    public WebElement biologyy;

    @FindBy(xpath = "//*[@class='mat-mdc-menu-item mat-focus-indicator']//span//span//span[text()='Default View']")
    public WebElement view;

    //----------------

    @FindBy(xpath = "//ms-layout-menu-button[contains(., 'Calendar')]")
    public WebElement Calendar;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-calendar-day fa-undefined fa-fw fa-pull-undefined']")
    public WebElement today;

    @FindBy(xpath = "//*[@class='mdc-tab mat-mdc-tab mat-focus-indicator mdc-tab--active mdc-tab-indicator--active']")
    public WebElement weekly;

    @FindBy(xpath = "(//span[@class='mdc-tab__text-label'])[2]")
    public WebElement calendar2;

    @FindBy(xpath = "//*[@class='fc-monthCalendar-button fc-button fc-button-primary']")
    public WebElement month;

    @FindBy(xpath = "//*[@class='fc-prevCalendar-button fc-button fc-button-primary']//span")
    public WebElement left;

    @FindBy(xpath = "(//*[@class='mat-accent-700-bg'])/following-sibling::span[text()=' Published ']")
    public WebElement Published;

    @FindBy(xpath= "//*[@id='mat-tab-group-5-content-0']/div//div/div/div[2]/div[2]/button[1]/fa-icon")
    public WebElement previous;

    @FindBy(xpath = "//*[@id='mat-tab-group-4-content-0']//button[3]/span[2]")
    public WebElement next;

    @FindBy(xpath = "//table/tbody/tr[1]/td[4]//span[contains(text(),'11A-MATHEMATICS ')]")
    public WebElement math;

    @FindBy(css = "[class='mat-mdc-dialog-component-host']")
    public WebElement coursedetail;

    @FindBy(xpath = "(//span[normalize-space(.)='Teacher_7 T7'])[1]")
    public WebElement teacher;

    @FindBy(xpath= "//div[text()=' June 18, 2025 ']")
    public WebElement date;

    @FindBy(xpath = "//div[text()=' 09:00 ']")
    public WebElement time;

    @FindBy(css = "[class='mat-expansion-panel-header-description']>div")
    public WebElement message;

    @FindBy(xpath = "//*[@class='fc-button-group']//button[text()='Week']")
    public WebElement week;










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
