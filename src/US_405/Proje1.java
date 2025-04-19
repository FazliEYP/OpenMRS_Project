package US_405;

import US_405.OpenMRSDemoPage;
import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Proje1 extends BaseDriver {

    @Test(groups = {"Smoke Test"})
    public void Test01() {

        OpenMRSDemoPage page = new OpenMRSDemoPage(driver);
        System.out.println("Smoke test başladı.");
        driver.get("https://openmrs.org/");
        MyFunc.Bekle(3);

        page.languageButton.click();
        MyFunc.Bekle(3);
        page.englishOption.click();
        page.demoBtn.click();

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", page.mrs2Btn);
        MyFunc.Bekle(3);
        page.mrs2Btn.click();

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", page.entermrs2Btn);
        MyFunc.Bekle(3);
        page.entermrs2Btn.click();

        page.username.sendKeys("admin");
        MyFunc.Bekle(2);
        page.password.sendKeys("Admin123");
        MyFunc.Bekle(2);
        page.registration.click();
        MyFunc.Bekle(2);
        page.loginBtn.click();
        MyFunc.Bekle(2);

        new Actions(driver).moveToElement(page.adminDropdown).perform();
        MyFunc.Bekle(3);
        page.myAccount.click();

        page.changePasswordBtn.click();
        MyFunc.Bekle(2);
        page.oldPassword.sendKeys("Admin123");
        MyFunc.Bekle(2);
        page.newPassword.sendKeys("Admin123!");
        MyFunc.Bekle(2);
        page.confirmPassword.sendKeys("Admin123!");
        MyFunc.Bekle(2);
        page.saveBtn.click();
        MyFunc.Bekle(2);
        page.cancelBtn.click();
        MyFunc.Bekle(2);

        page.changeLanguageBtn.click();
        MyFunc.Bekle(2);
        new Select(page.languageDropdown).selectByVisibleText("Italian");
        MyFunc.Bekle(2);
        page.saveButtonLanguage.click();
        MyFunc.Bekle(2);

        try {
            Assert.assertTrue(page.errorText.getText().contains("User defaults could not be updated."));
        } catch (Exception e) {
        } finally {
            TearDown();
        }
    }
}