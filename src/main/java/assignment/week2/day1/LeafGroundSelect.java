package assignment.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGroundSelect {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");

		driver.manage().window().maximize();

		System.out.println("=================Which is your favorite UI Automation tool?=========================");
		
		// Source
		WebElement dropDown1 = driver.findElement(By.className("ui-selectonemenu"));
		Select dd1 = new Select(dropDown1);
		dd1.selectByIndex(1);
		
	}

}
