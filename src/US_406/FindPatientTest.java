package US_406;

import Utility.BaseDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static Utility.BaseDriver.driver;

public class FindPatientTest extends BaseDriver{

    @Test(priority = 1)
    public void findPatient(){

        US_406Elements elements=new US_406Elements(driver);
        elements.findPatientRecordBtn.click();
        elements.searchField.sendKeys("Emma Herston".toLowerCase());
        elements.choosePatient.click();
        elements.patientIdentifier.isDisplayed();
        wait.until(ExpectedConditions.visibilityOf(elements.patientIdentifier));
        Assert.assertFalse(elements.resultRows.isEmpty(), "Hasta bulunamadı ");

    }
    @Test(dependsOnMethods = "findPatient")
    public void searchPatientID(){
        US_406Elements elements=new US_406Elements(driver);
        driver.navigate().back();
        wait.until(ExpectedConditions.visibilityOf(elements.searchField)).click();
        elements.searchField.sendKeys("100HTR".toLowerCase());
        elements.choosePatient.click();
        elements.patientIdentifier.isDisplayed();
        Assert.assertFalse(elements.resultRows.isEmpty(), "Hasta bulunamadı ");


    }

    @Test(dependsOnMethods = "searchPatientID")
    public void searchNonExistentPatient(){
        US_406Elements elements=new US_406Elements(driver);
        driver.navigate().back();
        wait.until(ExpectedConditions.visibilityOf(elements.searchField)).click();
        elements.searchField.sendKeys("invalidPatient");
        elements.noRecordMessage.isDisplayed();
        Assert.assertTrue(elements.noRecordMessage.isDisplayed(),"\"Beklenen 'no records' mesajı görünmedi.\"");

    }

}



