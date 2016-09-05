package tests;

import org.testng.annotations.Test;
import pages.StaticLoginPage;
import pages.StaticMainPage;
import settings.BaseClass;

/**
 * Created by AT on 20.07.2016.
 */
public class StaticTest extends BaseClass{

    @Test
    public void mailCountTest() {

        String userLogin = "strong.zubovich";
        String userPassword = "ZXCvbn123!";
        String userDomainValue = "bk.ru";

        StaticLoginPage.loginTo(driver,userLogin,userDomainValue,userPassword);

        StaticMainPage.countInboxLetters(driver);

    }

}
