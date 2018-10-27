package steam.pageObjects.forms;


import framework.BasePage;
import org.openqa.selenium.By;

public class FacebookPage extends BasePage {
    private String locatorUnique = "//a[@class='_64-f']";

    public FacebookPage() {
        locatorPage = By.xpath(locatorUnique);
        isOpen(locatorPage);
    }


}
