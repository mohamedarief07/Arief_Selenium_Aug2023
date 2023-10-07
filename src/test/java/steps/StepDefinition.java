package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	


	@And("Enter the username as {string}")
	public void enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	
	@And("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@And("Click on Login Button")
	public void ClickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@And("Welcome should be displayed")
	public void 	verifyWelcomePage() {
		
		String title = driver.findElement(By.tagName("h2")).getText();
		//System.out.println("Title of Resulting Page is " + title);

		if (title.contains("Welcome")) {
			System.out.println("Welcome should be displayed - PASSED");

		} else {
			System.out.println("Welcome should be not displayed- Failed");
		}
		
	}
	
	@But("Error Message should be displyed")
	public void 	verifyErrorMessage() {
		
		String title = driver.findElement(By.xpath("//p[text()='following error occurred during login: User not found.']")).getText();
		//System.out.println("Title of Resulting Page is " + title);

		if (title.contains("User not found")) {
			System.out.println("Error Message displayed- PASSED");

		} else {
			System.out.println("Error Message not displayed-Failed");
		}
		
	}
	
	
}
