package US_408;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US408Elements {

    public US408Elements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

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

    @FindBy(xpath = "//*[@class='icon-search']")
    public WebElement searchIcon;

    @FindBy(xpath = "//*[@aria-live='polite']//tr")
    public List<WebElement> patients;

    @FindBy(xpath = "//*[@id='patient-search-results-table_paginate']//span//a")
    public List<WebElement> pages;

    @FindBy(xpath = "//*[@class='dataTables_info']")
    public WebElement showingEntries;

    @FindBy(xpath = "//*[text()='Next']")
    public WebElement nextButton;
}
