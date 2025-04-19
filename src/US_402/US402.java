package US_402;


import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import Utility.Elements;
import Utility.MyFunc;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US402 extends BaseDriver {

    @Test
    public void UserStory402(){

      Elements elements1=new Elements(driver);

        driver.get("https://openmrs.org/");

        elements1.demoButton.click();
        MyFunc.Bekle(2);

        elements1.exploreOpenMRS2Button.click();

        wait.until(ExpectedConditions.urlContains("openmrs2"));
        MyFunc.Bekle(2);

        elements1.enterExploreOpenMRS2Button.click();

        wait.until(ExpectedConditions.visibilityOf(elements1.usernameInputField));
        elements1.usernameInputField.sendKeys("admin");
        elements1.passwordInputField.sendKeys("Admin123");
       elements1.locations.get(MyFunc.RandomSayiVer(elements1.locations.size())).click();

        elements1.logInButton.click();

        wait.until(ExpectedConditions.visibilityOf(elements1.userIcon));
        new Actions(driver).moveToElement(elements1.userIcon).build().perform();

        wait.until(ExpectedConditions.visibilityOf(elements1.myAccountButton));

        Assert.assertTrue(elements1.myAccountButton.isDisplayed());

    }


}
