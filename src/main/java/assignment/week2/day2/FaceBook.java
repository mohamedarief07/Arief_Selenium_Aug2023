	package assignment.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {

		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");

		// Step 4: Maximise the window
		driver.manage().window().maximize();

		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[contains(@class,'jy2 selected _51sy')]")).click();

		// Step 7: Enter the first name
		
	
		driver.findElement(By.name("firstname")).sendKeys("Arief Khaan");

		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("MAK aan");

		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg')])[3]")).sendKeys("9876543456");

		// Step 10: Enterthe password
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("abSbD345@12");

		// Step 11: Handle all the three drop downs
		// day
		WebElement day = driver.findElement(By.id("day"));
		Select dd1 = new Select(day);
		dd1.selectByIndex(7);

		// month
		WebElement month = driver.findElement(By.id("month"));
		Select dd2 = new Select(month);
		dd2.selectByValue("5");

		// year
		WebElement year = driver.findElement(By.id("year"));
		Select dd3 = new Select(year);
		dd3.selectByVisibleText("1991");

		// Step 12: Select the radio button "Female"
		driver.findElement(By.xpath("//input[@name='sex']")).click();

		Thread.sleep(5000);

		driver.close();

	}

}
