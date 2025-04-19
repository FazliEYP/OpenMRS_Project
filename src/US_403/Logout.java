package US_403;

import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Logout extends BaseDriver{
    @Test(groups = {"Smoke"})
    @Parameters("BrowserTipi")

    public void Logout() {
        Logout_Elements elements = new Logout_Elements(driver);

        // text gözükene kadar bekle
        wait.until(ExpectedConditions.visibilityOf(elements.visibleCaptionStartingWithLogged)).getText().contains("Logged in as Super User (admin) at ");
        elements.selectedLocation.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(elements.selected_list));
        // logout görünür olana kadar bekle ve click et
        wait.until(ExpectedConditions.elementToBeClickable(elements.logOutButton)).click();
        // login görünür olana kadar bekle
        wait.until(ExpectedConditions.visibilityOf(elements.logInButton));
    }
}