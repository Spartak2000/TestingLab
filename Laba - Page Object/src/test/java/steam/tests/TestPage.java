package steam.tests;

import framework.BaseTest;
import org.testng.annotations.Test;
import steam.pageObjects.forms.*;



public class TestPage extends BaseTest {

    @Test
    public void runTest() {

        MainPage mainPage = new MainPage();
        mainPage.goToFacebook();
        FacebookPage facebookPage = new FacebookPage();

    }
}
