package tests;

import org.testng.annotations.Test;
import pages.FlowLoginPage;
import pages.FlowMainPage;
import settings.BaseClass;

/**
 * Created by AT on 20.07.2016.
 */
public class FlowTest extends BaseClass {

    private String userLogin = "strong.zubovich";
    private String userLoginDomain = "bk.ru";
    private String userPassword = "ZXCvbn123!";


    @Test
    public void FlowMailCountTest() {

        FlowLoginPage loginPage = new FlowLoginPage(driver);
        FlowMainPage mainPage = new FlowMainPage(driver);

        loginPage.setLogin(userLogin)
                 .setPassword(userPassword)
                 .setLoginDomain(userLoginDomain)
                 .clickSignInButton();

        mainPage.
                countInboxLetters();


    }



}
