package actionandDatePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethodj {

	public ChromeDriver driver;
	public ChromeOptions options;

	@BeforeMethod
	public void preCondition() {
		options = new ChromeOptions();
		options.setBinary("116");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

	}

	@AfterMethod
	public void postCondition() {
		driver.quit();
	}

}
