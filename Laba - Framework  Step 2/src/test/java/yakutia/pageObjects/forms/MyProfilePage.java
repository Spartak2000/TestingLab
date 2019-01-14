package yakutia.pageObjects.forms;

import framework.BasePage;
import framework.elements.Button;
import framework.elements.Input;
import framework.elements.Label;
import org.openqa.selenium.By;

import java.util.Random;

public class MyProfilePage extends BasePage {

    private String locatorContactSecondName="//input[@name='booking_lastname']";
    private String locatorSave="//input[@name='change']";
    private String locatorUserName="//div[@class='nemo-ui-select js-common-pseudoSelectHeader']/div";
    private String locatorCabinet="(//a[contains(text(), 'Личный кабинет')])[2]";
    private String locatorMyProfile="(//a[contains(text(), 'Мой профиль')])[2]";
    public MyProfilePage() {
         locatorPage = By.xpath(locatorMyProfile);
        isOpen(locatorPage);
    }

    public boolean changeSecondName(){
        Button btnMyProfile = new Button(By.xpath(locatorMyProfile));
        btnMyProfile.click();
        Random random = new Random();
        String name= String.valueOf(random.nextInt(10));
        Input inputSecondName = new Input(By.xpath(locatorContactSecondName));
        inputSecondName.sendKeys(name);
        Button btnSave = new Button(By.xpath(locatorSave));
        btnSave.click();
        Button btnNewCabinet = new Button(By.xpath(locatorCabinet));
        btnNewCabinet.click();
        Label lblUserName = new Label(By.xpath(locatorUserName));
        return lblUserName.getText().contains(name);
    }

}
