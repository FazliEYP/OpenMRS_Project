package US_407;

import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import Utility.Elements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class HastaSilme_POM extends BaseDriverParameter {
@Test
    public void HastaSilme(){

    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
    Elements hse = new Elements(driver);
    driver.get("https://o2.openmrs.org/openmrs/login.htm");


    wait1.until(ExpectedConditions.visibilityOf(hse.usernameInputField));
    hse.usernameInputField.sendKeys("admin");
    hse.passwordInputField.sendKeys("Admin123");
    hse.registration.click();
    hse.logInButton.click();

    wait1.until(ExpectedConditions.elementToBeClickable(hse.findPatientRecord));
    hse.findPatientRecord.click();

    wait1.until(ExpectedConditions.visibilityOf(hse.searchField));
    hse.searchField.sendKeys("100KFD" + Keys.ENTER);
    hse.activePatient.click();


    wait1.until(ExpectedConditions.elementToBeClickable(hse.deletePatientLink));
    hse.deletePatientLink.click();

    hse.reasonBox.sendKeys("Patient demand");
    wait1.until(ExpectedConditions.elementToBeClickable(hse.reasonConfirm));
    hse.reasonConfirm.click();


}
}
