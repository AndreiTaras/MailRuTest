package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by AT on 19.07.2016.
 */
public class DynamicMainPage {

    public WebDriver driver;

    public  DynamicMainPage(WebDriver driver) {this.driver = driver ; }


    int inboxLettersCount = 0;
    private By pagesLetters = By.xpath("//div[@class='b-datalist__item__panel']");
    private By nextButton = By.xpath("//div[@data-name = 'next']");
    private By nextArrow = By.xpath("//div[@data-name='next']/i");






    public int countInboxLetters() {

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
