package marathon1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Type "Bags" in the Search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for bo");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();

		// Print the total number of results
		String totalCountResults = driver
				.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();

		System.out.println("Total Results: " + totalCountResults);

		// Select the first 2 brands in the left menu
		driver.findElement(By.xpath("//div[@id='brandsRefinements']/ul[1]/span[1]/li[1]/span[1]/a[1]/div[1]/label[1]/i[1]")).click();
		driver.findElement(By.xpath("//div[@id='brandsRefinements']/ul[1]/span[2]/li[1]/span[1]/a[1]/div[1]/label[1]/i[1]")).click();

		// Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();


		// Print the first resulting bag info (name, discounted price)
		WebElement firstBag = driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-color-base')])[2]"));
		WebElement discountedPrice = driver
				.findElement(By.xpath("(//span[@data-a-size='b']//span)[2]"));
		System.out.println("First Bag Name: " + firstBag.getText());
		System.out.println("Discounted Price: " + discountedPrice.getText());

		// Get the page title and close the browser
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);
		//driver.close();
	}
}