package Lesson15_JavascriptExecutor;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZakharchenkoHW12 extends BaseTest {

    private static final String VALID_USER_EMAIL = "rhbrbrschrl1@gmail.com";
    private static final String INVALID_USER_EMAIL = "";

    //Homework12 - part1: rework of homework09 using javaScriptExecutor
    @Test()
    public void createAccountUsingJavaScriptExecutor() throws InterruptedException {
        WebElement emailField = getEmailFieldJS();
        emailField.clear();
        emailField.sendKeys(VALID_USER_EMAIL);
        WebElement createAccountButton = getCreateAccountButtonJS();
        createAccountButton.click();
        Thread.sleep(3000);
        WebElement accountCreationPageText = getCreateAnAccountTextJS();
        Assert.assertEquals(accountCreationPageText.getText(), "CREATE AN ACCOUNT");
    }

    @Test()
    public void createAccountWithInvalidEmailUsingJS() throws InterruptedException {
        WebElement emailField = getEmailFieldJS();
        emailField.clear();
        emailField.sendKeys(INVALID_USER_EMAIL);
        WebElement createAccountButton = getCreateAccountButtonJS();
        createAccountButton.click();
        Thread.sleep(3000);
        WebElement accountCreationPageText = getCreateAccountErrorJS();
        Assert.assertEquals(accountCreationPageText.getText(), "Invalid email address.");
    }

    @Test
    public void checkContactUsTextUsingJS() throws InterruptedException {
        jsExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        WebElement contactUsButton = getContactUsButtonJS();
        contactUsButton.click();
        Thread.sleep(3000);
        Assert.assertTrue(checkIfContactUsInfoTextIsPresentJS(), "CUSTOMER SERVICE - CONTACT US is not visible");
        if (checkIfContactUsInfoTextIsPresentJS()) {
            WebElement contactUsInfoText = getContactUsInfoTextJS();
            Assert.assertEquals(getContactUsInfoTextJS().getText(), "CUSTOMER SERVICE - CONTACT US");
        }
    }

    private WebElement getEmailFieldJS() {
        return (WebElement) jsExecutor.executeScript("return document.getElementById('email_create')");
    }

    private WebElement getCreateAccountButtonJS() {
        return (WebElement) jsExecutor.executeScript("return document.getElementById('SubmitCreate')");
    }

    private WebElement getCreateAnAccountTextJS() {
        return (WebElement) jsExecutor.executeScript("return document.getElementsByClassName('page-heading')[0]");
    }

    private WebElement getCreateAccountErrorJS() {
        return (WebElement) jsExecutor.executeScript("return document.getElementById('create_account_error')");
    }

    private WebElement getContactUsButtonJS() {
        return (WebElement) jsExecutor.executeScript("return document.getElementsByClassName('dbl-click')[4]");
    }

    private WebElement getContactUsInfoTextJS() {
        return (WebElement) jsExecutor.executeScript("return document.getElementsByClassName('page-heading bottom-indent')[0]");
    }

    private boolean checkIfContactUsInfoTextIsPresentJS() {
        try {
            WebElement element = getContactUsInfoTextJS();
            return true;
        } catch (NoSuchElementException noSuchElementException) {
            return false;
        }
    }
}
