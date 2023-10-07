package week7.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowCase4 {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://leafground.com/window.xhtml");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
		
		Set<String> windowHandles = driver.getWindowHandles();

		List<String> list = new ArrayList<>(windowHandles);
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		
		for (String each : list) {
			
			System.out.println("Session ID : " +each);
			
		}

	}

}
