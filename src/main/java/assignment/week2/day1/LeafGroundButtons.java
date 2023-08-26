package assignment.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButtons {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");

		driver.manage().window().maximize();
		
		System.out.println("=================Click and Confirm title=========================");
		
		driver.findElement(By.name("j_idt88:j_idt90")).click();
		
		String title = driver.getTitle();
		System.out.println("Title of Resulting Page is " + title);
		
		if (title.contains("Dashboard")) {
			System.out.println("Test case is PASSED");
			
		}else {
			System.out.println("Test case is FAILED");
		}
		
System.out.println("=================Confirm if the button is disabled.=========================");
		
		driver.findElement(By.name("j_idt88:j_idt90")).click();
		
		String title2 = driver.getTitle();
		System.out.println("Title of Resulting Page is " + title);
		
		if (title2.contains("Dashboard")) {
			System.out.println("Test case is PASSED");
			
		}else {
			System.out.println("Test case is FAILED");
		}
	}

}
