package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.PageFactoryLoginPage;
import pages.PageFactoryMainPage;
import settings.BaseClass;

/**
 * Created by AT on 20.07.2016.
 */
public class PageFactoryTest extends BaseClass {

    String userLogin = "strong.zubovich";
    String userPassword = "ZXCvbn123!";
    String userDomainValue = "bk.ru";

    @Test
    public void PageFactoryMailCountTest() {

        PageFactoryLoginPage loginPage = PageFactory.initElements(driver,PageFactoryLoginPage.class);
        PageFactoryMainPage mainPage = PageFactory.initElements(driver,PageFactoryMainPage.class);

        loginPage.loginTo(userLogin,userDomainValue,userPassword);
        mainPage.countInboxLetters();

        System.out.println();


    }



}
