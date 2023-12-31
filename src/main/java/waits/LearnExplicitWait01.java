package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnExplicitWait01 {
	
	@Test
	public void waitForVisibility() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("116");
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/waits.xhtml;jsessionid=node0bb15ia76elqzbo68slethm43501962.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]/.")).click();
		
	
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(19));
//		WebElement until = wait.until(ExpectedConditions.elementToBeClickable(iAMHere));
//		until.click();
		
		WebElement iAMHere = driver.findElement(By.xpath("//span[text()='I am here']"));

		wait.until(ExpectedConditions.visibilityOf(iAMHere));
		
		String text = iAMHere.getText();
		System.out.println(text);
		
		boolean displayed = iAMHere.isDisplayed();
		
		Assert.assertEquals(displayed, true);
		
		Thread.sleep(5000);

		driver.quit();

		
	
		

		

	}

}
