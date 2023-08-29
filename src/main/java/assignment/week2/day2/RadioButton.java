package assignment.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Your most favorite browser
		driver.findElement(By.xpath("//label[text()='Chrome']/preceding::span[1]")).click();

		// UnSelectable
		driver.findElement(By.xpath("//label[text()='Chennai']/preceding::span[1]")).click();

		// Find the default select radio button

		for (int i = 1; i <= 4; i++) {
			boolean selected = driver.findElement(By.xpath("(//input[contains(@id,'j_idt87:console2')])[" + i + "]"))
					.isSelected();

			if (selected == true) {

				String text = driver
						.findElement(
								By.xpath("(//input[contains(@id,'j_idt87:console2')])[" + i + "]/following::label"))
						.getText();

				System.out.println("By defalut " + text + " browser is selected");

			}

		}

		// Select the age group (only if not selected)
		boolean selectedAge = driver.findElement(By.xpath("(//input[contains(@name,'j_idt87:age')])[2]")).isSelected();

		if (selectedAge == true)
			System.out.println("21-40 Years is already selected");

		Thread.sleep(4000);
		driver.close();

	}
}