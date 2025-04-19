package US401;

import Utility.BaseDriverParameter;
import Utility.MyFunc;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class US401 extends BaseDriverParameter {



    @DataProvider(name = "loginScenarios")
    public Object[][] loginScenarios() {
        return new Object[][]{
                // username,          password,
                {"admin", "Admin123", false, true},
                {"invalidUsername", "Admin123", true, true},
                {"admin", "invalidPassword", true, true},
                {"", "invalidPassword", true, true},
                {"", "Admin123", true, true},
                {"admin", "", true, true},
                {"invalidUsername", "", true, true},
                {"", "", true, true},
                {"   ", "Admin123", true, true},
                {"admin", "Admin123", true, false},
                {"admin", "Admin123" + Keys.ENTER, true, false}
        };
    }

    @Test(dataProvider = "loginScenarios")
    public void loginTest(String username, String password, boolean withLocation, boolean shouldFail) {
        US401Elements elements = new US401Elements(driver);

        driver.get("https://openmrs.org/");
        elements.demoButton.click();
        MyFunc.Bekle(2);
        elements.exploreOpenMRS2Button.click();
        wait.until(ExpectedConditions.urlContains("openmrs2"));
        MyFunc.Bekle(2);
        elements.enterExploreOpenMRS2Button.click();

        wait.until(ExpectedConditions.visibilityOf(elements.usernameInputField));

        elements.usernameInputField.sendKeys(username);
        elements.passwordInputField.sendKeys(password);

        if (withLocation) {
            wait.until(ExpectedConditions.visibilityOfAllElements(elements.locations));
            if (!elements.locations.isEmpty()) {
                elements.locations.get(MyFunc.RandomSayiVer(elements.locations.size())).click();
            } else {
                Assert.fail("Lokasyon listesi boş! Sayfa tam yüklenmemiş olabilir.");
            }
        }
        elements.logInButton.click();
        if (shouldFail) {
            if (!withLocation) {
                wait.until(ExpectedConditions.visibilityOf(elements.errorMessage));
                Assert.assertTrue(elements.errorMessage.isDisplayed(), "Lokasyon seçilmeden giriş yapılmasına izin verildi!");
            } else {
                wait.until(ExpectedConditions.visibilityOf(elements.invalidErrorMessage));
                Assert.assertTrue(elements.invalidErrorMessage.isDisplayed(), "Geçersiz bilgilerle giriş yapıldı!");
            }
        } else {

            wait.until(ExpectedConditions.visibilityOf(elements.userIcon));
            new Actions(driver).moveToElement(elements.userIcon).perform();
            wait.until(ExpectedConditions.visibilityOf(elements.myAccountButton));
            Assert.assertTrue(elements.myAccountButton.isDisplayed(), "Giriş başarılı ama kullanıcı simgesi görünmedi!");
            elements.logoutButton.click();
        }
    }
}
