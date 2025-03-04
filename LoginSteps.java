package Stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginSteps {
	WebDriver driver = new ChromeDriver();
	@Given("User navigates to flipkart homepage")
	public void userNavigatesToFlipkartHomepage() {
		driver.get("https://www.flipkart.com");
		
	}
	@When("User enters valid username and password")
    public void userEntersValidCredentials() {
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("valid_username");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("valid_password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Then("User should be logged in successfully")
    public void userShouldBeLoggedIn() {
        String title = driver.getTitle();
        assertTrue(title.contains("Flipkart"));

}
}
