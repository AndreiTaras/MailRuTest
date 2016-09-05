package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class StaticLoginPage {


    private final static By LOGIN_FIELD = By.id("mailbox__login");
    private static final By PASSWORD_FIELD = By.id("mailbox__password");
    private static final By LOGIN_DOMAIN = By.id("mailbox__login__domain");
    private static final By SIGN_IN_BUTTON = By.id("mailbox__auth__button");

    public static void typeLogin(WebDriver driver,String login) {

        WebElement loginField = driver.findElement(LOGIN_FIELD);
        loginField.click();
        loginField.sendKeys(login);

    }


    public static  void selectLoginDomain(WebDriver driver,String domainValue) {

        WebElement loginDomain = driver.findElement(LOGIN_DOMAIN);

        Select domain = new Select(loginDomain);
        domain.selectByValue(domainValue);

    }


    public static void typePassword(WebDriver driver,String password) {
        WebElement passwordField = driver.findElement(PASSWORD_FIELD);

        passwordField.click();
        passwordField.sendKeys(password);

    }

    public static StaticMainPage clickSignInButton(WebDriver driver) {

        driver.findElement(SIGN_IN_BUTTON).click();

        return new StaticMainPage();
    }

    public static StaticMainPage loginTo(WebDriver driver,String login , String domainValue , String password) {

        WebElement loginField = driver.findElement(LOGIN_FIELD);
        loginField.click();
        loginField.sendKeys(login);



        WebElement loginDomain = driver.findElement(LOGIN_DOMAIN);
        Select domain = new Select(loginDomain);
        domain.selectByValue(domainValue);

        WebElement passwordField = driver.findElement(PASSWORD_FIELD);
        passwordField.click();
        passwordField.sendKeys(password);

        driver.findElement(SIGN_IN_BUTTON).click();



        return new StaticMainPage();
    }



}
