package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Test extends BaseClass{

    @Given("^user is on the Homepage$")
    public void openHomePage(){
        driver.get("https://training-support.net");
    }

    @When("^user clicks on About us$")
    public void clickAboutUsButton(){
        driver.findElement(By.id("about-link")).click();
    }

    @Then("^User is redirected to About us page$")
    public void verify(){
        String title = driver.findElement(By.xpath("//h1[@class = 'ui header']")).getText();
        Assert.assertEquals("About Us",title);
    }

    @And("^close the browser$")
    public void tearDown(){
        driver.close();
    }
}
