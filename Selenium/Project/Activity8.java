package liveproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Activity8 {
    WebDriver driver;

    @BeforeClass
    public void setup(){

        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }


    @Test
    public void courses() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(@href,'contact')]")).click();
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wpforms-8-field_0")));

        driver.findElement(By.id("wpforms-8-field_0")).sendKeys("Ananya");
        driver.findElement(By.id("wpforms-8-field_1")).sendKeys("ananya@gmail.com");
        driver.findElement(By.id("wpforms-8-field_3")).sendKeys("Greetings");
        driver.findElement(By.id("wpforms-8-field_2")).sendKeys("Thank You!");

        driver.findElement(By.id("wpforms-submit-8")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'confirmation')]")));
        String text = driver.findElement(By.id("wpforms-confirmation-8")).getText();
        System.out.println("The confirmation message is: " +text);
    }

    @AfterClass
    public void tearDown(){

        driver.close();
    }
}
