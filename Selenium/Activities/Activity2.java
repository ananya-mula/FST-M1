package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/");

        System.out.println("The Title is:  " +driver.getTitle());



        WebElement element = driver.findElement(By.id("about-link"));
        System.out.println("The Text is:  " +element.getText());

        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in element: " + linkTextLocator.getText());

        element = driver.findElement(By.className("green"));
        System.out.println("The Text is:  " +element.getText());

        element = driver.findElement(By.cssSelector("#about-link"));
        System.out.println("The Text is:  " +element.getText());

        driver.close();

    }
}
