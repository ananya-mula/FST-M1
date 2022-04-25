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
import java.util.List;

public class Activity9 {
    WebDriver driver;

    @BeforeClass
    public void setup(){

        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
        WebElement element = driver.findElement(By.xpath("//a[contains(@href,'account')]"));
        element.click();
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(@class,'title')]")));

        driver.findElement(By.xpath("//a[contains(@href,'login')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_login")));

        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'profile')]")));

    }


    @Test
    public void courses() throws InterruptedException {


        driver.findElement(By.xpath("//a[contains(@href,'courses')]")).click();
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'ld_course')]")));

        driver.findElement(By.xpath("//p[contains(@class,'ld_course_grid_button')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Developing Strategy')]")));
        driver.findElement(By.xpath("//div[contains(text(),'Developing Strategy')]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Developing Strategy')]")));
        String title = driver.getTitle();
        System.out.println("The Heading is :" +title);
        Assert.assertEquals("Developing Strategy – Alchemy LMS",title);


    }

    @AfterClass
    public void tearDown(){

        driver.close();
    }
}
