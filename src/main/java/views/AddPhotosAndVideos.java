package views;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import testResources.Alerts;

public class AddPhotosAndVideos  {
    private AndroidDriver appDriver;

    public AddPhotosAndVideos(AndroidDriver appDriver) {
        this.appDriver = appDriver;
    }

    public WebElement getAlbumsTab() {
        return appDriver.findElementByAndroidUIAutomator(
                "new UiSelector().resourceId(\"com.lomotif.android:id/panel_tab\").childSelector(new UiSelector().index(0))");
    }

    public WebElement getMotifTab() {
        return appDriver.findElementByAndroidUIAutomator(
                "new UiSelector().resourceId(\"com.lomotif.android:id/panel_tab\").childSelector(new UiSelector().index(1))");
    }

    public WebElement getCloseIcon() {
        return appDriver.findElementByAndroidUIAutomator(
                "new UiSelector().resourceId(\"com.lomotif.android:id/icon_action_back\")");
    }

    public WebElement getNextIcon() {
        return appDriver.findElementByAndroidUIAutomator(
                "new UiSelector().resourceId(\"com.lomotif.android:id/icon_action_next\")");
    }

    public WebElement getPictureDirectory() {
        return appDriver.findElementByAndroidUIAutomator(
                "new UiSelector().textMatches(\"" + "Pictures" + "\")");
    }

    public WebElement getTestPicture() {
        return appDriver.findElementByAndroidUIAutomator(
                "new UiSelector().resourceId(\"com.lomotif.android:id/panel_clip_item\").index(1)");
    }


    public WebElement getVideoCheckBox() {
        return appDriver.findElementByAndroidUIAutomator(
                "new UiSelector().resourceId(\"com.lomotif.android:id/panel_content\").index(0).childSelector(" +
                        "new UiSelector().index(3).childSelector(new UiSelector().index(0)))");
    }
}
