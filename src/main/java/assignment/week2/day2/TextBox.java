package assignment.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// 1. Type your name
		driver.findElement(By.xpath("//h5[text()='Type your name']/following::input")).sendKeys("Arief Khan");

		// 2. Append Country to this City
		driver.findElement(By.xpath("//h5[text()='Append Country to this City.']/following::input")).clear();
		driver.findElement(By.xpath("//h5[text()='Append Country to this City.']/following::input"))
				.sendKeys("Kumbakonam");

		// 3. Verify if text box is disabled
		boolean enabled = driver
				.findElement(By.xpath("(//h5[text()='Verify if text box is disabled'])//following-sibling::div"))
				.isEnabled();
		System.out.println("Verify if text box is disabled: " + enabled);

		// 4. Clear the typed text
		driver.findElement(By.xpath("(//div[@class='grid formgrid'])[4]//input")).clear();

		// 5. Retrieve the typed text
		String text = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']"))
				.getAttribute("value");
		System.out.println(text);

		// 6. Type email and Tab. Confirm control moved to next element
		WebElement emailEleemnt = driver.findElement(By.xpath("//input[@placeholder='Your email and tab']"));
		emailEleemnt.sendKeys("test@email.com");
		emailEleemnt.sendKeys(Keys.TAB);

		// 7. Type about yourself
		driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("I am Mohamed ARief");

		// 8. Text Editor
		WebElement EditorElement = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));
		EditorElement.sendKeys("Text Editor");
		EditorElement.sendKeys(Keys.CONTROL, "a");
		driver.findElement(By.xpath("//button[@class='ql-underline']")).click();

		// 9. Just Press Enter and confirm error message*
		driver.findElement(
				By.xpath("(//div[@class='col-12 mb-2 lg:col-8'])//input[contains(@class,'te-default ui-corner-all')]"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String text2 = driver.findElement(By.xpath("//span[text()='Age is mandatory']")).getText();
		System.out.println(text2);

		if (text2.contains("Age is mandatory")) {
			System.out.println("Error is displaying as expected- This case is PASSED");
		} else {
			System.out.println("This case is FAILED");
		}

		// 10. Click and Confirm Label Position Changes
		driver.findElement(
				By.xpath("//h5[contains(text(),'Click and Confirm Label Position Changes')]/following::input")).click();
		Thread.sleep(2000);
		Point location = driver
				.findElement(
						By.xpath("//h5[contains(text(),'Click and Confirm Label Position Changes')]/following::input"))
				.getLocation();
		System.out.println(location);

		// 11. Type your name and choose the third option
		driver.findElement(By.xpath("//li[contains(@class,'ui-autocomplete-input-token')]/input")).click();
		driver.findElement(By.xpath("//li[contains(@class,'ui-autocomplete-input-token')]/input")).sendKeys("Babu");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//li[contains(@class,'ui-autocomplete-item ui-autocomplete-list-item ui-corner-all')][3]"))
				.click();

		// 12. Click and Confirm Keyboard appears
		driver.findElement(By.xpath(
				"//input[contains(@class,'ui-inputfield ui-keyboard-input ui-widget ui-state-default ui-corner-all is-keypad')]"))
				.click();

		Thread.sleep(3000);
		boolean isdisplayed = driver.findElement(By.xpath(
				"//div[contains(@class,'ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay')]"))
				.isDisplayed();

		System.out.println(isdisplayed);

		if (isdisplayed == true) {
			System.out.println("Keyboard is displayed hence Scenario 12 is passed");
		} else {
			System.out.println("Test case Failed try again");
		}
		
		// 13. Custom Toolbar
		WebElement EditorElement1 = driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']/p"));

		EditorElement1.sendKeys("Text Editor");
		EditorElement1.sendKeys(Keys.CONTROL, "a");
		driver.findElement(By.xpath("(//button[@class='ql-bold'])[2]")).click();

	}

}
