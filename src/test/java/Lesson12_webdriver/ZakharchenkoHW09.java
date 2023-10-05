package Lesson12_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ZakharchenkoHW09 {

    private WebDriver driver;

    private static final String ACCOUNT_CREATION_URL = "http://prestashop.qatestlab.com.ua/en/authentication?back=my-account#account-creation";
    private static final String VALID_USER_EMAIL = "rhbrbrschrl@gmail.com";
    private static final String INVALID_USER_EMAIL = "";

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void afterClass() {
        if (driver != null) {
            driver.quit();
        }
    }

    @BeforeMethod
    public void BeforeMethod() {
        driver.get(ACCOUNT_CREATION_URL);
    }

    @Test(priority = 1)
    public void createAccountWithValidEmail() throws InterruptedException {
        WebElement emailField = driver.findElement(By.xpath("//input[@id=\"email_create\"]"));
        emailField.clear();
        emailField.sendKeys(VALID_USER_EMAIL);
        WebElement createAccountButton = driver.findElement(By.xpath("//button[@id=\"SubmitCreate\"]"));
        createAccountButton.click();
        Thread.sleep(3000);
        WebElement accountCreationPageText = driver.findElement(By.xpath("//h1[@class=\"page-heading\"]"));
        Assert.assertEquals(accountCreationPageText.getText(), "CREATE AN ACCOUNT");
    }

    @Test(priority = 2)
    public void createAccountWithInvalidEmail() throws InterruptedException {
        WebElement emailField = driver.findElement(By.xpath("//input[@id=\"email_create\"]"));
        emailField.clear();
        emailField.sendKeys(INVALID_USER_EMAIL);
        WebElement createAccountButton = driver.findElement(By.xpath("//button[@id=\"SubmitCreate\"]"));
        createAccountButton.click();
        Thread.sleep(3000);
        WebElement accountCreationPageText = driver.findElement(By.xpath("//div[@id=\"create_account_error\"]"));
        Assert.assertEquals(accountCreationPageText.getText(), "An account using this email address has already been registered. Please enter a valid password or request a new one.");
    }
}
