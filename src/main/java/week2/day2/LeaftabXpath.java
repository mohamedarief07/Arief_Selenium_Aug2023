package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftabXpath {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();

		driver.findElement(By.xpath("//a[text()='Leads']")).click();

	}

}
