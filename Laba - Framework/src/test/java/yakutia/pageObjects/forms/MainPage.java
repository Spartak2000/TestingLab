package yakutia.pageObjects.forms;

import framework.BasePage;
import framework.elements.Button;
import framework.elements.Input;
import framework.elements.Label;
import org.openqa.selenium.By;

public class MainPage extends BasePage {

    private String locatorUnique="//img[@class='nemo-common-pageHeader__logo__image']";
    private String locatorLanguage="//div[@class='nemo-ui-dropMenu__main']/button";
    private String locatorChangeLanguage="//span[@class='nemo-common-pageHeader__droplist__option__text']";
    private String locatorEnglishElement="//a[contains(text(), 'Log in')]";
    private String locatorCheckOrder="(//a[contains(text(), 'Проверить состояние заказа')])[2]";
    private String locatorAccount="//input[@name='booking_num']";
    private String locatorSecondName="//input[@name='passenger_lastname']";
    private String locatorOpen="(//span[@class='ui-button-text'])[2]";
    private String invalidData="11111111111111";
    private String locatorLogin="//a[contains(text(), 'Войти')]";
    private String locatorGotoAccount="//a[contains(text(), 'У меня есть аккаунт')]";
    private String locatorClose="(//button[@role='button'])[3]";
    private String locatorRegistration="(//a[contains(text(), 'Регистрация')])[1]";
    private String locatorEmail="(//input[@name='login'])[2]";
    private String locatorPassword="//input[@id='password']";
    private String locatorGo="//input[@value='Войти']";
    private String locatorError="//div[contains(text(), 'Попробуйте еще раз')]";
    private String locatorCabinet="(//a[contains(text(), 'Личный кабинет')])[2]";
    private String locatorShowInformation="//a[contains(text(), 'Раскрытие информации')]";
    private String locatorReg="(//a[contains(text(), 'Регистрация')])[2]";

    public MainPage() {
        before();
        locatorPage = By.xpath(locatorUnique);
        isOpen(locatorPage);
    }

    public void checkOrder(){
        Button btnCheckOrder= new Button(By.xpath(locatorCheckOrder));
        btnCheckOrder.click();
        Input inputAccount = new Input(By.xpath(locatorAccount));
        inputAccount.sendKeys(invalidData);
        Input inputSecondName = new Input(By.xpath(locatorSecondName));
        inputSecondName.sendKeys(invalidData);
        Button btnOpen = new Button(By.xpath(locatorOpen));
        btnOpen.click();
    }

    public boolean changeLanguage(){
        Button btnLanguage = new Button(By.xpath(locatorLanguage));
        btnLanguage.click();
        Button btnChangeLanguage = new Button(By.xpath(locatorChangeLanguage));
        btnChangeLanguage.click();
        Button btnLogIn = new Button(By.xpath(locatorEnglishElement));
        return btnLogIn.isEnabled();
    }

    public boolean logIn(){
        Button btnLogIn = new Button(By.xpath(locatorLogin));
        btnLogIn.click();
        Input inputEmail = new Input(By.xpath(locatorEmail));
        inputEmail.sendKeys(invalidData);
        Input inputPassword = new Input(By.xpath(locatorPassword));
        inputPassword.sendKeys(invalidData);
        Button btnGo = new Button(By.xpath(locatorGo));
        btnGo.click();
        return Label.isFound(locatorError);
    }

    public void goToReg(){
        Button btnReg = new Button(By.xpath(locatorReg));
        btnReg.click();
    }

    public boolean checkInformation(){
        Button btnLogIn = new Button(By.xpath(locatorLogin));
        btnLogIn.click();
        Input inputEmail = new Input(By.xpath(locatorEmail));
        inputEmail.sendKeys(configReader.getProperties("email"));
        Input inputPassword = new Input(By.xpath(locatorPassword));
        inputPassword.sendKeys(configReader.getProperties("password"));
        Button btnClose = new Button(By.xpath(locatorClose));
        btnClose.click();
        Button btnReg = new Button(By.xpath(locatorRegistration));
        btnReg.click();
        Button btnHaveAccount = new Button(By.xpath(locatorGotoAccount));
        btnHaveAccount.click();
        Button btnGo = new Button(By.xpath(locatorGo));
        btnGo.click();
        return Label.isFound(locatorCabinet);
    }


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

    public void showInformation(){
        Button btnShowInformation = new Button(By.xpath(locatorShowInformation));
        btnShowInformation.click();
    }


}
