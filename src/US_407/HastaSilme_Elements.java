package US_407;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HastaSilme_Elements {

    public HastaSilme_Elements() {
    PageFactory.initElements(BaseDriver.driver , this);
    }



    @FindBy(xpath = "//a[@class='zak-button']")
    public WebElement demoButton;

    @FindBy(xpath = "(//div[@class='elementor-button-wrapper']/a)[4]")
    public WebElement MRS2DemoButton;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "loginButton")
    public WebElement loginButton;

    @FindBy(id = "Registration Desk")
    public WebElement regDesk;

    @FindBy(xpath = "(//div[@id='apps']/a)[1]")
    public WebElement findPatientRecord;

    @FindBy(id = "patient-search")
    public WebElement searchBox;

    @FindBy(xpath = "//tbody[@role='alert']")
    public WebElement activePatient;

    @FindBy(linkText = "Delete Patient")
    public WebElement deletePatientLink;

    @FindBy(xpath = "//input[@id='delete-reason']")
    public WebElement reasonBox;

    @FindBy(xpath = "//div[@id='delete-patient-creation-dialog']//button[text()='Confirm']")
    public WebElement reasonConfirm;












}
