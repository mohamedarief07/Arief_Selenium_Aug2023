package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--disable-notifications"); 
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		// Click on Movie Library
		driver.findElement(By.className("nav-icon")).click();
		driver.findElement(By.xpath("//a[@href='/movie-library']")).click();
		
		
		Thread.sleep(4000);
		// Select the City --> Chennai
        Select cityDropdown = new Select(driver.findElement(By.xpath("//select[@name='city']")));
        cityDropdown.selectByVisibleText("Chennai");
        
        Thread.sleep(6000);

		// Select the Genre --> Animation
		Select genreDropdown = new Select(driver.findElement(By.xpath("//select[@name='genre']")));
		genreDropdown.selectByVisibleText("ANIMATION");

		// Select the Language --> English
		Select languageDropdown = new Select(driver.findElement(By.xpath("//select[@name='lang']")));
		languageDropdown.selectByVisibleText("ENGLISH");

		// Click on Apply
		driver.findElement(By.xpath("//button[text()='Apply']")).click();

		// Click on first resulting animation movie
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//img[@src='https://originserver-static1-uat.pvrcinemas.com/app/movies/1/402x516/HO00018056.jpg?v=9']/following-sibling::div)[2]")).click();
		Thread.sleep(6000);
		// Click proceed to book
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();

		// Enter all the fields: cinema, Name, date, Preferred show time, no of seats,
		Select cinemaName = new Select(driver.findElement(By.xpath("//select[@name='cinemaName']")));
		cinemaName.selectByVisibleText("INOX The Marina Mall, OMR, Chennai");
		
		Select timings = new Select(driver.findElement(By.xpath("//select[@name='timings']")));
		timings.selectByVisibleText("12:00 PM - 03:00 PM");
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Mohamed Aief");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9789883888");
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("nil");
		
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("arief@gmail.com");
		
		Select FBRequirements = new Select(driver.findElement(By.xpath("//select[@name='food']")));
		FBRequirements.selectByVisibleText("Yes");
		
		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		
		// choose date	
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']//input[@class='ng-untouched ng-pristine ng-valid']")).click();
		driver.findElement(By.xpath("//div[@class='controls']/*[2]")).click();
		driver.findElement(By.xpath("//span[text()='5']")).click();
		
		Thread.sleep(2000);	
		
		// Click on Send Request
				driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		// Click cancel (assuming this is the cancel button for the OTP dialog)
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		
		Thread.sleep(3000);
		// Click cancel (assuming this is the cancel button for the OTP dialog)
		driver.findElement(By.xpath("//button[text()='×']")).click();


		// Verify the title of the page
		String expectedTitle = "Movie Library";
		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title verified: " + actualTitle);
		} else {
			System.out.println("Test case failed");
		}

	}
}