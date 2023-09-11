package assignment.week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();

		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();

		Set<String> setWindowHandles = driver.getWindowHandles();

		List<String> listWindowHandles = new ArrayList<>(setWindowHandles);
		String parent = listWindowHandles.get(0);
		String oneChild = listWindowHandles.get(1);

		driver.switchTo().window(oneChild);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='Contact ID']//following::a[@class='linktext'])[1]")).click();

		driver.switchTo().window(parent);

		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

		Set<String> set1WindowHandles = driver.getWindowHandles();

		List<String> list1WindowHandles = new ArrayList<>(set1WindowHandles);
		driver.switchTo().window(list1WindowHandles.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='Contact ID']//following::a[@class='linktext'])[5]")).click();
		driver.switchTo().window(list1WindowHandles.get(0));

		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		Thread.sleep(3000);

		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);

		String title = driver.getTitle();

		System.out.println(title);

		if (title.contains("View")) {
			System.out.println("THis Test case is PASSED");

		} else {
			System.out.println("THis Test case is FAILED");
		}

		Thread.sleep(3000);
		driver.close();
	}

}
