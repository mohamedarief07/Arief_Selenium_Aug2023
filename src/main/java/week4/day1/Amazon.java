package week4.day1;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--disable-notifications"); 
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Type "Bags" in the Search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();

		List<WebElement> findElementsPrice = driver.findElements(By.xpath("//span[text()='M.R.P: ']/preceding::span[1]"));
		
		for (WebElement webElement : findElementsPrice) {
			String text = webElement.getText();
	
			
		String replaceAll = text.replaceAll(",", "");
		String[] split = replaceAll.split(" ");
	//	int intValue = Integer.parseInt(replaceAll);
		//System.out.println(replaceAll);
		//int intValue = Integer.parseInt(replaceAll);
	
		
		List<Integer> list =new ArrayList<>();
		
		for (String webElement2 : split) {
		    System.out.println(webElement2);
		}
	
		System.out.println(list);
		
		
		
		
		}
		
		//driver.close();
	}
}