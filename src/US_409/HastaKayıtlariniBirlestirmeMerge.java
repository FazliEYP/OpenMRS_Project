package US_409;

import Utility.BaseDriverParameter;
import Utility.Elements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HastaKayıtlariniBirlestirmeMerge extends BaseDriverParameter {

    @Test(groups = "Regression")
    public void Merge(){

        Elements elements=new Elements(driver);

        elements.dataManagementButton.click();
        elements.mergePatientERButton.click();
        elements.patientIDButton1.sendKeys("100JAN");  //Us404te eklenen hastaların id'sine element eklenecek. burayada o yazılacak
        elements.patientIDButton2.sendKeys("100L41"+ Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(elements.continueButton)).click();
        //    wait.until(ExpectedConditions.invisibilityOf(elements.warningMessage));

        Assert.assertEquals(elements.warningMessage.getText(),"Merging cannot be undone!");  // bu asserti görmediği için fail oluyor

        elements.patient1.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.continueButton)).click();

        Assert.assertTrue(elements.mergeID.getText().contains("Patient ID"));



    }
}
