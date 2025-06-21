package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements extends ParentPage {
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

    @FindBy(css = "[class='mat-mdc-menu-item-text']")
    public List<WebElement> hamburgerMenu;

    @FindBy(xpath = "(//*[@class='mat-mdc-menu-content'])[2]//button")
    public List<WebElement> messageMenu;

    @FindBy(xpath = "(//span/fa-icon)[6]")
    public WebElement HamMenu;

    @FindBy(xpath = "//div[@class='cdk-overlay-container']/div[2]/div/div/div/button[1]")
    public WebElement Messaging;

    @FindBy(xpath = "(//*[@class='mat-mdc-menu-content'])[2]//button[1]")
    public WebElement SendMessage;

    @FindBy(xpath = "//ms-button[@icon='users-medical']/button/fa-icon")
    public WebElement AddReceivers;

    @FindBy(xpath = "//ms-dialog-content[@class='mat-dialog-content']//users-search//mat-form-field/div[1]/div/div[2]/input")
    public WebElement AddRecInput;

    @FindBy(xpath = "//table[@role='table']/tbody/tr")
    public List<WebElement> StudentsList;

    @FindBy(xpath = "//subscribers-dialog[@class='mat-mdc-dialog-component-host ng-star-inserted']//ms-dialog-buttons//ms-button[2]")
    public WebElement AddAndClose;

    @FindBy(xpath = "//div[@id='container-3']//app-user-message-form/div/div/div[3]//mat-form-field/div[1]/div/div[2]//input")
    public WebElement Subject;

    @FindBy(css = "body[id=tinymce]>p")
    public WebElement TextEditor;

    @FindBy(css = "div[class='tox-editor-header']>div>:nth-child(4) span")
    public WebElement InsertButton;

    @FindBy(xpath = "//file-upload[@appname='uaa']//ms-button/button")
    public WebElement AttachFiles;

    @FindBy(xpath = "//div[@class='mat-mdc-form-field-infix']/input")
    public WebElement NameInput;

    @FindBy (css = "ms-search-button[id^='ms-search-button'] div button")
    public WebElement Search;

    @FindBy (css = "ms-button[caption='GENERAL.BUTTON.SELECT'] button")
    public WebElement SelectButton;

    @FindBy (xpath= "//div[@class='toolbar']//ms-button[2]/button")
    public WebElement SendButton;

    @FindBy(xpath = "(//*[@class='mat-mdc-menu-content'])[2]//button[3]")
    public WebElement OutBox;

    @FindBy(xpath = "//tbody[@class='mdc-data-table__content ng-star-inserted']/tr")
    public List<WebElement> OutBoxMessageList;

    @FindBy (xpath = "//tbody[@class='mdc-data-table__content ng-star-inserted']/tr[1]")
    public WebElement LastMessage;

    @FindBy(xpath = "//tbody[@class='mdc-data-table__content ng-star-inserted']/tr/td[6]/div/ms-confirm-button/button")
    public List<WebElement> TrashButtonList;

    @FindBy (xpath = "//tbody[@class='mdc-data-table__content ng-star-inserted']/tr/td[6]/div/ms-confirm-button/button/fa-icon[1]")
    public WebElement WaitPointTrash;

    @FindBy (xpath = "//div[@fxlayoutalign='end end']/div/button[1]/span[2]")
    public WebElement Yes;

    @FindBy (css = "[class='mat-content mat-content-hide-toggle'] div")
    public WebElement MovedToTrashSuccesfully;

    @FindBy(xpath = "//div[@class='cdk-overlay-container']/div[2]/div/div/div/button[2]")
    public WebElement Finance;

    @FindBy(xpath = "(//*[@class='mat-mdc-menu-content'])[2]//button[1]")
    public WebElement MyFinanceButton;

    @FindBy(css = "[class^='mat-mdc-row mdc-data-table__row']")
    public WebElement StudentFinancePage;

    @FindBy(xpath = "//div[@class='hot-toast-bar-base']/button")
    public WebElement Alert;

    @FindBy(css = "[id='balance']>:nth-child(2)")
    public WebElement FeeBalanceDetail;

    @FindBy(css = "[id='mat-expansion-panel-header-0']")
    public WebElement WaitPointPayerInf;

    @FindBy(css = "[class^='ng-tns-c3768754809'] tbody tr")
    public List<WebElement> InstallmentTable;

    @FindBy(xpath = "(//*[@class='mat-mdc-menu-content'])[2]//button[4]")
    public WebElement Trash;

    @FindBy(xpath = "(//*[@class='mdc-data-table__content ng-star-inserted'])/tr/td[7]//ms-standard-button[2]/button/fa-icon")
    public List<WebElement> Restories;

    @FindBy(css = "[id^='mat-expansion-panel-header'] span div")
    public WebElement SuccessMsg;

    @FindBy(xpath = "//tbody[@class='mdc-data-table__content ng-star-inserted']/tr/td[7]/div/ms-delete-button/button/fa-icon")
    public List<WebElement> TrashBoxLists;

    @FindBy(css = "[class^='mdc-button mat-mdc-button-base secondary']")
    public WebElement ConfirmDeleteButton;

    @FindBy(css = "[id^='mat-expansion-panel-header'] span mat-panel-description div")
    public WebElement SuccessMsg2;

    public WebElement getWebElement(String strElement) {

        switch (strElement.toLowerCase()) {
            case "send message":
                return this.messageMenu.get(0);
            case "inbox":
                return this.messageMenu.get(1);
            case "outbox":
                return this.messageMenu.get(2);
            case "trash":
                return this.messageMenu.get(3);
        }

        return null;
    }
}
