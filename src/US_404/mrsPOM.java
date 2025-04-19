package US_404;

import Utility.BaseDriver;

import Utility.BaseDriverParameter;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class mrsPOM extends BaseDriverParameter {

    @Test
    public void registerMrs() throws AWTException {

        String firstName = "Harley";
        String middleName = "Annie";
        String lastName = "Johnson";

       mrsElements mrs = new mrsElements(driver);
        mrs.registerPatient.click();
        mrs.givenName.sendKeys(firstName);
        mrs.middleName.sendKeys(middleName);
        mrs.familyName.sendKeys(lastName);
        mrs.nextButton.click();

        mrs.genderFemale.click();
        mrs.nextButton.click();
        mrs.day.sendKeys("20");
        Select month = new Select(mrs.month);
        month.selectByIndex(8);
        mrs.year.sendKeys("1985");
        mrs.nextButton.click();

        mrs.address.sendKeys("456,Oak,St,Dallas,TX");
        mrs.cityVillage.sendKeys("Dallas");
        mrs.stateProvince.sendKeys("Texas");
        mrs.country.sendKeys("USA");
        mrs.postalCode.sendKeys("88000");
        mrs.nextButton.click();
        mrs.phoneNumber.sendKeys("(555)-235-3632");
        mrs.nextButton.click();


        Select relation = new Select(mrs.relationShip);
        relation.selectByVisibleText("Parent");
        mrs.relationShipName.sendKeys("John Doe");
         mrs.plus.click();
         MyFunc.Bekle(1);
        Select relation2 = new Select(mrs.relationShip2);
        relation2.selectByVisibleText("Child");
        mrs.relationShipName2.sendKeys("Sarah Hall");
        MyFunc.Bekle(2);
        mrs.nextButton.click();
        MyFunc.Bekle(2);
        mrs.confirmButton.click();
        MyFunc.Bekle(2);

        Robot robot = new Robot();
        for (int i = 0; i < 9; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);

            MyFunc.Bekle(1);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='PersonName-givenName']"))));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='PersonName-givenName']")).getText().contains(firstName));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='PersonName-middleName']")).getText().contains(middleName));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='PersonName-familyName']")).getText().contains(lastName));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='float-sm-right']//span")).getText().contains("100"));
    }
    }





