package tests;

import org.testng.annotations.Test;
import pages.DynamicLoginPage;
import pages.DynamicMainPage;
import settings.BaseClass;

/**
 * Created by AT on 19.07.2016.
 */
public class DynamicTest extends BaseClass{



    private String userLogin = "strong.zubovich";
    private String userLoginDomain = "bk.ru";
    private String userPassword = "ZXCvbn123!";

    @Test
    public void mailCountTest() {

        DynamicLoginPage loginPage = new DynamicLoginPage(driver);
        DynamicMainPage mainPage = new DynamicMainPage(driver);

        loginPage.setLogin(userLogin);
        loginPage.setLoginDomain(userLoginDomain);
        loginPage.setPassword(userPassword);
        loginPage.clickSignInButton();

        mainPage.countInboxLetters();



    }

}
