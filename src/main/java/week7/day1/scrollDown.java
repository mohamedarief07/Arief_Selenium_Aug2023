package week7.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class scrollDown {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement scrolElememt = driver
				.findElement(By.xpath("//span[text()='© 1996-2023, Amazon.com, Inc. or its affiliates']"));

		Actions builder = new Actions(driver);
		builder.scrollToElement(scrolElememt).perform();

		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		File dist = new File("./snaps/amazon01.png");
		FileUtils.copyFile(screenshot, dist);

		Thread.sleep(5000);

		driver.quit();

	}
}