package assignment.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundInput {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");

		driver.manage().window().maximize();

		System.out.println("=================Type your name=========================");

		WebElement findElement = driver.findElement(By.name("j_idt88:name"));
		findElement.sendKeys("Arief Khan");

		System.out.println("=================Append Country to this City.=========================");

		driver.findElement(By.id("j_idt88:j_idt91")).clear();
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("Kumbakonam");
		
		System.out.println("=================Verify if text box is disabled=========================");

		driver.findElement(By.id("j_idt88:j_idt91")).clear();
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("Kumbakonam");
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
