package assignment.week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowCase01 {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://leafground.com/window.xhtml");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[text()='Open']")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> list = new ArrayList<>(windowHandles);
		String pg1 = list.get(0);
		String pg2 = list.get(1);
		System.out.println(pg1 + " & " + pg2);

		if (!pg1.equals(pg2)) {
			System.out.println("Confirmed- new Window Opened- THis Test case is PASSED");

		} else {
			System.out.println("New Window not Opened-THis Test case is FAILED");
		}

	}

}
