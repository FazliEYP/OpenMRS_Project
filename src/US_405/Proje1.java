package US_405;

import US_405.OpenMRSDemoPage;
import Utility.BaseDriver;
import Utility.Elements;
import Utility.MyFunc;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Proje1 extends BaseDriver {

    @Test(groups = {"Smoke Test"})
    public void Test01() {

        Elements elements = new Elements(driver);
        System.out.println("Smoke test başladı.");
        driver.get("https://openmrs.org/");
        MyFunc.Bekle(3);

        elements.languageButton.click();
        MyFunc.Bekle(3);
        elements.englishOption.click();
        elements.demoBtn.click();

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", page.mrs2Btn);
        MyFunc.Bekle(3);
        elements.mrs2Btn.click();

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", page.entermrs2Btn);
        MyFunc.Bekle(3);
        elements.entermrs2Btn.click();

        elements.username.sendKeys("admin");
        MyFunc.Bekle(2);
        elements.password.sendKeys("Admin123");
        MyFunc.Bekle(2);
        elements.registration.click();
        MyFunc.Bekle(2);
        elements.loginBtn.click();
        MyFunc.Bekle(2);

        new Actions(driver).moveToElement(elements.adminDropdown).perform();
        MyFunc.Bekle(3);
        elements.myAccount.click();

        elements.changePasswordBtn.click();
        MyFunc.Bekle(2);
        elements.oldPassword.sendKeys("Admin123");
        MyFunc.Bekle(2);
        elements.newPassword.sendKeys("Admin123!");
        MyFunc.Bekle(2);
        elements.confirmPassword.sendKeys("Admin123!");
        MyFunc.Bekle(2);
        elements.saveBtn.click();
        MyFunc.Bekle(2);
        elements.cancelBtn.click();
        MyFunc.Bekle(2);

        elements.changeLanguageBtn.click();
        MyFunc.Bekle(2);
        new Select(elements.languageDropdown).selectByVisibleText("Italian");
        MyFunc.Bekle(2);
        elements.saveButtonLanguage.click();
        MyFunc.Bekle(2);

        try {
            Assert.assertTrue(elements.errorText.getText().contains("User defaults could not be updated."));
        } catch (Exception e) {
        } finally {
            TearDown();
        }
    }
}