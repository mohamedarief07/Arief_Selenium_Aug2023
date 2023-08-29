package assignment.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");

		driver.manage().window().maximize();

		// Which is your favorite UI Automation tool?
		// Source
		WebElement dropDown1 = driver.findElement(By.className("ui-selectonemenu"));
		Select dd1 = new Select(dropDown1);
		dd1.selectByIndex(1);

		String value1 = driver.findElement(By.className("ui-selectonemenu")).getAttribute("value");
		System.out.println("Which is your favorite UI Automation tool?  " + value1);
		System.out.println();

		// Choose your preferred country.
		driver.findElement(By.xpath("//label[@class='ui-selectonemenu-label ui-inputfield ui-corner-all']")).click();
		WebElement preferredCountry = driver.findElement(By.xpath("//li[text()='India']"));
		preferredCountry.click();

		String text = driver
				.findElement(By.xpath("//label[@class='ui-selectonemenu-label ui-inputfield ui-corner-all']"))
				.getText();
		System.out.println("Choose your preferred country:  " + text);
		System.out.println();

		// Confirm Cities belongs to Country is loaded
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("(//div[contains(@class,'ui-selectonemenu-trigger ui-state-default ui-corner-right')])[2]"))
				.click();
		WebElement preferredCity = driver.findElement(By.xpath("//li[text()='Chennai']"));
		preferredCity.click();

		String textCity = driver
				.findElement(By.xpath("//h5[text()='Confirm Cities belongs to Country is loaded']/following::label"))
				.getText();

		if (textCity.contains("Chennai")) {

			System.out.println("Cities belongs to Country is loaded : " + textCity);

		} else {
			System.out.println("Test case FAILED- Try again");
		}

		System.out.println();

		// Choose the Course
		driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		String text3 = driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).getText();
		System.out.println(text3);

		// Choose language randomly
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[text()='Tamil']")).click();
		String text4 = driver.findElement(By.xpath("//li[text()='Tamil']")).getText();
		System.out.println(text4);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		Thread.sleep(3000);

		WebElement element = driver.findElement(By.xpath("//li[contains(text(),'Select Values')]/parent::ul/li[2]"));

		element.click();

	}

}
