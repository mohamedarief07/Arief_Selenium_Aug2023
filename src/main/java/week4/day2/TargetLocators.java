package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TargetLocators {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//h5[text()=' Alert (Prompt Dialog)']/following::span)[2]")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Arief");
		alert.accept();
		
		String text = driver.findElement(By.id("confirm_result")).getText();
		
	if (text.contains("Arief")) {
		System.out.println("The Name is matching- PASSED");
		
	} else {
		System.out.println("The Name is not matching- Failed");
	}

	}
}