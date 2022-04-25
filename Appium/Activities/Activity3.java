package activities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Activity3 {

    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("deviceId","9d1a803c");
        caps.setCapability("platformName","android");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("appPackage","com.oneplus.calculator");
        caps.setCapability("appActivity",".Calculator");
        caps.setCapability("noReset",true);

        URL serverUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<>(serverUrl,caps);
    }

    @Test
    public void addtest() throws IOException {

        MobileElement digit5 = driver.findElementById("digit_5");
        digit5.click();
        MobileElement plus = driver.findElementById("op_add");
        plus.click();
        MobileElement digit9 = driver.findElementById("digit_9");
        digit9.click();
        MobileElement equal = driver.findElementById("eq");
        equal.click();
        String res = driver.findElementById("result").getText();
        System.out.println("The Result of Addition is: "+res);
        takeScreenshot();
        Assert.assertEquals(res,"14");

    }

    @Test
    public void substractTest() throws IOException {

        driver.findElementById("digit_1").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("op_sub").click();
        driver.findElementById("digit_5").click();
        driver.findElementById("eq").click();
        String res = driver.findElementById("result").getText();
        System.out.println("The Result of Substraction is: "+res);
        takeScreenshot();
        Assert.assertEquals(res,"5");

    }

    @Test
    public void multiplyTest() throws IOException {

        driver.findElementById("digit_1").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("op_mul").click();
        driver.findElementById("digit_5").click();
        driver.findElementById("eq").click();
        String res = driver.findElementById("result").getText();
        System.out.println("The Result of Multiplication is: "+res);
        takeScreenshot();
        Assert.assertEquals(res,"500");

    }

    @Test
    public void divisionTest() throws IOException {

        driver.findElementById("digit_5").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("op_div").click();
        driver.findElementById("digit_2").click();
        driver.findElementById("eq").click();
        String res = driver.findElementById("result").getText();
        System.out.println("The Result of Division is: "+res);
        takeScreenshot();
        Assert.assertEquals(res,"25");

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
