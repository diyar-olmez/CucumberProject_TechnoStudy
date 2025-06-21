package Pages;

import Utilities.GWD;
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

    @FindBy(xpath = "//ms-layout-menu-button[4]/button/span/span")
    public WebElement assignmentOmer;

    @FindBy(xpath = "//div[@class='ps']")
    public WebElement assignmentallPage;

    @FindBy(xpath = "//mat-drawer-content/div/div/span")
    public WebElement welcomeText;

    @FindBy(xpath = "//ms-icon-button[1]/button/fa-icon")
    public List <WebElement> informationListIcon;

    @FindBy(xpath = "(//ms-icon-button[@icon='file-import'])[3]")
    public WebElement submitButton;

    @FindBy(xpath = "(//ms-icon-button[@icon='file-import'])[4]")
    public WebElement submitButton5;

    @FindBy(xpath = "//mat-toolbar-row")
    public WebElement submissionToolbar;

    @FindBy(xpath = "//ms-icon-button[3]/button/fa-icon")
    public List <WebElement> favoriteListIcon;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    public WebElement closeDialog;

    @FindBy(xpath = "(//button[@aria-label='Close dialog'])[2]")
    public WebElement closeDialogInsade;

    @FindBy(xpath = "//div[@class='assignment'][1]")
    public WebElement homeworkRow;

    @FindBy(xpath = "(//ms-icon-button[@icon='comments-alt'])[2]")
    public WebElement discussIcon;

    @FindBy(xpath = "//textarea")
    public WebElement discussChat;

    @FindBy(xpath = "//ms-assignment-panel-student/div/div/div/div[2]")
    public WebElement homeworkList;

    @FindBy(xpath = "//div[@class='ps']")
    public WebElement homeworkAllPage;

    @FindBy(xpath = "//div[@class='assignment']")
    public List <WebElement> homeworkList1;

    @FindBy(xpath = "(//ms-standard-button/button/fa-icon)[1]")
    public WebElement chatsIcon;

    @FindBy(xpath = "//ms-standard-button[@icon='users']")
    public WebElement contactsIcon;

    @FindBy(xpath = "(//ms-icon-button[@icon='paperclip'])[2]")
    public WebElement attachFileInput;

    @FindBy(xpath = "//span[contains(text(),'Attach Files')]")
    public WebElement attachFiles;

    @FindBy(xpath = "//span[contains(text(),' From Local')]")
    public WebElement fromLocal;

    @FindBy(xpath = "(//ms-icon-button)[27]")
    public WebElement sendMessageButton;

    @FindBy(xpath = "//mat-toolbar/mat-toolbar-row/span")
    public WebElement successNotification;

    @FindBy(xpath = "//ams-comment/div/div[2]/div/div[3]")
    public WebElement sentMessageContent;

    @FindBy(xpath = "(//span[contains(text(),'TechnoStudy')])[3]")
    public WebElement attachFilesArea;

    @FindBy(xpath = "//ams-comment/div/div[2]/div/div[3]/div/div[3]/div[3]/div")
    public WebElement messageDateTime;

    @FindBy(css = "iframe.tox-edit-area__iframe")
    public WebElement iframe;

    @FindBy(id = "tinymce")
    public WebElement textArea;

    @FindBy(xpath = "//span[contains(text(),'Save as Draft')]")
    public WebElement saveAsDraft;

    @FindBy(xpath = "//file-upload-with-type")
    public WebElement attachmentFiles;

    @FindBy(xpath = "//ms-confirm-button/button")
    public WebElement submitButtonInsade;

    @FindBy(xpath = "//app-simple-dialog/div")
    public WebElement confirmDialog;

    @FindBy(css = "[type='submit']")
    public WebElement yesDialog;



}
