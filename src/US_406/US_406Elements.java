package US_406;

import Utility.BaseDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_406Elements {
    public US_406Elements(WebDriver driver) {PageFactory.initElements(BaseDriver.driver, this);}


    @FindBy(id = "username")
    public WebElement usernameInputField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(xpath = "//*[@id='sessionLocation']//li")
    public List<WebElement> locations;

    @FindBy(id="loginButton")
    public WebElement loginBtn;

    @FindBy(xpath = "//*[@class='icon-user small']")
    public WebElement userIcon;

    @FindBy(xpath = "//*[contains(text(),'My Account')]")
    public WebElement myAccountButton;

    @FindBy(id = "coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension")
    public WebElement findPatientRecordBtn;

    @FindBy(id = "patient-search")
    public WebElement searchField;

   @FindBy(css = "tbody tr")
   public List<WebElement> resultRows;

   @FindBy(css = ".identifiers span")
   public WebElement patientIdentifier;

    @FindBy(xpath = "//*[text()='No matching records found']")
    public WebElement noRecordMessage;

    @FindBy(xpath = "//*[@class='odd']")
    public WebElement choosePatient;





}
