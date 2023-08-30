package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBusTest {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.abhibus.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Click on Bus
		driver.findElement(By.xpath("//a[@data-toggle='pill']")).click();

		// Type "Chennai" in the FROM text box
		WebElement Chennai = driver.findElement(By.id("source"));
		Chennai.sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();

		// Type "Bangalore" in the TO text box
		WebElement Bangalore = driver.findElement(By.id("destination"));
		Bangalore.sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();

		// Select tomorrow's date in the Date field
		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.xpath("(//td[@data-event='click']//a)[2]")).click();

		// Click Search Buses
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-main')]")).click();

		// Print the name of the first resulting bus
		WebElement firstBusName = driver
				.findElement(By.xpath("//a[contains(@class,'canclbtn1 custom-width')]/preceding::h2[1]"));
		System.out.println("First Bus Name: " + firstBusName.getText());

		// Choose SLEEPER in the left menu from Bus Type
		driver.findElement(By.xpath("//span[text()='Bus Type']/following::input[@id='Bustypes4']")).click();

		// Print the first resulting bus seat count
		WebElement seatCount = driver
				.findElement(By.xpath("//a[contains(@class,'canclbtn1 custom-width')]/following::p"));
		System.out.println("First Bus Seat Count: " + seatCount.getText());

		// Click SelectSeat
		driver.findElement(By.xpath("//span[text()='Select Seat']")).click();

		// Choose any one Available seat
		driver.findElement(By.xpath("//p[text()='Click on seat to select /deselect seat ']/following::a")).click();

		// Print Seats Selected, Total Fare
		WebElement seatsSelected = driver
				.findElement(By.xpath("//p[text()='Seats Selected ']/following-sibling::p/span"));

		WebElement totalFare = driver
				.findElement(By.xpath("//p[text()='Boarding Point ']/preceding::span[@id='ticketfare']"));
		System.out.println("Seats Selected: " + seatsSelected.getText());
		System.out.println("Total Fare: " + totalFare.getText());

		// Select Boarding Point and Dropping Point (Select class)
		// Boarding Point
		WebElement boardingPoint = driver.findElement(By.id("boardingpoint_id"));
		Select dd1 = new Select(boardingPoint);
		dd1.selectByIndex(2);
		
		// Dropping  Point
		WebElement droppingPoint = driver.findElement(By.id("droppingpoint_id"));
		Select dd2 = new Select(droppingPoint);
		dd2.selectByIndex(10);

		// Get the Title of the page
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);

		// Close the browser
		driver.close();
	}
}