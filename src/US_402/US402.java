package US_402;

import US_402.US402Elements;
import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import Utility.MyFunc;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.lang.model.util.Elements;

public class US402 extends BaseDriverParameter {

    @Test
    public void UserStory402(){

      US402Elements elements = new US402Elements(driver);
        driver.get("https://openmrs.org/");

        elements.demoButton.click();
        MyFunc.Bekle(2);

        elements.exploreOpenMRS2Button.click();

        wait.until(ExpectedConditions.urlContains("openmrs2"));
        MyFunc.Bekle(2);

        elements.enterExploreOpenMRS2Button.click();

        wait.until(ExpectedConditions.visibilityOf(elements.usernameInputField));
        elements.usernameInputField.sendKeys("admin");
        elements.passwordInputField.sendKeys("Admin123");
        elements.locations.get(MyFunc.RandomSayiVer(elements.locations.size())).click();

        elements.logInButton.click();

        wait.until(ExpectedConditions.visibilityOf(elements.userIcon));
        new Actions(driver).moveToElement(elements.userIcon).build().perform();

        wait.until(ExpectedConditions.visibilityOf(elements.myAccountButton));

        Assert.assertTrue(elements.myAccountButton.isDisplayed());

    }


}
