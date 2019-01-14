package yakutia.pageObjects.forms;

import framework.BasePage;
import org.openqa.selenium.By;

public class InformationPage extends BasePage {

    private String locatorUnique="//h2[contains(text(), 'АО «Авиакомпания «Якутия»')]";

    public InformationPage() {
        locatorPage = By.xpath(locatorUnique);
        isOpen(locatorPage);
    }
}
