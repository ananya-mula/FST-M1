package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {

    WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

    }

    @BeforeMethod
    public void beforeMethod() {
        driver.switchTo().defaultContent();
    }

    @Test(priority = 0)
    public void simpleAlertTestCase(){
        driver.findElement(By.id("simple")).click();
        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        Assert.assertEquals("This is a JavaScript Alert!", alertText);
        simpleAlert.accept();
    }

    @Test(priority = 1)
    public void confirmAlertTestCase(){
        driver.findElement(By.id("confirm")).click();
        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        Assert.assertEquals("This is a JavaScript Confirmation!", alertText);
        simpleAlert.accept();

    }

    @Test(priority = 2)
    public void promptAlertTestCase(){
        driver.findElement(By.id("prompt")).click();
        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        Assert.assertEquals("This is a JavaScript Prompt!", alertText);
        simpleAlert.accept();

    }

    @AfterClass
    public void close(){
        driver.close();
    }

}
