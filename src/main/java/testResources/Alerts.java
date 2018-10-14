package testResources;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Alerts {
    ArrayList<WebElement> items;
    AndroidDriver driver;

    public Alerts(AndroidDriver driver){
        this.driver = driver;
        items = new ArrayList<WebElement>();
        try {
            items.add(getStoragePermissionAllowButton());
            items.add(getDoYouLoveLomotifYesButton());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void skipAlertBox(String visibleText){
        List<MobileElement> elements = driver.findElementsByAndroidUIAutomator("new UiSelector().textMatches(\"" + visibleText +"\")");
        for(MobileElement element : elements) {
            element.click();
        }
    }

    public void ridAlerts(){
        try {
            String tmp = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/message\")").getText();
            if (tmp.equals("Are you ready to export your Lomotif?")) {
                driver.findElement(By.id("android:id/button1")).click();
            } else if (tmp.equals("Would you like to resume editing?")) {
                driver.findElement(By.id("android:id/button2")).click();
            } else if(tmp.equals("Do you love Lomotif?")){
                driver.findElement(By.id("android:id/button2")).click();
            }
        } catch (Exception e) {
            try {
                driver.findElementByAndroidUIAutomator("new UiSelector().textMatches(\"ALLOW\")").click();
            } catch (Exception ignored) {}
        }
    }

    public WebElement getStoragePermissionAllowButton() throws Exception{
        return driver.findElementByAndroidUIAutomator(
                "new UiSelector().resourceId(\"com.android.packageinstaller:id/permission_allow_button\")");
    }

    public WebElement getDoYouLoveLomotifYesButton() throws Exception{
        return driver.findElementByAndroidUIAutomator(
                "new UiSelector().resourceId(\"android:id/button1\")");
    }

}
