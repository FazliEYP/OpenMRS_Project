package US_410;

import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class US_410_TimeZone extends BaseDriver {
    @Test(dataProvider = "datalarim")
    public void TimeZone(String username, String password, String patientname){

        Us_410_Elements timezone_elements = new Us_410_Elements();

        driver.get("https://o2.openmrs.org/openmrs/login.htm");
        // Login girişi yapılıyor
        timezone_elements.Username.sendKeys(username);
        timezone_elements.Password.sendKeys(password);
        timezone_elements.Location.click();
        timezone_elements.LoginButton.click();


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
