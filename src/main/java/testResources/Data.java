package testResources;

import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;

public class Data {
    AndroidDriver appDriver;

    public Data(AndroidDriver appDriver) {
        this.appDriver = appDriver;
    }

    public String RandomUsername = RandomStringUtils.randomAlphabetic(7).toLowerCase();

    public String RandomNumeric = RandomStringUtils.randomNumeric(10);

    public static final String PERMISSION_BOX = "ALLOW";

    public static final String LOMOTIF_YES = "YES!";

    public void printTestCaseName(String name){
        System.out.println(name);
    }

}
