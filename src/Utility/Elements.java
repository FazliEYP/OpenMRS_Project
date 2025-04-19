package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements {

   //401-402
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




//403
    @FindBy(xpath = "//h4")
    public WebElement visibleCaptionStartingWithLogged;

    @FindBy(xpath = "//*[@class='nav-item logout']/a")
    public WebElement logOutButton;

    @FindBy(xpath = "//*[@id='selected-location']")
    public WebElement selectedLocation;

    @FindBy(xpath = "//*[@class='select']//li")
    public List<WebElement> selected_list;





//404
    @FindBy(xpath = "//i[@id='togglePassword']")
    public WebElement eyesClick;


    @FindBy(xpath = "//*[@id='Pharmacy']")
    public WebElement pharmacy;



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

//405

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

    @FindBy(id = "Registration Desk")
    public WebElement registration;

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
    public WebElement errorTex;

//406




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

//407



    @FindBy(xpath = "(//div[@id='apps']/a)[1]")
    public WebElement findPatientRecord;

    @FindBy(xpath = "//tbody[@role='alert']")
    public WebElement activePatient;

    @FindBy(linkText = "Delete Patient")
    public WebElement deletePatientLink;

    @FindBy(xpath = "//input[@id='delete-reason']")
    public WebElement reasonBox;

    @FindBy(xpath = "//div[@id='delete-patient-creation-dialog']//button[text()='Confirm']")
    public WebElement reasonConfirm;

//408



    @FindBy(xpath = "//*[@class='icon-search']")
    public WebElement searchIcon;

    @FindBy(xpath = "//*[@aria-live='polite']//tr")
    public List<WebElement> patients;

    @FindBy(xpath = "//*[@id='patient-search-results-table_paginate']//span//a")
    public List<WebElement> pages;

    @FindBy(xpath = "//*[@class='dataTables_info']")
    public WebElement showingEntries;

    //409

    @FindBy(xpath = "//*[@class='icon-hdd']//..")
    public WebElement dataManagementButton;

    @FindBy(xpath = "//*[@id='coreapps-mergePatientsHomepageLink-app']")
    public WebElement mergePatientERButton;

    @FindBy(id = "patient1-text")
    public WebElement patientIDButton1;

    @FindBy(id = "patient2-text")
    public WebElement patientIDButton2;

    @FindBy(id = "confirm-button")
    public WebElement continueButton;

    @FindBy(id = "(//*[@class='messages-container'])[2]")
    public WebElement warningMessage;

    @FindBy(id = "first-patient")
    public WebElement patient1;

    @FindBy(xpath = "//*[@class='float-sm-right']")
    public WebElement mergeID;

    //410

    @FindBy(xpath = "//li[@id='Inpatient Ward']")
    public WebElement LocationInpatient;

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
