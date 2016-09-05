package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

/**
 * Created by AT on 20.07.2016.
 */
public class PageFactoryMainPage {

    private WebDriver driver;

    public PageFactoryMainPage(WebDriver driver) { this.driver = driver ;}

    int inboxLettersCount = 0;

    @FindBys({@FindBy(xpath = "//div[@class='b-datalist__item__panel']")})
     List <WebElement> pagesLetters;

    @FindBy(xpath = "//div[@data-name = 'next']")
    WebElement nextButton;

    @FindBy(xpath = "//div[@data-name='next']/i")
    WebElement nextArrow;


    public int countInboxLetters() {

        while (true) {



            inboxLettersCount += pagesLetters.size();


            if(nextButton.getAttribute("class").contains("b-toolbar__btn_disabled")) {

                break;

            }
            else {
                nextArrow.click();
            }

        }

        System.out.println("Inbox letters : " +inboxLettersCount);

        return inboxLettersCount;


    }

}
