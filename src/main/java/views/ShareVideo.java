package views;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public class ShareVideo {
    private AndroidDriver driver;

    public ShareVideo(AndroidDriver driver) {
        this.driver = driver;
    }

    public WebElement getTitle() {
        return driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.lomotif.android:id/label_title\")" );
    }

    public WebElement getCloseButton() {
        return driver.findElementByAndroidUIAutomator(
                "new UiSelector().resourceId(\"com.lomotif.android:id/share_close_btn\")");
    }

}
