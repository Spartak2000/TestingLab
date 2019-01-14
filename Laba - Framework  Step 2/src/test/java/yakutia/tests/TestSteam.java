package yakutia.tests;


import java.io.*;
import framework.BasePage;
import framework.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import yakutia.pageObjects.forms.*;
import yakutia.pageObjects.forms.menu.PersonProfilePage;

public class TestSteam extends BaseTest {
     
      PrintStream out = new PrintStream(System.out, true, "UTF-8");

    public TestSteam() throws UnsupportedEncodingException {
    }
     
     
    /**
     *  Тест 1. На главной странице нажать кнопку "Войти" им ввести валидные данные, нажать крестик, перейти в регистрацию, нажать "У меня есть аккаунт",начать войти. Ожидание - сохранилась информация введенная ранаее и вход прошел успешно.
     */
    @Test
    public void saveInformation(){
 
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.checkInformation());
        BasePage.closeBrowser();
    }

    /**
     *  Тест 2. На главной странице нажать кнопку "Проверить состояние заказа", ввести невалидные данные и нажать "Открыть". Ожидание - появилась страница ошибки.
     */
    @Test
    public void checkOrderTest(){
        MainPage mainPage = new MainPage();
        mainPage.checkOrder();
        ErrorPage errorPage = new ErrorPage();
        BasePage.closeBrowser();
    }

    /**
     *  Тест 3. На главной странице меняем язык. Ожидание - содержимое страницы изменило язык на выбранный.
    */
    @Test
    public void zoomTest(){
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.changeLanguage());
        BasePage.closeBrowser();
    }

    /**
     *  Тест 4. На главной странице нажать кнопку "Войти", ввести данные несуществующего аккаунта и нажать "Войти". Ожидание - появилось сообщение об ошибке логина или пароля.
     */
    @Test
    public void logInTest(){
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.logIn());
        BasePage.closeBrowser();
    }

    /**
     *  Тест 5.Авторизируемся на сайте. заходим в личный кабинет, профиль туристов и добавляем пассажира. Ожидаемый результат - Пассажир добавился.
     */
    @Test
    public void changeSecondName(){
        MainPage mainPage = new MainPage();
        mainPage.goToCabinet();
        MyProfilePage myProfilePage = new MyProfilePage();
        Assert.assertTrue(myProfilePage.changeSecondName());
        BasePage.closeBrowser();
    }

    /**
     *  Тест 6.Авторизируемся на сайте. заходим в личный кабинет, мой профиль и меняем фамилию. Ожидаемый результат - фамилия изменилась.
     */
    @Test
    public void addNewPerson(){
        MainPage mainPage = new MainPage();
        mainPage.goToCabinet();
        PersonProfilePage personProfilePage = new PersonProfilePage();
        Assert.assertTrue(personProfilePage.addPerson());
        BasePage.closeBrowser();
    }

    /**
     *  Тест 7. На главной странице нажать кнопку "Регистрация", ввести невалидную почту,пароль и нажать "Создать аккаунт". Ожидание - появилось сообщение об невалидной почте.
     */
    @Test
    public void regTest(){
        MainPage mainPage = new MainPage();
        mainPage.goToReg();
        RegistrationPage registrationPage = new RegistrationPage();
        Assert.assertTrue(registrationPage.tryToRegistation());
        BasePage.closeBrowser();
    }

    /**
     *  Тест 8. На главной странице нажать кнопку "Раскрытие информации". Ожидание - при переходе на новую страницу открылась страница с валидной инфомрации, соответствующей компании.
     */
    @Test
    public void showInformation(){
        MainPage mainPage = new MainPage();
        mainPage.showInformation();
        InformationPage informationPage = new InformationPage();
        BasePage.closeBrowser();
    }

    /**
     *  Тест 9. На главной странице нажать кнопку "Войти", ввести данные аккаунта и нажать "Войти". Ожидание - не появилось сообщение об ошибке логина или пароля.
     */
    @Test
    public void validLogInTest(){
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.valLogIn());
        BasePage.closeBrowser();
    }


    /**
     *  Тест 10. Перейти в регистрацию, нажать "У меня есть аккаунт",ввести данные, начать войти. Ожидание - вход прошел успешно.
     */
    @Test
    public void checkHaveAccount(){

        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.checkHaveAccount());
        BasePage.closeBrowser();
    }



}
