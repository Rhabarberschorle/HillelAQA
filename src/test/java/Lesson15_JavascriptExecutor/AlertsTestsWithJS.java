package Lesson15_JavascriptExecutor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTestsWithJS extends BaseTest {

    @Test
    public void promptTestOkJSText() {
        String textToEnter = "TestString";
        clickPromptButton();
        workWithAlert(true, textToEnter);
        String result = getResultJS();
        Assert.assertEquals(result, "You entered: " + textToEnter);
    }

    private String getResultJS() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        return javascriptExecutor.executeScript("return document.getElementById('result').textContent").toString();
    }

    public void clickPromptButton() {
        clickOnButton(Buttons.PROMPT);
    }

    private void clickOnButton(Buttons button) {
        WebElement alertButton = driver.findElement(By.xpath("//button[contains(text(),'" + button.getText() + "')]"));
        alertButton.click();
    }

    public String workWithAlert(boolean accept, String... textToEnter) {
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        if (textToEnter.length > 0) {
            alert.sendKeys(textToEnter[0]);
        }
        if (accept) {
            alert.accept();
        } else {
            alert.dismiss();
        }
        return text;
    }
}
