package Lesson13_Locators;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ZakharchenkoHW10_p1 extends BaseTest {

    @DataProvider
    public Object[] dataProviderFrames() {
        return new Object[][]{
                {"frame-top", "frame-left", "LEFT"},
                {"frame-top", "frame-middle", "MIDDLE"},
                {"frame-top", "frame-right", "RIGHT"},
                {"", "frame-bottom", "BOTTOM"}
        };
    }

    @Test(dataProvider = "dataProviderFrames", invocationCount = 3)
    public void switchToFrame(String mainFrame, String subFrame, String expectedText) {
        driver.get(FRAME_URL);
        if (mainFrame == "") {
            driver.switchTo().frame(subFrame);
        } else {
            driver.switchTo().frame(mainFrame).switchTo().frame(subFrame);
        }

        String actualText = driver.findElement(By.xpath("//body")).getText();
        softAssert.assertEquals(actualText, expectedText, "the text is not as expected");

        driver.switchTo().defaultContent();

        softAssert.assertEquals(driver.findElements(By.xpath("//frameset/frame")).size(), 2);
        softAssert.assertAll();
    }
}
