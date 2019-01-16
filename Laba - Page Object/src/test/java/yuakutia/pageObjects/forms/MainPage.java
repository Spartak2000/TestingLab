package yuakutia.pageObjects.forms;

import framework.BasePage;
import framework.elements.Button;
import framework.elements.Input;
import org.openqa.selenium.By;


public class MainPage extends BasePage {


    private String locatorUnique="//img[@class='nemo-common-pageHeader__logo__image']";
    private String locatorLogin="//a[contains(text(), 'Войти')]";
    private String locatorEmail="(//input[@name='login'])[2]";
    private String locatorPassword="//input[@id='password']";
    private String locatorGo="//input[@value='Войти']";
    private String locatorCabinet="(//a[contains(text(), 'Личный кабинет')])[2]";

    public void goToCabinet(){
        Button btnLogIn = new Button(By.xpath(locatorLogin));
        btnLogIn.click();
        Input inputEmail = new Input(By.xpath(locatorEmail));
        inputEmail.sendKeys(configReader.getProperties("email"));
        Input inputPassword = new Input(By.xpath(locatorPassword));
        inputPassword.sendKeys(configReader.getProperties("password"));
        Button btnGo = new Button(By.xpath(locatorGo));
        btnGo.click();
        Button btnCabinet = new Button(By.xpath(locatorCabinet));
        btnCabinet.click();

    }


    public MainPage() {
        locatorPage = By.xpath(locatorUnique);
        isOpen(locatorPage);
    }


}
