package com.Hamza;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class StepDef extends DriverManager {


    @Given("^User is in Home Page$")
    public void user_is_in_Home_Page() {
        driver.get("http://demo.nopcommerce.com/");

    }

    @When("^User select the Login link$")
    public void user_select_the_Login_link() {
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();

    }

    @When("^User enter email and password$")
    public void user_enter_email_and_password() {
        driver.findElement(By.xpath("//input[@class='email']")).sendKeys("aaa@aa.aa");
        waitForSomeTime();
        driver.findElement(By.xpath("//input[@class='password']")).sendKeys("123456");
        waitForSomeTime();

    }

    @When("^User click Login button$")
    public void user_click_Login_button() {

        driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
        waitForSomeTime();
    }

    @Then("^User enter welcome screen$")
    public void user_enter_welcome_screen() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[@class='ico-logout']")).isDisplayed());


    }
    public void waitForSomeTime()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
