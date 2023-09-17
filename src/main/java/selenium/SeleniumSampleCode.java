package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumSampleCode {

	// static ChromeDriver driver = new ChromeDriver();
	// static EdgeDriver driver1 = new EdgeDriver();

	static WebDriver driver;

	public static void main(String[] args) {

		SeleniumSampleCode.CommonMethod("Chrome", "https://platform.testleaf.com/#/");

	}

	public static void CommonMethod(String browser, String URL) {
		if (browser == "Chrome") {
			 driver = new ChromeDriver();

		} else {
			driver = new EdgeDriver();

		}
		driver.manage().window().maximize();
		driver.get("https://platform.testleaf.com/#/");
		driver.close();

	}

}
