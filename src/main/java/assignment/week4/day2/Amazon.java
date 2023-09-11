package assignment.week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("116");
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@aria-label='oneplus 9 pro']")).click();

		// 3.Get the price of the first product
		String priceofFt = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		String priceofFirst = priceofFt.replaceAll("\\D", "");
		System.out.println("price of the first product  is: " + priceofFirst.replaceAll("\\D", ""));

		// 4. Print the number of customer ratings for the first displayed product
		String ratingsFirst = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"))
				.getText();
		String replace = ratingsFirst.replace(")", "");
		String ratings = replace.replace("(", "");
		System.out.println("Customer ratings : " + ratings);

		// 5. Click the first text link of the first image
		driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();

		List<String> list = new ArrayList<>(windowHandles);
		driver.switchTo().window(list.get(1));

		// 6. Take a screen shot of the product displayed
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);

		File image = new File("./snaps/img001.jpg");

		FileUtils.copyFile(screenshotAs, image);

		// 7. Click 'Add to Cart' button
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);

		driver.switchTo().window(allhandles.get(1));

		driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();

		// 8. Get the cart subtotal and verify if it is correct.
		Thread.sleep(6000);

		String subtotal = driver
				.findElement(By.xpath("//span[@class='a-size-base-plus a-color-price a-text-bold']/span")).getText();
		String cartAmount = subtotal.replaceAll("\\D", "");
		System.out.println("cart subtotal : " + cartAmount);

		if (cartAmount.contains(priceofFirst)) {
			System.out.println("This test case is passed");
		} else {
			System.out.println("This test case is failed");
		}

		// 9.close the browser
		driver.close();
		driver.switchTo().window(list.get(0));

		Thread.sleep(3000);
		driver.close();

	}

}
