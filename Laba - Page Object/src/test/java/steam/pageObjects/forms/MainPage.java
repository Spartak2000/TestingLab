package steam.pageObjects.forms;

import framework.BasePage;
import framework.elements.Button;
import org.openqa.selenium.By;


public class MainPage extends BasePage {


    private String locatorUnique="//img[@class='nemo-common-pageHeader__logo__image']";
    private String locatorFacebook = "//span[@class='fa fa-facebook-square']";

    public void  goToFacebook() {
        Button btnFacebook = new Button(By.xpath(locatorFacebook));
        btnFacebook.click();
    }


    public MainPage() {
        locatorPage = By.xpath(locatorUnique);
        isOpen(locatorPage);
    }


}
