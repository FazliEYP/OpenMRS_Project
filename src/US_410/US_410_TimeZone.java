package US_410;

import Utility.BaseDriver;
import Utility.Elements;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class US_410_TimeZone extends BaseDriver {
    @Test(dataProvider = "datalarim")
    public void TimeZone(String username, String password, String patientname){

        Elements timezone_elements = new Elements(driver);

        driver.get("https://o2.openmrs.org/openmrs/login.htm");
        // Login girişi yapılıyor
        timezone_elements.usernameInputField.sendKeys(username);
        timezone_elements.passwordInputField.sendKeys(password);
        timezone_elements.LocationInpatient.click();
        timezone_elements.logInButton.click();


        // Hasta adı seçimi yapılıp randevu alınıyor ve saat dilimi hatası gözlemleniyor
        timezone_elements.AppointmentScheduling.click();
        timezone_elements.ManageAppointments.click();
        timezone_elements.SearchIdName.sendKeys(patientname);
        timezone_elements.SearchResult.click();

        Assert.assertFalse(timezone_elements.TimeZoneMessage.getText().contains("Your computer is not set to the right time zone."),
                "Boyle Bir Mesaj Bulunamadi");

        System.out.println("Time Zone Warning Message : " + timezone_elements.TimeZoneMessage.getText());


    }

    @DataProvider
    Object[] datalarim(){
        Object[][] data={{"admin","Admin123","Emma Hosters"}};

        return data;
    }

}
