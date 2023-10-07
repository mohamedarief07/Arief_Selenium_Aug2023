package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import steps.BaseClass;

public class HooksImplementation extends BaseClass {
	
	@Before
	public void preCondition() {
		
		options = new ChromeOptions();
		options.setBinary("116");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@After
	public void postCondition() {
		driver.quit();
	}
}
