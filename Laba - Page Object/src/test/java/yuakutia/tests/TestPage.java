package yuakutia.tests;

import framework.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import yuakutia.pageObjects.forms.*;



public class TestPage extends BaseTest {

    @Test
    public void runTest() {

        MainPage mainPage = new MainPage();
        mainPage.goToCabinet();
        MyProfilePage myProfilePage = new MyProfilePage();
        Assert.assertTrue(myProfilePage.changeSecondName());
    }
}
