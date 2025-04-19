package US_402;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;

public class US402Elements {

    public US402Elements(WebDriver driver) {PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[@class='zak-button']")
    public WebElement demoButton;

    @FindBy(xpath = "(//*[@class='elementor-button-text'])[2]")
    public WebElement exploreOpenMRS2Button;

     @FindBy(xpath = "(//*[@class='elementor-button-text'])[4]")
    public WebElement enterExploreOpenMRS2Button;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement usernameInputField;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//*[@id='sessionLocation']//li")
    public List<WebElement> locations;

    @FindBy(xpath = "//*[@id='loginButton']")
    public WebElement logInButton;

    @FindBy(xpath = "//*[@class='icon-user small']")
    public WebElement userIcon;

    @FindBy(xpath = "//*[contains(text(),'My Account')]")
    public WebElement myAccountButton;





}