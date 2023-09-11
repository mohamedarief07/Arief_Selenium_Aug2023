package assignment.week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowCase4 {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://leafground.com/window.xhtml");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
		Thread.sleep(4000);
		
		Set<String> windowHandles = driver.getWindowHandles();

		List<String> list = new ArrayList<>(windowHandles);
		
		for (String each : list) {
			
			System.out.println("Session ID : " +each);
			
		}

	}

}
