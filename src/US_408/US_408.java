package US_408;

import Utility.BaseDriver;
import Utility.Elements;
import Utility.MyFunc;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class US_408 extends BaseDriver {

    @Test(groups = {"Regression", "PatientManagement"})
    public void US308() {
        Elements elements = new Elements(driver);
        wait.until(ExpectedConditions.elementToBeClickable(elements.searchIcon)).click();

        int actualEntry = 0;
        String text = elements.showingEntries.getText();
        Matcher matcher = Pattern.compile("of (\\d+) entries").matcher(text);

        if (matcher.find()) {
            actualEntry = Integer.parseInt(matcher.group(1));
        } else {
            throw new RuntimeException("Toplam entry sayısı metinden çekilemedi: " + text);
        }

        int expectedEntry = 0;
        for (int i = 0; i < elements.pages.size(); i++) {
            expectedEntry += elements.patients.size();

            if (elements.nextButton.isEnabled()) {
                elements.nextButton.click();
                MyFunc.Bekle(1);
            }
        }

        Assert.assertEquals(expectedEntry, actualEntry, "Entry sayısı uyuşmuyor!");

    }
}
