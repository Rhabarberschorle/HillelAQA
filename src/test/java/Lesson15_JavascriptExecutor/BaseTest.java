package Lesson15_JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected JavascriptExecutor jsExecutor;
    protected String BASE_URL = "https://www.google.com/?hl=en-US";
    protected static final String ALERTS_URL = "https://the-internet.herokuapp.com/javascript_alerts";
    protected static final String ACCOUNT_CREATION_URL = "http://prestashop.qatestlab.com.ua/en/authentication?back=my-account#account-creation";

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ACCOUNT_CREATION_URL);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        jsExecutor = (JavascriptExecutor) driver;
    }

    @AfterClass
    public void afterClass() {
        if (driver != null) {
            driver.quit();
        }
    }
}
