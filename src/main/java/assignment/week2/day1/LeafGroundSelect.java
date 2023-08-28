package assignment.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGroundSelect {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");

		driver.manage().window().maximize();

		System.out.println("=================Which is your favorite UI Automation tool?=========================");
		
		// Source
		WebElement dropDown1 = driver.findElement(By.className("ui-selectonemenu"));
		Select dd1 = new Select(dropDown1);
		dd1.selectByIndex(1);
		
		String value1=driver.findElement(By.className("ui-selectonemenu")).getAttribute("value");
		System.out.println("Which is your favorite UI Automation tool?  " +value1);
		
		System.out.println("=================Choose your preferred country=========================");
		
		// Source
		WebElement dropDown2 = driver.findElement(By.id("ui-j_idt87:country_label"));
		Select dd2 = new Select(dropDown2);
		dd2.selectByIndex(1);
		
		String value2=driver.findElement(By.className("ui-selectonemenu")).getAttribute("value");
		System.out.println("Choose your preferred country  " +value2);
		
		
		
		
		
		Thread.sleep(5000);
		driver.close();

	}
	
	
	

}
