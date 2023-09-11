package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class KumToBang {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> list=new ArrayList<>(windowHandles);
		driver.switchTo().window(list.get(1));
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		if (title1.contains("Flight")) {
			System.out.println("THis TC is PASSSED");
			
		} else {
			System.out.println("THis TC is Failed");
		}
		
		driver.close();
		
		Thread.sleep(2000);
		
		driver.quit();
		

	}
}
