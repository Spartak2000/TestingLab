package onliner.form;

import framework.FileProperties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainPage {


    private By btnFromCountry = By.xpath("//input[@class='nemo-ui-textInput__input nemo-ui-dummiedInput__input nemo-flights-form__route__segment__input nemo-flights-form__route__segment__input_autocomplete js-autofocus-field js-autofocus-field_departure ui-autocomplete-input']");
    private  By btnSubmit = By.xpath("//button[@class='nemo-ui-button nemo-ui-button_main nemo-ui-button nemo-ui-button_main_form nemo-flights-form__searchButton']");
    private  String date="Невалидные данные";
    private WebDriver driver;


    public  MainPage(WebDriver driverAuthorization){
        driver=driverAuthorization;
    }

    public void inputInvalidDate(){
        WebElement webElement=driver.findElement(btnFromCountry);
        webElement.sendKeys(date);
        WebElement webElement1=driver.findElement(btnSubmit);
        webElement1.click();
    }

}
