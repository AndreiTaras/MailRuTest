package settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by AT on 19.07.2016.
 */
public class BaseClass {

    protected WebDriver driver;

    @BeforeTest
    public void setUp() {

        driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://mail.ru");
    }


//    @AfterTest
//    public void teardown() {
//
//        driver.quit();
//    }

}
