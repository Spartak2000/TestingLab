package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;


public class Browser {

    private static String OS = System.getProperty("os.name").toLowerCase();
    private static WebDriver driver;
    private static final String strBrowser = "browser";
    private static String pathChrome = "./src/test/resources/drivers/chromedriver";
    private static String pathFirefox ="./src/test/resources/drivers/geckodriver";

    private Browser() {
    }

    public static WebDriver getSingletonBrowser() {
        FileProperties fileProperties = new FileProperties();
        if (driver == null) {
            switch (OS) {
                case "windows 10": {
                    pathChrome += ".exe";
                    pathFirefox += ".exe";
                }
            }
            switch (fileProperties.getProperties(strBrowser)) {
                case "Chrome": {
                    try {
                        System.setProperty("webdriver.chrome.driver", new File(pathChrome).getCanonicalPath());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return driver = new ChromeDriver();
                }
                case "Firefox": {
                    try {
                        System.setProperty("webdriver.gecko.driver", new File(pathFirefox).getCanonicalPath());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return driver = new FirefoxDriver();
                }
            }
        }
        return driver;
    }
}