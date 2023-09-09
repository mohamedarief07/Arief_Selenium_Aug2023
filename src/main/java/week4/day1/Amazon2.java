package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Type "Bags" in the Search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();

		List<WebElement> findElementsPrice = driver
				.findElements(By.xpath("//span[text()='M.R.P: ']/preceding::span[1]"));

		List<Integer> list = new ArrayList<>();

		for (WebElement webElement : findElementsPrice) {
			String text = webElement.getText();

			String replaceAll = text.replaceAll(",", "");
			int intValue = Integer.parseInt(replaceAll);
			list.add(intValue);

		}

		Collections.sort(list);

		System.out.println("Lowest Prise "+list.get(0));
		System.out.println("------------------------------------------------------------------");
		//System.out.println(list);
		
		Set<Integer> set=new TreeSet<>(list);
		
		System.out.println(set);

		driver.close();
	}
}