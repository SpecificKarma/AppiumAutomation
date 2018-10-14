package views;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import testResources.Alerts;

public class TabBar {

    private AndroidDriver appDriver;

    public TabBar(AndroidDriver appDriver) {
        this.appDriver = appDriver;
    }

    public WebElement getHomeTab() {
        return appDriver.findElementByAndroidUIAutomator(
                "new UiSelector().className(\"android.widget.HorizontalScrollView\").childSelector(new UiSelector().index(0))");
    }

    public WebElement getSearchTab() {
        return appDriver.findElementByAndroidUIAutomator(
                "new UiSelector().className(\"android.widget.HorizontalScrollView\").childSelector(new UiSelector().index(1))");
    }

    public WebElement getPlusButton() {
        return appDriver.findElementByAndroidUIAutomator(
                "new UiSelector().resourceId(\"com.lomotif.android:id/navigation\").childSelector(new UiSelector().index(2))");
    }

    public WebElement getNotificationTab() {
        return appDriver.findElementByAndroidUIAutomator(
                "new UiSelector().className(\"android.widget.HorizontalScrollView\").childSelector(new UiSelector().index(3))");
    }

    public WebElement getAccountTab() {
        return appDriver.findElementByAndroidUIAutomator(
                "new UiSelector().className(\"android.widget.HorizontalScrollView\").childSelector(new UiSelector().index(4))");
    }


}
