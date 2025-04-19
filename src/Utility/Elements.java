package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements {
    public Elements(WebDriver driver) {
    PageFactory.initElements(driver,this);    }

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

    @FindBy(xpath = "//*[@class='zak-button']")
    public WebElement demoButton;

    @FindBy(xpath = "(//*[@class='elementor-button-text'])[2]")
    public WebElement exploreOpenMRS2Button;

    @FindBy(xpath = "(//*[@class='elementor-button-text'])[4]")
    public WebElement enterExploreOpenMRS2Button;

    @FindBy(xpath = "//*[@id='sessionLocationError']")
    public WebElement errorMessage;

    @FindBy(xpath = "//*[@id='error-message']")
    public WebElement invalidErrorMessage;

    @FindBy(xpath = "//*[@class='icon-signout small']")
    public WebElement logoutButton;





    @FindBy(xpath = "//h4")
    public WebElement visibleCaptionStartingWithLogged;

    @FindBy(xpath = "//*[@class='nav-item logout']/a")
    public WebElement logOutButton;

    @FindBy(xpath = "//*[@id='selected-location']")
    public WebElement selectedLocation;

    @FindBy(xpath = "//*[@class='select']//li")
    public List<WebElement> selected_list;











    @FindBy(xpath = "//i[@id='togglePassword']")
    public WebElement eyesClick;

    @FindBy(xpath = "//*[@id='Pharmacy']")
    public WebElement pharmacy;

    @FindBy(xpath = "//input[@id='loginButton']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='icon-user']")
    public WebElement registerPatient;

    @FindBy(xpath = "//input[@name='givenName']")
    public WebElement givenName;

    @FindBy(xpath = "//input[@name='middleName']")
    public WebElement middleName;

    @FindBy(xpath = "//input[@name='familyName']")
    public WebElement familyName;

    @FindBy(xpath = "//button[@id='next-button']")
    public WebElement nextButton;

    @FindBy(xpath = "//option[@value='F']")
    public WebElement genderFemale;

    @FindBy(xpath = "//input[@id='birthdateDay-field']")
    public WebElement day;

    @FindBy(xpath = "//select[@id='birthdateMonth-field']")
    public WebElement month;

    @FindBy(xpath = "//input[@id='birthdateYear-field']")
    public WebElement year;

    @FindBy(xpath = "//input[@name='address1']")
    public WebElement address;

    @FindBy(xpath = "//input[@id='cityVillage']")
    public WebElement cityVillage;

    @FindBy(xpath = "//input[@id='stateProvince']")
    public WebElement stateProvince;

    @FindBy(xpath = "//input[@id='country']")
    public WebElement country;

    @FindBy(xpath = "//input[@id='postalCode']")
    public WebElement postalCode;

    @FindBy(xpath = "//input[@name='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//select[@id='relationship_type']")
    public WebElement relationShip;

    @FindBy(xpath = "//input[@ng-model='relationship.name']")
    public WebElement relationShipName;

    @FindBy(xpath = "(//select[@id='relationship_type'])[2]")
    public WebElement relationShip2;

    @FindBy(xpath = "//div[@id='nav-buttons']")
    public WebElement bosluk;

    @FindBy(xpath = "(//*[@ng-model='relationship.name'])[2]")
    public WebElement relationShipName2;

    @FindBy(xpath = "//i[@class='icon-plus-sign edit-action']")
    public WebElement plus;

    @FindBy(xpath = "//input[@id='submit']")
    public WebElement confirmButton;

    @FindBy(xpath = "//span[@class='PersonName-givenName']")
    public WebElement givenNameAssert;

    @FindBy(xpath = "//span[@class='PersonName-middleName']")
    public WebElement middleNameAssert;

    @FindBy(xpath = "//span[@class='PersonName-familyName']")
    public WebElement familyNameAssert;














}
