package liveproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeClass
    public void setup(){

        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }


    @Test
    public void matchHeading(){
        WebElement element = driver.findElement(By.xpath("//h1[contains(@class,'title')]"));
        String heading = element.getText();
        System.out.println("The Heading: " +heading);
        Assert.assertEquals("Learn from Industry Experts",heading);
    }

    @AfterClass
    public void tearDown(){

        driver.close();
    }

}
