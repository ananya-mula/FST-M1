package activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;

public class Activity4 {

    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("deviceId","9d1a803c");
        caps.setCapability("platformName","android");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("appPackage","com.oneplus.dialer");
        caps.setCapability("appActivity","com.android.dialer.oneplus.activity.OPDialtactsActivity");
        caps.setCapability("noReset",true);

        URL serverUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<>(serverUrl,caps);
    }

    @Test
    public void addContact(){
        driver.findElementById("menu_add_contact").click();
        driver.findElementByAccessibilityId("First name").sendKeys("Aaditya");
        driver.findElementByAccessibilityId("Last name").sendKeys("Varma");

        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";

        driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable +
                        ".scrollIntoView(new UiSelector().xpath(\"//android.widget.TextView[@resource-id='com.appname/TextName' and contains(@text, 'Search_for_this_full_text')]\"))"));

        driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable + ".scrollIntoView(new UiSelector().xpath(\"//android.widget.EditText[@resource-id='textInputEditText']\"))")).sendKeys("455");
        driver.findElementByAccessibilityId("Save").click();


    }

    public void takeScreenshot() throws IOException, IOException {
        File scrShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File screenShotName = new File("src/test/resources/screenshot"+ Calendar.getInstance().getTimeInMillis()+".jpg");
        FileUtils.copyFile(scrShot, screenShotName);
        String filePath = "../" + screenShotName;
        String path = "<img src='" + filePath + "'/>";
        Reporter.log(path);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
