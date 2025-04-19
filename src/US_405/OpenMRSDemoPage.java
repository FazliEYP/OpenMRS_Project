package US_405;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenMRSDemoPage {

    public OpenMRSDemoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(@class,'gt_float_switcher')]")
    public WebElement languageButton;

    @FindBy(xpath = "//div[contains(@class,'gt_float_switcher')]//a[contains(text(),'English')]")
    public WebElement englishOption;

    @FindBy(xpath = "//a[@class='zak-button']")
    public WebElement demoBtn;

    @FindBy(xpath = "//span[text()='Explore OpenMRS 2']")
    public WebElement mrs2Btn;

    @FindBy(xpath = "//span[text()='Enter the OpenMRS 2 Demo']")
    public WebElement entermrs2Btn;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "Registration Desk")
    public WebElement registration;

    @FindBy(id = "loginButton")
    public WebElement loginBtn;

    @FindBy(xpath = "//li[contains(@class, 'nav-item identifier')]")
    public WebElement adminDropdown;

    @FindBy(xpath = "//a[@href='/openmrs/adminui/myaccount/myAccount.page']")
    public WebElement myAccount;

    @FindBy(xpath = "//a[@href='/openmrs/adminui/myaccount/changePassword.page']")
    public WebElement changePasswordBtn;

    @FindBy(name = "oldPassword")
    public WebElement oldPassword;

    @FindBy(name = "newPassword")
    public WebElement newPassword;

    @FindBy(name = "confirmPassword")
    public WebElement confirmPassword;

    @FindBy(id = "save-button")
    public WebElement saveBtn;

    @FindBy(id = "cancel-button")
    public WebElement cancelBtn;

    @FindBy(xpath = "//a[@href='/openmrs/adminui/myaccount/changeDefaults.page']")
    public WebElement changeLanguageBtn;

    @FindBy(id = "default-locale-field")
    public WebElement languageDropdown;

    @FindBy(xpath = "//input[@class='confirm right']")
    public WebElement saveButtonLanguage;

    @FindBy(xpath = "//p[text()='User defaults could not be updated.']")
    public WebElement errorText;
}
