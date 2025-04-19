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
    Elements elements = new Elements(driver);

    driver.get("https://o2.openmrs.org/openmrs/login.htm");


    wait1.until(ExpectedConditions.visibilityOf(elements.userName));
    elements.userName.sendKeys("admin");
    elements.password.sendKeys("Admin123");
    elements.regDesk.click();
    elements.loginButton.click();

    wait1.until(ExpectedConditions.elementToBeClickable(elements.findPatientRecord));
    elements.findPatientRecord.click();

    wait1.until(ExpectedConditions.visibilityOf(elements.searchBox));
    elements.searchBox.sendKeys("100KFD" + Keys.ENTER);
    elements.activePatient.click();


    wait1.until(ExpectedConditions.elementToBeClickable(elements.deletePatientLink));
    elements.deletePatientLink.click();

    elements.reasonBox.sendKeys("Patient demand");
    wait1.until(ExpectedConditions.elementToBeClickable(elements.reasonConfirm));
    elements.reasonConfirm.click();


}
}
