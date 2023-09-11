package assignment.week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowCase3 {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://leafground.com/window.xhtml");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("Open with delay")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> list = new ArrayList<>(windowHandles);
		System.out.println("Number of opened tabs : " + list.size());
		String parent = list.get(0);
		
		driver.switchTo().window(list.get(3));
		driver.close();		
		driver.switchTo().window(parent);
		
		driver.switchTo().window(list.get(2));
		driver.close();		
		driver.switchTo().window(parent);
		
		driver.switchTo().window(list.get(1));
		driver.close();		
		driver.switchTo().window(parent);
		
		Set<String> windowHandles1 = driver.getWindowHandles();

		List<String> list1 = new ArrayList<>(windowHandles1);
		String parent1 = list.get(0);
		
		System.out.println("Number of opened tabs now : " + list1.size());
		if (parent1.equals(parent)) {
			System.out.println("All windows closed except Primary and hence this Test case is PASSED");

		} else {
			System.out.println("THis Test case is FAILED");
		}


	}

}
