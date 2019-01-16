package framework;

import framework.elements.Label;
import org.openqa.selenium.By;
import org.testng.Assert;


public abstract class BasePage extends BaseEntity {
    protected By locatorPage;

    protected void isOpen(By locator) {
        Label uniqueElement = new Label(locator);
        Assert.assertTrue(uniqueElement.isEnabled());

    }

    public static void closeBrowser() {
        driver.quit();
        BrowserFactory.pathChrome = BrowserFactory.pathChrome.substring(0, BrowserFactory.pathChrome.length() - 4);
        BrowserFactory.pathFirefox = BrowserFactory.pathFirefox.substring(0, BrowserFactory.pathFirefox.length() - 4);
        driver = null;
    }

}

