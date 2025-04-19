package US_410;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Us_410_Elements {

    public Us_410_Elements(){
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//*[@id='username']")
    public WebElement Username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement Password;

    @FindBy(xpath = "//li[@id='Inpatient Ward']")
    public WebElement Location;

    @FindBy(xpath = "//input[@id='loginButton']")
    public WebElement LoginButton;

    @FindBy(xpath = "//a[contains(@href,'appointmentscheduling')]")
    public WebElement AppointmentScheduling;

    @FindBy(xpath = "//a[@id='appointmentschedulingui-manageAppointments-app']")
    public WebElement ManageAppointments;

    @FindBy(xpath = "//input[@id='patient-search']")
    public WebElement SearchIdName;

    @FindBy(xpath = "//tr[@class='odd']//*[text()='Emma Hosters']")
    public WebElement SearchResult;

    @FindBy(xpath = "(//i[@class='icon-remove medium'])[2]")
    public WebElement TimeZoneMessage;


}
