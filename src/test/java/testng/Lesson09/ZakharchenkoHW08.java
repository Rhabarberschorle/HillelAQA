package testng.Lesson09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ZakharchenkoHW08 {
    public WebDriver driver;
    protected String BASE_URL = "https://www.google.com/?hl=en-US";

    @BeforeMethod
    public void launchBrowser() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    @Test
    public void checkIfResultListContainsSearchTerm() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()=" +
                "'Accept all']"))).click();
        driver.findElement(By.name("q")).sendKeys("hillel it school");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']")).click();

        Thread.sleep(3000);

        List<WebElement> elements = driver.findElements(By.xpath("//a/h3"));
        //check if first element in the result list matches the search term
        Assert.assertEquals(elements.get(0).getText().toLowerCase(), "hillel it school", "The element does" +
                " not match the search term");
    }

    @Test
    public void checkIfResultListContainsSecondSearchTerm() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com/?hl=en-US");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Accept all']"))).click();

        driver.findElement(By.name("q")).sendKeys("Linkedin test");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']")).click();

        Thread.sleep(3000);

        List<WebElement> elements = driver.findElements(By.xpath("//a/h3"));
        //check if first element in the result list matches the search term
        Assert.assertEquals(elements.get(0).getText().toLowerCase(), "Linkedin test", "The element does" +
                " not match the search term");
    }
}