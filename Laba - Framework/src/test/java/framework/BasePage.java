package framework;

import framework.elements.Label;
import org.openqa.selenium.By;
import org.testng.Assert;


public abstract class BasePage extends BaseEntity {
    protected By locatorPage;
    private static String clearPathChrome = "./src/test/resources/drivers/chromedriver";
    private static String clearPathFirefox = "./src/test/resources/drivers/geckodriver";


    protected void isOpen(By locator) {
        Label uniqueElement = new Label(locator);
        Assert.assertTrue(uniqueElement.isEnabled());

    }
    public static void closeBrowser(){
        driver.quit();
        BrowserFactory.pathChrome=clearPathChrome;
        BrowserFactory.pathFirefox=clearPathFirefox;
        driver=null;
    }

}

