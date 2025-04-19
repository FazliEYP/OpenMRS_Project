package US_404;

import Utility.BaseDriver;

import Utility.BaseDriverParameter;

import Utility.Elements;
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
        Elements elements = new Elements(driver);
        String firstName = "Harley";
        String middleName = "Annie";
        String lastName = "Johnson";


        elements.registerPatient.click();
        elements.givenName.sendKeys(firstName);
        elements.middleName.sendKeys(middleName);
        elements.familyName.sendKeys(lastName);
        elements.nextButton.click();

        elements.genderFemale.click();
        elements.nextButton.click();
        elements.day.sendKeys("20");
        Select month = new Select(elements.month);
        month.selectByIndex(8);
        elements.year.sendKeys("1985");
        elements.nextButton.click();

        elements.address.sendKeys("456,Oak,St,Dallas,TX");
        elements.cityVillage.sendKeys("Dallas");
        elements.stateProvince.sendKeys("Texas");
        elements.country.sendKeys("USA");
        elements.postalCode.sendKeys("88000");
        elements.nextButton.click();
        elements.phoneNumber.sendKeys("(555)-235-3632");
        elements.nextButton.click();


        Select relation = new Select(elements.relationShip);
        relation.selectByVisibleText("Parent");
        elements.relationShipName.sendKeys("John Doe");
        elements.plus.click();
         MyFunc.Bekle(1);
        Select relation2 = new Select(elements.relationShip2);
        relation2.selectByVisibleText("Child");
        elements.relationShipName2.sendKeys("Sarah Hall");
        MyFunc.Bekle(2);
        elements.nextButton.click();
        MyFunc.Bekle(2);
        elements.confirmButton.click();
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





