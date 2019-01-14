package yakutia.pageObjects.forms;

import framework.BasePage;
import framework.elements.Button;
import framework.elements.Input;
import framework.elements.Label;
import org.openqa.selenium.By;

public class RegistrationPage extends BasePage {

    private String locatorEmailForRegistration="//input[@name='registration_email']";
    private String locatorPasswordForRegistration="//input[@name='registration_password']";
    private String locatorErrorForRegistration="//div[contains(text(), 'Указан неправильный e-mail')]";
    private String locatorCreateAccount="//input[@value='Создать аккаунт']";
    private String invalidData="11111111111111";
    public RegistrationPage() {
        locatorPage = By.xpath(locatorEmailForRegistration);
        isOpen(locatorPage);
    }

    public boolean tryToRegistation(){
        Input inputEmail= new Input(By.xpath(locatorEmailForRegistration));
        inputEmail.sendKeys(invalidData);
        Input inputPas= new Input(By.xpath(locatorPasswordForRegistration));
        inputPas.sendKeys(invalidData);
        Button btnCreate = new Button(By.xpath(locatorCreateAccount));
        btnCreate.click();
        return Label.isFound(locatorErrorForRegistration);
    }

}
