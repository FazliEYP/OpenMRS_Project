package US_403;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Logout_Elements {

    public Logout_Elements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h4")
    public WebElement visibleCaptionStartingWithLogged;

    @FindBy(xpath = "//*[@class='nav-item logout']/a")
    public WebElement logOutButton;

    @FindBy(xpath = "//*[@id='selected-location']")
    public WebElement selectedLocation;

    @FindBy(xpath = "//*[@class='select']//li")
    public List<WebElement> selected_list;

    @FindBy(xpath = "//*[@id='loginButton']")
    public WebElement logInButton;
}