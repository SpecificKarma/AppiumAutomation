package views;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public class FindMusic {
    private AndroidDriver appDriver;

    public FindMusic(AndroidDriver appDriver) {
        this.appDriver = appDriver;
    }

    public WebElement getCloseIcon() {
        return appDriver.findElementByAndroidUIAutomator(
                "new UiSelector().resourceId(\"com.lomotif.android:id/icon_action_back\")");
    }

    public WebElement getExportButton() {
        return appDriver.findElementByAndroidUIAutomator(
                "new UiSelector().resourceId(\"com.lomotif.android:id/icon_export\")");
    }

    public WebElement getFindMusicTab() {
        return appDriver.findElementByAndroidUIAutomator(
                "new UiSelector().resourceId(\"com.lomotif.android:id/panel_tab\").index(new UiSelector().index(0))");
    }

    public WebElement getMyMusicTab() {
        return appDriver.findElementByAndroidUIAutomator(
                "new UiSelector().resourceId(\"com.lomotif.android:id/panel_tab\").childSelector(new UiSelector().index(1))");
    }

    public WebElement getNextIcon() {
        return appDriver.findElementByAndroidUIAutomator(
                "new UiSelector().resourceId(\"com.lomotif.android:id/icon_action_next\")");
    }

    public WebElement getFirstItemMusicList() {
        return appDriver.findElementByAndroidUIAutomator(
                "new UiSelector().resourceId(\"com.lomotif.android:id/panel_content\").index(1)");
    }





}
