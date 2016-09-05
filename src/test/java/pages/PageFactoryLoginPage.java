package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by AT on 20.07.2016.
 */
public class PageFactoryLoginPage {

    private WebDriver driver;

    @FindBy(id="mailbox__login")
    WebElement loginField;

    @FindBy(id="mailbox__password")
    WebElement passwordField;

    @FindBy(id="mailbox__login__domain")
    WebElement loginDomain;

    @FindBy(id="mailbox__auth__button")
    WebElement signInButton;


    public void typeLogin(String login) {

        loginField.click();
        loginField.sendKeys(login);

    }

    public void selectLoginDomain(String domainValue) {


        Select domain = new Select(loginDomain);
        domain.selectByValue(domainValue);

    }


    public void typePassword(String password) {

        passwordField.click();
        passwordField.sendKeys(password);

    }

    public PageFactoryMainPage clickSignInButton() {

        signInButton.click();

        return new PageFactoryMainPage(driver);
    }

    public PageFactoryMainPage loginTo(String login , String domainValue , String password) {

        typeLogin(login);
        selectLoginDomain(domainValue);
        typePassword(password);
        clickSignInButton();

        return new PageFactoryMainPage(driver);
    }




}
