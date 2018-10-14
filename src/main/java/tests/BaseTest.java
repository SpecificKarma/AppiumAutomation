package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import testResources.PageResources;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseTest{

    public TouchAction action;
    public WebDriverWait wait;
    public AndroidDriver appDriver;
    public PageResources view;
    public AppiumDriverLocalService service;
    private DesiredCapabilities caps;

    @BeforeTest
    public void setUp() {
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();

        caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "721c9b730504");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
        caps.setCapability(MobileCapabilityType.APP, String.valueOf(new File("src/main/resources/com.lomotif.android_261_2.2.14.apk")));
        caps.setCapability(MobileCapabilityType.NO_RESET, true);
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        caps.setCapability("autoGrantPermissions", "true");

        appDriver = new AndroidDriver(service.getUrl(), caps);
        appDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        view = new PageResources(appDriver);
//        view.alerts.skipAlertBox(Data.LOMOTIF_YES);
        view.alerts.ridAlerts();
    }

    @AfterTest
    public void tearDown(){
        appDriver.quit();
        service.stop();
    }
}
