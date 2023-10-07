package week7.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Invisibility {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://leafground.com/waits.xhtml");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement hideElemet = driver.findElement(By.xpath("//span[text()='I am about to hide']"));
		boolean displayed = hideElemet.isDisplayed();
		System.out.println(displayed);
		wait.until(ExpectedConditions.invisibilityOf(hideElemet));
		

		Assert.assertNotEquals(displayed,false,"THis is passed");
	
		
		Thread.sleep(5000);

		driver.quit();
	}

}
