package liveproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver;

    @BeforeClass
    public void setup(){

        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }


    @Test
    public void popularInfo(){
        WebElement element = driver.findElement(By.xpath("//a[contains(@href,'email')]//following::h3[contains(@class,'title')]"));
        String heading = element.getText();
        System.out.println("The Title: " +heading);
        Assert.assertEquals("Email Marketing Strategies",heading);
    }

    @AfterClass
    public void tearDown(){

        driver.close();
    }
}
