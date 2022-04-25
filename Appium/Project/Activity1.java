package liveproject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.List;

public class Activity1 {

    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;
    static int i = 2;


    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("deviceId","9d1a803c");
        caps.setCapability("platformName","android");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("appPackage","com.google.android.apps.tasks");
        caps.setCapability("appActivity",".ui.TaskListsActivity");
        caps.setCapability("noReset",true);

        URL serverUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<>(serverUrl,caps);
        wait = new WebDriverWait(driver, 20);
    }

    @Test
    public void addGoogleTasks() throws IOException {

        String[] tasks = {"Complete Activity with Google Tasks", "Complete Activity with Google Keep", "Complete the second Activity Google Keep"};

        for (String task : tasks) {
            driver.findElementById("tasks_fab").click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("add_task_change_details")));
            driver.findElementById("add_task_title").sendKeys(task);
            driver.findElementById("add_task_done").click();
        }


        wait.until(ExpectedConditions.numberOfElementsToBe(MobileBy.id("task_name"), 3));
        List<MobileElement> addedTasks = driver.findElementsById("task_name");

        takeScreenshot("TasksAdded");

        for (MobileElement addedTask : addedTasks) {

            String t = addedTask.getText();
            System.out.println("Task : " + t);
            Assert.assertEquals(t, tasks[i]);
            i--;

        }

    }


    public void takeScreenshot(String tasksAdded) throws IOException, IOException {
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
