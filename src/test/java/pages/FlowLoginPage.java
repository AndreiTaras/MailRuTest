package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by AT on 20.07.2016.
 */
public class FlowLoginPage {

    private final By LOGIN_FIELD = By.id("mailbox__login");
    private final By LOGIN_DOMAIN = By.id("mailbox__login__domain");
    private final By PASSWORD_FIELD = By.id("mailbox__password");
    private final By SIGN_IN_BUTTON = By.id("mailbox__auth__button");


    private WebDriver driver;

    public FlowLoginPage(WebDriver driver) { this.driver = driver;}

    public FlowLoginPage  setLogin (String login) {

        WebElement loginField = driver.findElement(LOGIN_FIELD);

        loginField.click();
        loginField.sendKeys(login);

        return this;

    }

    public FlowLoginPage setLoginDomain(String domainValue) {

        WebElement loginDomain = driver.findElement(LOGIN_DOMAIN);

        Select domainDropDownList = new Select(loginDomain);
        domainDropDownList.selectByValue(domainValue);

        return this;

    }


    public FlowLoginPage setPassword(String password) {

        WebElement passwordField = driver.findElement(PASSWORD_FIELD);

        passwordField.click();
        passwordField.sendKeys(password);

        return this;

    }

    public FlowMainPage clickSignInButton () {

        driver.findElement(SIGN_IN_BUTTON).click();

        return new FlowMainPage(driver);


    }

}
