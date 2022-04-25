package liveproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity1 {

    WebDriver driver;

    @BeforeClass
    public void setup(){

        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }


    @Test
    public void matchTitle(){
        String title = driver.getTitle();
        Assert.assertEquals("Alchemy LMS – An LMS Application", title);
    }

    @AfterClass
    public void tearDown(){

        driver.close();
    }
}
