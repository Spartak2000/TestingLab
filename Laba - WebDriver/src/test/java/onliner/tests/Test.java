
import framework.Browser;

import framework.FileProperties;
import onliner.form.MainPage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Test {
    public static WebDriver driver;

    private static final String strUrl = "url";
    private static final String strTimeOut = "timeout";
    private static String titleMainPage="Поиск авиабилетов";
    private static FileProperties fileProperties;


    /**
     *Открывается сайт и заполняется невалидными данными. После чего нажимается кнопка поиск.
     * Ожидаемый резульат - поиск не был осуществлен.
     */


    @BeforeTest
    public void testBefore() {
        driver = Browser.getSingletonBrowser();
        fileProperties = new FileProperties();
        driver.get(fileProperties.getProperties(strUrl));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Long.parseLong(fileProperties.getProperties(strTimeOut)), TimeUnit.SECONDS);
    }


    @org.testng.annotations.Test
    public void testWork() {
        MainPage pageMain = new MainPage(driver);
        Assert.assertEquals(driver.getTitle(),titleMainPage);
        pageMain.inputInvalidDate();
        Assert.assertEquals(driver.getTitle(),titleMainPage);
    }

    @AfterTest
    public void testAfter() {
        driver.quit();
    }
}

