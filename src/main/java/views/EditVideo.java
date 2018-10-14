package views;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public class EditVideo {
    AndroidDriver driver;

    public EditVideo(AndroidDriver driver) {
        this.driver = driver;
    }

    public WebElement getExportButton() {
        return driver.findElementByAndroidUIAutomator(
                "new UiSelector().resourceId(\"com.lomotif.android:id/panel_action_bar\")" +
                        ".childSelector(new UiSelector().resourceId(\"com.lomotif.android:id/icon_action_export\").index(2)" +
                        ".childSelector(new UiSelector().index(0)))");
    }
}
