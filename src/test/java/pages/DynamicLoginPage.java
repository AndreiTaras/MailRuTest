package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by AT on 19.07.2016.
 */
public class DynamicLoginPage {

    private final By LOGIN_FIELD = By.id("mailbox__login");
    private final By LOGIN_DOMAIN = By.id("mailbox__login__domain");
    private final By PASSWORD_FIELD = By.id("mailbox__password");
    private final By SIGN_IN_BUTTON = By.id("mailbox__auth__button");


    private WebDriver driver;

    public DynamicLoginPage(WebDriver driver) { this.driver = driver;}

    public void  setLogin (String login) {

        WebElement loginField = driver.findElement(LOGIN_FIELD);

        loginField.click();
        loginField.sendKeys(login);

    }

    public void setLoginDomain(String domainValue) {

        WebElement loginDomain = driver.findElement(LOGIN_DOMAIN);

        Select domainDropDownList = new Select(loginDomain);
        domainDropDownList.selectByValue(domainValue);

    }


    public void setPassword(String password) {

        WebElement passwordField = driver.findElement(PASSWORD_FIELD);

        passwordField.click();
        passwordField.sendKeys(password);

    }

    public DynamicMainPage clickSignInButton () {

        driver.findElement(SIGN_IN_BUTTON).click();

        return new DynamicMainPage(driver);

    }


}
