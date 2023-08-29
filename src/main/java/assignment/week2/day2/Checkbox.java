package assignment.week2.day2;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Basic Checkbox

		driver.findElement(By.xpath("//span[text()='Basic']/preceding-sibling::div[1]")).click();

		// Notification
		driver.findElement(By.xpath("//span[text()='Ajax']/preceding-sibling::div[1]")).click();

		// Choose your favorite language(s)

		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]"))
				.click();

		// Tri State Checkbox
		driver.findElement(By.xpath(
				"//h5[text()='Tri State Checkbox']/following::div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']"))
				.click();

		// Toggle Switch
		driver.findElement(By.xpath("(//h5[text()='Toggle Switch']/following::div)[3]")).click();

		// Verify if check box is disabled

		boolean enabled = driver
				.findElement(By.xpath("(//h5[text()='Verify if check box is disabled']/following::div)[3]"))
				.isEnabled();
		System.out.println("Verify if check box is disabled: " + enabled);

		// Select Multiple
		driver.findElement(By.xpath("//h5[text()='Select Multiple']/following::ul")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[8]"))
				.click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[11]"))
				.click();

		driver.findElement(By.xpath("//h5[text()='Basic Checkbox']")).click();

		driver.close();

	}

}
