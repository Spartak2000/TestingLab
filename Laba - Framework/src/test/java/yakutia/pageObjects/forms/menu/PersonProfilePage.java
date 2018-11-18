package yakutia.pageObjects.forms.menu;

import framework.BasePage;
import framework.elements.Button;
import framework.elements.Input;
import framework.elements.Label;
import org.openqa.selenium.By;

import java.util.Random;

public class PersonProfilePage  extends BasePage {

    public PersonProfilePage() {
        locatorPage = By.xpath(locatorProfileTurist);
        isOpen(locatorPage);
    }

    private String locatorAddPerson="//button[@onclick='show_new_mypassenger_form();']";
    private String locatorSecondName="//input[@name='lastname[]'] ";
    private String locatorFirstName="//input[@name='name[]'] ";
    private String locatorSave="//button[contains(text(), 'Сохранить')]";
    private String locatorUser="//td[contains(text(), '%s')]";
    private String locatorProfileTurist="//li[@class='nemo-po-summary__item nemo-po-summary__item_myPassengers']";

    public boolean addPerson(){
        Button btnGotoProfile = new Button(By.xpath(locatorProfileTurist));
        btnGotoProfile.click();
        Random random = new Random();
        String firstName= String.valueOf(random.nextInt(10));
        String secondName= String.valueOf(random.nextInt(10));
        Button btnAddPerson = new Button(By.xpath(locatorAddPerson));
        btnAddPerson.click();
        Input inputSecondName= new Input(By.xpath(locatorSecondName));
        inputSecondName.sendKeys(secondName);
        Input inputFirstName= new Input(By.xpath(locatorFirstName));
        inputFirstName.sendKeys(firstName);
        Button btnSave = new Button(By.xpath(locatorSave));
        btnSave.click();
        return Label.isFound(String.format(locatorUser,secondName+" "+ firstName));
    }
}
