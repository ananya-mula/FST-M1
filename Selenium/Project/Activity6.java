package liveproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity6 {
    WebDriver driver;

    @BeforeClass
    public void setup(){

        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }


    @Test
    public void login() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//a[contains(@href,'account')]"));
        element.click();
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(@class,'title')]")));

        driver.findElement(By.xpath("//a[contains(@href,'login')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_login")));

        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'profile')]")));

        element = driver.findElement(By.xpath("//h3[text()='Your Courses']"));
        String heading = element.getText();
        System.out.println("The Title: " +heading);
        Assert.assertEquals("Your Courses",heading);
    }

    @AfterClass
    public void tearDown(){

        driver.close();
    }
}
