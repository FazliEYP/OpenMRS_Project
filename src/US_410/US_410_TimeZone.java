package US_410;

import Utility.BaseDriver;
import Utility.Elements;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class US_410_TimeZone extends BaseDriver {
    @Test(dataProvider = "datalarim")
    public void TimeZone(String username, String password, String patientname){

        Elements elements = new Elements(driver);

        driver.get("https://o2.openmrs.org/openmrs/login.htm");
        // Login girişi yapılıyor
        elements.Username.sendKeys(username);
        elements.Password.sendKeys(password);
        elements.Location.click();
        elements.LoginButton.click();


        // Hasta adı seçimi yapılıp randevu alınıyor ve saat dilimi hatası gözlemleniyor
        elements.AppointmentScheduling.click();
        elements.ManageAppointments.click();
        elements.SearchIdName.sendKeys(patientname);
        elements.SearchResult.click();

        Assert.assertFalse(elements.TimeZoneMessage.getText().contains("Your computer is not set to the right time zone."),
                "Boyle Bir Mesaj Bulunamadi");

        System.out.println("Time Zone Warning Message : " + elements.TimeZoneMessage.getText());


    }

    @DataProvider
    Object[] datalarim(){
        Object[][] data={{"admin","Admin123","Emma Hosters"}};

        return data;
    }

}
