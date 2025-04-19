package Utility;

//3


import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.time.Duration;


public class BaseDriver {


    public static Logger LogTutma= (Logger) LogManager.getLogger();

    // aşağısını SDET8 den aldık
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void Setup()
    {
        LogTutma.info("Log Tutma işlemi başladı");
        // seleniumdaki static yani başlangıç kısımlar konacak
        driver=new ChromeDriver();

        driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // 5 sn mühlet: elementi bulma mühleti

        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        LogTutma.info("Başlangıç değişkenleri driver,wait,log tanımlandı ve başlatıldı");
       // LoginTest();
    }

    public void LoginTest() {
        driver.get("https://o2.openmrs.org/openmrs/login.htm");

        Elements elements = new Elements(driver);
        wait.until(ExpectedConditions.visibilityOf(elements.usernameInputField)).sendKeys("admin");
        wait.until(ExpectedConditions.visibilityOf(elements.passwordInputField)).sendKeys("Admin123");
        wait.until(ExpectedConditions.visibilityOf(elements.locations.get(MyFunc.RandomSayiVer(elements.locations.size())))).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.logInButton)).click();
        wait.until(ExpectedConditions.visibilityOf(elements.userIcon));
        new Actions(driver).moveToElement(elements.userIcon).build().perform();

        Assert.assertTrue(elements.myAccountButton.isDisplayed());
    }


    @AfterClass
    public void TearDown()
    {
// seleniumdaki BekleKapat
        MyFunc.Bekle(3);
        driver.quit(); // bütün açılmış windowları kapatır
        LogTutma.info("Driver kapatıldı");

//if (hata oldu ise)
        LogTutma.warn("Driver kapatılamadı.");
    }

    @BeforeMethod
    public void BeforeMetod()
    {
        LogTutma.info("Metod başladı");

        LogTutma.warn("WARN : Metod başladı, hata oluşmuş olsa idi");
    }

    @AfterMethod
    public void AfterMetod(ITestResult sonuc) // tesin sonuç ve isim bilgisini olduğu değişkeni
    {
        LogTutma.info(sonuc.getName()+", Metod Bitti"+" Sonuc="+ (sonuc.getStatus()==1 ? "Passed" : "Failed") );

        LogTutma.warn("WARN : Metod bitti, hata oluşmuş olsa idi bu şekilde eklenebilir.Bir if kontrolü ile");
    }
}
