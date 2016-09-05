package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by AT on 20.07.2016.
 */
public class StaticMainPage {


    static int inboxLettersCount = 0;
    private static By pagesLetters = By.xpath("//div[@class='b-datalist__item__panel']");
    private static By nextButton = By.xpath("//div[@data-name = 'next']");
    private static By nextArrow = By.xpath("//div[@data-name='next']/i");





    public static int countInboxLetters(WebDriver driver) {

        while (true) {


            List<WebElement> pageLetters = driver.findElements(pagesLetters);

            inboxLettersCount += pageLetters.size();

            WebElement nextBtn = driver.findElement(nextButton);
            WebElement nextArr = driver.findElement(nextArrow);

            if(nextBtn.getAttribute("class").contains("b-toolbar__btn_disabled")) {

                break;

            }
            else {
                nextArr.click();
            }

        }

        System.out.println("Inbox letters : " +inboxLettersCount);

        return inboxLettersCount;


    }



}
