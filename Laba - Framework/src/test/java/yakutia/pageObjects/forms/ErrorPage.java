package yakutia.pageObjects.forms;

import framework.BasePage;
import org.openqa.selenium.By;

public class ErrorPage  extends BasePage {
    private String locatorUnique="//h1[@class='pro-component-header']";
    public ErrorPage() {
        locatorPage = By.xpath(locatorUnique);
        isOpen(locatorPage);
    }

}
